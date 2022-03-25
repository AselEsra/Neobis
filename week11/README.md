## Instructions

### Dockerfile

***Create MySQL container;***
> docker run --name cafe-mysql -e MYSQL_ROOT_PASSWORD=passwor
d -e MYSQL_DATABASE=cafe -e MYSQL_USER=admin -e MYSQL_PASSWORD=password -d mysql

***Build Docker image;***
> docker build . -t cafe-api

***Create Spring Boot container and link it to MySQL container;***
>  docker run -p 8090:8090 --name cafe-api --link cafe-mysql:m
ysql cafe-api

