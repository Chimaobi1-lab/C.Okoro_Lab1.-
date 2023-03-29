package application;

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;

	/**
	 * 
	 * @param propertyName = property name 
	 * @param city		   = city where the property is located	
	 * @param rentAmount   = rent amount
	 * @param owner        = the owner's name
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();	
	}
	/**
	 * This gets  the rent amount.
	 *
	 * @return the rentAmount
	 */
	public double getRentAmount() {
		// TODO Auto-generated method stub
		return rentAmount;
	}
		/**
		 * This gets the owner
		 * 
		 * @return the owner
		 */
		public String getOwner(){
			return owner;
		}
		/**
		 *  This represents a Property object in the following String format: propertyName,city,owner,rentAmount
		 */
			public String toString() {
				return propertyName + "," + city + "," + owner + "," + rentAmount;
			}
		/**
		 * This gets the property name
		 * 
		 *  @return the property name	
		 */
				public String getPropertyName() {
					return propertyName;
				}
		/**
		 * This  gets the city	
		 * 
		 * @return the city	
		 */
				public String getCity() {
					return city;
				}	
		
		/**
		 * This gets the plot
		 * 
		 * @return the plot
		 */
				public Plot getPlot() {
					return this.plot;
				}	
		
		/**
		 * This creates a new copy of the given property object
		 * 
		 * @param otherProperty the property object to make a copy 		
		 */
				public Property(Property otherProperty) {
					this(otherProperty.propertyName, otherProperty.city, otherProperty.rentAmount, otherProperty.owner);
					plot = otherProperty.getPlot();
				}	

		/**
		 *  This creates new Property object using given values. It also creates a Plot using given values of a plot.
		 * 
		 *  * @param propertyName 	property name
		 * @param city         	city where the property is located
		 * @param rentAmount   	rent amount
		 * @param owner        	the owner's name
		 * @param x            	the x coordinate of the plot
		 * @param y            	the y coordinate of the plot
		 * @param width        	the width coordinate of the plot
		 * @param depth        	the depth coordinate of the plot
	 */
public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
		int depth) {
	this(propertyName, city, rentAmount, owner);
	this.plot = new Plot(x, y, width, depth);
}
}		 
		


