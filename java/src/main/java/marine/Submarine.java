package marine;

import lombok.Getter;

import java.math.BigDecimal;
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
        // FIXME
        var objet = getObject();

        if ("down".equals(instruction.text)) object = getObject().withProfondeur(calculateDepth(instruction));
        else if ("up".equals(instruction.text))
            object = getObject().withProfondeur(BigDecimal.valueOf(getObject().profondeur).subtract((instruction.x)).intValue());
        else
            object = getObject().withHorizontal(BigDecimal.valueOf(getObject().horizontal).add(instruction.x).intValue());
    }

    public Objet getObject() {
        return (Objet) object;
    }

    private int calculateDepth(Instruction instruction) {
        return BigDecimal.valueOf(getObject().profondeur).add(instruction.x).intValue();
    }
}