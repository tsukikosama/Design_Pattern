package org.weilai.CreateMode.Builder.Builder;

import lombok.extern.slf4j.Slf4j;
import org.weilai.CreateMode.Builder.IMatter.Matter;
import org.weilai.CreateMode.Builder.IMenu.IMenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * 构建的包装接口
 * 方法放回对象
 */
@Slf4j
public class DecorationPackageMenu implements IMenu {

    private String grade;

    private BigDecimal area;

    private List<Matter> list = new ArrayList<Matter>();
    ;
    private BigDecimal price = new BigDecimal(0);

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------- -----------------------------------\r\n" + "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) +
                " 元\r\n" +
                "房屋⾯积：" + area.doubleValue() + " 平⽶\r\n" +
                "材料清单：\r\n");
        for (Matter matter : list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append(
                    "、").append(matter.model()).append("、平⽶价格：").append(matter.price()).append(" 元。\n");

        }
        return detail.toString();
    }
}
