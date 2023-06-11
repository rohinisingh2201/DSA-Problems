class Reverse
{
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String w = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--) {
            w += str.charAt(i);
        }
        return w;
    }
}
