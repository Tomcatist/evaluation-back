package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.Application;

/**
 * 申请Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface ApplicationMapper 
{
    /**
     * 查询申请
     * 
     * @param id 申请主键
     * @return 申请
     */
    public Application selectApplicationById(Long id);

    /**
     * 查询申请列表
     * 
     * @param application 申请
     * @return 申请集合
     */
    public List<Application> selectApplicationList(Application application);

    /**
     * 新增申请
     * 
     * @param application 申请
     * @return 结果
     */
    public int insertApplication(Application application);

    /**
     * 修改申请
     * 
     * @param application 申请
     * @return 结果
     */
    public int updateApplication(Application application);

    /**
     * 删除申请
     * 
     * @param id 申请主键
     * @return 结果
     */
    public int deleteApplicationById(Long id);

    /**
     * 批量删除申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteApplicationByIds(Long[] ids);

}
