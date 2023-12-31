package com.mocang.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mocang.project.common.ErrorCode;
import com.mocang.project.exception.BusinessException;
import com.mocang.project.mapper.InterfaceInfoMapper;
import com.mocang.project.service.InterfaceInfoService;
import com.mocang.moapicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


/**
* @author Arrebol
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2023-10-16 14:27:54
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }

    }
}




