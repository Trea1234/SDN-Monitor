package team.sdn.net.traffic.websocket.handler;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import team.sdn.net.traffic.service.DeviceService;

import java.lang.reflect.Method;
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

    /**
     * 设备信息服务类
     */
    @Autowired
    private DeviceService service;

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
        String method = (String) session.getAttributes().get("method");
        System.out.println(method);
        Object[] params = JSONObject.parseObject(String.valueOf(message.getPayload())).values().toArray();
        Method serviceMethod = service.getClass().getMethod(method);
        Object invoke = serviceMethod.invoke(service, params);
        session.sendMessage(new TextMessage(JSONObject.toJSONString(new Object())));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        SESSION_POOL.remove(session.getId());
        LINK_COUNT.decrementAndGet();
        log.info("sessionID:" + session.getId() + "退出连接");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

}
