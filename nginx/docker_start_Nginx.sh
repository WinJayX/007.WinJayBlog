docker rm -f Nginx
docker container run -d \
	--volume /etc/localtime:/etc/localtime:ro \
	--volume `pwd`/conf.d:/etc/nginx/conf.d \
	--volume `pwd`/nginx.conf:/etc/nginx/nginx.conf \
	--volume `pwd`/html:/etc/nginx/html \
	--name Nginx \
	--user root \
	-p 80:80 \
	-p 443:443 \
	--hostname Nginx \
	--restart always \
	nginx:1.20.1

