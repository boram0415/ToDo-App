----------------# Spring Boot 
- ToDo App 만들기
- Spring Boot, Spring Data JPA , 템플릿 엔진(HTML ) , Mysql
- Docker 를 이용해 MySQL을 설치
## 프로젝트 생성

1) spring.io.start 에서 프로젝트 생성
2) IntelliJ에서 build.gradle 파일을 열어 설정 정보 확인
3) SpringBootApplication 실행 > error
   - Spring Data JAP 라이브러리를 사용에 필요 조건에 대한 설정이 되지 않아 error
## MySQL 설치

1) https://www.docker.com/products/docker-desktop/
    - Docker-DeskTop 설치
        ㄴ> 설치되면  docker-compose 가 자동으로 설치됨
## MySQL 설치 및 실행

- mkdir ~/devel/docker 폴더 생성
- mkdir ~/devel/docker/database 폴더 생성
- ~/devel/docker/docker-compose.yml 파일 생성


---

```
version: '2'

services:
    vacation-db:
        image: mysql
        restart: always
        environment:
            MYSQL_ROOT_PASSWORD: "root1234"
            MYSOL_DATABASE: "examplesdb"
            MYSQL_USER: "urstory"
            MYSQL_PASSWORD: "u1234"
        command:
            - --character-set-server=utf8mb4
            - --collation-server=utf8mb4_unicode_ci
        volumes:
            - ./database/init/:/docker-entrypoint-initdb.d/
            - ./database/datadir/:/var/lib/mysql
        platform: linux/x86_64
        ports:
            - 3306:3306
```
---

## mysql 접속 Test 

- MySQL Workbench 설치하여 테스트 해보기

## 간단하게 작성한 todo list 보여주기 및 todo 작성하기 만들기 끝
