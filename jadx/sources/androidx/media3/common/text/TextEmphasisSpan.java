package androidx.media3.common.text;

/* loaded from: classes2.dex */
public final class TextEmphasisSpan implements LanguageFeatureSpan {
    public int markFill;
    public int markShape;
    public final int position;

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }
}
