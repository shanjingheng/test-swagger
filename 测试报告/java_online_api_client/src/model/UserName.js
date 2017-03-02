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
    root.HyphenateRestApIs.UserName = factory(root.HyphenateRestApIs.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The UserName model module.
   * @module model/UserName
   * @version 1.0.2
   */

  /**
   * Constructs a new <code>UserName</code>.
   * @alias module:model/UserName
   * @class
   * @extends Array
   */
  var exports = function() {
    var _this = this;
    _this = new Array();
    Object.setPrototypeOf(_this, exports);

    return _this;
  };

  /**
   * Constructs a <code>UserName</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserName} obj Optional instance to populate.
   * @return {module:model/UserName} The populated <code>UserName</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, String);

    }
    return obj;
  }




  return exports;
}));


