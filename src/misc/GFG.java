package misc;

// Java program to find K'th character in
// decrypted string
public class GFG {

    // Function to find K'th character in
    // Encoded String
    static char encodedChar(String str,int k)
    {
        // expand string variable is used to
        // store final string after decompressing
        // string str
        String expand = "";

        String temp = ""; // Current substring
        int freq = 0; // Count of current substring

        for (int i=0; i < str.length() ; )
        {
            temp = ""; // Current substring
            freq = 0; // count frequency of current
            // substring

            // read characters until you find a number
            // or end of string
            while (i < str.length() && Character.isLetter(str.charAt(i)))
            {
                // push character in temp
                temp += str.charAt(i);
                i++;
            }

            // read number for how many times string temp
            // will be repeated in decompressed string
            while (i < str.length() && Character.isDigit(str.charAt(i)))
            {
                // generating frequency of temp
                freq = freq*10 + str.charAt(i) - '0';
                i++;
            }

            // now append string temp into expand
            // equal to its frequency
            for (int j=1; j<=freq; j++)
                expand += temp;
        }

        // this condition is to handle the case
        // when string str is ended with alphabets
        // not with numeric value
        if (freq==0)
            expand += temp;

        return expand.charAt(k-1);
    }

    // Driver program to test the string
    public static void main(String args[])
    {
        String str = "ab4c12ed3";
        int k = 21;
        System.out.println(encodedChar(str, k));
    }
}
// This code is contributed by Sumit Ghosh
