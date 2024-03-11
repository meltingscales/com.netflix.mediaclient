package androidx.compose.ui.text;

/* loaded from: classes.dex */
public interface ParagraphIntrinsics {
    default boolean getHasStaleResolvedFonts() {
        return false;
    }

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();
}
