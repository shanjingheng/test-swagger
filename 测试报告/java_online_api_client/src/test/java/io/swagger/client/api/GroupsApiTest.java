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
import io.swagger.client.model.UserNames;
import io.swagger.client.model.ModifyGroup;
import io.swagger.client.model.NewOwner;
import io.swagger.client.model.Group;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Get All the Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        // String response = api.orgNameAppNameChatgroupsGet(orgName, appName, authorization);

        // TODO: test validations
    }
    
    /**
     * Get Group Blocked Users
     *
     * Get the blacklist of blocked users. Blocked user cannot see nor receive group message.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdBlocksUsersGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdBlocksUsersGet(orgName, appName, authorization, groupId);

        // TODO: test validations
    }
    
    /**
     * Block Group Members in Batch
     *
     * Block multiple group members by adding the users to the group blacklist. Max 60 users at a time. Blocked users will receive an event, \&quot;You are kicked out of the group {groupid}\&quot;. Blocked user will not able to see nor receive group message.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdBlocksUsersPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        UserNames body = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdBlocksUsersPost(orgName, appName, authorization, groupId, body);

        // TODO: test validations
    }
    
    /**
     * Unblock a Group Member
     *
     * Unblock group member by removing the user from group blacklist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdBlocksUsersUsernameDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String username = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdBlocksUsersUsernameDelete(orgName, appName, authorization, groupId, username);

        // TODO: test validations
    }
    
    /**
     * Block a Group Member
     *
     * Block a group member by adding the user to the group blacklist.  Blocked user will receive an event, \&quot;You are kicked out of the group {groupid}\&quot;. Blocked user will not able to see nor  receive group message. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdBlocksUsersUsernamePostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String username = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdBlocksUsersUsernamePost(orgName, appName, authorization, groupId, username);

        // TODO: test validations
    }
    
    /**
     * Unblock Group Members in Batch
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdBlocksUsersUsernamesDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String usernames = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdBlocksUsersUsernamesDelete(orgName, appName, authorization, groupId, usernames);

        // TODO: test validations
    }
    
    /**
     * Delete a Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdDelete(orgName, appName, authorization, groupId);

        // TODO: test validations
    }
    
    /**
     * Update Group Details
     *
     * The message body only allows groupname, description, and maxusers.  Note: Use &#39;+&#39; to replace space if modifying groupname ​and description. E.g., use \&quot;test+group\&quot; instead of \&quot;test group\&quot;.  Warning: If group cannot be found or operation failed, then the response will still return HTTP code 200, but key-value are \&quot;maxusers\&quot;&#x3D;false, \&quot;groupname\&quot;&#x3D;false, and \&quot;description\&quot;&#x3D;false. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdPutTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        ModifyGroup body = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdPut(orgName, appName, authorization, groupId, body);

        // TODO: test validations
    }
    
    /**
     * Get a List of Members of Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdUsersGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdUsersGet(orgName, appName, authorization, groupId);

        // TODO: test validations
    }
    
    /**
     * Remove multiple Member from the Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdUsersMembersDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String members = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdUsersMembersDelete(orgName, appName, authorization, groupId, members);

        // TODO: test validations
    }
    
    /**
     * Add Multiple Members to Group
     *
     * Warning: Add max 60 members once at a time. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdUsersPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        UserNames body = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdUsersPost(orgName, appName, authorization, groupId, body);

        // TODO: test validations
    }
    
    /**
     * Remove a Member from the Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdUsersUsernameDeleteTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String username = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdUsersUsernameDelete(orgName, appName, authorization, groupId, username);

        // TODO: test validations
    }
    
    /**
     * Add a Member to Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdUsersUsernamePostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupId = null;
        String username = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdUsersUsernamePost(orgName, appName, authorization, groupId, username);

        // TODO: test validations
    }
    
    /**
     * Get Group(s) Details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupIdsGetTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupIds = null;
        // String response = api.orgNameAppNameChatgroupsGroupIdsGet(orgName, appName, authorization, groupIds);

        // TODO: test validations
    }
    
    /**
     * Update Group Owner
     *
     * Transfer group ownership by changing owner. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsGroupidPutTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        String groupid = null;
        NewOwner body = null;
        // String response = api.orgNameAppNameChatgroupsGroupidPut(orgName, appName, authorization, groupid, body);

        // TODO: test validations
    }
    
    /**
     * Create a Group
     *
     * Group settings: 1. Group name 2. Group description 3. Public vs. Private Group 4. Max number of member (including admin) 5. If public group, allow join freely vs. require permission from admin 6. allowinvites property. If public group, then allowinvites is false. If private group, then allowinvites is true. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgNameAppNameChatgroupsPostTest() throws ApiException {
        String orgName = null;
        String appName = null;
        String authorization = null;
        Group body = null;
        // String response = api.orgNameAppNameChatgroupsPost(orgName, appName, authorization, body);

        // TODO: test validations
    }
    
}
