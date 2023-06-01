package team.sdn.net.traffic.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TokisakiKurumi
 * @className CT
 * @date 2023/6/1
 * @description
 **/
@RestController
@RequestMapping("/test")
public class CT {
    @GetMapping("/string")
    public String ok(){
        return "Success";
    }
}
