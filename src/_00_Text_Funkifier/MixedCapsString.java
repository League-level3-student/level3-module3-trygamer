package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String ns = "";
		for(int i=0; i<s.length(); i++) {
			
			
			
			if(i%2==0) {
			//	System.out.println(s.charAt(i));
				String c1hs =""+s.charAt(i);
				c1hs =c1hs.toLowerCase();
				ns+= c1hs;
				System.out.println(c1hs);
			}
			
			else if(i%2==1) {
				String c2hs =""+s.charAt(i);
				c2hs =	c2hs.toUpperCase();
				ns+= c2hs;
				System.out.println(c2hs);
			}
		}
		
		System.out.println(ns);
		return ns;
	}

}
