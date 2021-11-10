docker run -itd -p 8001:80   -p 8002:443  -p 8003:22 -n WinJay -hostname winjay harbor.nercoa.com/winjay/bt_centos7.7.1908:v1.0




docker container run -d \
    --volume /etc/localtime:/etc/localtime:ro \
    --volume ~/.halo:/root/.halo \  
    --name Halo \
    --user root \
    -p 8090:8090 \
    --hostname Halo \
    --restart always \
    halohub/halo


 docker container run -d \
    -p 80:80 \
    -p 443:443 \
    --user root \
    --name Caddy \
    --hostname Caddy \
    --restart always \
    --volume `pwd`/srv:/srv \
    --volume `pwd`/data:/data \
    --volume `pwd`/config:/config \
    --volume `pwd`/Caddyfile:/etc/caddy/Caddyfile \
    --volume /etc/localtime:/etc/localtime:ro \
    caddy caddy file-server --domain www.winjay.cn




docker run -it -d --name halo -p 8091:8090 -v ~/.halo/application.yaml:/root/.halo/application.yaml --restart=always halohub/halo

    ssl_session_timeout 5m;
    ssl_prefer_server_ciphers on;
    ssl_protocols TLSv1 TLSv1.1 TLSv1.2;
    ssl_ciphers ECDHE-RSA-AES128-GCM-SHA256:ECDHE:ECDH:AES:HIGH:!NULL:!aNULL:!MD5:!ADH:!RC4:!DH:!DHE;


