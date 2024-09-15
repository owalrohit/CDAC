package in.cdac.pojo;

public class BMI {
	private float weight;
	private float height;
	
	public BMI() {};
	
	public BMI(float weight, float height) {
		
		this.weight = weight;
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float BmiCal() {
		float bmi = weight / ( height * height );
		return bmi;
	}

	@Override
	public String toString() {
		return "BMI [weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
}
