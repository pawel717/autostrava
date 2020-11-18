package com.autostrava.strava.app;

import com.autostrava.api.gen.ApiClient;
import com.autostrava.api.gen.auth.OAuth;
import com.autostrava.api.gen.client.UploadsApi;
import com.sun.tools.javac.util.List;
import lombok.extern.log4j.Log4j2;

import java.io.File;

@Log4j2
public class UploadApp {
    static UploadsApi apiInstance = new UploadsApi(new ApiClient());


    public static void main(String[] args) {
        configureUploadsApi();
        String directoryPath = "";

        File directory = new File(directoryPath);
        List.from(directory.listFiles((dir, name) -> name.endsWith(".gpx") || name.endsWith(".tcx")))
                .forEach(UploadApp::uploadActivity);
    }

    private static void configureUploadsApi() {
        apiInstance.getApiClient().setBasePath("https://www.strava.com/api/v3");

        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) apiInstance.getApiClient().getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");
    }

    private static void uploadActivity(File file) {
        String name = "name_example"; // String | The desired name of the resulting activity.
        String description = "description_example"; // String | The desired description of the resulting activity.
        String trainer = "trainer_example"; // String | Whether the resulting activity should be marked as having been performed on a trainer.
        String commute = "commute_example"; // String | Whether the resulting activity should be tagged as a commute.
        String dataType = file.; // String | The format of the uploaded file.
        String externalId = file.getName(); // String | The desired external identifier of the resulting activity.
        apiInstance.createUpload(file, name, description, trainer, commute, dataType, externalId).doOnError(e -> {
                    System.err.println("Exception when calling UploadsApi#createUpload");
                    e.printStackTrace();
                }).blockOptional().ifPresent(System.out::println);
    }
}
