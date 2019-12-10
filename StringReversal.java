package oracle;

public class StringReversal {

	public static void main(String args[]) {
		String s="zyxwvutsrqponmlkjihgfedcba";
		char[] c=s.toCharArray();
/*		for(int i=0;i<s.length()/2;i++) {
			char temp= c[i];
			c[i] = c[s.length()-i-1];
			c[s.length()-i-1] = temp;
		}*/

		strrev(c, 0, 0,c.length);
		s=String.copyValueOf(c);
		System.out.println(s);
	}

	private static void strrev(char[] c, int length, int start, int end) {

		if(length>=c.length/2) {
			return;
		}
		else {
			char temp = c[start];
			c[start] = c[end-1];
			c[end-1] = temp;
			length++;
			strrev(c, length, length, c.length-length);
		}
			
	}

}
