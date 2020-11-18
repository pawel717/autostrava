package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.DetailedClubDTO;
import com.autostrava.api.gen.dto.FaultDTO;
import com.autostrava.api.gen.dto.SummaryActivityDTO;
import com.autostrava.api.gen.dto.SummaryAthleteDTO;
import com.autostrava.api.gen.dto.SummaryClubDTO;

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
public class ClubsApi {
    private ApiClient apiClient;

    public ClubsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClubsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Club Activities
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     * <p><b>200</b> - A list of activities.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryActivityDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryActivityDTO> getClubActivitiesById(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubActivitiesById");
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

        ParameterizedTypeReference<SummaryActivityDTO> localVarReturnType = new ParameterizedTypeReference<SummaryActivityDTO>() {};
        return apiClient.invokeFluxAPI("/clubs/{id}/activities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Club Administrators
     * Returns a list of the administrators of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryAthleteDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryAthleteDTO> getClubAdminsById(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubAdminsById");
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
        return apiClient.invokeFluxAPI("/clubs/{id}/admins", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Club
     * Returns a given club using its identifier.
     * <p><b>200</b> - The detailed representation of a club.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club.
     * @return DetailedClubDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DetailedClubDTO> getClubById(Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubById");
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

        ParameterizedTypeReference<DetailedClubDTO> localVarReturnType = new ParameterizedTypeReference<DetailedClubDTO>() {};
        return apiClient.invokeAPI("/clubs/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Club Members
     * Returns a list of the athletes who are members of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryAthleteDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryAthleteDTO> getClubMembersById(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubMembersById");
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
        return apiClient.invokeFluxAPI("/clubs/{id}/members", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Athlete Clubs
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     * <p><b>200</b> - A list of summary club representations.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1.
     * @param perPage Number of items per page. Defaults to 30.
     * @return List&lt;SummaryClubDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SummaryClubDTO> getLoggedInAthleteClubs(Integer page, Integer perPage) throws RestClientException {
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

        ParameterizedTypeReference<SummaryClubDTO> localVarReturnType = new ParameterizedTypeReference<SummaryClubDTO>() {};
        return apiClient.invokeFluxAPI("/athlete/clubs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
