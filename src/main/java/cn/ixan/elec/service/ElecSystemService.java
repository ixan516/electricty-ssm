package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecCommonmsg;
import cn.ixan.elec.vo.ElecCommonMsgVo;

import java.util.List;
import java.util.Map;

public interface ElecSystemService {
    /**
     * 保存站点信息
     * @param elecCommonmsg
     * @return
     */
    Map<String, Object> save(ElecCommonmsg elecCommonmsg);

    /**
     * 获取最新站点信息
     * @return
     */
    Map<String, Object> findLatestElecCommonMsg();

    /**
     * 首页返回10条运行监控信息
     * @return
     */
    List<ElecCommonMsgVo> findAllElecCommonMsg();

}
