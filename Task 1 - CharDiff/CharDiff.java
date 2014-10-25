package geeklabs1;

public class CharDiff {
	
	private String str1, str2;
	
	public CharDiff(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public Integer count(){
		
		//W przypadku wyrazów róźnej dliny, sprawdzamy znaki do pozycji, gdzie oni są w dwóch wyrazach.
		int minLength = str1.length() < str2.length() ? str1.length() : str2.length();
		int diffCounter = 0;
		
		for (int i=0; i<minLength; i++){
			if(str1.charAt(i) != str2.charAt(i))
				diffCounter++;
		}
		return diffCounter;
	}
	
	
	public static void main(String[] args){
		
		CharDiff charDiff = new CharDiff("ABBB", "AAAA");
		System.out.println(charDiff.count());
	}

}
