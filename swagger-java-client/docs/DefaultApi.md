# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addABGet**](DefaultApi.md#addABGet) | **GET** /add/{a}/{b} | 
[**divABGet**](DefaultApi.md#divABGet) | **GET** /div/{a}/{b} | 
[**mulABGet**](DefaultApi.md#mulABGet) | **GET** /mul/{a}/{b} | 
[**rootGet**](DefaultApi.md#rootGet) | **GET** / | 
[**rootPost**](DefaultApi.md#rootPost) | **POST** / | 
[**subABGet**](DefaultApi.md#subABGet) | **GET** /sub/{a}/{b} | 


<a name="addABGet"></a>
# **addABGet**
> Result addABGet(a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    Result result = apiInstance.addABGet(a, b);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addABGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="divABGet"></a>
# **divABGet**
> Result divABGet(a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    Result result = apiInstance.divABGet(a, b);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#divABGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mulABGet"></a>
# **mulABGet**
> Result mulABGet(a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    Result result = apiInstance.mulABGet(a, b);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#mulABGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rootGet"></a>
# **rootGet**
> Result rootGet(op, a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String op = "op_example"; // String | 
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    Result result = apiInstance.rootGet(op, a, b);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rootGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **String**|  | [optional]
 **a** | **String**|  | [optional]
 **b** | **String**|  | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rootPost"></a>
# **rootPost**
> Result rootPost(input)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Input input = new Input(); // Input | 
try {
    Result result = apiInstance.rootPost(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rootPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**Input**](Input.md)|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subABGet"></a>
# **subABGet**
> Result subABGet(a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    Result result = apiInstance.subABGet(a, b);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subABGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

