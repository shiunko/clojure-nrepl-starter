# clojure-nrepl-starter

### 这是什么?
这个是一个Spring-boot的nrepl快速启动组件,在Maven中引入该依赖后可以快速在Spring-boot项目中启动一个`Clojure-Cider-Nrepl`.

### 可以做什么?
启动`Nrepl`后可以直接连接到该服务,连接后可以直接获取Spring上下文中的Bean,并且直接调用Bean的方法/查看当前属性状态


### 如何使用
直接在项目的`pom.xml`里引入依赖
```xml
<dependency>
  <groupId>com.github.shiunko</groupId>
  <artifactId>clojure-nrepl-starter</artifactId>
  <version>1.0.0</version>
</dependency>
```
然后配置
```properties
#是否启动,默认不启动
clojure.nrepl.state=true
#服务绑定的端口,默认18848
clojure.nrepl.port=18848
#服务绑定的IP,默认localhost
clojure.nrepl.bind=192.168.1.101
#仅在以下环境中启动,默认为dev,优先级高于state
clojure.nrepl.mode=dev,test
```