
public class condicionalesClase2 {

	public static void main(String[] args) {
		int ano = 2016;
		
		if ((ano % 4 == 0 && ano % 100 !=0) || ano % 400 == 0 ) {
			System.out.println("El año es bisiesto");
			
		}else {
			System.out.println("El año no es bisiesto");
		}

	}

}
