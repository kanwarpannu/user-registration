# user-registration

How to run

1. First Maven build using cmd.

mvn package

2. Then use docker file to create docker image:

docker build -f DockerFile -t userregistration

3. Then simply run docker container

docker run -p 8080:8080 userregistration
