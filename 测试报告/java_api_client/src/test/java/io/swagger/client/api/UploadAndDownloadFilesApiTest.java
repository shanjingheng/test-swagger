/**
 * Easemob REST APIs
 * Easemob Server REST API Swagger is designated to provide better documentation and thorough interfaces for testing. For more details about server implementation, request rate limitation, etc, please visit [Easemob Server Integration](http://docs.easemob.com/im/100serverintegration/10intro).    **Note:**  `org_ID` is the unique ID of the organization created when you first registered [Easemob console](https://console.easemob.com/).                          `app_name` is the unique app ID created when you new application in [Easemob console](https://console.easemob.com/).            `Authorization token` is required for most API requests as part of requesting header in the format `Bearer ${token}`. You can obtain the token via [/{org_name}/{app_name}/token](https://docs.hyphenate.io/docs/server-overview#section-request-authentication-token).                                             
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.io.File;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadAndDownloadFilesApi
 */
public class UploadAndDownloadFilesApiTest {

    private final UploadAndDownloadFilesApi api = new UploadAndDownloadFilesApi();

    
    /**
     * Upload a File
     *
     * Warning: File cannot be over 10MB, otherwise will fail. Important: Be sure keep the \&quot;uuid\&quot; and \&quot;share-secret\&quot;, which are requirement when downloading particular file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatfilesPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        File file = null;
        Boolean restrictAccess = null;
        // String response = api.orgNameAppNameChatfilesPost(orgName, appName, authorization, file, restrictAccess);

        // TODO: test validations
    }
    
    /**
     * Download a File
     *
     * Important: 1. Include the share-secret from HTTP header  2. Include uuid from the response of a successful file uploading, which is the file identifier 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatfilesUuidGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String uuid = null;
        String shareSecret = null;
        Boolean thumbnail = null;
        // String response = api.orgNameAppNameChatfilesUuidGet(orgName, appName, authorization, uuid, shareSecret, thumbnail);

        // TODO: test validations
    }
    
}
