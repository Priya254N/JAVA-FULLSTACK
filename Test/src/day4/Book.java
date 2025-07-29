package day4;

class Book {
	   private String name;
	   private Author author;  
	   private double price;
	   private int qtyInStock;

	   public Book(String name, Author author, double price, int qtyInStock) {
		    this.name = name;
			this.author = author;
			this.price = price;
			this.qtyInStock = qtyInStock;
	    }

			    
		public String getName() {
			 return name;
		}

	    public void setName(String name) {
			 this.name = name;
	    }

		public Author getAuthor() {
			 return author;
		}

	    public void setAuthor(Author author) {
			 this.author = author;
	    }

	    public double getPrice() {
			 return price;
	    }

	    public void setPrice(double price) {
			 this.price = price;
		}

	    public int getQtyInStock() {
			  return qtyInStock;
		}

		public void setQtyInStock(int qtyInStock) {
			 this.qtyInStock = qtyInStock;
		}

	    public void printDetails() {
			 System.out.println("Book Title: " + name);
			 System.out.println("Price: ₹" + price);
			 System.out.println("Quantity in Stock: " + qtyInStock);
			 System.out.println(author.getDetails()); // Include author details
		}
			


	}