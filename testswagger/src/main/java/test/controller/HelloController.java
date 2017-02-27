package test.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "/{name}")
@RestController
public class HelloController {
     @RequestMapping(value = "/hello",method = RequestMethod.GET ,consumes = "*/*",produces = "application/json")
     @ApiOperation(value = "测试接口",notes = "这个接口通过输入一个名字，返回hell:name信息")
     @ResponseBody
    public Map<String, String> hello(@ApiParam(value = "测试输入")@PathVariable("name")String name){
         HashMap<String,String> map = new HashMap<>();
         map.put("message","hello:"+name);
         return map;
    }
   }
