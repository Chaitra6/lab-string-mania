package utility;

public class StringBoolean {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public boolean contains(String input1, String input2) {
		boolean output = input1.contains(input2);
		System.out.println(output);
		return output;
	}

	public boolean endsWith(String input1, String input2) {
		boolean output = input1.endsWith(input2);
		return output;
	}

	public boolean startsWith(String input1, String input2) {
		boolean output = input1.startsWith(input2);
		return output;
	}

	public boolean equals(String input1, String input2) {
		boolean output = input1.equals(input2);
		return output;
	}

	public boolean equalsIgnoreCase(String input1, String input2) {
		boolean output = input1.equalsIgnoreCase(input2);
		return output;
	}
	
	public String concatinate(String input1, String input2) {
		String str = input1.concat(input2);
		return str;
	}
	
	public int findIndexValue(String input1, char ch) {
		int indexValue = input1.indexOf(ch);
		return indexValue;
	}
	
	
	
	
	
	
	
	
	
	

}
