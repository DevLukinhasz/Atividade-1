import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {
	
	public static void main(String[] args) {
		System.out.println("===== BANCO UFT ======");
		System.out.println("Insira seus dados");

		String agencia;
		String nome;
		int numero;
		double saldo;

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Por favor, digite o número da Agência: ");
		numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Usuario: " + numero);

		System.out.print("\nPor favor, digite a sua Agência: ");
		agencia = sc.nextLine();

		System.out.print("Por favor, digite seu nome completo: ");
		nome = sc.nextLine();

		System.out.print("Por favor, adicione um primeiro saldo: ");
		saldo = sc.nextDouble();

		System.out.print("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta " + numero + " e seu saldo " + saldo + " já esta disponivel para saque.");

	}
}
