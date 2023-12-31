# MOMO API

> 一个丰富的API开放调用平台，为开发者提供便捷、实用、安全的API调用体验； Java + React 全栈项目，包括网站前台+后台
>
>
> 
>
> 在线体验地址：[MOMO API](http://81.69.163.231:8000/)
>





## 项目背景

&emsp;&emsp;我的初衷是尽可能帮助和服务更多的用户和开发者，让他们更加方便快捷的获取他们想要的信息和功能。
接口平台可以帮助开发者快速接入一些常用的服务，从而提高他们的开发效率，比如随机头像，随机壁纸，随机动漫图片(二次元爱好者专用)等服务，他们是一些应用或者小程序常见的功能，所以提供这些接口可以帮助开发者更加方便地实现这些功能。这些接口也可以让用户在使用应用时获得更加全面的功能和服务，从而提高他们的用户体验




## 技术栈

### 前端技术栈

- 开发框架：React、Umi
- 脚手架：Ant Design Pro
- 组件库：Ant Design、Ant Design Components
- 语法扩展：TypeScript、Less
- 打包工具：Webpack
- 代码规范：ESLint、StyleLint、Prettier



### 后端技术栈

- 主语言：Java
- 框架：SpringBoot 2.7.0、Mybatis-plus、Spring Cloud
- 数据库：Mysql8.0、Redis
- 中间件：RabbitMq
- 注册中心：Nacos
- 服务调用：Dubbo
- 网关：Spring Cloud Gateway
- 负载均衡：Spring cloud Loadbalancer



## 项目模块

- api-frontend ：为项目前端，前端项目启动具体看readme.md文档
- api-common ：为公共封装类（如公共实体、公共常量，统一响应实体，统一异常处理）
- api-backend ：为接口管理平台，主要包括用户、接口相关的功能
- api-gateway ：为网关服务，**涉及到网关限流，统一鉴权，统一日志处理，接口统计，接口数据一致性处理**
- api-interface：为接口服务，提供可供调用的接口
- api-sdk：提供给开发者的SDK







## 功能模块

> 🌟 亮点功能 🚀 未来计划

- 用户、管理员
  - 登录注册
  - 个人主页，包括上传头像，显示密钥，重新生成ak,sk
  - 管理员：用户管理
  - 管理员：接口管理
  - 管理员：接口分析
- 接口
  - 浏览接口信息
  - 🌟 数字签名校验接口调用权限
  - 🌟 SDK调用接口
  - 接口搜索 (🚀)
  - 购买接口 (🚀)
  - 下载SDK
  - 用户上传自己的接口（🚀）
- 订单 (🚀)
  - 创建订单
  - 订单超时回滚
  - 支付宝沙箱支付
