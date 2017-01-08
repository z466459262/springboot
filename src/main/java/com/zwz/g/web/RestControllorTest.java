package com.zwz.g.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouwenzhe on 16/12/18.
 * 这样就可以省略@ResponseBody了
 */
@RestController
public class RestControllorTest {
    @GetMapping("/myuser2/{id}")
    public String display(@PathVariable("id") String id){
        return "display..."+id;

    }
}
