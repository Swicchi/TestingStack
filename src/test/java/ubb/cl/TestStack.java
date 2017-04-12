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
	public void addSixAndSevenStackPopShouldReturnSeven()throws InvalidActionException{
		Stack stack= new Stack ();
		
		stack.Push(6);
		stack.Push(7);
		
		Object result= stack.Pop();
		assertEquals(7,result);
	}
	@Test
	public void addEightAndNineStackPopShouldReturnNineandEight()throws InvalidActionException{
		Stack stack= new Stack ();
		
		stack.Push(8);
		stack.Push(9);
		
		Object result= stack.Pop();
		assertEquals(9,result);
		result= stack.Pop();
		assertEquals(8,result);
	}
	@Test(expected = InvalidActionException.class)
	public void PopinEmptyStackShouldThrowAnException() throws Exception{
		Stack stack= new Stack ();
		Object result;
		result= stack.Pop();
		
	}
	
}
