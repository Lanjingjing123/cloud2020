# redis安装配置Linux过程

1. 安装编译

```shell
$ wget http://download.redis.io/releases/redis-5.0.8.tar.gz
$ tar xzf redis-5.0.8.tar.gz
$ cd redis-5.0.8
$ make
```

2. 启动redis

```shell
$ src/redis-server

# /var/redis/redis-5.0.8/redis.conf 进行配置文件编写

```



1. 客户端连接测试（本地）

```shell
$ src/redis-cli
redis> set foo bar
OK
redis> get foo
"bar
```

3. 注意：