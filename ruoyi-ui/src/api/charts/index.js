import * as echarts from "echarts";
export default class Charts {
    /**
     * 构造函数
     * @param {String} title 标题
     * @param {String} containerId 容器ID
     */
    constructor(title, containerId) {
        //Charts只能被继承,不能被实例化
        if (new.target === Charts) {
            throw new Error("Charts 类不能被实例化");
        }
        this.title = title;
        this.container = document.getElementById(containerId);
    }

    /**
     * 初始化
     */
    init(option) {
        let myChart = echarts.init(this.container);
        option && myChart.setOption(option);
    }
}