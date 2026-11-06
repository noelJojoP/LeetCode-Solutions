class Solution {
    public int minAddToMakeValid(String s) {
        int counter = 0;
        int extra = 0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                counter++;
            else if(s.charAt(i) == ')')
                counter--;
            if(counter < 0)
            {
                extra++;
                counter = 0;
            }
        }
        return counter+extra;
    }
}