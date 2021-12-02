package io.github.quantamancer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AoCPuzzle {

    public AoCPuzzle(String day, String dataType) {
        File file = new File("res/day" + day + ".txt");
        if(!file.exists()) {
            System.err.println("File doesn't exist!");
            return;
        }
        BufferedReader reader;
        try
        {
            reader = new BufferedReader(new FileReader(file));
        } catch(FileNotFoundException e)
        {
            System.err.println("File not found!");
            return;
        }

        if (dataType == "Number") {
            List<Integer> puzzleInputs = new ArrayList<>();
            try {
                String line;
                while ((line = reader.readLine()) != null) puzzleInputs.add(Integer.parseInt(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
            solvePuzzleWithIntegers(puzzleInputs);
        }
        else if (dataType == "String"){
            List<String> puzzleInputs = new ArrayList<>();
            try {
                String line;
                while ((line = reader.readLine()) != null) puzzleInputs.add(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
            solvePuzzleWithString(puzzleInputs);
        } else if (dataType == "Long") {
            List<Long> puzzleInputs = new ArrayList<>();
            try {
                String line;
                while ((line = reader.readLine()) != null) puzzleInputs.add(Long.parseLong(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
            solvePuzzleWithLongs(puzzleInputs);
        }

    }

    abstract void solvePuzzleWithString(List<String> puzzleInput);
    abstract void solvePuzzleWithIntegers(List<Integer> puzzleInput);
    abstract void solvePuzzleWithLongs(List<Long> puzzleInput);

}
