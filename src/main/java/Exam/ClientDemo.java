package Exam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo {

	public static void main(String[] args) {
		
		ClientDemo cd=new ClientDemo();
		//cd.addclient();
		//cd.displaytotal();
		cd.displaysome();

	}
	
	public void addclient()
	{
		 Configuration configuration = new Configuration();
		  configuration.configure("hibernate.cfg.xml");

		  SessionFactory sf = configuration.buildSessionFactory();
		  Session session = sf.openSession();
		  
		  Transaction t = session.beginTransaction();
		  
		  Client c=new Client();
		  
		  c.setId(1);
		  c.setName("alex");
		  c.setGender("Male");
		  c.setAge(20);
		  c.setLocation("canada");
		  c.setEmail("alex@gmail.com");
		  c.setCno("9999999999");
		  
		  
		  session.persist(c);
		  t.commit();
		  System.out.println("Client added");
		  session.close();
		  sf.close();
		  
	}
	
	public void displaytotal()
	{
		  Configuration configuration = new Configuration();
		  configuration.configure("hibernate.cfg.xml");

		  SessionFactory sf = configuration.buildSessionFactory();
		  Session session = sf.openSession();
		  
		  String hql = "from Client";
		  
		  Query<Client> qry = session.createQuery(hql, Client.class);
	 		List<Client> clilist = qry.getResultList();
	  
	 		
	 		for(Client cli : clilist) {
	 			System.out.println(cli);
	 		}
	}
	
	public void displaysome()
	{
		  Configuration configuration = new Configuration();
		  configuration.configure("hibernate.cfg.xml");

		  SessionFactory sf = configuration.buildSessionFactory();
		  Session session = sf.openSession();
		  
		  String hql="select c.id,c,name,c.gender from Client c";
		  
		  
		  Query<Object[]> qry=session.createQuery(hql, Object[].class);
		  List<Object[]> clilist=qry.getResultList();
		  
		
		  
		  for(Object[] o:clilist)
		  {
			  System.out.println("ID="+o[0]);
			  System.out.println("Name="+o[1]);
			  System.out.println("gender="+o[2]);
		  }
		  
		  session.close();
		  sf.close();
	}

}
