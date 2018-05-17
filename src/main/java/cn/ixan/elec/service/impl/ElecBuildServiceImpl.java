package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecBuild;
import cn.ixan.elec.mapper.ElecBuildMapper;
import cn.ixan.elec.service.ElecBuildService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.vo.ElecBuildVo;
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
public class ElecBuildServiceImpl implements ElecBuildService {

    @Inject
    private ElecBuildMapper elecBuildMapper;

    /**
     * 模糊查询监测台建筑信息
     * @param elecBuild
     * @return
     */
    @Override
    public ResultBean<ElecBuildVo> queryBuildInfoByExample(ElecBuild elecBuild) {
        List<ElecBuildVo> list = elecBuildMapper.queryBuildInfoByExample(elecBuild);
        ResultBean<ElecBuildVo> resultBean = new ResultBean<>();
        resultBean.setRows(list);
        resultBean.setTotal(list.size());
        return resultBean;
    }

    /**
     * 根据主键查询监测台建筑信息
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getBuildInfoById(String id) {
        ElecBuild elecBuild = elecBuildMapper.selectByPrimaryKey(id);
        Map<String, Object> map = new HashMap<>();
        map.put("jctId", elecBuild.getJctId());
        map.put("buildName", elecBuild.getBuildName());
        map.put("buildType", elecBuild.getBuildType());
        map.put("buildLayer", elecBuild.getBuildLayer());
        map.put("buildArea", elecBuild.getBuildArea());
        map.put("buildStartDate", DateUtils.date2String(elecBuild.getBuildStartDate()));
        map.put("extendBuildDate", DateUtils.date2String(elecBuild.getExtendBuildDate()));
        map.put("extendBuildArea", elecBuild.getExtendBuildArea());
        map.put("dxDate", DateUtils.date2String(elecBuild.getDxDate()));
        map.put("buildExpense", elecBuild.getBuildExpense());
        map.put("useDate", DateUtils.date2String(elecBuild.getUseDate()));
        map.put("comment", elecBuild.getComment());
        map.put("id", elecBuild.getId());
        return map;
    }

    /**
     * 添加监测台建筑信息
     * @param elecBuild
     * @return
     */
    @Override
    public Boolean addBuildInfo(ElecBuild elecBuild) {
        Integer result = null;
        String buildId = elecBuild.getId();
        // 更新
        if(StringUtils.isNotBlank(buildId)){
            result = elecBuildMapper.updateByPrimaryKey(elecBuild);
        }else{
            result = elecBuildMapper.insertSelective(elecBuild);
        }
        return result == 1;
    }

    /**
     * 批量删除建筑信息
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteUser(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecBuildMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }

    /**
     * 查询所有建筑信息
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecBuildVo> findAllBuildInfo(Integer page, Integer rows) {
        ResultBean<ElecBuildVo> resultBean = new ResultBean<>();
        List<ElecBuildVo> elecBuildVoList = new ArrayList<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecBuild> elecBuildList = elecBuildMapper.findAllBuildInfo();
        if(elecBuildList != null && elecBuildList.size() > 0){
            for(ElecBuild elecBuild : elecBuildList){
                ElecBuildVo elecBuildVo = new ElecBuildVo();
                elecBuildVo.setId(elecBuild.getId());
                elecBuildVo.setBuildName(elecBuild.getBuildName());
                elecBuildVo.setJctId(elecBuild.getJctId());
                elecBuildVo.setBuildLayer(elecBuild.getBuildLayer());
                elecBuildVo.setBuildExpense(elecBuild.getBuildExpense());
                elecBuildVo.setBuildType(elecBuild.getBuildType());
                elecBuildVo.setBuildArea(elecBuild.getBuildArea());
                elecBuildVo.setDxDate(DateUtils.date2String(elecBuild.getDxDate()));
                elecBuildVo.setComment(elecBuild.getComment());
                elecBuildVoList.add(elecBuildVo);
            }
        }
        // 获取其他数据
        PageInfo<ElecBuild> info=new PageInfo<ElecBuild>(elecBuildList);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(elecBuildVoList);
        return resultBean;
    }
}
