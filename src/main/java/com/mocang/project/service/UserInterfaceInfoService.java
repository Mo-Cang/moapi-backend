package com.mocang.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mocang.moapicommon.model.entity.UserInterfaceInfo;


import javax.servlet.http.HttpServletRequest;

/**
 * 用户接口信息服务
 *
 * @author mocang
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
