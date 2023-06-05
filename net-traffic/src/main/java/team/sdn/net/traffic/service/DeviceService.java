package team.sdn.net.traffic.service;

import team.sdn.domain.Host;
import team.sdn.domain.Switch;
import team.sdn.domain.Topology;

import java.util.List;

/**
 * @author TokisakiKurumi
 * @className DeviceService
 * @date 2023/5/31
 * @description 用于获取设备信息的接口类
 **/
public interface DeviceService {
    /**
     * 获取网络拓扑图
     * @return 拓扑图
     */
    String getTopology();

    /**
     * 获取主机信息
     * @param hostId 主机ID
     * @return 主机信息
     */
    List<Host> getHost(String hostId);

    /**
     * 获取交换机信息
     * @param switchId 交换机ID
     * @return 交换机信息
     */
    List<Switch> getSwitch(String switchId);


}
