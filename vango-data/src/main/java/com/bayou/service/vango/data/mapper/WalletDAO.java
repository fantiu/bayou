package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.Wallet;
import com.bayou.service.vango.data.model.WalletExample;
import org.springframework.stereotype.Repository;

/**
 * WalletDAO继承基类
 */
@Repository
public interface WalletDAO extends MyBatisBaseDao<Wallet, Long, WalletExample> {
}