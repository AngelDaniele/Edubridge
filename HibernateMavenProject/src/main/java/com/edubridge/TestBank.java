package com.edubridge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBank {

	public static void main(String[] args) {
		try{
		    //creating configuration object  
		    	  System.out.println("111111111111111111111");
		    Configuration cfg=new Configuration();
		    System.out.println("2222222222222222222222222222");
		    cfg.configure("Bank.cfg.xml");//populates the data of the configuration file  
		    System.out.println("3333333333333333333333333333");
		    //creating seession factory object  https://screenrec.com/share/DcKI15pmfw
		    SessionFactory factory=cfg.buildSessionFactory();  
		    System.out.println("4444444444444444444444444");
		    //creating session object  
		    Session session=factory.openSession();  
		    System.out.println("5555555555555555555555555");
		    //creating transaction object  
		    Transaction t=session.beginTransaction();  
		    System.out.println("66666666666666666666666666666666");
		    Bank bank=new Bank();
		    bank.setBankName("CANARA BANK");
		    System.out.println("7777777777777777777777777777777");
		     session.persist(bank);//persisting the object  
		   System.out.println("888888888888888888888888888888");
		    t.commit();//transaction is committed
		   
		  /* Serializable id=session.save(t1);*/
		   // System.out.println(id);
		    session.close();  
		      
		    System.out.println("successfully saved");  
		      }catch(Exception ex)
		      {
		    	  System.out.println("Problem in connection"+ex.getMessage());
		      }

	}

	}


