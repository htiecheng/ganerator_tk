# 在maven中添加依赖
```
<!--tk.mybatis框架所需的jar包-->
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>1.2.4</version>
</dependency>

```

# 在maven中添加插件
```
<!-- MyBatis 逆向工程 插件 -->
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.5</version>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.37</version>
        </dependency>
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper-generator</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
    <configuration>
        <!--允许移动生成的文件 -->
        <verbose>true</verbose>
        <!-- 是否覆盖 -->
        <overwrite>true</overwrite>
        <!-- 自动生成的配置文件路径 -->
        <configurationFile>src/main/resources/config/generatorConfig.xml</configurationFile>
    </configuration>
</plugin>
```

# 在resources/config中添加generateConfig.xml

需要额外添加
```
<!--使用tkMyBatis框架生成mapper-->
<plugin type="tk.mybatis.mapper.generator.MapperPlugin">
    <property name="mappers"
              value="tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper"/>
</plugin>
```
![](https://github.com/htiecheng/ganerator_tk/blob/master/image/addplugins.png)


# 使用插件运行
* 进入配置

![](https://github.com/htiecheng/ganerator_tk/blob/master/image/plugins1.png)

* 设置maven

![](https://github.com/htiecheng/ganerator_tk/blob/master/image/plugins2.png)

* 双击运行插件

![](https://github.com/htiecheng/ganerator_tk/blob/master/image/plugins3.png)
