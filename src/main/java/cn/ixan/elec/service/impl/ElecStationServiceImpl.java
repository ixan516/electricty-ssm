package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecRun;
import cn.ixan.elec.domain.ElecStation;
import cn.ixan.elec.mapper.ElecRunMapper;
import cn.ixan.elec.mapper.ElecStationMapper;
import cn.ixan.elec.service.ElecStationService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.vo.ElecRunVo;
import cn.ixan.elec.vo.ElecStationVo;
import cn.ixan.elec.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class ElecStationServiceImpl implements ElecStationService {

    @Inject
    private ElecStationMapper elecStationMapper;
    @Inject
    private ElecRunMapper elecRunMapper;

    /**
     * 模糊查询运行情况
     * @param map
     * @return
     */
    @Override
    public ResultBean<ElecRunVo> queryRunInfoByExample(Map<String,String> map) {
        List<ElecRunVo> list = elecRunMapper.queryRunInfoByExample(map);
        ResultBean<ElecRunVo> resultBean = new ResultBean<>();
        resultBean.setRows(list);
        resultBean.setTotal(list.size());
        return resultBean;
    }

    /**
     * 根据主键查询运行情况
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getStationById(String id) {
        ElecRun run = elecRunMapper.selectByPrimaryKey(id);
        if(null != run){
            Map<String,Object> map = new HashMap<>();
            map.put("stationId",run.getStationId());
            map.put("bugType",run.getBugType());
            map.put("occurDate",DateUtils.date2String(run.getOccurDate()));
            map.put("produceHome",run.getProduceHome());
            map.put("bugDesc",run.getBugDesc());
            map.put("resolveDate",DateUtils.date2String(run.getResolveDate()));
            map.put("resolveMethod",run.getResolveMethod());
            map.put("sbMonth",run.getSbMonth());
            map.put("comment",run.getComment());
            map.put("id",run.getId());
            return map;
        }
        return null;
    }

    /**
     * 添加运行情况
     * @param elecRun
     * @return
     */
    @Override
    public Boolean addRunInfo(ElecRun elecRun) {
        Integer result = null;
        String runId = elecRun.getId();
        // 更新
        if(StringUtils.isNotBlank(runId)){
            result = elecRunMapper.updateByPrimaryKey(elecRun);
        }else{
            result = elecRunMapper.insertSelective(elecRun);
        }
        return result == 1;
    }

    /**
     * 批量删除运行情况
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteRunInfo(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecRunMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }

    /**
     * 获取运行情况
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<Map<String, Object>> getAllRunInfo(Integer page, Integer rows) {
        ResultBean<Map<String,Object>> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecRunVo> list = elecRunMapper.getAllRunInfo();
        List<Map<String,Object>> listVo = new ArrayList<>();
        if(null != list && list.size() >0){
            for(ElecRunVo run:list){
                Map<String,Object> map = new HashMap<>();
                map.put("id",run.getId());
                map.put("jctId",run.getJctId());
                map.put("stationName",run.getStationName());
                map.put("bugType",run.getBugType());
                map.put("occurDate",DateUtils.date2String(run.getOccurDate()));
                map.put("bugReason",run.getBugReason());
                map.put("sbmonth",run.getSbmonth());
                map.put("comment",run.getComment());
                listVo.add(map);
            }
        }
        // 获取其他数据
        PageInfo<ElecRunVo> info=new PageInfo<ElecRunVo>(list);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(listVo);
        return resultBean;
    }

    /**
     * 获取所有站点名称
     * @return
     */
    @Override
    public List<Map<String, String>> getStationNames() {
        return elecStationMapper.getStationNames();
    }

    /**
     * 模糊查询站点信息
     * @param elecStation
     * @return
     */
    @Override
    public ResultBean<ElecStationVo> querySiteInfoByExample(ElecStation elecStation) {
        List<ElecStationVo> list = elecStationMapper.querySiteInfoByExample(elecStation);
        ResultBean<ElecStationVo> resultBean = new ResultBean<>();
        resultBean.setRows(list);
        resultBean.setTotal(list.size());
        return resultBean;
    }

    /**
     * 根据主键查询站点信息
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getSiteInfoById(String id) {
        ElecStation elecStation = elecStationMapper.selectByPrimaryKey(id);
        Map<String,Object> map = new HashMap<>();
        map.put("jctId",elecStation.getJctId());
        map.put("stationName",elecStation.getStationName());
        map.put("stationCode",elecStation.getStationCode());
        map.put("useStartDate", DateUtils.date2String(elecStation.getUseStartDate()));
        map.put("installAddress",elecStation.getInstallAddress());
        map.put("produceHome",elecStation.getProduceHome());
        map.put("contactType",elecStation.getContactType());
        map.put("stationType",elecStation.getStationType());
        map.put("attributeGround",elecStation.getAttributeGround());
        map.put("comment",elecStation.getComment());
        map.put("id",elecStation.getId());
        return map;
    }

    /**
     * 添加站点信息
     * @param elecStation
     * @return
     */
    @Override
    public Boolean addSiteInfo(ElecStation elecStation) {
        Integer result = null;
        String buildId = elecStation.getId();
        // 更新
        if(StringUtils.isNotBlank(buildId)){
            result = elecStationMapper.updateByPrimaryKey(elecStation);
        }else{
            result = elecStationMapper.insertSelective(elecStation);
        }
        return result == 1;
    }

    /**
     * 批量删除站点信息
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteStationInfo(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecStationMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }

    /**
     * 获取站点基本信息
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecStationVo> getAllSiteInfo(Integer page, Integer rows) {
        ResultBean<ElecStationVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecStationVo> list = elecStationMapper.getAllSiteInfo();
        // 获取其他数据
        PageInfo<ElecStationVo> info=new PageInfo<ElecStationVo>(list);
        //封装结果
        long total = info.getTotal();
        resultBean.setTotal(Math.toIntExact(total));
        resultBean.setRows(list);
        return resultBean;
    }
}
