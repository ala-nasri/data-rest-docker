### Windows and macOS

Docker Compose is included in
[Docker Desktop](https://www.docker.com/products/docker-desktop)
for Windows and macOS.

### Linux

You can download Docker Compose binaries from the
[release page](https://github.com/docker/compose/releases) on this repository.

How to RUN
-----------

It is very simple:
1. run `docker-compose build` to build your image for the first time
2. run `docker-compose up` and Compose will start and run your entire
   app
3. access to swagger-ui via http://localhost:8080/api/swagger-ui/