## 使用moco框架搭建接口mock服务

### 创建配置文件test.json，并输入如下内容：
```json
[
  {
    "description": "首页",
    "request": {
      "uri": "/index"
    },
    "response": {
      "text": "hello world"
    }
  }
]
```
### 启动http服务
```shell
java -jar <path-to-moco-runner> http -p <monitor-port> -c <configuration-file>
```

* <path-to-moco-runner>：jar包的路径
* <monitor-port>：http服务监听的端口
* <configuration-file>：配置文件路径


示例
```shell
java -jar moco-runner-1.1.0-standalone.jar http -p 9090 -c test.json
```
### 接口访问

```shell

```
###  Moco引入配置文件

moco支持在配置文件中引入其他配置文件，这样可以分服务/模块定义配置文件，便于对配置文件的管理。

实现步骤：

分服务/模块定义配置文件，如分别定义index.json和login.json文件

```json
[
    {
        "description": "首页",
        "request": {
            "uri": "/index"
        },
        "response": {
            "text": "hello world"
        }
    }
]
```


```json
[
    {
        "description": "登录",
        "request": {
            "uri": "/login"
        },
        "response": {
            "text": "success"
        }
    }
]
```
定义启动配置文件，如config.json并引入其他配置文件

```json
[
    {"include": "index.json"},
    {"include": "login.json"}
]
```


启动服务
```shell
java -jar moco-runner-1.1.0-standalone.jar http -p 9090 -g config.json
```
