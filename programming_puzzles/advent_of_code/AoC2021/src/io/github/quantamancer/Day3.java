package io.github.quantamancer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3 extends AoCPuzzle{

    public Day3() {
        super("3");
    }

    @Override
    void solvePuzzle(List<String> puzzleInput) {
        /* PART 1 */
        int[] zeros = new int[puzzleInput.get(0).length()];
        int[] ones = new int[puzzleInput.get(0).length()];
        for (String input : puzzleInput) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '0') zeros[i]++;
                else ones[i]++;
            }
        }

        long g = 0;
        long e = 0;
        for (int i = 0; i < ones.length; i++) {
            if (ones[i] > zeros[i]) {
                g += Math.pow(2, ones.length - (i + 1));
            } else {
                e += Math.pow(2, ones.length - (i + 1));
            }
        }

        long sum = g * e;

        System.out.println("Day 3 Part 1: " + sum);

        /* PART 2 */
        List<String> oxygen = new ArrayList<>(puzzleInput);
        List<String> co2 = new ArrayList<>(puzzleInput);

        int index = 0;

        while (oxygen.size() > 1) {
            List<int[]> input = getCombinedList(oxygen);
            ones = input.get(0);
            zeros = input.get(1);
            for (int i = oxygen.size() - 1; i >= 0; i--) {
                String oxy = oxygen.get(i);
                if (ones[index] >= zeros[index] && oxy.charAt(index) == '0') oxygen.remove(i);
                else if (ones[index] < zeros[index] && oxy.charAt(index) == '1') oxygen.remove(i);
            }
            index++;
        }

        index = 0;

        while(co2.size() > 1) {
            List<int[]> input = getCombinedList(co2);
            ones = input.get(0);
            zeros = input.get(1);
            for (int i = co2.size() - 1; i >= 0; i--) {
                String cO2 = co2.get(i);
                if (ones[index] >= zeros[index] && cO2.charAt(index) == '0') co2.remove(i);
                else if (ones[index] < zeros[index] && cO2.charAt(index) == '1') co2.remove(i);
            }
            index++;
        }

        long oxyNum = Integer.parseInt(oxygen.get(0), 2);
        long co2Num = Integer.parseInt(co2.get(0), 2);
        sum = oxyNum * co2Num;
        System.out.println("Day 3 Part 2: " + sum);

    }

    private List<int[]> getCombinedList(List<String> input) {
        int[] zeros = new int[input.get(0).length()];
        int[] ones = new int[input.get(0).length()];
        for (String a : input) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '0') zeros[i]++;
                else ones[i]++;
            }
        }
        return Arrays.asList(ones, zeros);
    }
}
