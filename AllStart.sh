#!/bin/sh

mv -f ./ServiceMongoCRUD/target/ServiceMongoCRUD-Mcrud100.jar ./

docker-compose up -d


# curl -H "Content-Type: application/json" -X POST 'http://localhost:8087/create' -d '{"id":"1","title":"搭建微服務","content":"微服務內容","view":"1"}'

# curl -X GET 'http://localhost:8087/read/1'
