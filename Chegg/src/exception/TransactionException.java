package exception;

public class TransactionException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  TransactionException(String msg)
	{
		super(msg);
	}
	
	public TransactionException(Throwable t)
	{
		super(t);
	}

	public TransactionException(String msg, Throwable t)
	{
		super(msg, t);
	}

}
