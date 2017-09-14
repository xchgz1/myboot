package com.zyf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/21.
 */
@RestController
public class BootController {
    @RequestMapping("hellow")
    public String hellow(){
        return "hellow2233355";
    }
}
