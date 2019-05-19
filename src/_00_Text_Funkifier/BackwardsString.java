package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ns = "";
		for(int i = s.length()-1; i>-1;i--) {
			
		ns+= s.charAt(i);
			
	}
		
	
		
		return ns;
	}

}
