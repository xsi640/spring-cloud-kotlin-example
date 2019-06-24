#!/bin/bash

docker run --name oap-webui \
--restart always -d \
-e SW_OAP_ADDRESS=192.168.68.100:12800 \
-p 8081:8080 \
apache/skywalking-ui:6.1.0