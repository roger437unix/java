// Converter e exibir uma temperatura
// de graus Celsius para graus Fahrenheit.

class Exercicio6 {
  public static void main(String[] args) {
    double temperaturaCelsius = 25.0;

    double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

    System.out.println();
    System.out.print(temperaturaCelsius + " graus Celsius equivale ");
    System.out.println(temperaturaFahrenheit + " graus Fahrenheit ");
  }
}
