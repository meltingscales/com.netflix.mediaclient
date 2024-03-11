package androidx.compose.ui.text.font;

import android.content.Context;
import o.InterfaceC8585dra;

/* loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;

    /* loaded from: classes.dex */
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, InterfaceC8585dra<? super android.graphics.Typeface> interfaceC8585dra);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ  reason: not valid java name */
    public final int mo2189getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }
}
