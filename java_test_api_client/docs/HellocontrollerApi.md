# HellocontrollerApi

All URIs are relative to *http://localhost:10086/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helloUsingGET**](HellocontrollerApi.md#helloUsingGET) | **GET** /{name}/hello | 测试接口


<a name="helloUsingGET"></a>
# **helloUsingGET**
> Map&lt;String, String&gt; helloUsingGET(name)

测试接口

这个接口通过输入一个名字，返回hell:name信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HellocontrollerApi;


HellocontrollerApi apiInstance = new HellocontrollerApi();
String name = "name_example"; // String | 测试输入
try {
    Map<String, String> result = apiInstance.helloUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HellocontrollerApi#helloUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| 测试输入 |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

