package team.sdn.net.traffic.websocket.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author TokisakiKurumi
 * @className DeviceHandler
 * @date 2023/5/31
 * @description 关于设备信息的处理类
 **/
@Component
@Slf4j
public class DeviceHandler implements WebSocketHandler {
    /**
     * 连接数
     */
    private static final AtomicInteger LINK_COUNT = new AtomicInteger(0);

    /**
     * 存储sessionID与对应的WebSocketSession
     */
    private static final HashMap<String,WebSocketSession> SESSION_POOL = new HashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        SESSION_POOL.put(session.getId(), session);
        int count = LINK_COUNT.incrementAndGet();
        log.info("sessionID:" + session.getId() + "加入连接");
        log.info("已有" + count + "个连接");
        session.sendMessage(new TextMessage("Device服务端已将你加入连接"));
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        System.out.println(message.getPayload());
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        SESSION_POOL.remove(session.getId());
        log.info("sessionID:" + session.getId() + "退出连接");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
