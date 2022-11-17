package marine;

import lombok.Getter;

import java.util.List;

@Getter
public class Submarine {
    public Object position;

    public Submarine(int horizontal, int depth) {
        this.position = new Position(horizontal, depth);
    }

    public void move(List<Instruction> instructions) {
        instructions.forEach(this::move);
    }

    private void move(Instruction instruction) {
        if ("down".equals(instruction.text)) {
            position = getObject().withProfondeur(calculateDepth(instruction));
        } else if ("up".equals(instruction.text)) {
            position = getObject().withProfondeur(getObject().profondeur - instruction.x);
        } else {
            position = getObject().withHorizontal(getObject().horizontal + instruction.x);
        }
    }

    public Position getObject() {
        return (Position)position;
    }

    private int calculateDepth(Instruction instruction) {
        return getObject().profondeur + instruction.x;
    }
}