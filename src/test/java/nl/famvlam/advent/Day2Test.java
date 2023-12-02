package nl.famvlam.advent;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static nl.famvlam.advent.Day2.Color.BLUE;
import static nl.famvlam.advent.Day2.Color.GREEN;
import static nl.famvlam.advent.Day2.Color.RED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {

    @Test
    void partOne() {
        var input = """
                Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
                Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
                Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
                Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
                Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
                """;

        var constraints = new EnumMap<>(Map.of(
                RED, 12,
                GREEN, 13,
                BLUE, 14
        ));

        assertEquals(8 ,Day2.BagChecker.partOne(input, constraints));
    }

    @Test
    void partTwo() {
        var input = """
                Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
                Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
                Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
                Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
                Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
                """;


        assertEquals(2286 ,Day2.BagChecker.partTwo(input));
    }
}