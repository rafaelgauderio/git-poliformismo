package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();

		System.out.print("Informe a quantidade de funcion�rios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcion�rio #" + i);
			System.out.print("O Funcion�rio � tercerizado(s/n)?");
			char terc = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			// consumir o nextLine que ficou pendende da linha passada
			String nome = sc.nextLine();

			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora trabalhada: ");
			double valorPorHora = sc.nextDouble();
			// s� vai precisar do valor adicinar caso por tercerizado
			if (terc == 's') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				Funcionario fun�a = new FuncionarioTercerizado(nome, horas, valorPorHora, despesaAdicional);
				lista.add(fun�a);
			} else {
				Funcionario fun�a = new Funcionario(nome, horas, valorPorHora);
				lista.add(fun�a);
			}

		}
		System.out.println();
		System.out.println("Pagamento");
		for (Funcionario apelido : lista) {
			// imprime o apelido do la�o for da lista
			System.out.println(apelido.getNome() + " - $ " + String.format("%.2f", apelido.pagamento()));
		}
		sc.close();

	}

}
