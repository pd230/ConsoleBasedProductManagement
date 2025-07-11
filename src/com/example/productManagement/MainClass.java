package com.example.productManagement;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.example.model.Product;
import com.example.service.ServiceRepo;

public class MainClass {
  public static void main(String[] args) {
	  ServiceRepo sr = new ServiceRepo();

	  Scanner sc = new Scanner(System.in);
	  
	  sr.DemoProducts();
	  int selection = 0;
	  do {
		  System.out.println("---------------------------------------");
		  System.out.println("Enter 1 for Adding Product : ");
		  System.out.println("Enter 2 to get Product : ");
		  System.out.println("Enter 3 for update a Product : ");
		  System.out.println("Enter 4 for Remove Product from list : ");
		  System.out.println("Enter 5 for exit Product : ");
		  System.out.println("---------------------------------------");
		  selection = sc.nextInt();
		  switch(selection) {
		  case 1 :
			  System.out.println(sr.AddProducts());
			  break;
			  
		  case 2 :
			  int choice = 0;
			  do {
				  System.out.println("---------------------------------------");
				  System.out.println("Enter 1 to get list of all Products : ");
				  System.out.println("Enter 2 to get Product by ID : ");
				  System.out.println("Enter 3 to get Product by Location : ");
				  System.out.println("Enter 4 to get product with expired Warrunty : ");
				  System.out.println("---------------------------------------");
				  choice = sc.nextInt();
				  switch(choice) {
				  case 1:
					  System.out.println("--------List of All Products---------");
					  sr.getAllProducts();
					  break;
				  case 2:
					  System.out.println("Enter id of product : ");
						int id = sc.nextInt();
					  System.out.println("--------Product---------");
					  System.out.println(sr.getProductById(id));
					  break;
				  case 3 : 
					  System.out.println("--------Product---------");
					  List<Product> l = sr.getProductByLocation();
					  for(Product p : l) {
						  System.out.println(p);
					  }
					  break;
				  case 4 : 
					  System.out.println("products with expired Warrunty : ");
					  List<Product> list = sr.getExpWarruntyPro();
					  Iterator<Product> itr = list.iterator();
					  while(itr.hasNext()) {
						  System.out.println(itr.next());
					  }
					  break;
				  }
			  }while(choice < 5);
			  break;
		  case 3:
			  System.out.println("Enter name of Product : "); 
			  String p_name = sc.next();
			  sr.UpdateProductWarrunty(p_name);
			  break;
		  case 4:
			  System.out.println("Enter Product name : ");
			  sr.removeProduct(sc.next());
			  break;
		  }
	  }while(selection < 5);
  }
}
