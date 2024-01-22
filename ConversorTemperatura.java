public class ConversorTemperatura {
    private double resultado;
    public double celciusParaFahrenheit(double temperatura){
        resultado = (temperatura * 1.8) + 32.0;
        System.out.println(resultado);
        return resultado;
    }

    public static void fahrenheitParaCelcius(double temp){
        double result = (temp - 32.0) / 1.8;
        System.out.println(result);
    }
}
