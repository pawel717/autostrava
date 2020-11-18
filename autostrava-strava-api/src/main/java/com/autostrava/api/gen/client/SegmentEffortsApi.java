package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.DetailedSegmentEffortDTO;
import com.autostrava.api.gen.dto.FaultDTO;
import java.time.OffsetDateTime;

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
public class SegmentEffortsApi {
    private ApiClient apiClient;

    public SegmentEffortsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentEffortsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.
     * <p><b>200</b> - List of segment efforts.
     * <p><b>0</b> - Unexpected error.
     * @param segmentId The identifier of the segment.
     * @param startDateLocal ISO 8601 formatted date time.
     * @param endDateLocal ISO 8601 formatted date time.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;DetailedSegmentEffortDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<DetailedSegmentEffortDTO> getEffortsBySegmentId(Integer segmentId, OffsetDateTime startDateLocal, OffsetDateTime endDateLocal, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling getEffortsBySegmentId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "segment_id", segmentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_local", startDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_local", endDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegmentEffortDTO> localVarReturnType = new ParameterizedTypeReference<DetailedSegmentEffortDTO>() {};
        return apiClient.invokeFluxAPI("/segment_efforts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.
     * <p><b>200</b> - Representation of a segment effort.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort.
     * @return DetailedSegmentEffortDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedSegmentEffortDTO> getSegmentEffortById(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentEffortById");
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

        ParameterizedTypeReference<DetailedSegmentEffortDTO> localVarReturnType = new ParameterizedTypeReference<DetailedSegmentEffortDTO>() {};
        return apiClient.invokeAPI("/segment_efforts/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
