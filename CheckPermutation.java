import java.util.*;

class CheckPermutation{
static String sort (String toBeSorted){
	char newChar[] = toBeSorted.toCharArray();
	java.util.Arrays.sort(newChar);
    return new String(newChar);
}
static boolean checkPerm (String str, String permStr) {
	if (str.length() != permStr.length()) {
		return false;
	}
	return sort(str).equals(sort(permStr));
}

public static void main(String args[]){
	String str = "Kim";
	String permStr = "miK";
	System.out.println(checkPerm(str,permStr));
 }
}

// case sensitive