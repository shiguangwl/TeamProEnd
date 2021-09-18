# 随手记

社区,影视,TODO,通讯
基于人人fast快速开发,添加一个注册功能.权限管理由renren-fast接管,专注开发业务.

分类区分板块:
 博客,日记,
 将博客系统改造为多人
 用户通讯 TODO

-

TODO

- 按需开发

Video

- 通用解析模块

通讯模块



2021年9月12日

 放弃微服务架构.

2021年9月14日:

​	新环境搭建 -  依赖BUG

2021年9月15日:

​	无依赖问题

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>2.3.2.RELEASE</version>
            <type>pom</type>     <!-- 没加这两行!!!!!! -->
            <scope>import</scope>
            <!-- import只能用在dependencyManagement块中，它将spring-boot-dependencies 中				dependencyManagement下的dependencies插入到当前工程的dependencyManagement中，所以不存在依赖传递。
当没有<scope>import</scope>时，意思是将spring-boot-dependencies 的dependencies全部插入到当前工程的dependencies中，并且会依赖传递。
			-->
        </dependency>
    </dependencies>
</dependencyManagement>
```

奇奇怪怪的依赖问题

搞了三个小时项目结构~!  细节问题

2021年9月16日:

​	搞项目结构第三天~遇到奇奇怪怪的BUG折磨~不同包下出现Bean异常,放到相同路径就没问题.捣鼓最后还是吧fast包路劲改成com.xxhoz~浪费几天时间~项目还没开始业务逻辑编写~

