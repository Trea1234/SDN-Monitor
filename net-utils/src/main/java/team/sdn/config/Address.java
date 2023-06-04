package team.sdn.config;

/**
 * 各种地址
 * @author Big-Bai
 **/
public class Address {
    /**
     * opendaylight控制器地址
     */
    public static String ODL_ADDRESS = "http://192.168.1.250:8181";

    /**
     * 查询流表<br/>
     * GET<br/>
     * o+nodeId+1+tableId+2+flowId
     */
    public static String[] QUERY_FLOW_TABLE_GET_NODE = {"/restconf/operational/opendaylight-inventory:nodes/node/","/flow-node-inventory:table/","/flow/"};

    public static String TOPOLOGY = "/restconf/operational/network-topology:network-topology";
    public static String NODE_INFO;









}
