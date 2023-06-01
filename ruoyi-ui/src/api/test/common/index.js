import request from '@/utils/request';

export default function webscoketLink(url, protol, { token, data }) {
    // 创建一个WebSocket对象
    let ws = new WebSocket(url, [protol]);
    // "ws://192.168.0.113:8888/websocket"
    let connect = false;
    // 连接成功时触发
    ws.onopen = function () {
        // 发送数据
        if (ws.readyState === 1) {
            console.log(666);

            if (!connect) {
                //第一次向服务端发送请求
                ws.send(token);
                connect = true;
            } else {
                ws.send(JSON.stringify(data));
            }

        }
    }
    // 连接失败时触发
    ws.onerror = function () {
        alert("连接失败")
    }

    // 接收消息时触发
    ws.onmessage = function (MessagEvent) {
        console.log(MessagEvent.data)
    }
    // 连接关闭的回调函数
    ws.onclose = function () {
        alert("close")
    }

}
function sendWs() {
    if (ws.readyState === 1) {
        console.log(666);
        ws.send("sbsb"); // 向服务端发送请求
    }
}

function sendWsSb() {
    if (ws_sb.readyState === 1) {
        console.log(666);
        ws_sb.send("sbsbsb666"); // 向服务端发送请求
    }
}