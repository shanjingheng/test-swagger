# ChatHistoryApi

All URIs are relative to *http://a1.easemob.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgNameAppNameChatmessagesGet**](ChatHistoryApi.md#orgNameAppNameChatmessagesGet) | **GET** /{org_name}/{app_name}/chatmessages | Get Message History


<a name="orgNameAppNameChatmessagesGet"></a>
# **orgNameAppNameChatmessagesGet**
> orgNameAppNameChatmessagesGet(orgName, appName, authorization, ql, limit, cursor)

Get Message History



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChatHistoryApi;


ChatHistoryApi apiInstance = new ChatHistoryApi();
String orgName = "orgName_example"; // String | Organization ID
String appName = "appName_example"; // String | Application name
String authorization = "Bearer YWMtLU9T4JRGEea0-Vvai3EzjAAAAVkGz4dZKNSpsVdRvVix2OfSm42w5-IaUL4"; // String | Bearer ${token}
String ql = "select+*+where+timestamp>1403164734226"; // String | Get messages based on starting  timestamp. Could also alter the comparison to get later, equal, or earlier messages. ex. ql=select+*+where+timestamp>1403164734226 or =<[timestamp]
String limit = "3"; // String | total number of messages per page by pagination at a time
String cursor = ""; // String | Get messages by pagination. Obtained \"cursor\" from the previous GET messages call response.
try {
    apiInstance.orgNameAppNameChatmessagesGet(orgName, appName, authorization, ql, limit, cursor);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatHistoryApi#orgNameAppNameChatmessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgName** | **String**| Organization ID |
 **appName** | **String**| Application name |
 **authorization** | **String**| Bearer ${token} | [default to Bearer YWMtLU9T4JRGEea0-Vvai3EzjAAAAVkGz4dZKNSpsVdRvVix2OfSm42w5-IaUL4]
 **ql** | **String**| Get messages based on starting  timestamp. Could also alter the comparison to get later, equal, or earlier messages. ex. ql&#x3D;select+*+where+timestamp&gt;1403164734226 or &#x3D;&lt;[timestamp] | [optional] [default to select+*+where+timestamp&gt;1403164734226]
 **limit** | **String**| total number of messages per page by pagination at a time | [optional] [default to 3]
 **cursor** | **String**| Get messages by pagination. Obtained \&quot;cursor\&quot; from the previous GET messages call response. | [optional] [default to ]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

