package rensyu13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException
			  ("名前は3文字以上です");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException
			  ("増幅率は 0.5～100 です");
		}
		this.power = power;
	}
	
}