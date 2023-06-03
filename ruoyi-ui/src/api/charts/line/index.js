import Charts from "../index.js";
export default class Line extends Charts {
    /**
     * 构造函数
     * @param {String} title 标题
     * @param {String} containerId 容器ID
     */
    constructor(title, containerId) {
        super(title, containerId);
        this.data = [65, 66, 67, 68, 69];
    }

    /**
     * 初始化
     */
    init() {
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
        super().init(option);
    }
}