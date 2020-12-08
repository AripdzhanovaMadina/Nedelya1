import java.util.ArrayList;
import java.util.List;

public class Text {
    List<Sentence> text = new ArrayList<>();
    Sentence head = new Sentence();

    public Text() {
    }

    public List<Sentence> getText() {
        return text;
    }

    public void addSentence(Sentence sentence) {
        this.text.add(sentence);
    }

    public Sentence getHead() {
        return head;
    }

    public void setHead(Sentence head) {
        this.head = head;
    }

    @Override
    public String toString() {
        String res="";
        for (Sentence sentence: text) {
            res+=sentence+". ";
        }
        return res;
    }
}