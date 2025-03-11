import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Ex 26:
		Scanner scanner = new Scanner(System.in); //abre o Scanner
		System.out.println(""); //pergunta para o usuario
		String VAR = scanner.nextLine(); //pega o que o usuario digitar e transforma em uma variavel
		scanner.close(); //fecha o Scanner
	}
}