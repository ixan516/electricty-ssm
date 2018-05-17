package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecDict;
import cn.ixan.elec.enums.StatusEnums;
import cn.ixan.elec.mapper.ElecSystemddlMapper;
import cn.ixan.elec.service.ElecDictService;
import cn.ixan.elec.vo.ElecDictVo;
import cn.ixan.elec.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class ElecDictServiceImpl implements ElecDictService {

    @Autowired
    private ElecSystemddlMapper elecSystemddlMapper;

    /**
     * 查询字典表中的故障类型
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByBugType() {
        return getElecDictVosByTypeCode(StatusEnums.TYPE_OF_FAULT.getCode());
    }

    /**
     * 查询字典表中的设备状态
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByDeviceStatus() {
        return getElecDictVosByTypeCode(StatusEnums.STATUS_OF_DEVICE.getCode());
    }

    /**
     * 查询字典表中的设备类型
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByDeviceType() {
        return getElecDictVosByTypeCode(StatusEnums.TYPE_OF_DEVICE.getCode());
    }

    /**
     * 查询字典表所有站点类别
     * @return
     */
    @Override
    public List<ElecDictVo> findDictBySiteType() {
        return getElecDictVosByTypeCode(StatusEnums.TYPE_OF_STATION.getCode());
    }

    /**
     * 查询字典表中的建筑类型
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByBuildType() {
        return getElecDictVosByTypeCode(StatusEnums.TYPE_OF_BUILD.getCode());
    }

    /**
     * 查询字典表中的在职状态
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByDuty() {
        return getElecDictVosByTypeCode(StatusEnums.STATUS_OF_DUTY.getCode());
    }

    /**
     * 查询字典表中的所有单位
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByRegion() {
        return getElecDictVosByTypeCode(StatusEnums.REGIONS_OF_DICT.getCode());
    }

    /**
     * 查询字典表中的所有职位
     * @return
     */
    @Override
    public List<ElecDictVo> findDictByPosition() {
        return getElecDictVosByTypeCode(StatusEnums.POSITION_OF_DICT.getCode());
    }

    /**
     * 查询字典表中的所有性别
     * @return
     */
    @Override
    public List<ElecDictVo> findDictBySex() {
        return getElecDictVosByTypeCode(StatusEnums.SEX_OF_DICT.getCode());
    }

    /**
     * 获取字典表所有关键字
     * 请求:/dict/getAllKeywords.action
     * 返回值:List<String>
     */
    @Override
    public ResultBean<ElecDict> getDicts() {
        ResultBean<ElecDict> resultBean = new ResultBean<>();
        List<ElecDict> list = elecSystemddlMapper.getDicts();
        if (null != list && list.size() > 0) {
            list.stream().forEach(elecDict -> {
                if (elecDict.getpId() != 0) {
                    elecDict.setState("open");
                }
            });
            resultBean.setTotal(list.size());
        } else {
            resultBean.setTotal(Integer.parseInt(StatusEnums.EMPTY_OF_DICT.getCode()));
        }
        resultBean.setRows(list);
        return resultBean;
    }

    private List<ElecDictVo> getElecDictVosByTypeCode(String typeCode) {
        // 输入参数
        Map<String,Object> input = new HashMap<>();
        input.put("pId",Integer.parseInt(typeCode));
        // 输出参数
        List<ElecDictVo> output =  elecSystemddlMapper.findDictBypId(input);
        return output;
    }
    @Override
    public void saveOrUpdateDict(Map<String, Object> map) {

    }

}
