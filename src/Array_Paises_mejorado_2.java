
public class Array_Paises_mejorado_2 {
	public static void main(String[] args) {
	
			int[]matriz_aleatorios= new int[150];
			
			for (int i=0; i<matriz_aleatorios.length;i++) {
				matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
			}
			
			for(int numeros:matriz_aleatorios) {
				System.out.print(numeros+" ");
			}
	}

}