package com.mocang.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mocang.moapicommon.model.entity.UserInterfaceInfo;

import java.util.List;


/**
* @author mocang
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-10-20 19:22:37
* @Entity com.mocang.project.model.enums.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




