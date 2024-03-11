package o;

/* loaded from: classes3.dex */
public abstract class KT {
    private final String a;

    /* loaded from: classes3.dex */
    public static final class a extends KT {
    }

    /* loaded from: classes3.dex */
    public static final class c extends KT {
    }

    /* loaded from: classes3.dex */
    public static final class d extends KT {
    }

    public /* synthetic */ KT(String str, C8627dsp c8627dsp) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private KT(String str) {
        this.a = str;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C8632dsu.a(simpleName, "");
        return simpleName;
    }

    /* loaded from: classes3.dex */
    public static final class e extends KT {
        public static final e d = new e();

        private e() {
            super("", null);
        }
    }
}
