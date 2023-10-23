package com.mocang.moapicommon.service;

import com.mocang.moapicommon.model.entity.User;

/**
 * 内部用户服务
 *
 * @author mocang
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     *
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
