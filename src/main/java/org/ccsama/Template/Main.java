package org.ccsama.Template;

import java.io.FileInputStream;

/**
 * 模板模式 就是 使用一个抽象类来定义一些抽象方法 可以让子类去实现这些方法的具体
 * 定义一个实现类  来使用这些抽象方法  子类也可以进行相同的操作不会造成代码冗余
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('H');
        charDisplay.display();
        StringDisplay stringDisplay = new StringDisplay("hello");
        stringDisplay.display();
        StringDisplay stringDisplay2 = new StringDisplay("歪歪歪");
        stringDisplay2.display();

    }
}
