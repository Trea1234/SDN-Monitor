package team.sdn.sdnutils;

import team.sdn.domain.Host;
import team.sdn.domain.Switch;
import team.sdn.domain.Topology;

import java.util.List;

/**
 * 拓扑（拓扑图、主机、交换机等信息）相关工具
 * @author Big-Bai
 **/
public interface TopologyUtils {
    //拓扑
    /**
     * 获取网络拓扑
     * @return 拓扑类
     */
    Topology getTopology();

    //主机
    /**
     * 获取所有主主机信息
     * @return 所有主机信息
     */
    List<Host> getAllHost();

    /**
     * 根据id获取某一主机当前信息
     * @param hostId 主机id
     * @return 主机信息
     */
    Host getHostById(Integer hostId);

    //交换机
    /**
     * 获取所有交换机信息
     * @return 所有交换机信息
     */
    List<Switch> getAllSwitch();

    /**
     * 根据id获取某个交换机的信息
     * @param switchId
     * @return
     */
    Switch getSwitchById(Integer switchId);


}
