package team.sdn.domain;

import lombok.Data;

import java.util.List;

/**
 * 交换机
 * @author Big-Bai
 **/
@Data
public class Switch{
    /**
     * 交换机节点id
     */
    private String nodeId;
    /**
     * 交换机节点名称
     */
    private String nodeName;

    /**
     * 端口们
     */
    private List<String> terminations;

}
