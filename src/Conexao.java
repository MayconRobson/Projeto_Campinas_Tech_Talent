import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection Conecta_Banco_Dados () throws SQLException	{

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acesso_Senha", "root",
					"Prgtd1907");

			
//			System.out.println("Conectado!!!!");

			return conexao;

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}
		return null;

	}
	}


