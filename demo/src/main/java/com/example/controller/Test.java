package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//import com.javatpoint.dao.*;

class A
	{
		void getA()
		{
			System.out.println("testA");
		}
		
		
	}
	class B extends A
	{
		
		
		void getB()
		{
			this.getA();
			System.out.println("testB");
		}
		
		
		
	}

public class Test extends B {

	public static void main(String[] args) {
		

		


		
		
		for(int i = 0,j=0; i <10; i++ ,j--)
		{
			System.out.println(j);
		}







		B b = new B();
		b.getB();

	}

}
