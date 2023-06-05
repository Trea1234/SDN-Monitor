package team.sdn.net.traffic.service.impl;

import org.springframework.stereotype.Service;
import team.sdn.domain.Host;
import team.sdn.domain.Switch;
import team.sdn.domain.Topology;
import team.sdn.net.traffic.service.DeviceService;
import team.sdn.sdnutils.TopologyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author TokisakiKurumi
 * @className DeviceServiceImpl
 * @date 2023/6/2
 * @description DeviceService接口实现类
 **/
@Service
public class DeviceServiceImpl implements DeviceService {
    @Override
    public String getTopology() {
        return TopologyUtils.getTopology();
    }

    @Override
    public List<Host> getHost(String hostId) {
        if (Objects.nonNull(hostId)) {
            List<Host> hosts = new ArrayList<>();
            hosts.add(TopologyUtils.getHostById(hostId));
            return hosts;
        }
        return TopologyUtils.getAllHost();
    }

    @Override
    public List<Switch> getSwitch(String switchId) {
        if (Objects.nonNull(switchId)) {
            List<Switch> switches = new ArrayList<>();
            switches.add(TopologyUtils.getSwitchById(switchId));
            return switches;
        }
        return TopologyUtils.getAllSwitch();
    }
}
