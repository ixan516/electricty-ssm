package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecCommonmsg;
import cn.ixan.elec.mapper.ElecCommonmsgMapper;
import cn.ixan.elec.service.ElecSystemService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.vo.ElecCommonMsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class ElecSystemServiceImpl implements ElecSystemService {

    @Autowired
    private ElecCommonmsgMapper elecCommonmsgMapper;

    /**
     * 保存运行监控信息
     *
     * @param elecCommonmsg
     */
    @Override
    @Transactional(readOnly = false)
    public Map<String, Object> save(ElecCommonmsg elecCommonmsg) {
        Integer result = elecCommonmsgMapper.insertSelective(elecCommonmsg);
        if (result == 1) {
            Map<String, Object> map = new HashMap<>();
            map.put("comId", elecCommonmsg.getComId());
            map.put("devRun", elecCommonmsg.getDevRun());
            map.put("stationRun", elecCommonmsg.getStationRun());
            map.put("createDate", DateUtils.timestamp2String(elecCommonmsg.getCreateDate()));
            return map;
        } else {
            return null;
        }
    }

    /**
     * 查询出运行监控表中的最新数据
     *
     * @return
     */
    @Override
    public Map<String, Object> findLatestElecCommonMsg() {
        Map<String,Object> map = new HashMap<>();
        ElecCommonmsg commonMsg = elecCommonmsgMapper.findLatestElecCommonMsg();
        if (null != commonMsg) {
            map.put("comId",commonMsg.getComId());
            map.put("stationRun",DateUtils.timestamp2String(commonMsg.getCreateDate()));
            map.put("devRun",DateUtils.timestamp2String(commonMsg.getCreateDate()));
            map.put("createDate",DateUtils.timestamp2String(commonMsg.getCreateDate()));
        }
        return map;
    }

    /**
     * 首页返回10条运行监控信息
     *
     * @return
     */
    @Override
    public List<ElecCommonMsgVo> findAllElecCommonMsg() {
        List<ElecCommonmsg> list = elecCommonmsgMapper.findAllElecCommonMsg();
        List<ElecCommonMsgVo> elecCommonMsgVoList = new ArrayList<ElecCommonMsgVo>();
        if (null != list && list.size() > 0){
            for (ElecCommonmsg commonMsg : list) {
                // 封装数据
                ElecCommonMsgVo elecCommonMsgVo = new ElecCommonMsgVo();
                elecCommonMsgVo.setComId(commonMsg.getComId());
                elecCommonMsgVo.setStationRun(commonMsg.getStationRun());
                elecCommonMsgVo.setDevRun(commonMsg.getDevRun());
                elecCommonMsgVo.setCreateDate(DateUtils.timestamp2String(commonMsg.getCreateDate()));
                elecCommonMsgVoList.add(elecCommonMsgVo);
            }
        }else{
            elecCommonMsgVoList = null;
        }
        return elecCommonMsgVoList;
    }
}
