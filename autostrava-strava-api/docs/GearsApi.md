# GearsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGearById**](GearsApi.md#getGearById) | **GET** /gear/{id} | Get Equipment



## getGearById

> DetailedGearDTO getGearById(id)

Get Equipment

Returns an equipment using its identifier.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.GearsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        GearsApi apiInstance = new GearsApi(defaultClient);
        String id = "id_example"; // String | The identifier of the gear.
        try {
            DetailedGearDTO result = apiInstance.getGearById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GearsApi#getGearById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The identifier of the gear. |

### Return type

[**DetailedGearDTO**](DetailedGearDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A representation of the gear. |  -  |
| **0** | Unexpected error. |  -  |

