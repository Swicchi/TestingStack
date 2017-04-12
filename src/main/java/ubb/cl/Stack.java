package ubb.cl;

public class Stack {
	private Object [ ] theStack;
    private int         topOfStack;

    private static final int DEFAULT_CAPACITY = 100;
    
    public Stack (){
    	this.theStack= new Object[this.DEFAULT_CAPACITY];
    	this.topOfStack=-1;
    }
    public boolean IsEmpty(){
    	return this.topOfStack==-1;
    }
    public void Push(Object obj ){
    	this.topOfStack++;
    	this.theStack[this.topOfStack]=obj;
    }
	public int Size() {
		// TODO Auto-generated method stub
		return this.topOfStack+1;
	}
	public Object Pop() {
		// TODO Auto-generated method stub
		
		return this.theStack[this.topOfStack--];
	}
    
}
