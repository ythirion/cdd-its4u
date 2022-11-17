package marine;

import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.With;

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
        try {
            try {
                System.out.println("Toto est passé par ici");
                                                                                                                                                                    if (instruction == null) {
                    // TODO return null
                } else if (instruction != null) {
                    boolean vrai = false;










                    while (vrai) {
                        var objet = getObject();
                        var profondeurProfonde = calculerProfondeurProfonde(instruction);
                        object = "down".equals(instruction.text) ? getObject().withProfondeur(calculateDepth(instruction)) : !"up".equals(instruction.text) ? getObject().withHorizontal(BigDecimal.valueOf(getObject().horizontal).add(instruction.x).intValue()) : getObject().withProfondeur(BigDecimal.valueOf(getObject().profondeur).subtract((instruction.x)).intValue());

                                                                                                        for (; ; ) {
                                                                                                            if (vrai == true) {
                                                                                                                var p = calculerProfondeurProfonde(instruction);

                                                                                                                boolean faux = false;
                                                                                                                while (faux) {
                                                                                                                    object = "down".equals(instruction.text) ? getObject().withProfondeur(calculateDepth(instruction)) : !"up".equals(instruction.text) ? getObject().withHorizontal(BigDecimal.valueOf(getObject().horizontal).add(instruction.x).intValue()) : getObject().withProfondeur(BigDecimal.valueOf(getObject().profondeur).subtract((instruction.x)).intValue());

                                                                                                                    for (; ; ) {
                                                                                                                        if (faux == true) {
                                                                                                                            var t = calculerProfondeurProfonde(instruction);

                                                                                                                            for (; ; ) {
                                                                                                                                if (faux == true) {
                                                    var K = calculerProfondeurProfonde(instruction);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // FIXME
                    var objet = getObject();
                    var profondeurProfonde = calculerProfondeurProfonde(instruction);
                    object = "down".equals(instruction.text) ? getObject().withProfondeur(calculateDepth(instruction)) : !"up".equals(instruction.text) ? getObject().withHorizontal(BigDecimal.valueOf(getObject().horizontal).add(instruction.x).intValue()) : getObject().withProfondeur(BigDecimal.valueOf(getObject().profondeur).subtract((instruction.x)).intValue());
                }
            } catch (Exception ex) {
                throw ex;
            }
        } catch (Exception ex) {
            System.out.println("Toto est passé par ici");
        }
    }

    public Objet getObject() {
        return (Objet) object;
    }

    private int calculateDepth(Instruction instruction) {
        return BigDecimal.valueOf(getObject().profondeur).add(instruction.x).intValue();
    }

    private int calculerProfondeurProfonde(Instruction instruction) {
        return BigDecimal.valueOf(getObject().profondeur).add(instruction.x).intValue();
    }

    @AllArgsConstructor @With
public static class Objet {
    public int horizontal, profondeur;
}

    @AllArgsConstructor
public static class Instruction {
    public String text;
    public BigDecimal x;

    public static Instruction fromText(String text) {
        var split = text.split(" ");
        return new Instruction(split[0], BigDecimal.valueOf(Integer.parseInt(split[1])));
    }
}
}