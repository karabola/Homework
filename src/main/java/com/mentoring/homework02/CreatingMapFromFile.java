package com.mentoring.homework02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CreatingMapFromFile {

    public HashMap<String, String> mapFromFile(HashMap<String, String> map) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Dogs.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                String key = parts[0];
                String value = parts[1];

                map.put(key, value);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong with reading.");
        }
        return map;
    }
}
