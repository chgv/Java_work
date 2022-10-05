package xxx;

public class three_test {
public static void main(String[] args) {
	String s = "abuiiiiAiiiaiiiiiaiiiiiniiiaeeeeeeea";
	char[] chars= s.toLowerCase().toCharArray();
	
	int counter = 0;
	for(int i=0;i<chars.length;i++)
	{
		if(chars[i]=='a'){
			counter++;
		}
	}
	System.out.println(counter);
	
	int a = 8 ;
	int sum = 6 ;
	sum =+ a * 2 ;
	System.out.println(sum);
}

}

