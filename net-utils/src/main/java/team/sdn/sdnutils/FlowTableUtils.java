package team.sdn.sdnutils;

import team.sdn.domain.OpenFlow;

import java.util.List;

/**
 * 流表相关工具
 * @author Big-Bai
 **/
public interface FlowTableUtils {
    /**
     * 批量下发流表
     * @param flow 流表
     * @return 是否下发成功
     */
    Boolean addFlowsBatch(OpenFlow flow);

    /**
     * 为某个交换机下发流表
     * @param switchId 交换机id
     * @param flow 流表内容
     * @return 是否下发成功
     */
    Boolean addFlowForSwitch(Integer switchId,OpenFlow flow);

    /**
     * 获取所有的流表
     * @return 所有的流表
     */
    List<OpenFlow> getAllFlowTables();

    /**
     * 获取某个交换器的流表
     * @param switchId 交换机id
     * @return 流表们
     */
    List<OpenFlow> getAllTablesOfSwitch(Integer switchId);

    /**
     * 删除某个交换机的某个流表
     * @param switchId 交换机id
     * @param tableId 流表id
     * @return 是否成功删除
     */
    Boolean deleteFlowTable(Integer switchId,Integer tableId);
    /**
     * 删除某个交换机的所有流表
     * @param switchId 交换机id
     * @return 是否成功删除
     */
    Boolean deleteAllTableOfSwitch(Integer switchId);

    /**
     * 修改某个交换机的某个流表内容
     * @param switchId 交换机id
     * @param tableId 流表id
     * @return 是否成功删除
     */
    Boolean modifyFlowTable(Integer switchId,Integer tableId);
}
