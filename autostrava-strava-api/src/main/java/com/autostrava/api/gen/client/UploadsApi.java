package com.autostrava.api.gen.client;

import com.autostrava.api.gen.ApiClient;

import com.autostrava.api.gen.dto.FaultDTO;
import java.io.File;
import com.autostrava.api.gen.dto.UploadDTO;

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
public class UploadsApi {
    private ApiClient apiClient;

    public UploadsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Upload Activity
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * <p><b>201</b> - A representation of the created upload.
     * <p><b>0</b> - Unexpected error.
     * @param file The uploaded file.
     * @param name The desired name of the resulting activity.
     * @param description The desired description of the resulting activity.
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer.
     * @param commute Whether the resulting activity should be tagged as a commute.
     * @param dataType The format of the uploaded file.
     * @param externalId The desired external identifier of the resulting activity.
     * @return UploadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<UploadDTO> createUpload(File file, String name, String description, String trainer, String commute, String dataType, String externalId) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (trainer != null)
            formParams.add("trainer", trainer);
        if (commute != null)
            formParams.add("commute", commute);
        if (dataType != null)
            formParams.add("data_type", dataType);
        if (externalId != null)
            formParams.add("external_id", externalId);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<UploadDTO> localVarReturnType = new ParameterizedTypeReference<UploadDTO>() {};
        return apiClient.invokeAPI("/uploads", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Upload
     * Returns an upload for a given identifier. Requires activity:write scope.
     * <p><b>200</b> - Representation of the upload.
     * <p><b>0</b> - Unexpected error.
     * @param uploadId The identifier of the upload.
     * @return UploadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<UploadDTO> getUploadById(Long uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling getUploadById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("uploadId", uploadId);

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

        ParameterizedTypeReference<UploadDTO> localVarReturnType = new ParameterizedTypeReference<UploadDTO>() {};
        return apiClient.invokeAPI("/uploads/{uploadId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
