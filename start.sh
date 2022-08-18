#!/bin/sh
mvn clean package
docker build -t shoppingdemo:latest .
docker run  -p 8080:8080 -d --name shoppingdemo shoppingdemo:latest
