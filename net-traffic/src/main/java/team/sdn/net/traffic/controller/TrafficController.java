package team.sdn.net.traffic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TokisakiKurumi
 * @className TrafficController
 * @date 2023/5/31
 * @description 作为与前端交互的控制器，传输流量信息等
 **/
@RestController("/traffic")
public class TrafficController {

    @GetMapping("/loss/")
    public String packetLoss() {
        return null;
    }
}
