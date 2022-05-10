package com.ruoyi.web.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.mapper.SysDeptMapper;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.mapper.UserMapper;
import com.ruoyi.web.domain.*;
import com.ruoyi.web.domain.vo.ApplyVo;
import com.ruoyi.web.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.service.IApplicationService;

/**
 * 申请Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class ApplicationServiceImpl implements IApplicationService 
{
    @Autowired
    private ApplicationMapper applicationMapper;

    @Autowired
    private AppMapper appMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private M31Mapper m31Mapper;

    @Autowired
    private M32Mapper m32Mapper;

    @Autowired
    private M33Mapper m33Mapper;

    @Autowired
    private M34Mapper m34Mapper;

    @Autowired
    private M35Mapper m35Mapper;

    @Autowired
    private M36Mapper m36Mapper;

    @Autowired
    private M37Mapper m37Mapper;

    @Autowired
    private M38Mapper m38Mapper;

    @Autowired
    private M39Mapper m39Mapper;

    /**
     * 查询申请
     * 
     * @param id 申请主键
     * @return 申请
     */
    @Override
    public Application selectApplicationById(Long id)
    {
        return applicationMapper.selectApplicationById(id);
    }

    /**
     * 查询申请列表
     * 
     * @param application 申请
     * @return 申请
     */
    @Override
    public List<Application> selectApplicationList(Application application) {
        if (application.getUserName() != null) {
            SysUser sysUser = sysUserMapper.selectUserByNickName(application.getUserName());
            if (sysUser != null) {
                application.setUserId(sysUser.getUserId());
            }
        }
        List<Application> applications = applicationMapper.selectApplicationList(application);
        for (Application application1 : applications) {
            Long userId = application1.getUserId();
            SysUser sysUser = sysUserMapper.selectUserById(userId);
            application1.setDeptName(sysUser.getDept().getDeptName());
            String nickName = sysUserMapper.selectUserById(userId).getNickName();
            application1.setUserName(nickName);
            if (application1.getApplyResult() == 0) {
                application1.setApplyResultName("审核中");
            }else if (application1.getApplyResult() == 1) {
                application1.setApplyResultName("申报成功");
            }else if (application1.getApplyResult() == 2){
                application1.setApplyResultName("申报失败");
            }
        }
        return applications;
    }

    /**
     * 新增申请
     * 
     * @param application 申请
     * @return 结果
     */
    @Override
    public int insertApplication(Application application)
    {
        application.setCreateTime(DateUtils.getNowDate());
        return applicationMapper.insertApplication(application);
    }

    /**
     * 修改申请
     * 
     * @param application 申请
     * @return 结果
     */
    @Override
    public int updateApplication(Application application)
    {
        application.setUpdateTime(DateUtils.getNowDate());
        return applicationMapper.updateApplication(application);
    }

    /**
     * 批量删除申请
     * 
     * @param ids 需要删除的申请主键
     * @return 结果
     */
    @Override
    public int deleteApplicationByIds(Long[] ids)
    {
        return applicationMapper.deleteApplicationByIds(ids);
    }

    /**
     * 删除申请信息
     * 
     * @param id 申请主键
     * @return 结果
     */
    @Override
    public int deleteApplicationById(Long id)
    {
        return applicationMapper.deleteApplicationById(id);
    }

    @Override
    public int insertApplyApplication(ApplyVo apply) {
        Application application = new Application();
        application.setCreateTime(DateUtils.getNowDate());
        application.setUserId(SecurityUtils.getLoginUser().getUserId());
        SysUser sysUser = sysUserMapper.selectUserById(SecurityUtils.getLoginUser().getUserId());
        application.setDeptName(sysUser.getDept().getDeptName());
        application.setApplyName(apply.getApplyName());
        application.setApplyType(apply.getApplyType());
        // 判断申报类型id
        if ("M31".equals(apply.getApplyType())) {
            EvaluationTypeM31 evaluationTypeM31 = m31Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType());
            if (evaluationTypeM31 != null) {
                application.setApplyTypeId(evaluationTypeM31.getId());
            }
        }
        if ("M32".equals(apply.getApplyType())) {
            EvaluationTypeM32 evaluationTypeM32 = m32Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType(),apply.getThirdLevelType());
            if (evaluationTypeM32 != null) {
                application.setApplyTypeId(evaluationTypeM32.getId());
            }
        }
        if ("M33".equals(apply.getApplyType())) {
            EvaluationTypeM33 evaluationTypeM33 = m33Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType());
            if (evaluationTypeM33 != null) {
                application.setApplyTypeId(evaluationTypeM33.getId());
            }
        }
        if ("M34".equals(apply.getApplyType())) {
            EvaluationTypeM34 evaluationTypeM34 = m34Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType(),apply.getThirdLevelType());
            if (evaluationTypeM34 != null) {
                application.setApplyTypeId(evaluationTypeM34.getId());
            }
        }
        if ("M35".equals(apply.getApplyType())) {
            EvaluationTypeM35 evaluationTypeM35= m35Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType(),apply.getThirdLevelType());
            if (evaluationTypeM35 != null) {
                application.setApplyTypeId(evaluationTypeM35.getId());
            }
        }
        if ("M36".equals(apply.getApplyType())) {
            EvaluationTypeM36 evaluationTypeM36= m36Mapper.selectIdByType(apply.getFirstLevelType());
            if (evaluationTypeM36 != null) {
                application.setApplyTypeId(evaluationTypeM36.getId());
            }
        }
        if ("M37".equals(apply.getApplyType())) {
            EvaluationTypeM37 evaluationTypeM37= m37Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType(),apply.getThirdLevelType());
            if (evaluationTypeM37 != null) {
                application.setApplyTypeId(evaluationTypeM37.getId());
            }
        }
        if ("M38".equals(apply.getApplyType())) {
            EvaluationTypeM38 evaluationTypeM38= m38Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType(),apply.getThirdLevelType());
            if (evaluationTypeM38 != null) {
                application.setApplyTypeId(evaluationTypeM38.getId());
            }
        }
        if ("M39".equals(apply.getApplyType())) {
            EvaluationTypeM39 evaluationTypeM39= m39Mapper.selectIdByType(apply.getFirstLevelType(), apply.getSecondLevelType());
            if (evaluationTypeM39 != null) {
                application.setApplyTypeId(evaluationTypeM39.getId());
            }
        }
        application.setApplyContent(apply.getApplyContent());
        application.setApplyLink(apply.getApplyLink());
        application.setApplyMark(apply.getApplyMark());
        application.setApplyResult(0L);
        application.setCreateTime(new Date());
        return applicationMapper.insertApplication(application);
    }

    @Override
    public List<Application> selectApplicationListForUser(Application application) {
        Long loginUserId = SecurityUtils.getLoginUser().getUserId();
        if (loginUserId != 1) {
            application.setUserId(loginUserId);
        }
        List<Application> applications = applicationMapper.selectApplicationList(application);
        for (Application application1 : applications) {
            Long userId = application1.getUserId();
            String nickName = sysUserMapper.selectUserById(userId).getNickName();
            application1.setUserName(nickName);
            if (application1.getApplyResult() == 0) {
                application1.setApplyResultName("审核中");
            }else if (application1.getApplyResult() == 1) {
                application1.setApplyResultName("申报成功");
            }else if (application1.getApplyResult() == 2){
                application1.setApplyResultName("申报失败");
            }
            Long applyTypeId = application1.getApplyTypeId();
            if ("M31".equals(application1.getApplyType())) {
                EvaluationTypeM31 evaluationTypeM31 = m31Mapper.selectById(applyTypeId);
                if (evaluationTypeM31 != null) {
                    application1.setFirstLevelType(evaluationTypeM31.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM31.getSecondLevelType());
                    application1.setScores(evaluationTypeM31.getScores());
                }
            }
            if ("M32".equals(application1.getApplyType())) {
                EvaluationTypeM32 evaluationTypeM32 = m32Mapper.selectById(applyTypeId);
                if (evaluationTypeM32 != null) {
                    application1.setFirstLevelType(evaluationTypeM32.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM32.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM32.getThirdLevelType());
                    application1.setScores(evaluationTypeM32.getScores());
                }
            }
            if ("M33".equals(application1.getApplyType())) {
                EvaluationTypeM33 evaluationTypeM33 = m33Mapper.selectById(applyTypeId);
                if (evaluationTypeM33 != null) {
                    application1.setFirstLevelType(evaluationTypeM33.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM33.getSecondLevelType());
                    application1.setScores(evaluationTypeM33.getScores());
                }
            }
            if ("M34".equals(application1.getApplyType())) {
                EvaluationTypeM34 evaluationTypeM34 = m34Mapper.selectById(applyTypeId);
                if (evaluationTypeM34 != null) {
                    application1.setFirstLevelType(evaluationTypeM34.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM34.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM34.getThirdLevelType());
                    application1.setScores(evaluationTypeM34.getScores());
                }
            }
            if ("M35".equals(application1.getApplyType())) {
                EvaluationTypeM35 evaluationTypeM35= m35Mapper.selectById(applyTypeId);
                if (evaluationTypeM35 != null) {
                    application1.setFirstLevelType(evaluationTypeM35.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM35.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM35.getThirdLevelType());
                    application1.setScores(evaluationTypeM35.getScores());
                }
            }
            if ("M36".equals(application1.getApplyType())) {
                EvaluationTypeM36 evaluationTypeM36= m36Mapper.selectById(applyTypeId);
                if (evaluationTypeM36 != null) {
                    application1.setFirstLevelType(evaluationTypeM36.getFirstLevelType());
                    application1.setScores(evaluationTypeM36.getScores());
                }
            }
            if ("M37".equals(application1.getApplyType())) {
                EvaluationTypeM37 evaluationTypeM37= m37Mapper.selectById(applyTypeId);
                if (evaluationTypeM37 != null) {
                    application1.setFirstLevelType(evaluationTypeM37.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM37.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM37.getThirdLevelType());
                    application1.setScores(evaluationTypeM37.getScores());
                }
            }
            if ("M38".equals(application1.getApplyType())) {
                EvaluationTypeM38 evaluationTypeM38= m38Mapper.selectById(applyTypeId);
                if (evaluationTypeM38 != null) {
                    application1.setFirstLevelType(evaluationTypeM38.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM38.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM38.getThirdLevelType());
                    application1.setScores(evaluationTypeM38.getScores());
                }
            }
            if ("M39".equals(application1.getApplyType())) {
                EvaluationTypeM39 evaluationTypeM39= m39Mapper.selectById(applyTypeId);
                if (evaluationTypeM39 != null) {
                    application1.setFirstLevelType(evaluationTypeM39.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM39.getSecondLevelType());
                    application1.setScores(evaluationTypeM39.getScores());
                }
            }

        }
        return applications;
    }

    @Override
    public List<Application> selectApplicationListSta(Application application) {
        if (application.getUserName() != null) {
            SysUser sysUser = sysUserMapper.selectUserByNickName(application.getUserName());
            if (sysUser != null) {
                application.setUserId(sysUser.getUserId());
            }
        }
        application.setApplyResult(1L);
        List<Application> applications = applicationMapper.selectApplicationList(application);
        for (Application application1 : applications) {
            Long userId = application1.getUserId();
            SysUser sysUser = sysUserMapper.selectUserById(userId);
            application1.setDeptName(sysUser.getDept().getDeptName());
            application1.setUserName(sysUser.getNickName());
            if (application1.getApplyResult() == 0) {
                application1.setApplyResultName("审核中");
            }else if (application1.getApplyResult() == 1) {
                application1.setApplyResultName("申报成功");
            }else if (application1.getApplyResult() == 2){
                application1.setApplyResultName("申报失败");
            }
            Long applyTypeId = application1.getApplyTypeId();
            if ("M31".equals(application1.getApplyType())) {
                EvaluationTypeM31 evaluationTypeM31 = m31Mapper.selectById(applyTypeId);
                if (evaluationTypeM31 != null) {
                    application1.setFirstLevelType(evaluationTypeM31.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM31.getSecondLevelType());
                    application1.setScores(evaluationTypeM31.getScores());
                }
            }
            if ("M32".equals(application1.getApplyType())) {
                EvaluationTypeM32 evaluationTypeM32 = m32Mapper.selectById(applyTypeId);
                if (evaluationTypeM32 != null) {
                    application1.setFirstLevelType(evaluationTypeM32.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM32.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM32.getThirdLevelType());
                    application1.setScores(evaluationTypeM32.getScores());
                }
            }
            if ("M33".equals(application1.getApplyType())) {
                EvaluationTypeM33 evaluationTypeM33 = m33Mapper.selectById(applyTypeId);
                if (evaluationTypeM33 != null) {
                    application1.setFirstLevelType(evaluationTypeM33.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM33.getSecondLevelType());
                    application1.setScores(evaluationTypeM33.getScores());
                }
            }
            if ("M34".equals(application1.getApplyType())) {
                EvaluationTypeM34 evaluationTypeM34 = m34Mapper.selectById(applyTypeId);
                if (evaluationTypeM34 != null) {
                    application1.setFirstLevelType(evaluationTypeM34.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM34.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM34.getThirdLevelType());
                    application1.setScores(evaluationTypeM34.getScores());
                }
            }
            if ("M35".equals(application1.getApplyType())) {
                EvaluationTypeM35 evaluationTypeM35= m35Mapper.selectById(applyTypeId);
                if (evaluationTypeM35 != null) {
                    application1.setFirstLevelType(evaluationTypeM35.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM35.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM35.getThirdLevelType());
                    application1.setScores(evaluationTypeM35.getScores());
                }
            }
            if ("M36".equals(application1.getApplyType())) {
                EvaluationTypeM36 evaluationTypeM36= m36Mapper.selectById(applyTypeId);
                if (evaluationTypeM36 != null) {
                    application1.setFirstLevelType(evaluationTypeM36.getFirstLevelType());
                    application1.setScores(evaluationTypeM36.getScores());
                }
            }
            if ("M37".equals(application1.getApplyType())) {
                EvaluationTypeM37 evaluationTypeM37= m37Mapper.selectById(applyTypeId);
                if (evaluationTypeM37 != null) {
                    application1.setFirstLevelType(evaluationTypeM37.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM37.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM37.getThirdLevelType());
                    application1.setScores(evaluationTypeM37.getScores());
                }
            }
            if ("M38".equals(application1.getApplyType())) {
                EvaluationTypeM38 evaluationTypeM38= m38Mapper.selectById(applyTypeId);
                if (evaluationTypeM38 != null) {
                    application1.setFirstLevelType(evaluationTypeM38.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM38.getSecondLevelType());
                    application1.setThirdLevelType(evaluationTypeM38.getThirdLevelType());
                    application1.setScores(evaluationTypeM38.getScores());
                }
            }
            if ("M39".equals(application1.getApplyType())) {
                EvaluationTypeM39 evaluationTypeM39= m39Mapper.selectById(applyTypeId);
                if (evaluationTypeM39 != null) {
                    application1.setFirstLevelType(evaluationTypeM39.getFirstLevelType());
                    application1.setSecondLevelType(evaluationTypeM39.getSecondLevelType());
                    application1.setScores(evaluationTypeM39.getScores());
                }
            }

        }
        return applications;
    }

    @Override
    public List<String> getDeptName() {
        return appMapper.getDeptName();
    }

    @Override
    public List<String> getType() {
        return appMapper.getType();
    }
}
