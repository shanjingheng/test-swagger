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
import io.swagger.client.model.ModifyChatroom;
import io.swagger.client.model.UserNames;
import io.swagger.client.model.Chatroom;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChatRoomsApi
 */
public class ChatRoomsApiTest {

    private final ChatRoomsApi api = new ChatRoomsApi();

    
    /**
     * Delete a Chat Room
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdDelete(orgName, appName, authorization, chatroomId);

        // TODO: test validations
    }
    
    /**
     * Get Chat Room Details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdGet(orgName, appName, authorization, chatroomId);

        // TODO: test validations
    }
    
    /**
     * Update Chat Room Details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdPutTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        ModifyChatroom body = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdPut(orgName, appName, authorization, chatroomId, body);

        // TODO: test validations
    }
    
    /**
     * Add Chat Room Members in Batch
     *
     * Add max 60 group members at a time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdUsersPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        UserNames content = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdUsersPost(orgName, appName, authorization, chatroomId, content);

        // TODO: test validations
    }
    
    /**
     * Remove a Chat Room Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdUsersUsernameDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        String username = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdUsersUsernameDelete(orgName, appName, authorization, chatroomId, username);

        // TODO: test validations
    }
    
    /**
     * Add a Chat Room Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdUsersUsernamePostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        String username = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdUsersUsernamePost(orgName, appName, authorization, chatroomId, username);

        // TODO: test validations
    }
    
    /**
     * Remove Chat Room Members in Batch
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsChatroomIdUsersUsernamesDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String chatroomId = null;
        String usernames = null;
        // String response = api.orgNameAppNameChatroomsChatroomIdUsersUsernamesDelete(orgName, appName, authorization, chatroomId, usernames);

        // TODO: test validations
    }
    
    /**
     * Get All the Chat Rooms
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        // String response = api.orgNameAppNameChatroomsGet(orgName, appName, authorization);

        // TODO: test validations
    }
    
    /**
     * Create a Chat Room
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatroomsPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        Chatroom body = null;
        // String response = api.orgNameAppNameChatroomsPost(orgName, appName, authorization, body);

        // TODO: test validations
    }
    
}
