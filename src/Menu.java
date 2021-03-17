
import java.util.Scanner;

public class Menu {

	public void Menu() {

		int a = 1;

		while (a == 1) {
			Scanner sc = new Scanner(System.in);

			int opcao1;

			System.out.println("BEM VINDO! ESCOLHA UM OPÇÃO:\n");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			opcao1 = sc.nextInt();

			switch (opcao1) {

			case 1:
				CadastroUsuario Cd = new CadastroUsuario();
				Cd.getClass();
				break;

			case 2:
				Consulta Cs = new Consulta();
				Cs.getClass();
				break;

			 case 3:
				 Alterar At = new Alterar ();
				 At.getClass();
			 break;

			case 4:
				Apagar Ap = new Apagar();
				Ap.getClass();
				break;

			default:
				System.out.println("Opção Invalida");
			}

			System.out.println("Deseja fazer outra operação? 1-Sim | 2-Não");
			a = sc.nextInt();

			if (a == 2) {
				System.out.println("Programa Finalizado!");

				sc.close();

			}

		}

	}
}