package j$.time.format;

/* loaded from: classes5.dex */
public enum TextStyle {
    FULL(2, 0),
    FULL_STANDALONE(32770, 0),
    SHORT(1, 1),
    SHORT_STANDALONE(32769, 1),
    NARROW(4, 1),
    NARROW_STANDALONE(32772, 1);
    
    private final int g;
    private final int i;

    TextStyle(int i, int i2) {
        this.i = i;
        this.g = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.g;
    }
}
