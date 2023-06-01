package team.sdn.net.traffic.websocket.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import team.sdn.net.traffic.service.TrafficService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author TokisakiKurumi
 * @className TrafficHandler
 * @date 2023/5/31
 * @description 关于网络流量信息的处理类
 **/
@Component
@Slf4j
public class TrafficHandler implements WebSocketHandler {

    /**
     * 连接数
     */
    private static final AtomicInteger LINK_COUNT = new AtomicInteger(0);

    /**
     * 存储sessionID与对应的WebSocketSession
     */
    private static final HashMap<String,WebSocketSession> SESSION_POOL = new HashMap<>();

    /*@Autowired
    private TrafficService service;*/

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        SESSION_POOL.put(session.getId(), session);
        int count = LINK_COUNT.incrementAndGet();
        log.info("sessionID:" + session.getId() + "加入连接");
        log.info("已有" + count + "个连接");
        session.sendMessage(new TextMessage("Traffic服务端已将你加入连接"));
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {

    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
