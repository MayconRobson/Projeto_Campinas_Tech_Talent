import org.junit.Assert;
import org.junit.Test;

public class Teste {
	Cadastro ca = new Cadastro ("Maycon", "Mayconrobson@gmail.com", "1234");

		
	@Test 
	public void cadastro () {
		Assert.assertEquals("Maycon",ca.getNome());
		Assert.assertEquals("Mayconrobson@gmail.com",ca.getLogin());
		Assert.assertEquals("1234",ca.getSenha());
		
	}
	
	
}