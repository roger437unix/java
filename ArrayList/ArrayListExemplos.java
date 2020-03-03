
// Exemplos de utilização de ArrayList *

import java.util.ArrayList;

public class ArrayListExemplos {
	
	public static void main(String[] args) {
		
		//****** Declarando ArrayList
				
				ArrayList<Integer> lista1 = new ArrayList<Integer>();
				ArrayList<Double>  lista2 = new ArrayList<>();
				ArrayList<String>  lista3 = new ArrayList<>();
				

		//***** Adiciando itens à lista
				
				lista1.add(1);
				lista1.add(-9);
				lista1.add(3);		
				
				lista2.add(3.14);
				lista2.add(1.618);
				lista2.add(2.71);
				
				lista3.add("Pitágoras");
				lista3.add("Fibonacci");
				lista3.add("Euler");
				
				
		//****** Adicionar elemento em uma determinada posição da lista
				
				lista3.add(1, "Galileu");
								

		//****** Mostrando todos elementos da lista
				
				System.out.println();
				for (int i=0 ; i<lista1.size() ; i++) {
					System.out.println(lista1.get(i));
				}
				
				System.out.println();
				
				for (String elemento: lista3) {
					System.out.println(elemento);			
				}
						
				System.out.println();
				
		
		//****** Alterando um elemento da lista
				
				lista3.set(3, "Leibniz");
				
				for (String elemento: lista3) {
					System.out.println(elemento);			
				}
				System.out.println();
				
				
		//****** Obtendo o índice de um elemento da lista
				
				lista3.indexOf("Fibonacci");				
				
		
		//****** Removendo um elemento da lista
				
				lista3.remove("Galileu");
				
					
		// ***** Limpando toda a lista
				
				lista3.clear();
				
				
		//***** Tamanho da Lista
				
				//System.out.print("\nTamanho da lista: ");
				//System.out.println(lista1.size());
				
				
		//***** ArrayList em Array [vetor]
				
				System.out.println(lista3.toArray());
				
				for (int i=0 ; i<lista3.toArray().length ; i++) {
					System.out.println(lista3.toArray()[i]);
				}
				
				
		//***** Criando String com os elementos do ArrayList		
				
				String str2 = lista3.toString();
				//System.out.println(str2);
				
				for (int i=0 ; i<str2.length() ; i++) {
					//System.out.println(str2.charAt(i));
				}				
				

		//****** ArrayList com elementos de tipos diferentes
				
						ArrayList<Object> lista = new ArrayList<>();
						
				        lista.add(10);
				        lista.add(4.78);
				        lista.add("Pink Floyd");
				        lista.add('\u2588');
				        lista.add(true);
				        
				        System.out.println();
				        System.out.println(lista.get(0));
				        System.out.println(lista.get(1));
				        System.out.println(lista.get(2));
				        System.out.println(lista.get(3));
				        System.out.println(lista.get(4));		
			}

}
