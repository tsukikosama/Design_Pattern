package org.weilai.CreateMode.AbstracFactory.Adapter;

import org.weilai.CreateMode.AbstracFactory.Adapter.Impl.ICacheAdapter;
import org.weilai.CreateMode.AbstracFactory.JuTiShiXian.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();
    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
