import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta {

	public Consulta() {

		try {

			Connection con = Conexao.Conecta_Banco_Dados();

			Statement statement = con.createStatement();

			statement.executeQuery("SELECT*FROM Dados_Senha");
			 ResultSet set = statement.getResultSet();
	        while (set.next()) {
	      	  System.out.printf("%d:%15s-%10s\n",
	      	  set.getInt("id"),
	      	  set.getString( "nome"),
	      	  set.getString("login"),
	      	  set.getString("senha"));  	  			}

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}
	}

}
