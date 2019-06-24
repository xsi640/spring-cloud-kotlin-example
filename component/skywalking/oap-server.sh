#!/bin/bash

docker run --name oap \
--restart always -d \
-e SW_STORAGE=elasticsearch \
-e SW_STORAGE_ES_CLUSTER_NODES=192.168.68.100:9200 \
-p 11800:11800 \
-p 12800:12800 \
-p 1234:1234 \
apache/skywalking-oap-server:6.1.0