import java.util.ArrayList;
import java.util.List;

public class Sentence {
    List<Word> sentence = new ArrayList<>();

    public Sentence() {
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void addWord(Word word) {
        this.sentence.add(word);
    }

    @Override
    public String toString() {
        String res="";
        for (Word word: sentence) {
            res+=" "+word;
        }
        return res.trim();
    }
}