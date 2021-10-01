
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		/*
		 * int idade = 16; 
		 * int quantidadePessoas = 3;
		 * 
		 * if (idade >= 18 || quantidadePessoas > 2) {
		 * System.out.println("Acesso liberado"); } else {
		 * System.out.println("De menor e não acompanhado, não pode entrar"); }
		 */
		
		
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >=2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("De menor e não acompanhado, não pode entrar");
		}

	}
}
