package misc;

import java.util.*;

public class decode {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;

            res.add(str.substring(i, j));
            i += length;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for list of strings
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        List<String> strs = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs.add(scanner.nextLine());
        }

        // Create an object of the decode class
        decode codec = new decode();

        // Encode the strings
        String encoded = codec.encode(strs);
        System.out.println("Encoded String: " + encoded);

        // Decode the encoded string  
        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded Strings: " + decoded);
    }
}
