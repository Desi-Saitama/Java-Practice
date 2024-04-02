public class Test {
    public static void main(String[] args) {
    	int count;
    	int i=0;
    	String str;
    	count = args.length;
    	System.out.println("Argumnets= "+count);
    	while(i<count){
    		str = args[i];
    		System.out.println(str);
    		i= i+1;
    	}
        
    }
}
