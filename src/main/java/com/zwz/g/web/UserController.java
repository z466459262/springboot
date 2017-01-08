package com.zwz.g.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhouwenzhe on 16/12/18.
 */
@Controller
public class UserController {

    /**
     * RequestMapping支持get和post
     * @return
     */
    @RequestMapping(value="/user/home",method= RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "xxxxxxxxxxxxxx";
    }

    @ResponseBody
    @GetMapping(value="/user/bbb") public String bbb(@RequestParam("a") String a,
                                                     @RequestParam(name = "b", required = false) String b,
                                                     @RequestParam(value = "c",required = false) String c) {
        return a + b + c;
    }
    @ResponseBody
    @GetMapping("/myuser/{id}")
    public String display(@PathVariable("id") String id){
        return "display..."+id;

    }
}
