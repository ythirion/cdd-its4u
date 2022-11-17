package marine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

// Advent of code instructions available here : https://adventofcode.com/2021/day/2
class SubmarineTests {
    @Test
    void should_move_on_given_instructions() {
        var instructions = loadInstructions();
        var submarine = new Submarine(0, 0);

        submarine.méthode1(instructions);

        assertThat(calculateResult(submarine)).isEqualTo(1690020);
    }

    private int calculateResult(Submarine submarine) {
        return submarine.getObject().profondeur * submarine.getObject().horizontal;
    }

    private List<Submarine.Instruction> loadInstructions() {
        return Arrays.stream(FileUtils.getInputAsSeparatedLines("submarine.txt"))
                .map(Submarine.Instruction::fromText)
                .collect(Collectors.toUnmodifiableList());
    }
}