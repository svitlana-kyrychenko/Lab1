FROM openjdk:11
ENV TZ=Europe/Kiev
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac GetTime.java
CMD ["java", "GetTime"]