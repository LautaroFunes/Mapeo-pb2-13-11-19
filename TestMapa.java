import static org.junit.Assert.*;

import org.junit.Test;

public class TestMapa {

	Usuario u1 = new Usuario("Pedrin", "@", "123contra");
	Sistema s1 = new Sistema();
	
	@Test
	public void test() {
		s1.agregar(u1);
		assertTrue(s1.getMapa().containsKey("llave"));
		assertTrue(s1.getMapa().containsValue(u1));	
		s1.iterar();
	}

}
