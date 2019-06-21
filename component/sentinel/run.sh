#!/bin/bash

docker run -d \
--restart=always \
-p 8080:8080 \
sentinel:1.6.2