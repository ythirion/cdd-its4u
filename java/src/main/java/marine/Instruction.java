package marine;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Instruction {
    public final String text;
    private final int x;

    public static Instruction fromText(String text) {
        var split = text.split(" ");
        return new Instruction(split[0], Integer.parseInt(split[1]));
    }
}