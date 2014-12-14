package fr.xiaomi;

public class Sheep implements Animal{

	public Sheep() {
		// TODO Auto-generated constructor stub
		System.out.println("sheep is made");
	}
	
	@Override
	public Animal makeCopy() {
		// TODO Auto-generated method stub
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString(){
		return "Dolly is my hero, baaaaah";
	}
	

}
