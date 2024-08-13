package org.weilai.CreateMode.Builder.Builder;

import org.weilai.CreateMode.Builder.IMenu.IMenu;
import org.weilai.CreateMode.Builder.Materials.ceiling.LevelOneCeiling;
import org.weilai.CreateMode.Builder.Materials.ceiling.LevelTwoCeiling;
import org.weilai.CreateMode.Builder.Materials.coat.DuluxCoat;
import org.weilai.CreateMode.Builder.Materials.coat.LiBangCoat;
import org.weilai.CreateMode.Builder.Materials.floor.ShengXiangFloor;
import org.weilai.CreateMode.Builder.Materials.tile.DongPengTile;
import org.weilai.CreateMode.Builder.Materials.tile.MarcoPoloTile;


/**
 * 自己随意组合构建
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new DuluxCoat()) // 涂料，多乐⼠
                .appendFloor(new ShengXiangFloor()); // 地板，圣象
    }
    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢⽥园")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new MarcoPoloTile()); // 地砖，⻢可波罗
    }
    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new DongPengTile()); // 地砖，东鹏
    }
}
