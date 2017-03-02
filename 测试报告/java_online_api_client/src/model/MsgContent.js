/**
 * Hyphenate REST APIs
 * Hyphenate Server REST API Swagger is designated to provide better documentation and thorough interfaces for testing. For more details about server implementation, request rate limitation, etc, please visit [Hyphenate Server Integration](http://docs.hyphenate.io/v1.0/docs/server-overview).    **Note:**  `org_ID` is the unique ID of the organization created when you first registered [Hyphenate console](https://console.hyphenate.io/).                          `app_name` is the unique app ID created when you new application in [Hyphenate console](https://console.hyphenate.io/).            `Authorization token` is required for most API requests as part of requesting header in the format `Bearer ${token}`. You can obtain the token via [/{org_name}/{app_name}/token](https://docs.hyphenate.io/docs/server-overview#section-request-authentication-token).                                             
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HyphenateRestApIs) {
      root.HyphenateRestApIs = {};
    }
    root.HyphenateRestApIs.MsgContent = factory(root.HyphenateRestApIs.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MsgContent model module.
   * @module model/MsgContent
   * @version 1.0.2
   */

  /**
   * Constructs a new <code>MsgContent</code>.
   * @alias module:model/MsgContent
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>MsgContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MsgContent} obj Optional instance to populate.
   * @return {module:model/MsgContent} The populated <code>MsgContent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('msg')) {
        obj['msg'] = ApiClient.convertToType(data['msg'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/MsgContent.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} msg
   */
  exports.prototype['msg'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "txt"
     * @const
     */
    "txt": "txt",
    /**
     * value: "img"
     * @const
     */
    "img": "img",
    /**
     * value: "audio"
     * @const
     */
    "audio": "audio",
    /**
     * value: "video"
     * @const
     */
    "video": "video",
    /**
     * value: "cmd"
     * @const
     */
    "cmd": "cmd"  };


  return exports;
}));


