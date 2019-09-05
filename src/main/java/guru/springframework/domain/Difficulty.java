package guru.springframework.domain;

public enum Difficulty {

    EASY("easy"),
    MODERATE("moderate"),
    KIND_OF_HARD("kind of hard"),
    HARD("hard");

    private String text;

    Difficulty(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Difficulty fromString(String text) {
        for (Difficulty b : Difficulty.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}
