package org.weilai.StructureMode.Adapter.adapter;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.weilai.StructureMode.Adapter.entity.RebateInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * 通过反射来实现的 可以使不同的mq类型进行统一的适配
 * 适配通过反射来实现的 直接去调用set方法来设置新的值
 */
@Slf4j
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String>
            link) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
//        System.out.println("1111");
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    /**
     * 通过传入map 使用反射去获取rebateinfo的set方法 设置新的值
     * @param obj  传递过来的json字符串对象
     * @param link 需要适配的属性map
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static RebateInfo filter(Map obj, Map<String, String> link)

            throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        //创建一个新的对象 用来保存对象
        RebateInfo rebateInfo = new RebateInfo();
        //遍历 树妖适配的map key是需要适配的字段名

        for (String key : link.keySet()) {
            //val得到的结果是获取匹配到对象的值
            Object val = obj.get(link.get(key));
            //通过反射调用rebateInfo.setXXX方法来设置对象的属性
            RebateInfo.class.getMethod("set" + key.substring(0,
                    1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo,
                    val.toString());
            //setUserId()
            System.out.println(rebateInfo);
        }
        return rebateInfo;
    }
}
