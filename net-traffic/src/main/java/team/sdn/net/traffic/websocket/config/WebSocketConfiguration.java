package team.sdn.net.traffic.websocket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import team.sdn.net.traffic.websocket.handler.DeviceHandler;
import team.sdn.net.traffic.websocket.handler.TrafficHandler;
import team.sdn.net.traffic.websocket.interceptor.ServerInterceptor;

/**
 * @author TokisakiKurumi
 * @className WebSocketConfiguration
 * @date 2023/5/31
 * @description websocket配置类
 **/
@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

    @Autowired
    private DeviceHandler deviceHandler;

    @Autowired
    private TrafficHandler trafficHandler;

    @Autowired
    private ServerInterceptor serverInterceptor;

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(deviceHandler,"/device")
                .addHandler(trafficHandler,"/traffic")
                .addInterceptors(serverInterceptor)
                .setAllowedOrigins("*");
    }
}
