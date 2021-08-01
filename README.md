# Kotlin SpringBoot Logback 예제 프로젝트


## 개요
이 프로젝트는 Kotlin 기반 SpringBoot 어플리케이션에서 Logback을 사용하는 예제를 안내합니다.


## 실행 방법
1. 아래 명령을 통고 Gradle Build 를 수행합니다.
```
./gradlew clean && ./gradlew build
```

2. 아래 명령을 통해 Docker 이미지를 빌드합니다.
```
docker build -t logback-examples:latest .
```

3. 아래 명령을 통해 Docker 컨테이너를 구동합니다.
```
docker run --rm -p 8080:8080 logback-examples:latest
```


## 로그 테스트 방법
Logback 설정을 통해 로그가 잘 출력되는지 확인하고 싶다면, 
아래 절차를 통해 Docker 컨테이너 내부의 로그 파일을 확인할 수 있습니다.

1. 아래 명령을 실행하여 컨테이너의 `/bin/sh` 명령을 호출합니다.
```
docker exec -it {Container ID} /bin/sh
```

2. 정상적으로 `/bin/sh` 명령을 호출하였다면, 컨테이너 내부의 쉘 환경에 접속합니다.
아래 명령을 순서대로 실행하여 로그 파일이 저장되어있는 디렉토리 공간으로 이동하여 로그 파일을 확인합니다.
```
# /var/log 디렉터리로 이동합니다.
cd /var/log 

# 디렉터리 내부 파일 목록을 조회합니다.
ls

# 아래와 같이 파일 목록이 출력되면 성공입니다.
alternatives.log  application-service.log  apt	btmp  dpkg.log	faillog  fontconfig.log  lastlog  wtmp
```

3. 어플리케이션 로그를 실시간으로 조회하고 싶다면, 아래 명령을 실행합니다.
```
tail -f application-service.log
```


## 참고 문서
- http://logback.qos.ch/manual/appenders.html#ConsoleAppender
- http://logback.qos.ch/manual/appenders.html#RollingFileAppender
- https://www.baeldung.com/logback
- https://www.elastic.co/guide/en/beats/filebeat/current/index.html
- https://jsonobject.tistory.com/500
- https://gowoonsori.site/spring/elk/


