
public class PruebaVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Programa para pruebas con variables
		
		//Mostramos la suma realizada al mostrar
		System.out.println(3+4);
		
		int numero1 = 3; //primera cifra
		int numero2 = 4; //segunda cifra
		int resultado; //resultado de la operaci�n
		int numero3 = 9;
		int numero4 = 0;
		
		resultado = 3+4;
		
		//Mostramos el valor resultado realizando la operaci�n antes de imprimir por pantalla
		System.out.println("Operaci�n realizada antes de mostrar: " + resultado);
		//Mostramos el valor resultado realizando la operaci�n al imprimir por pantalla
		System.out.print("Operaci�n realizada al mostrar: ");
		System.out.println(numero1 + numero2);
		
		//Realizamos la validaci�n del divisor que sea distinto a cero.
		if(numero4!=0) //comprobamos que el numero4 sea distinto a 0
		{
			System.out.println(numero3/numero4);
		}
		else
		{
			System.out.println("Error: no se puede dividir por 0");
			System.out.println("Error: no se puede dividir por " + numero4 + ", so burro");
		}

	}

}
