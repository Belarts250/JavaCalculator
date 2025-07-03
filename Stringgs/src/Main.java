public class Main {
    public static void main(String[] args){
        String name = "Igihozo Belise";

        int length = name.length();
        char letter = name.charAt(5);
        int index = name.indexOf("B");
        int lastIndex = name.lastIndexOf("i");

        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String removeSpace = name.trim();
        String replaceLetters = name.replace("o", "a");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(removeSpace);
        System.out.println(replaceLetters);
    }
}
