# openapi-java-client

Strava API v3

- API version: 3.0.0

- Build date: 2020-11-17T18:32:36.104+01:00[Europe/Belgrade]

The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>3.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:3.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-3.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.autostrava.api.gen.*;
import com.autostrava.api.gen.auth.*;
import com.autostrava.api.gen.dto.*;
import com.autostrava.api.gen.client.ActivitiesApi;

public class ActivitiesApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://www.strava.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**createActivity**](docs/ActivitiesApi.md#createActivity) | **POST** /activities | Create an Activity
*ActivitiesApi* | [**getActivityById**](docs/ActivitiesApi.md#getActivityById) | **GET** /activities/{id} | Get Activity
*ActivitiesApi* | [**getCommentsByActivityId**](docs/ActivitiesApi.md#getCommentsByActivityId) | **GET** /activities/{id}/comments | List Activity Comments
*ActivitiesApi* | [**getKudoersByActivityId**](docs/ActivitiesApi.md#getKudoersByActivityId) | **GET** /activities/{id}/kudos | List Activity Kudoers
*ActivitiesApi* | [**getLapsByActivityId**](docs/ActivitiesApi.md#getLapsByActivityId) | **GET** /activities/{id}/laps | List Activity Laps
*ActivitiesApi* | [**getLoggedInAthleteActivities**](docs/ActivitiesApi.md#getLoggedInAthleteActivities) | **GET** /athlete/activities | List Athlete Activities
*ActivitiesApi* | [**getZonesByActivityId**](docs/ActivitiesApi.md#getZonesByActivityId) | **GET** /activities/{id}/zones | Get Activity Zones
*ActivitiesApi* | [**updateActivityById**](docs/ActivitiesApi.md#updateActivityById) | **PUT** /activities/{id} | Update Activity
*AthletesApi* | [**getLoggedInAthlete**](docs/AthletesApi.md#getLoggedInAthlete) | **GET** /athlete | Get Authenticated Athlete
*AthletesApi* | [**getLoggedInAthleteZones**](docs/AthletesApi.md#getLoggedInAthleteZones) | **GET** /athlete/zones | Get Zones
*AthletesApi* | [**getStats**](docs/AthletesApi.md#getStats) | **GET** /athletes/{id}/stats | Get Athlete Stats
*AthletesApi* | [**updateLoggedInAthlete**](docs/AthletesApi.md#updateLoggedInAthlete) | **PUT** /athlete | Update Athlete
*ClubsApi* | [**getClubActivitiesById**](docs/ClubsApi.md#getClubActivitiesById) | **GET** /clubs/{id}/activities | List Club Activities
*ClubsApi* | [**getClubAdminsById**](docs/ClubsApi.md#getClubAdminsById) | **GET** /clubs/{id}/admins | List Club Administrators
*ClubsApi* | [**getClubById**](docs/ClubsApi.md#getClubById) | **GET** /clubs/{id} | Get Club
*ClubsApi* | [**getClubMembersById**](docs/ClubsApi.md#getClubMembersById) | **GET** /clubs/{id}/members | List Club Members
*ClubsApi* | [**getLoggedInAthleteClubs**](docs/ClubsApi.md#getLoggedInAthleteClubs) | **GET** /athlete/clubs | List Athlete Clubs
*GearsApi* | [**getGearById**](docs/GearsApi.md#getGearById) | **GET** /gear/{id} | Get Equipment
*RoutesApi* | [**getRouteAsGPX**](docs/RoutesApi.md#getRouteAsGPX) | **GET** /routes/{id}/export_gpx | Export Route GPX
*RoutesApi* | [**getRouteAsTCX**](docs/RoutesApi.md#getRouteAsTCX) | **GET** /routes/{id}/export_tcx | Export Route TCX
*RoutesApi* | [**getRouteById**](docs/RoutesApi.md#getRouteById) | **GET** /routes/{id} | Get Route
*RoutesApi* | [**getRoutesByAthleteId**](docs/RoutesApi.md#getRoutesByAthleteId) | **GET** /athletes/{id}/routes | List Athlete Routes
*RunningRacesApi* | [**getRunningRaceById**](docs/RunningRacesApi.md#getRunningRaceById) | **GET** /running_races/{id} | Get Running Race
*RunningRacesApi* | [**getRunningRaces**](docs/RunningRacesApi.md#getRunningRaces) | **GET** /running_races | List Running Races
*SegmentEffortsApi* | [**getEffortsBySegmentId**](docs/SegmentEffortsApi.md#getEffortsBySegmentId) | **GET** /segment_efforts | List Segment Efforts
*SegmentEffortsApi* | [**getSegmentEffortById**](docs/SegmentEffortsApi.md#getSegmentEffortById) | **GET** /segment_efforts/{id} | Get Segment Effort
*SegmentsApi* | [**exploreSegments**](docs/SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
*SegmentsApi* | [**getLoggedInAthleteStarredSegments**](docs/SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
*SegmentsApi* | [**getSegmentById**](docs/SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
*SegmentsApi* | [**starSegment**](docs/SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment
*StreamsApi* | [**getActivityStreams**](docs/StreamsApi.md#getActivityStreams) | **GET** /activities/{id}/streams | Get Activity Streams
*StreamsApi* | [**getRouteStreams**](docs/StreamsApi.md#getRouteStreams) | **GET** /routes/{id}/streams | Get Route Streams
*StreamsApi* | [**getSegmentEffortStreams**](docs/StreamsApi.md#getSegmentEffortStreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
*StreamsApi* | [**getSegmentStreams**](docs/StreamsApi.md#getSegmentStreams) | **GET** /segments/{id}/streams | Get Segment Streams
*UploadsApi* | [**createUpload**](docs/UploadsApi.md#createUpload) | **POST** /uploads | Upload Activity
*UploadsApi* | [**getUploadById**](docs/UploadsApi.md#getUploadById) | **GET** /uploads/{uploadId} | Get Upload


## Documentation for Models

 - [ActivityStatsDTO](docs/ActivityStatsDTO.md)
 - [ActivityTotalDTO](docs/ActivityTotalDTO.md)
 - [ActivityTypeDTO](docs/ActivityTypeDTO.md)
 - [ActivityZoneDTO](docs/ActivityZoneDTO.md)
 - [AltitudeStreamAllOfDTO](docs/AltitudeStreamAllOfDTO.md)
 - [AltitudeStreamDTO](docs/AltitudeStreamDTO.md)
 - [BaseStreamDTO](docs/BaseStreamDTO.md)
 - [CadenceStreamAllOfDTO](docs/CadenceStreamAllOfDTO.md)
 - [CadenceStreamDTO](docs/CadenceStreamDTO.md)
 - [CommentDTO](docs/CommentDTO.md)
 - [DetailedActivityAllOfDTO](docs/DetailedActivityAllOfDTO.md)
 - [DetailedActivityDTO](docs/DetailedActivityDTO.md)
 - [DetailedAthleteAllOfDTO](docs/DetailedAthleteAllOfDTO.md)
 - [DetailedAthleteDTO](docs/DetailedAthleteDTO.md)
 - [DetailedClubAllOfDTO](docs/DetailedClubAllOfDTO.md)
 - [DetailedClubDTO](docs/DetailedClubDTO.md)
 - [DetailedGearAllOfDTO](docs/DetailedGearAllOfDTO.md)
 - [DetailedGearDTO](docs/DetailedGearDTO.md)
 - [DetailedSegmentAllOfDTO](docs/DetailedSegmentAllOfDTO.md)
 - [DetailedSegmentDTO](docs/DetailedSegmentDTO.md)
 - [DetailedSegmentEffortAllOfDTO](docs/DetailedSegmentEffortAllOfDTO.md)
 - [DetailedSegmentEffortDTO](docs/DetailedSegmentEffortDTO.md)
 - [DistanceStreamAllOfDTO](docs/DistanceStreamAllOfDTO.md)
 - [DistanceStreamDTO](docs/DistanceStreamDTO.md)
 - [ErrorDTO](docs/ErrorDTO.md)
 - [ExplorerResponseDTO](docs/ExplorerResponseDTO.md)
 - [ExplorerSegmentDTO](docs/ExplorerSegmentDTO.md)
 - [FaultDTO](docs/FaultDTO.md)
 - [HeartRateZoneRangesDTO](docs/HeartRateZoneRangesDTO.md)
 - [HeartrateStreamAllOfDTO](docs/HeartrateStreamAllOfDTO.md)
 - [HeartrateStreamDTO](docs/HeartrateStreamDTO.md)
 - [LapDTO](docs/LapDTO.md)
 - [LatLngStreamAllOfDTO](docs/LatLngStreamAllOfDTO.md)
 - [LatLngStreamDTO](docs/LatLngStreamDTO.md)
 - [MetaActivityDTO](docs/MetaActivityDTO.md)
 - [MetaAthleteDTO](docs/MetaAthleteDTO.md)
 - [MetaClubDTO](docs/MetaClubDTO.md)
 - [MovingStreamAllOfDTO](docs/MovingStreamAllOfDTO.md)
 - [MovingStreamDTO](docs/MovingStreamDTO.md)
 - [PhotosSummaryDTO](docs/PhotosSummaryDTO.md)
 - [PhotosSummaryPrimaryDTO](docs/PhotosSummaryPrimaryDTO.md)
 - [PolylineMapDTO](docs/PolylineMapDTO.md)
 - [PowerStreamAllOfDTO](docs/PowerStreamAllOfDTO.md)
 - [PowerStreamDTO](docs/PowerStreamDTO.md)
 - [PowerZoneRangesDTO](docs/PowerZoneRangesDTO.md)
 - [RouteDTO](docs/RouteDTO.md)
 - [RunningRaceDTO](docs/RunningRaceDTO.md)
 - [SmoothGradeStreamAllOfDTO](docs/SmoothGradeStreamAllOfDTO.md)
 - [SmoothGradeStreamDTO](docs/SmoothGradeStreamDTO.md)
 - [SmoothVelocityStreamAllOfDTO](docs/SmoothVelocityStreamAllOfDTO.md)
 - [SmoothVelocityStreamDTO](docs/SmoothVelocityStreamDTO.md)
 - [SplitDTO](docs/SplitDTO.md)
 - [StreamSetDTO](docs/StreamSetDTO.md)
 - [SummaryActivityAllOfDTO](docs/SummaryActivityAllOfDTO.md)
 - [SummaryActivityDTO](docs/SummaryActivityDTO.md)
 - [SummaryAthleteAllOfDTO](docs/SummaryAthleteAllOfDTO.md)
 - [SummaryAthleteDTO](docs/SummaryAthleteDTO.md)
 - [SummaryClubAllOfDTO](docs/SummaryClubAllOfDTO.md)
 - [SummaryClubDTO](docs/SummaryClubDTO.md)
 - [SummaryGearDTO](docs/SummaryGearDTO.md)
 - [SummaryPRSegmentEffortDTO](docs/SummaryPRSegmentEffortDTO.md)
 - [SummarySegmentDTO](docs/SummarySegmentDTO.md)
 - [SummarySegmentEffortDTO](docs/SummarySegmentEffortDTO.md)
 - [TemperatureStreamAllOfDTO](docs/TemperatureStreamAllOfDTO.md)
 - [TemperatureStreamDTO](docs/TemperatureStreamDTO.md)
 - [TimeStreamAllOfDTO](docs/TimeStreamAllOfDTO.md)
 - [TimeStreamDTO](docs/TimeStreamDTO.md)
 - [TimedZoneRangeAllOfDTO](docs/TimedZoneRangeAllOfDTO.md)
 - [TimedZoneRangeDTO](docs/TimedZoneRangeDTO.md)
 - [UpdatableActivityDTO](docs/UpdatableActivityDTO.md)
 - [UploadDTO](docs/UploadDTO.md)
 - [ZoneRangeDTO](docs/ZoneRangeDTO.md)
 - [ZonesDTO](docs/ZonesDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### strava_oauth


- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.strava.com/api/v3/oauth/authorize
- **Scopes**: 
  - read: Read public segments, public routes, public profile data, public posts, public events, club feeds, and leaderboards
  - read_all: Read private routes, private segments, and private events for the user
  - profile:read_all: Read all profile information even if the user has set their profile visibility to Followers or Only You
  - profile:write: Update the user&#39;s weight and Functional Threshold Power (FTP), and access to star or unstar segments on their behalf
  - activity:read: Read the user&#39;s activity data for activities that are visible to Everyone and Followers, excluding privacy zone data
  - activity:read_all: The same access as activity:read, plus privacy zone data and access to read the user&#39;s activities with visibility set to Only You
  - activity:write: Access to create manual activities and uploads, and access to edit any activities that are visible to the app, based on activity read access level


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


