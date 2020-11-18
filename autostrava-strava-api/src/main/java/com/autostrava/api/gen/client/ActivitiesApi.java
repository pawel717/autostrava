package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.ActivityZoneDTO;
import com.autostrava.api.gen.dto.CommentDTO;
import com.autostrava.api.gen.dto.DetailedActivityDTO;
import com.autostrava.api.gen.dto.FaultDTO;
import com.autostrava.api.gen.dto.LapDTO;
import java.time.OffsetDateTime;
import com.autostrava.api.gen.dto.SummaryActivityDTO;
import com.autostrava.api.gen.dto.SummaryAthleteDTO;
import com.autostrava.api.gen.dto.UpdatableActivityDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T20:13:51.882+01:00[Europe/Belgrade]")
public class ActivitiesApi {
    private ApiClient apiClient;

    public ActivitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ActivitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Activity
     * Creates a manual activity for an athlete, requires activity:write scope.
     * <p><b>201</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param name The name of the activity.
     * @param type Type of activity. For example - Run, Ride etc.
     * @param startDateLocal ISO 8601 formatted date time.
     * @param elapsedTime In seconds.
     * @param description Description of the activity.
     * @param distance In meters.
     * @param trainer Set to 1 to mark as a trainer activity.
     * @param commute Set to 1 to mark as commute.
     * @return DetailedActivityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedActivityDTO> createActivity(String name, String type, OffsetDateTime startDateLocal, Integer elapsedTime, String description, Float distance, Integer trainer, Integer commute) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createActivity");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling createActivity");
        }
        // verify the required parameter 'startDateLocal' is set
        if (startDateLocal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDateLocal' when calling createActivity");
        }
        // verify the required parameter 'elapsedTime' is set
        if (elapsedTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'elapsedTime' when calling createActivity");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (name != null)
            formParams.add("name", name);
        if (type != null)
            formParams.add("type", type);
        if (startDateLocal != null)
            formParams.add("start_date_local", startDateLocal);
        if (elapsedTime != null)
            formParams.add("elapsed_time", elapsedTime);
        if (description != null)
            formParams.add("description", description);
        if (distance != null)
            formParams.add("distance", distance);
        if (trainer != null)
            formParams.add("trainer", trainer);
        if (commute != null)
            formParams.add("commute", commute);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivityDTO> localVarReturnType = new ParameterizedTypeReference<DetailedActivityDTO>() {};
        return apiClient.invokeAPI("/activities", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Activity
     * Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param includeAllEfforts To include all segments efforts.
     * @return DetailedActivityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedActivityDTO> getActivityById(Long id, Boolean includeAllEfforts) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getActivityById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_all_efforts", includeAllEfforts));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivityDTO> localVarReturnType = new ParameterizedTypeReference<DetailedActivityDTO>() {};
        return apiClient.invokeAPI("/activities/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Activity Comments
     * Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;CommentDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<CommentDTO> getCommentsByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCommentsByActivityId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<CommentDTO> localVarReturnType = new ParameterizedTypeReference<CommentDTO>() {};
        return apiClient.invokeFluxAPI("/activities/{id}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Activity Kudoers
     * Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryAthleteDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryAthleteDTO> getKudoersByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getKudoersByActivityId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<SummaryAthleteDTO> localVarReturnType = new ParameterizedTypeReference<SummaryAthleteDTO>() {};
        return apiClient.invokeFluxAPI("/activities/{id}/kudos", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Activity Laps
     * Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Laps.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @return List&lt;LapDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<LapDTO> getLapsByActivityId(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLapsByActivityId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<LapDTO> localVarReturnType = new ParameterizedTypeReference<LapDTO>() {};
        return apiClient.invokeFluxAPI("/activities/{id}/laps", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Athlete Activities
     * Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.
     * <p><b>200</b> - The authenticated athlete&#39;s activities
     * <p><b>0</b> - Unexpected error.
     * @param before An epoch timestamp to use for filtering activities that have taken place before a certain time.
     * @param after An epoch timestamp to use for filtering activities that have taken place after a certain time.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryActivityDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryActivityDTO> getLoggedInAthleteActivities(Integer before, Integer after, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<SummaryActivityDTO> localVarReturnType = new ParameterizedTypeReference<SummaryActivityDTO>() {};
        return apiClient.invokeFluxAPI("/athlete/activities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Activity Zones
     * Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Zones.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @return List&lt;ActivityZoneDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<ActivityZoneDTO> getZonesByActivityId(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getZonesByActivityId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<ActivityZoneDTO> localVarReturnType = new ParameterizedTypeReference<ActivityZoneDTO>() {};
        return apiClient.invokeFluxAPI("/activities/{id}/zones", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update Activity
     * Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param body The body parameter
     * @return DetailedActivityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedActivityDTO> updateActivityById(Long id, UpdatableActivityDTO body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateActivityById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivityDTO> localVarReturnType = new ParameterizedTypeReference<DetailedActivityDTO>() {};
        return apiClient.invokeAPI("/activities/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
