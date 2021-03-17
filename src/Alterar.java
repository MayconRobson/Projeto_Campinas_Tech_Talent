
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Alterar {

	public Alterar() {

		try {
			Scanner sc = new Scanner(System.in);
			Calendar c = Calendar.getInstance();
			SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

			Connection con = Conexao.Conecta_Banco_Dados();

			Statement statement = con.createStatement();

			System.out.println("Digite o ID que deseja atualizar os dados");
			int id = sc.nextInt();
			System.out.println("Digite o nome deseja atualizar os dados");
			String nome = sc.next();
			System.out.println("Digite o email que deseja atualizar os dados");
			String login = sc.next();
			statement.execute("UPDATE Dados_Senha SET nome= '" + nome + "', login= '" + login + "' WHERE id=" + id);
			System.out.println("Cadastro Atulizado!\n " + dataFormat.format(c.getTime()));

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}

	}
}
