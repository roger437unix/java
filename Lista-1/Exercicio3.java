/****************************************
A partir de dois valores inteiros,
fazer a troca destes de tal forma que um
fique na variável inicial do outro.
*****************************************/

class Exercicio3 {
  public static void main(String[] args) {
    int variavel1 = 3;
    int variavel2 = 6;
    System.out.println("\nPrimeira variavel: " + variavel1);
    System.out.println("Segunda variavel: " + variavel2);

    int variavelAuxiliar = 0;

    variavelAuxiliar = variavel1;
    variavel1 = variavel2;
    variavel2 = variavelAuxiliar;

    System.out.println("\nPrimeira variavel: " + variavel1);
    System.out.println("Segunda variavel: " + variavel2);
  }
}
