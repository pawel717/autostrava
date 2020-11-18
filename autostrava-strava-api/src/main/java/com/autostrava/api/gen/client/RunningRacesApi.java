package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.FaultDTO;
import com.autostrava.api.gen.dto.RunningRaceDTO;

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
public class RunningRacesApi {
    private ApiClient apiClient;

    public RunningRacesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RunningRacesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Running Race
     * Returns a running race for a given identifier.
     * <p><b>200</b> - Representation of a running race.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the running race.
     * @return RunningRaceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<RunningRaceDTO> getRunningRaceById(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRunningRaceById");
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

        ParameterizedTypeReference<RunningRaceDTO> localVarReturnType = new ParameterizedTypeReference<RunningRaceDTO>() {};
        return apiClient.invokeAPI("/running_races/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Running Races
     * Returns a list running races based on a set of search criteria.
     * <p><b>200</b> - Representation of a list of running race.
     * <p><b>0</b> - Unexpected error.
     * @param year Filters the list by a given year.
     * @return List&lt;RunningRaceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<RunningRaceDTO> getRunningRaces(Integer year) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<RunningRaceDTO> localVarReturnType = new ParameterizedTypeReference<RunningRaceDTO>() {};
        return apiClient.invokeFluxAPI("/running_races", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
