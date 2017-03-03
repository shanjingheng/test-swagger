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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NewOwner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-03T17:22:30.082+08:00")
public class NewOwner   {
  @SerializedName("newowner")
  private String newowner = null;

  public NewOwner newowner(String newowner) {
    this.newowner = newowner;
    return this;
  }

   /**
   * Get newowner
   * @return newowner
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNewowner() {
    return newowner;
  }

  public void setNewowner(String newowner) {
    this.newowner = newowner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOwner newOwner = (NewOwner) o;
    return Objects.equals(this.newowner, newOwner.newowner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newowner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOwner {\n");
    
    sb.append("    newowner: ").append(toIndentedString(newowner)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

