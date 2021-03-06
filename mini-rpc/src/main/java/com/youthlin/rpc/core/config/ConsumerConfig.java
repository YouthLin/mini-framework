package com.youthlin.rpc.core.config;

import com.youthlin.rpc.core.ProxyFactory;

/**
 * 消费者代理配置
 * 创建: youthlin.chen
 * 时间: 2017-11-26 15:08
 */
public interface ConsumerConfig extends ServiceConfig {
    /**
     * 指定代理实现的类
     */
    Class<? extends ProxyFactory> proxy();
}
