package fit.challenge;

public class ImcCalculator {
    public static String calculate(double weight, double height) {
        double imc = weight / Math.pow(height, 2);
        if(imc >= 30) return "Obesidade";
        if(imc >= 25 && imc < 30) return "Sobrepeso";
        if(imc >= 18.5 && imc < 25) return "Normal";
        if(imc < 18.5) return "Magreza";

        return "n/a";
    }

}
