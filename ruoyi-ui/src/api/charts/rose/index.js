import Charts from "../index.js";
export default class Rose extends Charts {
    /**
     * 构造函数
     * @param {String} title 标题
     * @param {String} containerId 容器ID
     */
    constructor(title, containerId) {
        super(title, containerId);
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
            series: [
                {
                    type: 'pie',
                    data: [
                        {
                            value: 100,
                            name: 'A'
                        },
                        {
                            value: 200,
                            name: 'B'
                        },
                        {
                            value: 300,
                            name: 'C'
                        },
                        {
                            value: 400,
                            name: 'D'
                        },
                        {
                            value: 500,
                            name: 'E'
                        }
                    ],
                    roseType: 'area'
                }
            ]
        }
        super().init(option);
    }
}