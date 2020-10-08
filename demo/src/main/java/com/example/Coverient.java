package com.example;

import java.util.Arrays;
import java.util.Optional;

public class Coverient {
	  // swap() doesn't swap i and j 
	   public static void swap(Integer i, Integer j) { 
	      Integer temp = new Integer(i); //10
	      i = j; // i = 20
	      j = temp;  //j = 10
	      
	      System.out.println("i1 = " + i + ", j 1= " + j);  
	      
	   } 
	public static void main(String[] args) {
		

	      Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j); 
	   } 
	

     
	}

