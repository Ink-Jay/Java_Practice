// program to find the century from year
public class CenturyFromYear {
	
	int centuryFromYear(int year) {
	    
	    if(year % 100 == 0){
	        return year/100;
	    }
	    else{
	        return (year/100) + 1;
	    }

	}

}
