package application;

public class Plot {
	int x,y,width,depth;

	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	Plot(int x,int y,int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		//System.out.println(this);
	}
	

	/** This will return the x
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**This will return the y
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/** This will return the width
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/** This will return the depth
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/** The x will be set
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/** The y will be set
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/** The width will be set
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	

	/** The depth will be set
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
			
		}
	public boolean encompasses(Plot plot) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean overlaps1(Plot plot) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean overlaps(Plot plot) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean encompasses1(Plot plot) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean encompasses11(Plot plot) {
		// TODO Auto-generated method stub
		return false;
	}

	}
	

