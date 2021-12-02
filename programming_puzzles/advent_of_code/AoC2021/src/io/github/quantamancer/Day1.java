package io.github.quantamancer;

import java.util.List;

public class Day1 extends AoCPuzzle{

    public Day1() {
        super("1", "Number");
    }

    @Override
    void solvePuzzleWithIntegers(List<Integer> puzzleInput) {

        /* PART 1 */
        int increases = 0;
        /*
            Here, we are iterating through the list of inputs given. We then check
            the previous element and the current element. If the current element is
            larger, then increases is incremented by 1. The loop var i starts at 1
            since we can assume the element at index 0 is always no change.
         */
        for (int i = 1; i < puzzleInput.size(); i++) {
            if (puzzleInput.get(i) > puzzleInput.get(i - 1)) increases++;
        }
        System.out.println("Part 1 Answer: " + increases);

        /* PART 2 */
        increases = 0;
        /*
            Here, we are also iterating through the list of inputs given. However, now
            we are adding three elements together and then comparing it to the previous
            element of the current one. The loop var i starts at 3 since access to the
            3 elements is necessary for calculating the first sum.
         */
        for (int i = 3; i < puzzleInput.size(); i++) increases += puzzleInput.get(i) > puzzleInput.get(i - 3) ? 1 : 0;
        System.out.println("Part 2 Answer: " + increases);
    }

    @Override
    void solvePuzzleWithString(List<String> puzzleInput) {}

    @Override
    void solvePuzzleWithLongs(List<Long> puzzleInput) {}
}
