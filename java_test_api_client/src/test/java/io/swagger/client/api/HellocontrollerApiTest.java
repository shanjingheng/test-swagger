/**
 * swagger 测试
 * spring-boot restful接口
 *
 * OpenAPI spec version: v1.0
 * Contact: shanjh@easemob.com
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
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HellocontrollerApi
 */
public class HellocontrollerApiTest {

    private final HellocontrollerApi api = new HellocontrollerApi();

    
    /**
     * 测试接口
     *
     * 这个接口通过输入一个名字，返回hell:name信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void helloUsingGETTest() throws ApiException {
         String name = "jack";
         Map<String, String> response = api.helloUsingGET(name);
         System.out.print(response);

        // TODO: test validations
    }
    
}