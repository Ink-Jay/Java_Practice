// check if string is a palindrome
public class CheckPalindrome {
      
	boolean checkPalindrome(String inputString) {
	    
	    String reverse = "";
	    
	    for(int i = inputString.length() - 1 ; i>= 0; i--){
	reverse = reverse +inputString.charAt(i);
	    }
	    
	    if(inputString.equals(reverse)){
	        return true;
	    }
	    else{
	        return false;
	    }

	}
}
