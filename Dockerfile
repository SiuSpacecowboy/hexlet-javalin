FROM gradle:7.2-jdk17

COPY . /javalin

WORKDIR /javalin

EXPOSE 8080

RUN ./gradlew installDist

CMD ./build/install/HexletJavalin/bin/HexletJavalin