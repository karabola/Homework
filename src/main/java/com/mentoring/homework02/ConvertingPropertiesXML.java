package com.mentoring.homework02;

import java.io.*;
import java.util.Properties;

public class ConvertingPropertiesXML {
    public void convertXMLToPropertiesFile(Properties properties) throws IOException {

        String outPropertiesFile = "src/main/resources/filePropertiesFromXML.properties";
        String inputPropertiesFile = "src/main/resources/fileXMLToProperties.xml";

        OutputStream outputStream = new FileOutputStream(outPropertiesFile);
        InputStream inputStream = new FileInputStream(inputPropertiesFile);

        properties.loadFromXML(inputStream);

        properties.store(outputStream, "Properties file converted from fileXMLToProperties.xml");
        outputStream.close();
    }

    public void convertPropertiesToXMLFile(Properties properties) throws IOException {

        String outputPropertiesFile = "src/main/resources/fileXMLFromProperties.xml";
        String inputXMLFile = "src/main/resources/filePropertiesToXML.properties";

        OutputStream outputStream1 = new FileOutputStream(outputPropertiesFile);
        InputStream inputStream1 = new FileInputStream(inputXMLFile);

        properties.load(inputStream1);
        properties.storeToXML(outputStream1, "XML file converted from filePropertiesToXML.properties");
    }
}
