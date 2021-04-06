package p1.p2;

import java.util.*;
import java.util.logging.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Client {
	
	public static void main(String[] args)
	{
	
		final Logger LOGGER= Logger.getLogger(Client.class.getName());
		Scanner scanner= new Scanner(System.in);
		LOGGER.info("Welcome");
		
	
	System.out.println("***********Project started**********");
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
			
	//Creating bankAccount
	App acc= new App();

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please type the bank account type");
	String accountType=sc.next();
	acc.setAccountType(accountType);
	
	System.out.println("Please enter your name");
	String holderName=sc.next();
	acc.setAccountHolderName(holderName);
	
		
	System.out.println("Please enter your name of the bank");
	String bankName= sc.next();
	acc.setBankName(bankName);
			
	System.out.println("Enter your branch name");
	String branchName=sc.next();
	acc.setBranchName(branchName);
			
	System.out.println("Please enter your branch IFSC code");
	String branchCode=sc.next();
	acc.setBranchCode(branchCode);
	
	Generator g=new Generator();
	g.accountNoGenerator();
	
	
	Transaction tx=session.beginTransaction();
	session.save(acc);

	tx.commit();
	session.close();
	
	factory.close();
	
	}
}
