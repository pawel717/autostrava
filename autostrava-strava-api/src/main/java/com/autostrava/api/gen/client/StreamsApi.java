package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.FaultDTO;
import com.autostrava.api.gen.dto.StreamSetDTO;

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
public class StreamsApi {
    private ApiClient apiClient;

    public StreamsApi() {
        this(new ApiClient());
    }

    @Autowired
    public StreamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Activity Streams
     * Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity.
     * @param keys Desired stream types.
     * @param keyByType Must be true.
     * @return StreamSetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamSetDTO> getActivityStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getActivityStreams");
        }
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getActivityStreams");
        }
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getActivityStreams");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDTO> localVarReturnType = new ParameterizedTypeReference<StreamSetDTO>() {};
        return apiClient.invokeAPI("/activities/{id}/streams", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Route Streams
     * Returns the given route&#39;s streams. Requires read_all scope for private routes.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route.
     * @return StreamSetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamSetDTO> getRouteStreams(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteStreams");
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

        ParameterizedTypeReference<StreamSetDTO> localVarReturnType = new ParameterizedTypeReference<StreamSetDTO>() {};
        return apiClient.invokeAPI("/routes/{id}/streams", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Segment Effort Streams
     * Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort.
     * @param keys The types of streams to return.
     * @param keyByType Must be true.
     * @return StreamSetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamSetDTO> getSegmentEffortStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentEffortStreams");
        }
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getSegmentEffortStreams");
        }
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getSegmentEffortStreams");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDTO> localVarReturnType = new ParameterizedTypeReference<StreamSetDTO>() {};
        return apiClient.invokeAPI("/segment_efforts/{id}/streams", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Segment Streams
     * Returns the given segment&#39;s streams. Requires read_all scope for private segments.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment.
     * @param keys The types of streams to return.
     * @param keyByType Must be true.
     * @return StreamSetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamSetDTO> getSegmentStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentStreams");
        }
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getSegmentStreams");
        }
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getSegmentStreams");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDTO> localVarReturnType = new ParameterizedTypeReference<StreamSetDTO>() {};
        return apiClient.invokeAPI("/segments/{id}/streams", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
