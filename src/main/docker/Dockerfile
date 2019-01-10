FROM openjdk:8-jdk-alpine
USER root
RUN apk --no-cache update && \
    apk --no-cache upgrade && \
    apk --no-cache add tzdata

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
ENV TZ Asia/Shanghai
VOLUME /tmp
ADD wx-msg-persistence-0.0.1-SNAPSHOT.jar wx-msg-persistence.jar
RUN sh -c 'touch /wx-msg-persistence.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /wx-msg-persistence.jar" ]