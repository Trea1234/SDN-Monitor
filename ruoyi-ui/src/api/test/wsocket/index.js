import request from '@/utils/request';

export default class websocketLink {
    constructor(url, protol, { token, data }) {
        this.ws = new WebSocket(url, [protol]);
        this.token = token;
        this.data = data;
    }

    init() {
        console.log(666);
        let connect = false;
        // 连接成功时触发
        this.ws.onopen = function () {
            // 发送数据
            if (this.ws.readyState === 1) {
                console.log(666);

                if (!connect) {
                    //第一次向服务端发送请求
                    setTimeout(() => {
                        this.ws.send(this.token)
                    }, 500);

                    connect = true;
                } else {
                    this.ws.send(JSON.stringify(this.data));
                }

            }
        }
        // 连接失败时触发
        this.ws.onerror = function () {
            alert("连接失败")
        }

        // 接收消息时触发
        this.ws.onmessage = function (MessagEvent) {
            console.log(MessagEvent.data)
        }
        // 连接关闭的回调函数
        this.ws.onclose = function () {
            alert("close")
        }
    }

    sendWs() {
        if (this.ws.readyState === 1) {
            console.log(666);
            this.ws.send("sbsb"); // 向服务端发送请求
        }
    }
}

