## PocketCat
> PocketCat  寓意：猫古怪精灵，善于发现新鲜事物。口袋猫意味着随时随地发现新的信息

### 写在前面
- 本作品是即将面临毕业的我的毕业设计，课题名为：校园兼职系统
- 由于指导老师的督促，所以这段时间连忙开启了项目(〃'▽'〃)
- 之前的计划是打算使用angular2和springboot写这样一个项目，但是由于时间比较紧张，所以就更改了计划
- φ(>ω<*) 本项目从`2018/02/26`开始到`2018/3/1`基本完成，项目的话其实很简单，就是数据的CURD操作

### 技术设计
> 由于我是做`Android`的，所以在后台以及网页前端上都显的略微吃力，还好有朋友的帮助٩(๑>◡<๑)۶ 

- 后台使用`SpringBoot`进行设计
- 数据库: `mysql`
- 数据库管理：`MyBatis`
- 使用`Jsoup`进行数据的抓取
- 使用`thymeleaf`进行数据的展示
- 使用`Gitalk`进行留言板的设计
- 使用`BootStrap`进行后台的设计，后台是找的模板进行修改过的(｀・ω・´)
- 系统设计遵循`MVC`架构ヾ(=･ω･=)o

### 开始使用

### 源码编译运行
- git clone https://github.com/monsterLin/PocketCat.git
- 打开Intellij IDEA
- 配置`application.properties`
- 配置[gitalk](https://github.com/gitalk/gitalk)，具体页面在`resources/templates/bbs.html`
- 编译运行||构建打包，使用如下命令：

```
cd 项目跟目录（和pom.xml同级）

//排除测试代码后进行打包
//前提是电脑配置了MAVEN环境变量
mvn clean package  -Dmaven.test.skip=true

```

### 直接运行jar文件
- 下载目标文件: [点我下载](http://oszh5svp5.bkt.clouddn.com/pocketcat/PocketCat-1.0.0-SNAPSHOT.jar)
- 使用如下命令运行：

```
//控制台开启，则服务运行；相反，则服务停止
java -jar  PocketCat-1.0.0-SNAPSHOT.jar

//保持服务挂起状态
java -jar PocketCat-1.0.0-SNAPSHOT.jar &

//在启动的时候选择读取不同的配置文件
java -jar app.jar --spring.profiles.active=dev

//在启动的时候设置jvm参数
java -Xms10m -Xmx80m -jar PocketCat-1.0.0-SNAPSHOT.jar &

```


### 项目预览
![pic01](http://oszh5svp5.bkt.clouddn.com/pocketcat/pic01.png)
![pic07](http://oszh5svp5.bkt.clouddn.com/pocketcat/pic07.png)

### 相关资料
- [Spring Boot系列文章](http://www.ityouknow.com/spring-boot.html)
- [tinypng图片压缩](https://tinypng.com/)
- [gitalk评论插件](https://github.com/gitalk/gitalk)
- [spring4all](http://www.spring4all.com/)
