package team.sdn.domain;

import lombok.Data;

import java.util.List;

/**
 * 拓扑
 * @author Big-Bai
 **/
@Data
public class Topology {
    /**
     * 拓扑图id
     */
    private String topologyId;

    /**
     * 主机们
     */
    private List<Host> hosts;

    /**
     * 交换机们
     */
    private List<Switch> switches;

    /**
     * 链路们
     */
    private List<Link> links;



}
