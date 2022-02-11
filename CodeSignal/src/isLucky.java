/* Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half. Given a ticket number n, determine if it's lucky or not. */

boolean solution(int n) {

int sum1 = 0;
int sum2 = 0;
String s = String.valueOf(n);

for(int i = 0; i < s.length() / 2; i++)
{
    sum1 = sum1 + Integer.valueOf(s.charAt(i));
    
}

for(int i = s.length()/2 ; i < s.length(); i++)
{
    sum2 = sum2 + Integer.valueOf(s.charAt(i));
    
}

return sum1 == sum2 ;

}
