# 使用官方 Java 运行时基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将项目构建后的 JAR 文件复制到容器中
COPY target/bazi-api.jar /app/bazi-api.jar

# 暴露运行的端口
EXPOSE 8080

# 运行应用
CMD ["java", "-jar", "bazi-api.jar"]
