package team.sdn.domain;

import lombok.Data;

/**
 * 主机信息
 * @author Big-Bai
 **/
@Data
public class Host {
    /**
     * 节点id<br/>
     * 格式 host:xx:xx:xx:xx:xx:xx
     */
    private String nodeId;

    /**
     * mac地址<br/>
     * 格式 xx:xx:xx:xx:xx:xx
     */
    private String mac;

    /**
     * ip地址
     */
    private String ip;

    /**
     *
     */
    private String firstSeen;

    /**
     *
     */
    private String lastSeen;
}
