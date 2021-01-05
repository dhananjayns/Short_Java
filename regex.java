package java9;
import java.util.regex.*;


public class regex{
	Pattern p;
	Matcher m;
	public regex(String pattern,String matcher){
		p = Pattern.compile(".s");  
		m = p.matcher("as");  
	}

	public boolean match(){
		return m.matches();
	}

	public boolean find(){
		return m.find();
	}

	public String group(int i){
		return m.group(i);
	}

	public int start(){
		return m.start();
	}

	public int end(){
		return m.end();
	}
}