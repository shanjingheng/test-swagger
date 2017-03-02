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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HyphenateRestApIs);
  }
}(this, function(expect, HyphenateRestApIs) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HyphenateRestApIs.ModifyGroup();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ModifyGroup', function() {
    it('should create an instance of ModifyGroup', function() {
      // uncomment below and update the code to test ModifyGroup
      //var instane = new HyphenateRestApIs.ModifyGroup();
      //expect(instance).to.be.a(HyphenateRestApIs.ModifyGroup);
    });

    it('should have the property groupname (base name: "groupname")', function() {
      // uncomment below and update the code to test the property groupname
      //var instane = new HyphenateRestApIs.ModifyGroup();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new HyphenateRestApIs.ModifyGroup();
      //expect(instance).to.be();
    });

    it('should have the property maxusers (base name: "maxusers")', function() {
      // uncomment below and update the code to test the property maxusers
      //var instane = new HyphenateRestApIs.ModifyGroup();
      //expect(instance).to.be();
    });

  });

}));
