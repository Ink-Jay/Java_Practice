/* Given an array of strings, return another array containing all of its longest strings. */

String[] solution(String[] inputArray) {
    
    int longest = 0;
    
for (String s : inputArray){
    
    if( s.length() >= longest){
        longest = s.length();
    }
}

List<String>Solution = new ArrayList <String> ();

    for (String s : inputArray)
    {
        if (s.length() == longest){
         Solution.add(s);
        }
    }
     
    
    return Solution.toArray(new String[Solution.size()]);
    
}
