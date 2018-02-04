class UniqueString {

static boolean anyDupChar(String str) {

	if len(str) > 128 {
		return false;
	}
	
	boolean[] str_array = new boolean[128];

    	for (int i = 0 ; i< str.length();i++){
    		int val = str.charAt(i);
		
       		if (str_array[val])	  {
	      	return false;
       		}
		
       		str_array [val] = true;
       		System.out.println(str_array[val]);
	 }
  	
	return true;
}

public static void main(String args[]){
	String str = "Kim";
	System.out.println(anyDupChar(str));
 }
}
