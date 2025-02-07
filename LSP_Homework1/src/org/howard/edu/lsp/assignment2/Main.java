package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String inputFileName = "data/products.csv";
		String outputFileName = "data/transformed_products.csv";
		
		List<String> updatedLines = readAndModifyCSV(inputFileName, 500.00);
		overwriteCSV(outputFileName, updatedLines);
	}
	
		public static List<String> readAndModifyCSV(String fileName, double priceThreshold) {
		    List<String> modifiedLines = new ArrayList<>();
		    File file = new File(fileName);
		    
		    if (!file.exists()) {
	            System.out.println("Error: The file " + fileName + " does not exist or is inaccessible.");
	            return modifiedLines; 
		    }
		    
		    try (Scanner scanner = new Scanner(new File(fileName))) {
		        boolean isFirstLine = true;
		        
		        while (scanner.hasNextLine()) {
		            String line = scanner.nextLine();
		            
		           
		            if (isFirstLine) {
		                isFirstLine = false;
		                modifiedLines.add(line); 
		                continue;
		            }
		            
		            String[] values = line.split(",");
		            
		           
		            if (values.length >= 4) {
		                String productId = values[0].trim(); 
		                String product = values[1].trim();  
		                double price = 0.0;
		                
		                try {
		                    price = Double.parseDouble(values[2].trim());  
		                } catch (NumberFormatException e) {
		                    System.out.println("Error analyzing price for product ID " + productId + ": " + product);
		                    continue; 
		                }
		                
		                String category = values[3].trim();

		                double newPrice = 0.0;
		                String priceCategory = priceRange(price);
		                
		                if (price > 500.01) {
		                	category = "Premium Electronics";
		                }
		                
		                if (category.equalsIgnoreCase("Premium Electronics") && price > priceThreshold) {
		                    newPrice = price - (price * 0.10);  
		                    line = productId + "," + product.toUpperCase() + "," + String.format("%.2f", newPrice) + ", Premium Electronics, " + priceCategory;
		                } else {
		                    
		                    if (price > priceThreshold) {
		                        newPrice = price - (price * 0.10);  
		                        line = productId + "," + product.toUpperCase() + "," + String.format("%.2f", newPrice) + "," + category + ", " + priceCategory;
		                    } else {
		                        line = productId + "," + product.toUpperCase() + "," + String.format("%.2f", price) + "," + category + ", " + priceCategory;
		                    }
		                }

		               
		                modifiedLines.add(line);
		            }
		        }
		    } catch (IOException e) {
		        System.out.println("Error reading CSV file: " + e.getMessage());
		    }
		    return modifiedLines;
		}

		public static String priceRange(double price) {
			if (price <= 10.00) {
				return "Low";
			} else if (price > 10.00 && price <= 100.00) {
				return "Medium";
			} else {
				return "High";
			}
		}
		public static void overwriteCSV(String fileName, List<String> updatedLines) {
			try (FileWriter writer = new FileWriter(fileName)) {
	            for (String line : updatedLines) {
	                writer.write(line + "\n");
	            }
	            System.out.println("File updated successfully");
	        } catch (IOException e) {
	            System.out.println("Error writing to CSV" + e.getMessage());
	        }
		}
	}

//COMMENTS 
//used https://www.geeksforgeeks.org/exceptions-in-java/ for error handling implementation 
// used https://www.w3schools.com/java/java_syntax.asp as a guide for program 

