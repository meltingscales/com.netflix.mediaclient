package o;

import android.view.Window;

/* loaded from: classes4.dex */
public abstract class bEL extends C9941zV {
    public /* synthetic */ bEL(C8627dsp c8627dsp) {
        this();
    }

    private bEL() {
    }

    /* loaded from: classes4.dex */
    public static final class d extends bEL {
        private final int b;
        private final Window e;

        public final Window c() {
            return this.e;
        }

        public final int d() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Window window, int i) {
            super(null);
            C8632dsu.c((Object) window, "");
            this.e = window;
            this.b = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bEL {
        private final int b;
        private final Window d;

        public final Window c() {
            return this.d;
        }

        public final int d() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Window window, int i) {
            super(null);
            C8632dsu.c((Object) window, "");
            this.d = window;
            this.b = i;
        }
    }
}
