package io.github.quantamancer;

import java.util.List;

public class Day1 extends AoCPuzzle{

    public Day1() {
        super("1", "Number");
    }

    @Override
    void solvePuzzleWithIntegers(List<Integer> puzzleInput) {
        for (Integer a : puzzleInput) {
            System.out.println(a);
        }
    }

    @Override
    void solvePuzzleWithString(List<String> puzzleInput) {}

    @Override
    void solvePuzzleWithLongs(List<Long> puzzleInput) {}
}
