import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Apagar {

	public Apagar() {

		try {

			Scanner sc = new Scanner(System.in);
			Calendar c = Calendar.getInstance();
			SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

			Connection con = Conexao.Conecta_Banco_Dados();

			Statement statement = con.createStatement();

			System.out.print("Excluir Cadastro \nEscolha o ID \n");
			int id = sc.nextInt();
			statement.execute("DELETE FROM Dados_Senha WHERE id = " + id);
			System.out.println("Cadastro Excluido com Sucesso! \n" + dataFormat.format(c.getTime()));

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}
	}

}
