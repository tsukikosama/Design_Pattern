package org.ccsama.Adapter.Practice;


import java.io.*;
import java.util.Properties;

/**
 *  基层Properties 可以直接对文件进行读写操作
 */
public class FileProperties extends Properties implements FileIo  {

    @Override
    public void readFromFile(String filename)  throws IOException {
        //从文件名中读取
         load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        //后面一个参数是写入文件的第一行注释  #mikumiku 文件第一个会这样显示
         store(new FileOutputStream(filename),"mikumiku");
    }

    @Override
    public void setValue(String key, String value) throws IOException {
        //以key=value 的形式写入
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) throws IOException {

        //通过key读取value
        return getProperty(key,"");
    }
}
