package memorycard.model;

public class MemoryCard {

    private String name;
    private String header;
    private String[] tags;
    private String question;
    private Answer answer;

    public MemoryCard() {
        if(answer == null) {
            answer = new Answer();
        }
    }

    class Answer {
        private String hint;
        private String description;
    }
}