package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        String str = new String(chars);
        System.out.println(str + " has ");
        System.out.println(str.length()+ " characters");
    }
    public static void main(String[] args) {
        buildPhrase('c', 'a', 't');
    }
}
