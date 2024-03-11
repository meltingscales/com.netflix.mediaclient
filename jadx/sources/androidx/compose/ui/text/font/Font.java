package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public interface ResourceLoader {
    }

    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    int mo2199getStyle_LCdwA();

    FontWeight getWeight();

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo2189getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m2211getBlockingPKNRLFQ();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
