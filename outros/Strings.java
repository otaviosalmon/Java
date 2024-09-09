package outros;

public class Strings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG      ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4= original.substring(2);
        String s5 = original.substring(2,9);
        String s6 = original.replace('a','x');
        String s7 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Original: "+original+ "-");
        System.out.println("toLowerCase: "+ s1);
        System.out.println("toUpperCase: "+s2);
        System.out.println("trim: "+s3 +"-");
        System.out.println("subString: "+ s4+ "-");
        System.out.println("substring: "+s5 +"-");
        System.out.println("replace: " + s6 +"-");
        System.out.println("replace: " + s7 +"-");
        System.out.println("indexOf: "+i+"-");
        System.out.println("lastIndexOf: "+j+"-");
    }
}
