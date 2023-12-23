package model.dao;


public class AccountbookDao extends Dao{

private static AccountbookDao accountbookDao = new AccountbookDao();
	
	public static AccountbookDao getInstance() {return accountbookDao;}
	
	private AccountbookDao() {super();} 
}