# ClubsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClubActivitiesById**](ClubsApi.md#getClubActivitiesById) | **GET** /clubs/{id}/activities | List Club Activities
[**getClubAdminsById**](ClubsApi.md#getClubAdminsById) | **GET** /clubs/{id}/admins | List Club Administrators
[**getClubById**](ClubsApi.md#getClubById) | **GET** /clubs/{id} | Get Club
[**getClubMembersById**](ClubsApi.md#getClubMembersById) | **GET** /clubs/{id}/members | List Club Members
[**getLoggedInAthleteClubs**](ClubsApi.md#getLoggedInAthleteClubs) | **GET** /athlete/clubs | List Athlete Clubs



## getClubActivitiesById

> List&lt;SummaryActivityDTO&gt; getClubActivitiesById(id, page, perPage)

List Club Activities

Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ClubsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ClubsApi apiInstance = new ClubsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the club.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryActivityDTO> result = apiInstance.getClubActivitiesById(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClubsApi#getClubActivitiesById");
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
 **id** | **Long**| The identifier of the club. |
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
| **200** | A list of activities. |  -  |
| **0** | Unexpected error. |  -  |


## getClubAdminsById

> List&lt;SummaryAthleteDTO&gt; getClubAdminsById(id, page, perPage)

List Club Administrators

Returns a list of the administrators of a given club.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ClubsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ClubsApi apiInstance = new ClubsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the club.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryAthleteDTO> result = apiInstance.getClubAdminsById(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClubsApi#getClubAdminsById");
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
 **id** | **Long**| The identifier of the club. |
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
| **200** | A list of summary athlete representations. |  -  |
| **0** | Unexpected error. |  -  |


## getClubById

> DetailedClubDTO getClubById(id)

Get Club

Returns a given club using its identifier.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ClubsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ClubsApi apiInstance = new ClubsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the club.
        try {
            DetailedClubDTO result = apiInstance.getClubById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClubsApi#getClubById");
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
 **id** | **Long**| The identifier of the club. |

### Return type

[**DetailedClubDTO**](DetailedClubDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The detailed representation of a club. |  -  |
| **0** | Unexpected error. |  -  |


## getClubMembersById

> List&lt;SummaryAthleteDTO&gt; getClubMembersById(id, page, perPage)

List Club Members

Returns a list of the athletes who are members of a given club.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ClubsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ClubsApi apiInstance = new ClubsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the club.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryAthleteDTO> result = apiInstance.getClubMembersById(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClubsApi#getClubMembersById");
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
 **id** | **Long**| The identifier of the club. |
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
| **200** | A list of summary athlete representations. |  -  |
| **0** | Unexpected error. |  -  |


## getLoggedInAthleteClubs

> List&lt;SummaryClubDTO&gt; getLoggedInAthleteClubs(page, perPage)

List Athlete Clubs

Returns a list of the clubs whose membership includes the authenticated athlete.

### Example

```java
// Import classes:
import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.ApiException;
import com.autostrava.api.gen.Configuration;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.models.*;
import com.autostrava.api.gen.client.ClubsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ClubsApi apiInstance = new ClubsApi(defaultClient);
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryClubDTO> result = apiInstance.getLoggedInAthleteClubs(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClubsApi#getLoggedInAthleteClubs");
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
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryClubDTO&gt;**](SummaryClubDTO.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of summary club representations. |  -  |
| **0** | Unexpected error. |  -  |

