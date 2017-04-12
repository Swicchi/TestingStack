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
	@Test
	public void addThreeStackNotEmpty(){
		Stack stack= new Stack ();
		
		stack.Push(3);
		
		boolean result= stack.IsEmpty();
		assertEquals(false,result);
	}
	@Test
	public void addOneAndTwoStackNotEmpty(){
		Stack stack= new Stack ();
		
		stack.Push(1);
		stack.Push(2);
		
		boolean result= stack.IsEmpty();
		assertEquals(false,result);
	}
	@Test
	public void addFiveAndFourStackSizeShouldByTwo(){
		Stack stack= new Stack ();
		
		stack.Push(4);
		stack.Push(5);
		
		int result= stack.Size();
		assertEquals(2,result);
	}
	@Test
	public void addSixAndSevenStackPopShouldReturnSeven(){
		Stack stack= new Stack ();
		
		stack.Push(6);
		stack.Push(7);
		
		Object result= stack.Pop();
		assertEquals(7,result);
	}
}
