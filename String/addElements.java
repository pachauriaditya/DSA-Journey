package String;

public class addElements {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // append is used to add elements/strings from end.
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
