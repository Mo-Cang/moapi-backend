package com.mocang.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mocang.project.model.entity.InterfaceInfo;

/**
* @author Arrebol
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2023-10-16 14:27:54
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
