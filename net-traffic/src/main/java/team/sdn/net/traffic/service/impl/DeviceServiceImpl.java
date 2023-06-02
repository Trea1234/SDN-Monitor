package team.sdn.net.traffic.service.impl;

import team.sdn.domain.Host;
import team.sdn.domain.Switch;
import team.sdn.domain.Topology;
import team.sdn.net.traffic.service.DeviceService;

import java.util.List;

/**
 * @author TokisakiKurumi
 * @className DeviceServiceImpl
 * @date 2023/6/2
 * @description DeviceService接口实现类
 **/
public class DeviceServiceImpl implements DeviceService {
    @Override
    public Topology getTopology() {
        return null;
    }

    @Override
    public List<Host> getHost(Integer hostId) {
        return null;
    }

    @Override
    public List<Switch> getSwitch(Integer switchId) {
        return null;
    }
}
