# Version 0.2

FROM tomcat:9.0.24-jdk11-openjdk
MAINTAINER WeiYuanStudio weiyuanstudio@gmail.com
RUN rm -rf /usr/local/tomcat/webapps/*
ADD https://github.com/WeiYuanStudio/LightMessage/releases/download/0.2/LightMessage_war.war /usr/local/tomcat/webapps/ROOT.war
