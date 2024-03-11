package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    default FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo  reason: not valid java name */
    default int m2237interceptFontStyleT2F_aPo(int i) {
        return i;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y  reason: not valid java name */
    default int m2238interceptFontSynthesisMscr08Y(int i) {
        return i;
    }

    default FontWeight interceptFontWeight(FontWeight fontWeight) {
        return fontWeight;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }

        private Companion() {
        }
    }
}
