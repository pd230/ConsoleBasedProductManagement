package com.example.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

import com.example.model.Product;

public class ServiceRepo {
  
	final DateTimeFormatter dfr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Scanner sc = new Scanner(System.in);
	
	List<Product> productList = new ArrayList<>();
	
//	to initialize list of products
	public void DemoProducts() {
		productList.add(new Product(101,"lenovo mouse","v01","mouse",LocalDate.parse("02/03/2019", dfr),LocalDate.parse("02/11/2022", dfr),"white table"));
		productList.add(new Product(102,"Mmbile","m01","Android",LocalDate.parse("23/03/2025", dfr),LocalDate.parse("02/10/2027", dfr),"black table"));
		productList.add(new Product(103,"mackbook","mb01","Apple",LocalDate.parse("04/10/2024", dfr),LocalDate.parse("02/03/2022", dfr),"white table"));
		productList.add(new Product(104,"Iphone 15","i15","Apple",LocalDate.parse("02/03/2019", dfr),LocalDate.parse("12/08/2020", dfr),"black table"));
		productList.add(new Product(105,"GoPro","v011","Apple",LocalDate.parse("03/12/2023", dfr),LocalDate.parse("12/06/2026", dfr),"cupboard"));
		productList.add(new Product(106,"Mice","m01","Sony",LocalDate.parse("02/03/2019", dfr),LocalDate.parse("02/03/2022", dfr),"white table"));
		productList.add(new Product(107,"printer","p121","Sony",LocalDate.parse("02/03/2025", dfr),LocalDate.parse("02/05/2028", dfr),"black table"));
	}

//	if user wants add products in the list of Products
	public String AddProducts() {
		System.out.println("Enter How many Products do you want to add : ");
		int num = Integer.parseInt(sc.nextLine().trim());
		
		try {
		for( int i = 0; i < num ; i++) {
			System.out.println("id : ");
			int pid = Integer.parseInt(sc.nextLine().trim());
			
			System.out.println("name : ");
			String pname = sc.nextLine().trim();
			
			System.out.println("version : ");
			String version = sc.nextLine().trim();
			
			System.out.println("type : ");
			String type = sc.nextLine().trim();
			
			System.out.println("Location : ");
			String location = sc.nextLine().trim();
			
			LocalDate purchase_date = LocalDate.now();
			
			System.out.println("Enter Warrunty(dd/MM/yyyy) : ");
			String line = sc.nextLine();
			
			LocalDate warrunty = LocalDate.parse(line, dfr);
			
			Product poroduct = new Product(pid,pname,version,type,purchase_date,warrunty,location);
			productList.add(poroduct);
			
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return num + " Added to the List";
	}
	
//	if user wants retrieve all the products from the list of Products
	public void getAllProducts(){
		for(Product P : productList) {
			System.out.println(P);
		}
	}
	
//	if user wants retrieve single product from the list of Products using id of product
	public List<Product> getProductById(int pid) {
		List<Product> p = productList.stream().filter(product -> product.getPid() == pid).toList();
		return p;
	}
	
//	if user wants retrieve single product from the list of Products using location of product
	public List<Product> getProductByLocation() {
		System.out.println("Enter Location : ");
		String location = sc.nextLine().trim(); 
		List<Product> list = productList.stream().filter(product -> location.equalsIgnoreCase(product.getLocation())).toList();
		
		if (list.isEmpty()) {
	        System.out.println("No products found for location: " + location);
	    }
		
		return list;
	}
	
//	if user wants retrieve products from the list of Products with expired warranty
	public List<Product> getExpWarruntyPro(){
		LocalDate cur_date = LocalDate.now();
		
		List<Product> list = productList.stream().filter(p -> p.getWarranty().isBefore(cur_date)).toList();
		return list;
	}
	
	
//	Update Products Warranty
	public void UpdateProductWarrunty(String p_name) {
//		get Product
		Optional<Product> product = productList.stream().filter(p -> p.getPname().equals(p_name)).findFirst();
		System.out.println(product.toString());
		
//		Extended Warranty
		System.out.println("Enter Extended Warranty(dd/MM/yyyy): ");
		LocalDate exd_date = LocalDate.parse(sc.next(),dfr);

//		Set extended Warranty if Product is present
		try {
			product.ifPresent(p -> p.setWarranty(exd_date));
		    System.out.println(product.toString());
		    System.out.println("Product Updated ! ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
//	remove product if Product is present
	public void removeProduct(String name) {
		try {
		    productList.stream().filter(p -> p.getPname().equalsIgnoreCase(name)).findFirst().ifPresent(p -> productList.remove(p));
		    System.out.println("Product "+name+" removed !");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
}
