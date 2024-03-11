package kotlinx.coroutines.rx2;

/* loaded from: classes5.dex */
public enum Mode {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle");
    
    private final String i;

    @Override // java.lang.Enum
    public String toString() {
        return this.i;
    }

    Mode(String str) {
        this.i = str;
    }
}
