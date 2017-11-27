package com.youthlin.rpc.core.config;

import com.youthlin.rpc.core.Exporter;
import com.youthlin.rpc.core.SimpleExporter;
import com.youthlin.rpc.util.NetUtil;

import java.lang.reflect.Method;

/**
 * 超时无限长, 同步调用, 默认在 1884 端口暴露服务
 * 创建: youthlin.chen
 * 时间: 2017-11-26 15:31
 */
public class SimpleProviderConfig extends AbstractConfig implements ProviderConfig {
    @Override
    public String host() {
        return NetUtil.ANY_HOST;
    }

    @Override
    public int port() {
        return NetUtil.getAvailablePort(NetUtil.DEFAULT_PORT);
    }

    @Override
    public int timeout(Method method) {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean async(Method method) {
        return false;
    }

    @Override
    public Class<?>[] interfaces() {
        return null;
    }

    @Override
    public Class<? extends Exporter> exporter() {
        return SimpleExporter.class;
    }

}
