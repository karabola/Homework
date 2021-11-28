package com.mentoring.homework02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValue {


    public void getPropValue(Properties properties, String propertiesFileName) throws IOException {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);

        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propertiesFileName + "' not found in the classpath");
        }

        inputStream.close();
        System.out.println("After loading properties: " + properties);

    }
}
