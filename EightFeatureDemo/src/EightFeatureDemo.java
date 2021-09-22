import java.util.Optional;
import java.util.StringJoiner;

public class EightFeatureDemo {

	public static void main(String[] args) {
		
		StringJoiner strJoin = new StringJoiner(",","[","]");
		
		strJoin.add("ONE");
		strJoin.add("TWO");
		strJoin.add("THREE");
		
		System.out.println(strJoin);
		
		String[] str = new String[5];
		str[0]= "HUNDRED";
		
		if(str[1]!=null ) {
			System.out.println(str[1].toLowerCase());
		}
		

	}

}
