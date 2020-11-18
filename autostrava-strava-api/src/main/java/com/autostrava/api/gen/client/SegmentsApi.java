package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.DetailedSegmentDTO;
import com.autostrava.api.gen.dto.ExplorerResponseDTO;
import com.autostrava.api.gen.dto.FaultDTO;
import com.autostrava.api.gen.dto.SummarySegmentDTO;

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
public class SegmentsApi {
    private ApiClient apiClient;

    public SegmentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Explore segments
     * Returns the top 10 segments matching a specified query.
     * <p><b>200</b> - List of matching segments.
     * <p><b>0</b> - Unexpected error.
     * @param bounds The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude]
     * @param activityType Desired activity type.
     * @param minCat The minimum climbing category.
     * @param maxCat The maximum climbing category.
     * @return ExplorerResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<ExplorerResponseDTO> exploreSegments(List<Float> bounds, String activityType, Integer minCat, Integer maxCat) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'bounds' is set
        if (bounds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bounds' when calling exploreSegments");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "bounds", bounds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activity_type", activityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "min_cat", minCat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max_cat", maxCat));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<ExplorerResponseDTO> localVarReturnType = new ParameterizedTypeReference<ExplorerResponseDTO>() {};
        return apiClient.invokeAPI("/segments/explore", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Starred Segments
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - List of the authenticated athlete&#39;s starred segments.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummarySegmentDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummarySegmentDTO> getLoggedInAthleteStarredSegments(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<SummarySegmentDTO> localVarReturnType = new ParameterizedTypeReference<SummarySegmentDTO>() {};
        return apiClient.invokeFluxAPI("/segments/starred", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Segment
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment.
     * @return DetailedSegmentDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedSegmentDTO> getSegmentById(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentById");
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

        ParameterizedTypeReference<DetailedSegmentDTO> localVarReturnType = new ParameterizedTypeReference<DetailedSegmentDTO>() {};
        return apiClient.invokeAPI("/segments/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Star Segment
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment to star.
     * @param starred If true, star the segment; if false, unstar the segment.
     * @return DetailedSegmentDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedSegmentDTO> starSegment(Long id, Boolean starred) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling starSegment");
        }
        // verify the required parameter 'starred' is set
        if (starred == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'starred' when calling starSegment");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (starred != null)
            formParams.add("starred", starred);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegmentDTO> localVarReturnType = new ParameterizedTypeReference<DetailedSegmentDTO>() {};
        return apiClient.invokeAPI("/segments/{id}/starred", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
