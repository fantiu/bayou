package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.WalletLog;
import com.bayou.service.vango.data.model.WalletLogExample;
import org.springframework.stereotype.Repository;

/**
 * WalletLogDAO继承基类
 */
@Repository
public interface WalletLogDAO extends MyBatisBaseDao<WalletLog, Integer, WalletLogExample> {
}