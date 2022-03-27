package com.rtg.cache_service.controller;

import com.rtg.cache_service.dto.CachedDetails;
import com.rtg.cache_service.service.CacheService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CacheController {

    private final CacheService<Object> cacheService = new CacheService<>();

    @GetMapping(path = "/get-value/{key}")
    public ResponseEntity<Object> fetchCacheDetails(@PathVariable String key) {
        Object cachedDetails = cacheService.get(key);
        return ResponseEntity.ok(cachedDetails);
    }

    @PostMapping(path = "/add-value")
    public ResponseEntity<String> addCacheDetails(@RequestBody CachedDetails cacheDetails) {
        cacheService.put(cacheDetails.key, cacheDetails.value);
        return ResponseEntity.ok("Saved Data");
    }
}
