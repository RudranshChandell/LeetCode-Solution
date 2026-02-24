class Solution {

    static {
    // This disconnects the standard Java streams to speed up I/O
    System.setOut(new java.io.PrintStream(new java.io.BufferedOutputStream(System.out)));
    // Sometimes people also use this to close the input stream early or speed up scanning
    }

    public String reverseWords(String s) {
        String[]str=s.split(" ");

        for(int i=0;i<str.length;i++){
            str[i]=new StringBuilder(str[i]).reverse().toString();
        }
        
        return String.join(" ",str);
    }
}