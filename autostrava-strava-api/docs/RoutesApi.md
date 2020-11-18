# RoutesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteAsGPX**](RoutesApi.md#getRouteAsGPX) | **GET** /routes/{id}/export_gpx | Export Route GPX
[**getRouteAsTCX**](RoutesApi.md#getRouteAsTCX) | **GET** /routes/{id}/export_tcx | Export Route TCX
[**getRouteById**](RoutesApi.md#getRouteById) | **GET** /routes/{id} | Get Route
[**getRoutesByAthleteId**](RoutesApi.md#getRoutesByAthleteId) | **GET** /athletes/{id}/routes | List Athlete Routes



## getRouteAsGPX

> File getRouteAsGPX(id)

Export Route GPX

Returns a GPX file of the route. Requires read_all scope for private routes.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.RoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RoutesApi apiInstance = new RoutesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the route.
        try {
            File result = apiInstance.getRouteAsGPX(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutesApi#getRouteAsGPX");
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
 **id** | **Long**| The identifier of the route. |

### Return type

[**File**](File.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/gpx+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A GPX file with the route. |  -  |
| **0** | Unexpected error. |  -  |


## getRouteAsTCX

> File getRouteAsTCX(id)

Export Route TCX

Returns a TCX file of the route. Requires read_all scope for private routes.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.RoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RoutesApi apiInstance = new RoutesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the route.
        try {
            File result = apiInstance.getRouteAsTCX(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutesApi#getRouteAsTCX");
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
 **id** | **Long**| The identifier of the route. |

### Return type

[**File**](File.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/tcx+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A TCX file with the route. |  -  |
| **0** | Unexpected error. |  -  |


## getRouteById

> RouteDTO getRouteById(id)

Get Route

Returns a route using its identifier. Requires read_all scope for private routes.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.RoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RoutesApi apiInstance = new RoutesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the route.
        try {
            RouteDTO result = apiInstance.getRouteById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutesApi#getRouteById");
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
 **id** | **Long**| The identifier of the route. |

### Return type

[**RouteDTO**](RouteDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A representation of the route. |  -  |
| **0** | Unexpected error. |  -  |


## getRoutesByAthleteId

> List&lt;RouteDTO&gt; getRoutesByAthleteId(id, page, perPage)

List Athlete Routes

Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.RoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RoutesApi apiInstance = new RoutesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the athletee.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<RouteDTO> result = apiInstance.getRoutesByAthleteId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutesApi#getRoutesByAthleteId");
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
 **id** | **Long**| The identifier of the athletee. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;RouteDTO&gt;**](RouteDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A representation of the route. |  -  |
| **0** | Unexpected error. |  -  |

