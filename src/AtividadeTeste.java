import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class AtividadeTeste extends TestCase{
	private Aplicação val = new Aplicação();
	
	public void testIns() {
		
		assertEquals(false, val.ins(-10));
		assertEquals(true, val.ins(5));
		assertEquals(true, val.ins(11));
		assertEquals(false, val.ins(0));
	}
	
	
	public void testDel() {
		val.ins(6);
		assertEquals(0, val.del(6));
		val.ins(4);
		assertEquals(0, val.del(4));
		val.ins(8);
		assertEquals(0, val.del(7));
		
		
	}

	public void testSize()  {
		val.ins(2);
		assertEquals(1, val.size());
		val.ins(3);
		assertEquals(2, val.size());
		val.ins(4);
		assertEquals(3, val.size());
		val.ins(50);
		assertEquals(4, val.size());
		
		
		
		
	}
	
}
