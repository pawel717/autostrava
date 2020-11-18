# SegmentEffortsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEffortsBySegmentId**](SegmentEffortsApi.md#getEffortsBySegmentId) | **GET** /segment_efforts | List Segment Efforts
[**getSegmentEffortById**](SegmentEffortsApi.md#getSegmentEffortById) | **GET** /segment_efforts/{id} | Get Segment Effort



## getEffortsBySegmentId

> List&lt;DetailedSegmentEffortDTO&gt; getEffortsBySegmentId(segmentId, startDateLocal, endDateLocal, perPage)

List Segment Efforts

Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.SegmentEffortsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentEffortsApi apiInstance = new SegmentEffortsApi(defaultClient);
        Integer segmentId = 56; // Integer | The identifier of the segment.
        OffsetDateTime startDateLocal = new OffsetDateTime(); // OffsetDateTime | ISO 8601 formatted date time.
        OffsetDateTime endDateLocal = new OffsetDateTime(); // OffsetDateTime | ISO 8601 formatted date time.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<DetailedSegmentEffortDTO> result = apiInstance.getEffortsBySegmentId(segmentId, startDateLocal, endDateLocal, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEffortsApi#getEffortsBySegmentId");
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
 **segmentId** | **Integer**| The identifier of the segment. |
 **startDateLocal** | **OffsetDateTime**| ISO 8601 formatted date time. | [optional]
 **endDateLocal** | **OffsetDateTime**| ISO 8601 formatted date time. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;DetailedSegmentEffortDTO&gt;**](DetailedSegmentEffortDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of segment efforts. |  -  |
| **0** | Unexpected error. |  -  |


## getSegmentEffortById

> DetailedSegmentEffortDTO getSegmentEffortById(id)

Get Segment Effort

Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.SegmentEffortsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentEffortsApi apiInstance = new SegmentEffortsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the segment effort.
        try {
            DetailedSegmentEffortDTO result = apiInstance.getSegmentEffortById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentEffortsApi#getSegmentEffortById");
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
 **id** | **Long**| The identifier of the segment effort. |

### Return type

[**DetailedSegmentEffortDTO**](DetailedSegmentEffortDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of a segment effort. |  -  |
| **0** | Unexpected error. |  -  |

