package o;

/* renamed from: o.cwA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7431cwA extends C9941zV {
    public /* synthetic */ AbstractC7431cwA(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.cwA$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7431cwA {
        private final String c;
        private final boolean e;

        public final boolean b() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public a(String str, boolean z) {
            super(null);
            this.c = str;
            this.e = z;
        }

        public /* synthetic */ a(String str, boolean z, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? true : z);
        }
    }

    private AbstractC7431cwA() {
    }

    /* renamed from: o.cwA$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC7431cwA {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: o.cwA$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7431cwA {
        public static final b c = new b();

        private b() {
            super(null);
        }
    }
}
