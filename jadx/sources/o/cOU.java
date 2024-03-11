package o;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class cOU extends C9941zV {
    public /* synthetic */ cOU(C8627dsp c8627dsp) {
        this();
    }

    private cOU() {
    }

    /* loaded from: classes4.dex */
    public static final class e extends cOU {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends cOU {
        private final List<C8313dhy> a;
        private final boolean d;

        public final boolean d() {
            return this.d;
        }

        public final List<C8313dhy> e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, List<C8313dhy> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.d = z;
            this.a = list;
        }
    }
}
