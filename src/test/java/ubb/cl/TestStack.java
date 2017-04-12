package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStack  {
	@Test
	public void StackIsEmpty(){
		Stack stack= new Stack ();
		
		boolean result= stack.IsEmpty();
		assertTrue(result);
	}
}
