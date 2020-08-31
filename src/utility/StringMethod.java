package utility;

public class StringMethod{
	public String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String toLowerCase(String str) {
		String s = str.toLowerCase();
		return s;
	}
	
	public String toUpperCase(String str) {
		String s = str.toUpperCase();
		return s;
	}
	
	public char firstChar(String str) {
		char ch = str.charAt(0);
		return ch;
	}
	public int strLenght(String str) {
		int len = str.length();
		return len;
	}
	
	public String trim(String str) {
		String s = str.trim();
		return s;
	}

	
	
}
