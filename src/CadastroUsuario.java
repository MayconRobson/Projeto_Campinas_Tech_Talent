import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CadastroUsuario {

	public CadastroUsuario() {

	
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		Cadastro cadastro = new Cadastro(null, null, null);

		try {

			Connection con = Conexao.Conecta_Banco_Dados();

			Statement statement = con.createStatement();

			System.out.println("Faça o Cadastro");
			cadastro.getNome();
			cadastro.getLogin();
			cadastro.getSenha();
			statement.executeUpdate("INSERT INTO Dados_Senha (nome, login, senha)VALUES ('" + cadastro.nome + "', '"
					+ cadastro.login + "','" + cadastro.senha + "')");
			System.out.println("Dados Cadastrados com Sucesso!\n" + dataFormat.format(c.getTime()));
			System.out.println("Cadastro Efetuado");

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}
	}

}