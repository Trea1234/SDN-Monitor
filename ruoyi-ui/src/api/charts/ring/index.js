import Charts from "../index.js";
export default class Ring extends Charts {
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
        const gaugeData = [
            {
                //百分比值
                value: 20,
                name: 'Perfect',
                title: {
                    //距离中心的偏移
                    offsetCenter: ['0%', '-30%']
                },
                detail: {
                    //是否开启标签的数字动画
                    valueAnimation: true,
                    //距离中心的偏移
                    offsetCenter: ['0%', '-20%']
                }
            }
        ];

        let option = {
            series: [
                {
                    type: 'gauge',
                    startAngle: 90,
                    endAngle: -270,
                    pointer: {
                        show: false
                    },
                    progress: {
                        show: true,
                        overlap: false,
                        roundCap: true,
                        clip: false,
                        itemStyle: {
                            borderWidth: 1,
                            borderColor: '#464646'
                        }
                    },
                    axisLine: {
                        lineStyle: {
                            width: 40
                        }
                    },
                    splitLine: {
                        show: false,
                        distance: 0,
                        length: 10
                    },
                    axisTick: {
                        show: false
                    },
                    axisLabel: {
                        show: false,
                        distance: 50
                    },
                    data: gaugeData,
                    title: {
                        fontSize: 14
                    },
                    detail: {
                        width: 50,
                        height: 14,
                        fontSize: 14,
                        color: 'inherit',
                        borderColor: 'inherit',
                        borderRadius: 20,
                        borderWidth: 1,
                        formatter: '{value}%'
                    }
                }
            ]
        };
        super().init(option);
    }
}