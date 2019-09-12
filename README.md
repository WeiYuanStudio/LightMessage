# Light Message

一个简单的在线“聊天”室

![LightMessage.jpg](https://i.loli.net/2019/09/12/aoev9CgTbi8dWI4.jpg)

## 使用方法

去上方该项目的release里面下载最新版本的war打包文件部署到tomcat即可。

## DOCKER ~~懒人~~ 部署

该项目已经打包好镜像，只需要pull下我的docker镜像直接运行即可。
或者也可以选择使用源码的Dockerfile自己进行构建，不过要注意的时Dockerfile中拉取的war是从release里面来的，如果你想完完全全自己构建，那么还需要自行编译打包war文件。

docker pull命令

```bash
docker pull weiyuanstudio/light_message:latest
```

运行命令

```bash
docker run -d -p <host port>:8080 weiyuanstudio/light_message:latest
```

请将`<host port>`修改为你想要让Light Message运行的宿主机端口
