##Swagger Codegen使用
>###使用swagger codegen编译线上json文件时，需要修改一下几点内容
>+  第8行`"host":"api.hyphenate.io"`修改为`"host":"a1.easemob.com",`
>+  第47行`  "schemes": []`修改为`"schemes": ["http"]`
>+  在每个接口的response描述中需增加关于200状态码的描述并指定返回类型e.g.:`"200":{"description":"OK","schema":{"type":"object"}`
>###生成java客户端
>+  使用命令`java -jar swagger-codegen-cli-2.2.1.jar generate -i hyphenate_hy.json -l java -o c:\test\java_test_api_client`生成客户端
>+  -i参数指json/yaml文件的路径
>+  -l参数指生成客户端的语言
>+  -o指生成客户端的路径
>###说明
>+  应在服务器接口中添加注解response=200的相关描述和返回值类型，否则自动生成的代码默认泛型为Void拿不到返回的json数据
>+  手动修改json文件测试两个接口，结果正常
