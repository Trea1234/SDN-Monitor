import Charts from "../index.js";
export default class Relate extends Charts {
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
                text: 'Basic Graph'
            },

            tooltip: {},
            animationDurationUpdate: 1500,
            animationEasingUpdate: 'quinticInOut',
            series: [
                {
                    type: 'graph',
                    //图的类型
                    layout: 'none',
                    //节点标记的大小
                    symbolSize: 50,
                    //是否开启鼠标缩放和平移漫游
                    roam: true,
                    //是否显示文本标签
                    label: {
                        show: true
                    },
                    //边两端的标记类型
                    //下面表示起点为圆，终点为箭头
                    edgeSymbol: ['circle', 'arrow'],
                    //边两段的标记大小
                    edgeSymbolSize: [4, 10],
                    //边上文字的大小
                    edgeLabel: {
                        fontSize: 20
                    },
                    data: [
                        {
                            name: 'Node 1',
                            x: 300,
                            y: 300,
                            tooltip: {
                                formatter: function () {
                                    return '777<br/>999';
                                }
                            }
                        },
                        {
                            name: 'Node 2',
                            x: 800,
                            y: 300
                        },
                        {
                            name: 'Node 3',
                            x: 550,
                            y: 100
                        },
                        {
                            name: 'Node 4',
                            x: 550,
                            y: 500
                        }
                    ],
                    // links: [],
                    links: [
                        {
                            //数字表示节点索引
                            source: 0,
                            target: 1,
                            symbolSize: [5, 20],
                            //是否显示边上文字
                            label: {
                                show: true,
                                //边字符串内容
                                formatter: function () {
                                    return "666";
                                }
                            },
                            //边样式
                            lineStyle: {
                                width: 5,
                                //边曲度
                                curveness: 0.2
                            }
                        },
                        {
                            //名字表示索引
                            source: 'Node 2',
                            target: 'Node 1',
                            label: {
                                show: true
                            },
                            lineStyle: {
                                curveness: 0.2
                            }
                        },
                        {
                            source: 'Node 1',
                            target: 'Node 3'
                        },
                        {
                            source: 'Node 2',
                            target: 'Node 3'
                        },
                        {
                            source: 'Node 2',
                            target: 'Node 4'
                        },
                        {
                            source: 'Node 1',
                            target: 'Node 4'
                        }
                    ],
                    lineStyle: {
                        opacity: 0.9,
                        width: 2,
                        curveness: 0
                    }
                }
            ]
        };
        super().init(option);
    }
}