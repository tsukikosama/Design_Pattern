package org.weilai.CreateMode.Builder.IMenu;

import org.weilai.CreateMode.Builder.IMatter.Matter;

public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶
    IMenu appendCoat(Matter matter); // 涂料
    IMenu appendFloor(Matter matter); // 地板
    IMenu appendTile(Matter matter); // 地砖
    String getDetail(); // 明细
}
