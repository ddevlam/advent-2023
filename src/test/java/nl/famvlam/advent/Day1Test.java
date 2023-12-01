package nl.famvlam.advent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @Test
    void partOne() {
        var lines = """
                        1abc2
                        pqr3stu8vwx
                        a1b2c3d4e5f
                        treb7uchet       
                """;

        var totalCalibration = new Day1.LineReader(lines).getCalibrationPartOne();

        assertEquals(142, totalCalibration);
    }

    @Test
    void partTwo() {
        var lines = """
                two1nine
                eightwothree
                abcone2threexyz
                xtwone3four
                4nineeightseven2
                zoneight234
                7pqrstsixteen
                """;


        var totalCalibration = new Day1.LineReader(lines).getCalibrationPartTwo();

        assertEquals(281, totalCalibration);
    }
}