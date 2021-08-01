FROM openjdk:11.0.12-jre

COPY build/libs/logback-examples-*.jar /usr/local/bin/logback-examples.jar
COPY entrypoint.sh /usr/local/bin/entrypoint.sh
RUN chmod +x /usr/local/bin/entrypoint.sh
ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]
