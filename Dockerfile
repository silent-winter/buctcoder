FROM java:8
MAINTAINER 1228604898@qq.com
# 拷贝java的程序到容器目录中
RUN mkdir /opt/web
COPY target/coder-0.0.1-SNAPSHOT.jar /opt/web/
# 部署JavaWeb程序
EXPOSE 81
# 切换WORKDIR
WORKDIR /opt/web/
ENTRYPOINT ["nohup","java","-jar","coder-0.0.1-SNAPSHOT.jar",">","/dev/null","2>&1","&"]