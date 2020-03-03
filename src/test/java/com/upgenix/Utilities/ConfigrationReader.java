package com.upgenix.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {


    private static Properties configFile;

    static {
        try{
            FileInputStream fileInputStream=new FileInputStream("configration.properties");
            configFile=new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e){
            System.out.println("Failed to load properties file");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }
}
