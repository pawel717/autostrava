# ActivitiesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActivity**](ActivitiesApi.md#createActivity) | **POST** /activities | Create an Activity
[**getActivityById**](ActivitiesApi.md#getActivityById) | **GET** /activities/{id} | Get Activity
[**getCommentsByActivityId**](ActivitiesApi.md#getCommentsByActivityId) | **GET** /activities/{id}/comments | List Activity Comments
[**getKudoersByActivityId**](ActivitiesApi.md#getKudoersByActivityId) | **GET** /activities/{id}/kudos | List Activity Kudoers
[**getLapsByActivityId**](ActivitiesApi.md#getLapsByActivityId) | **GET** /activities/{id}/laps | List Activity Laps
[**getLoggedInAthleteActivities**](ActivitiesApi.md#getLoggedInAthleteActivities) | **GET** /athlete/activities | List Athlete Activities
[**getZonesByActivityId**](ActivitiesApi.md#getZonesByActivityId) | **GET** /activities/{id}/zones | Get Activity Zones
[**updateActivityById**](ActivitiesApi.md#updateActivityById) | **PUT** /activities/{id} | Update Activity



## createActivity

> DetailedActivityDTO createActivity(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute)

Create an Activity

Creates a manual activity for an athlete, requires activity:write scope.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String name = "name_example"; // String | The name of the activity.
        String type = "type_example"; // String | Type of activity. For example - Run, Ride etc.
        OffsetDateTime startDateLocal = new OffsetDateTime(); // OffsetDateTime | ISO 8601 formatted date time.
        Integer elapsedTime = 56; // Integer | In seconds.
        String description = "description_example"; // String | Description of the activity.
        Float distance = 3.4F; // Float | In meters.
        Integer trainer = 56; // Integer | Set to 1 to mark as a trainer activity.
        Integer commute = 56; // Integer | Set to 1 to mark as commute.
        try {
            DetailedActivityDTO result = apiInstance.createActivity(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#createActivity");
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
 **name** | **String**| The name of the activity. |
 **type** | **String**| Type of activity. For example - Run, Ride etc. |
 **startDateLocal** | **OffsetDateTime**| ISO 8601 formatted date time. |
 **elapsedTime** | **Integer**| In seconds. |
 **description** | **String**| Description of the activity. | [optional]
 **distance** | **Float**| In meters. | [optional]
 **trainer** | **Integer**| Set to 1 to mark as a trainer activity. | [optional]
 **commute** | **Integer**| Set to 1 to mark as commute. | [optional]

### Return type

[**DetailedActivityDTO**](DetailedActivityDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |


## getActivityById

> DetailedActivityDTO getActivityById(id, includeAllEfforts)

Get Activity

Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Boolean includeAllEfforts = true; // Boolean | To include all segments efforts.
        try {
            DetailedActivityDTO result = apiInstance.getActivityById(id, includeAllEfforts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getActivityById");
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
 **id** | **Long**| The identifier of the activity. |
 **includeAllEfforts** | **Boolean**| To include all segments efforts. | [optional]

### Return type

[**DetailedActivityDTO**](DetailedActivityDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |


## getCommentsByActivityId

> List&lt;CommentDTO&gt; getCommentsByActivityId(id, page, perPage)

List Activity Comments

Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<CommentDTO> result = apiInstance.getCommentsByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getCommentsByActivityId");
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
 **id** | **Long**| The identifier of the activity. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;CommentDTO&gt;**](CommentDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Comments. |  -  |
| **0** | Unexpected error. |  -  |


## getKudoersByActivityId

> List&lt;SummaryAthleteDTO&gt; getKudoersByActivityId(id, page, perPage)

List Activity Kudoers

Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryAthleteDTO> result = apiInstance.getKudoersByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getKudoersByActivityId");
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
 **id** | **Long**| The identifier of the activity. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryAthleteDTO&gt;**](SummaryAthleteDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Comments. |  -  |
| **0** | Unexpected error. |  -  |


## getLapsByActivityId

> List&lt;LapDTO&gt; getLapsByActivityId(id)

List Activity Laps

Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        try {
            List<LapDTO> result = apiInstance.getLapsByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLapsByActivityId");
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
 **id** | **Long**| The identifier of the activity. |

### Return type

[**List&lt;LapDTO&gt;**](LapDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity Laps. |  -  |
| **0** | Unexpected error. |  -  |


## getLoggedInAthleteActivities

> List&lt;SummaryActivityDTO&gt; getLoggedInAthleteActivities(before, after, page, perPage)

List Athlete Activities

Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Integer before = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place before a certain time.
        Integer after = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place after a certain time.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryActivityDTO> result = apiInstance.getLoggedInAthleteActivities(before, after, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLoggedInAthleteActivities");
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
 **before** | **Integer**| An epoch timestamp to use for filtering activities that have taken place before a certain time. | [optional]
 **after** | **Integer**| An epoch timestamp to use for filtering activities that have taken place after a certain time. | [optional]
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryActivityDTO&gt;**](SummaryActivityDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The authenticated athlete&#39;s activities |  -  |
| **0** | Unexpected error. |  -  |


## getZonesByActivityId

> List&lt;ActivityZoneDTO&gt; getZonesByActivityId(id)

Get Activity Zones

Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        try {
            List<ActivityZoneDTO> result = apiInstance.getZonesByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getZonesByActivityId");
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
 **id** | **Long**| The identifier of the activity. |

### Return type

[**List&lt;ActivityZoneDTO&gt;**](ActivityZoneDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity Zones. |  -  |
| **0** | Unexpected error. |  -  |


## updateActivityById

> DetailedActivityDTO updateActivityById(id, body)

Update Activity

Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        UpdatableActivityDTO body = new UpdatableActivityDTO(); // UpdatableActivityDTO | 
        try {
            DetailedActivityDTO result = apiInstance.updateActivityById(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#updateActivityById");
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
 **id** | **Long**| The identifier of the activity. |
 **body** | [**UpdatableActivityDTO**](UpdatableActivityDTO.md)|  | [optional]

### Return type

[**DetailedActivityDTO**](DetailedActivityDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |

