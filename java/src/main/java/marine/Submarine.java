package marine;

import lombok.Getter;

import java.util.List;

@Getter
public class Submarine {
    public Object object;

    public Submarine(int horizontal, int depth) {
        this.object = new Objet(horizontal, depth);
    }

    public void méthode1(List<Instruction> instructions) {
        instructions.forEach(this::méthode2);
    }

    private void méthode2(Instruction instruction) {
        if ("down".equals(instruction.text)) {
            object = getObject().withProfondeur(calculateDepth(instruction));
        } else if ("up".equals(instruction.text)) {
            object = getObject().withProfondeur(getObject().profondeur - instruction.x);
        } else {
            object = getObject().withHorizontal(getObject().horizontal + instruction.x);
        }
    }

    public Objet getObject() {
        return (Objet) object;
    }

    private int calculateDepth(Instruction instruction) {
        return getObject().profondeur + instruction.x;
    }
}