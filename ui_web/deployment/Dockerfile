FROM openjdk:8-jdk-alpine
#RUN apt-get update
#RUN apt-get install curl
RUN apk add curl
VOLUME /tmp
RUN mkdir /opt/tomcat/

WORKDIR /opt/tomcat
RUN curl -O https://mirror-hk.koddos.net/apache/tomcat/tomcat-9/v9.0.45/bin/apache-tomcat-9.0.45.tar.gz
RUN tar -xvf apache-tomcat-9.0.45.tar.gz
RUN mv apache-tomcat-9.0.45/* /opt/tomcat/.
ENV CATALINA_HOME=/opt/tomcat
ENV CATALINA_BASE=/opt/tomcat

EXPOSE 8080
CMD ["/opt/tomcat/bin/catalina.sh","run"]
