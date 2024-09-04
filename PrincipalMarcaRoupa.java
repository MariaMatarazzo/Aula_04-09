package Aula_04_09;

public class PrincipalMarcaRoupa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EXEMPLOS DE MARCAS DE ROUPA");
		
		for (MarcasRoupa marcaRoupa:MarcasRoupa.values()) {
			System.out.println(" ") ;
			System.out.println("Exemplo:") ;{
				System.out.println(marcaRoupa);
			}

		}

	}
}
