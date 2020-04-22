public class Boba extends Generics {
	public static final String type = "Boba";
	public enum KeyType {combo, flavor, pearltype, pearlamount};
	public static KeyType key = KeyType.combo;
	private String flavor;
	private int pearlamount;
	private String pearltype;
	
	Boba(String pearltype, int pearlamount, String flavor)
	{
		this.setType(type);
		this.flavor = flavor;
		this.pearlamount = pearlamount;
		this.pearltype = pearltype;
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() {		
		String output="";
		switch(key) {
		case flavor:
			output += this.flavor;
			break;
		case pearltype:
			output += this.pearltype;
			break;
		case pearlamount:
			output += this.pearlamount;
			break;
		case combo:
		default:
			output = type + ": " + this.flavor + ", " + this.pearlamount + ", " + this.pearltype;
		}
		return output;
	}
	
	public static Generics[] bobaData() {
		Generics[] boba = { 
				new Boba("Milk tea", 40, "Black"),
			    new Boba("Green tea", 35, "Popping"),
			    new Boba("Taro", 37, "Clear"),
			    new Boba("Peach tea", 30, "Fruity"),
			    new Boba("Hokkaido", 80, "Mini"),
			    new Boba("Mango slush", 0, "None"),
		};
		return boba;
	}
	
	public static void main(String[] args)
	{
		Generics[] boba = bobaData();
		for(int i = 0; i < boba.length; i++)
			System.out.println(boba[i]);
	}
	
}
