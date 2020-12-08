public class ZD6 {
    public static void main(String[] args) {
        Sentence head = new Sentence();
        head.addWord(new Word("About"));
        head.addWord(new Word("Jon"));


        Sentence sentence1 = new Sentence();
        sentence1.addWord(new Word("Hi"));
        sentence1.addWord(new Word("I'm"));
        sentence1.addWord(new Word("Jon"));

        Sentence sentence2 = new Sentence();
        sentence2.addWord(new Word("I"));
        sentence2.addWord(new Word("want"));
        sentence2.addWord(new Word("to"));
        sentence2.addWord(new Word("drink"));

        try{
        Text text = new Text();
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.setHead(head);
            System.out.println(text.getHead());
            System.out.println(text);
        }
        catch(Exception ex){

            ex.printStackTrace();
        }
        System.out.println("Программа завершена");

    }
}
