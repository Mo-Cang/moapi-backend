package com.mocang.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mocang.project.model.entity.InterfaceInfo;
import com.mocang.project.service.InterfaceInfoService;
import com.mocang.project.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Arrebol
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2023-10-16 14:27:54
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




