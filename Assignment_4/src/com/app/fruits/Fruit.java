package com.app.fruits;

public abstract class Fruit {
		private String name;
		private double weight;
		private String color;
		private boolean isFresh;
		public Fruit(String name, double weight, String color) {
		
			this.name = name;
			this.weight = weight;
			this.color = color;
			this.isFresh = true;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFresh() {
			return isFresh;
		}
		public void setFresh(boolean isFresh) {
			this.isFresh = isFresh;
		}
		@Override
	    public String toString() {
	        return ("Name: " + name +
	               ", Color: " + color +
	               ", Weight: " + weight);
	    }
		public abstract String taste();
		
	}













	

}
