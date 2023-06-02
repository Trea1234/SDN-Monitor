package team.sdn.sdnutils;

import team.sdn.domain.Host;
import team.sdn.domain.Switch;
import team.sdn.domain.Topology;

import java.util.List;

/**
 * 拓扑（拓扑图、主机、交换机等信息）相关工具
 * @author Big-Bai
 **/
public class TopologyUtils {
    //拓扑
    /**
     * 获取网络拓扑
     * @return 拓扑类
     */
    public static Topology getTopology(){
        return null;
    }

    //主机
    /**
     * 获取所有主主机信息
     * @return 所有主机信息
     */
    public static List<Host> getAllHost(){
        return null;
    }

    /**
     * 根据id获取某一主机当前信息
     * @param hostId 主机id
     * @return 主机信息
     */
    public static Host getHostById(Integer hostId){
        return null;
    }

    //交换机
    /**
     * 获取所有交换机信息
     * @return 所有交换机信息
     */
    public static List<Switch> getAllSwitch(){
        return null;
    }

    /**
     * 根据id获取某个交换机的信息
     * @param switchId 交换机的id
     * @return 交换机信息
     */
    public static Switch getSwitchById(Integer switchId){
        return null;
    }


}
