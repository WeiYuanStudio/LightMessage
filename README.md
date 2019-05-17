# Light Message

## 确定需求

初步实现：

 - 做一个在线网页聊天程序，匿名，无需注册（暂不加入user部分
 - 前端可以考虑使用BootStrap响应式框架
 - Ajax交互数据，尽可能前后端解偶
 - 考虑使用json保存数据
 
进阶：

 - 增加配置文件功能，配置相关设置
  - ~~管理员账户~~
  - 端口
  - 是否匿名
  - 
 - 考虑使用数据库
 - 增加用户注册，登录功能 user
 - 增加加好友，群组功能
 
可能性

 - 编写客户端(电脑端与手机端）
 - Docker一键部署服务端
 
## 设计

网络部分，网页端与聊天数据网络部分分离，不要写在一起  
前后端解偶，静态响应nginx，降低后端服务压力

## 使用