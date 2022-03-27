# cache_service
A simple java implementation of the cache mechanism

# Start Up
This solution was built in java 11, it is a maven project.
Run the below command to start up the project

`mvn spring-boot:run`
# API
To access the available cache APIs, see below

**Save Data**

**Endpoint** -> POST http://localhost:8080/add-value

**Sample Request**

`{
"key": 1,
"value": {
"name": "Jake",
"email": "jake@mail.com",
"age": 25
}
}`

**Sample Response**

`Saved Data`

**Fetch Data API**

**Endpoint** -> GET http://localhost:8080/get-value/{key}

**Sample Request**

http://localhost:8080/get-value/1

**Sample Response**

`{
"name": "Jake",
"email": "jake@mail.com",
"age": 25
}`
