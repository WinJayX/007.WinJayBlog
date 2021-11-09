docker rm -f Halo
docker container run -d \
	--volume /etc/localtime:/etc/localtime:ro \
	--volume /root/docker/007.Halo:/root/.halo \
	--name Halo \
	--user root \
	-p 8090:8090 \
	-p 9092:9092 \
   	--hostname Halo \
	--restart always \
	halohub/halo:1.4.12
