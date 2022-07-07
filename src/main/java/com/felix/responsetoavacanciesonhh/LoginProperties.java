package com.felix.responsetoavacanciesonhh;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginProperties {

    private static FileInputStream fileInputStream;
    private static Properties properties;

    static {
        try {
            fileInputStream = new FileInputStream("/home/felix/IdeaProjects/response-to-a-vacancies-on-hh/src/main/resources/login.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream == null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
