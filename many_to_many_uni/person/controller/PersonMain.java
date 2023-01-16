package many_to_many_uni.person.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni.person.dto.Language;
import many_to_many_uni.person.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Language language1 =new Language();
		language1.setId(1);
		language1.setName("Kannada");
		language1.setCountry("India");
		language1.setOrigine("Karnataka");
		
		Language language2=new Language();
		language2.setId(2);
		language2.setName("Hindi");
		language2.setCountry("India");
		language2.setOrigine("maharastra");
	
		Language language3=new Language();
		language3.setId(3);
		language3.setName("Tamil");
		language3.setCountry("india");
		language3.setOrigine("Tamil nadu");
		

		List<Language>list1=new ArrayList<Language>();
		list1.add(language1);
		list1.add(language3);
		
		List<Language>list2=new ArrayList<Language>();
	    list2.add(language1);
	    list2.add(language2);
		
		Person person1=new Person();
		person1.setId(1);
		person1.setName("rakesh");
		person1.setPhone(98798876);
		person1.setAddress("bangalore");
		person1.setList(list1);
		
		Person person2=new Person();
		person2.setId(2);
		person2.setName("rahul");
		person2.setPhone(98787687);
		person2.setAddress("blr");
		person2.setList(list2);
		
		Person person3=new Person();
		person3.setId(3);
		person3.setName("ram");
		person3.setPhone(98787687);
		person3.setAddress("blr");
		person3.setList(list2);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(language1);
		entityManager.persist(language2);
		entityManager.persist(language3);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityTransaction.commit();
		
	System.out.println();	

	}

}
