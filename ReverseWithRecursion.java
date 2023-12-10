

public class ReverseWithRecursion {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(reverse(str, 0));
	}
	
	//Ewwwwww, Static method. 
	public static StringBuilder reverse(String str, int position) {
		
		//At the end of recursion?
		if (position == str.length()) {
			
			//yes, return an empty StringBuilder
			StringBuilder empty= new StringBuilder();
			return empty;
		}
		
		//remember the letter at this position
		char ch = str.charAt(position);
		
		//lets get the next letter... and the next letter... and the... and accumulate it to a StringBuilder.
		StringBuilder accumulateStrB=new StringBuilder(reverse(str, position+1));
		
		//slap that letter on the accumulating StringBuilder
		accumulateStrB.append(ch);
		
		//pass it back
		return accumulateStrB;
		
	}

}
