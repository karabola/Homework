package com.mentoring.homework02;

import java.util.HashMap;

/*
początkowe dane do mapy czyli klucze i wartości do poszczególnych list były brane z zewnetrznego pliku properties
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        CreatingMapFromFile creatingMapFromFile = new CreatingMapFromFile();
        creatingMapFromFile.mapFromFile(map);

        Iterating iterating = new Iterating();
        iterating.iterationKeyValue(map);

    }
}
