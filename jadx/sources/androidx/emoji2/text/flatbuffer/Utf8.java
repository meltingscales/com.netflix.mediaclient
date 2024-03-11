package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }
}
