public class WCResult {

    private final long words;
    private final long characters;
    private final long lines;

    public WCResult(long words, long characters, long lines){
        this.words = words;
        this.characters = characters;
        this.lines = lines;
    }

    public long getLines() {
        return lines;
    }

    public long getCharacters() {
        return characters;
    }

    public long getWords() {
        return words;
    }
}
