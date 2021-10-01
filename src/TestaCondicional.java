
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("De maior, acesso liberado");
		} else {
			if (quantidadePessoas > 2) {
				System.out.println("De menor , mas acompanhado, acesso liberado");
			} else {
				
				System.out.println("De menor e não acompanhado, não pode entrar");
			}
		}
	}

}
