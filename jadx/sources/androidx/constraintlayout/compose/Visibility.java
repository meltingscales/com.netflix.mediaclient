package androidx.constraintlayout.compose;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class Visibility {
    private final int solverValue;
    public static final Companion Companion = new Companion(null);
    private static final Visibility Visible = new Visibility(0);
    private static final Visibility Invisible = new Visibility(4);
    private static final Visibility Gone = new Visibility(8);

    public Visibility(int i) {
        this.solverValue = i;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Visibility getVisible() {
            return Visibility.Visible;
        }
    }
}
