package androidx.compose.ui.layout;

import o.C8627dsp;
import o.drX;

/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final Companion Companion = new Companion(null);
    private final drX<Integer, Integer, Integer> merger;

    public /* synthetic */ AlignmentLine(drX drx, C8627dsp c8627dsp) {
        this(drx);
    }

    public final drX<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(drX<? super Integer, ? super Integer, Integer> drx) {
        this.merger = drx;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
