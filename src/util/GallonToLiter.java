package util;

public class GallonToLiter {
    // Constante de conversão
    private final double GALAO_TO_LITER = 3.7854;
    private double galao;

    // Métodos get e set
    public double getGalao() {
        return galao;
    }

    public void setGalao(double galao) {
        this.galao = galao;
    }

    // Calcula e retorna de galões para litros
    public double galaoToLiter() {
        return GALAO_TO_LITER * galao;
    }

    // Retorna o resultado formatado
    @Override
    public String toString() {
        return String.format("Total de galões: %.1f%nTotal de litros: %.2f%n", galao, galaoToLiter());
    }
}
