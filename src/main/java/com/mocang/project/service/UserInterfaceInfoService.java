package com.mocang.project.service;

import com.mocang.project.model.enums.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author mocang
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-10-20 19:22:37
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
