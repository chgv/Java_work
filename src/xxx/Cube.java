package xxx;

public class Cube {
    private double length;
    
    public Cube() {
    	
    }
    public Cube(double length) throws CubeException{
    	if(length>0) {
    		this.length = length;    		
    	}else {
    		CubeException ce = new CubeException();
    	}
    }
    
    public double getLength(){
    	return length;
    }
    public void setLength(double length) {
		this.length = length;
	}
    
    
}
