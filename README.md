# SpringBoot-MongoDB-docker

<br>
<br>

### Execute
```
cd SpringBoot-MongoDB-docker    (Folder)
```
```
AllStart.sh
```

<br>
<br>
<br>
<br>

### Feature

| Dependency | Version |
| :----: | :----: |
| Spring Boot | 2.3.7.RELEASE |
| Spring Web | by parent version |
| Spring Data Mongodb | / |
| Docker| v20.10.10 |

<br>
<br>
<br>
<br>

###  Api
| api | Service | Method |
| :----: | :----: | :----: |
| localhost:8087 |  |  |
| /read/{id} | 搜尋指定資料 | GET |
| /create | 創建資料 | POST |
| /update | 更新 | PUT |
| /delete/{id}} | 刪除資料 | DELETE |

<br>
<br>
<br>
<br>

### Notes

| Notes | content |
| :----: | :----: |
| 在 Springboot 中 創建完映射實體類即是創建表|就可以直接進行 CRUL，不需再像 SQL 使用 DDL 創建等等。|
| mongo express |是一個基於Node.js和express的開源的MongoDB Web管理介面。<br>http://localhost:8081/|
| 也可以進入容器後 用 mongo shell 創建 Collection 資料 |
|進入容器後 使用 mongo shell 進入 mongodb|mongo mongodb://localhost:27017 -u rootuser -p rootpass|
|顯示所有資料庫|show dbs;|
|創建及切換資料庫| (下完 use 之後 要再下 db.createCollection 不然 show dbs 會找不到)<br>use Article|
|創建資料庫結構|db.createCollection("hello");|
|取得資料庫名稱|db.getName();|
|刪除資料庫|db.dropDatabase();|
|所有command預覽|db.help;|
