import * as echarts from "echarts";
export default class Line {
    /**
     * 构造函数
     * @param {String} title 标题
     * @param {String} containerId 容器ID
     * @param {Array} data 数据
     */
    constructor({ title, containerId, data }) {
        // console.log(title, containerId, data)
        this.title = title;
        this.container = document.getElementById(containerId);
        this.data = data;
    }

    /**
     * 初始化
     */
    init() {
        let myChart = echarts.init(this.container);

        let option = {
            title: {
                text: this.title
            },
            legend: {
                data: [],
            },
            // tooltip: {
            //     trigger: "axis"
            // },
            xAxis: {
                type: 'category',
                data: ['A', 'B', 'C', 'D', 'E']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    type: 'line',
                    data: this.data
                }
            ]
        }
        option && myChart.setOption(option);
    }
}