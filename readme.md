## 简述
>### 服务器
>+  server端采用springboot作为测试
>+  使用springfox-swagger2 jar包可根据swagger注解动态生成swagger.json
>+  使用springfox-swagger-ui可动态生成html格式api文档
>+  使用application.properties可以配置host和port等

>### 客户端
>+  将生成的swagger.json文件保存
>+  用swagger-codegen-cli jar包来生成java客户端
>+  命令如下java -jar swagger-codegen-cli-2.2.1.jar generate -i test-swagger.json -l java -o c:\test\java_test_api_client
>+  使用客户端生成的test测试正常

>### 问题
>+  目前还没找到服务器端怎么设置schemes[http]自动手动在swagger.json中添加，虽然文档说明默认http访问，但实际客户端生成代码的默认url为https://host/port
>+  注解需要明确指定products和consumes类型 否则默认生成代码可能有误，错误状态码为406
