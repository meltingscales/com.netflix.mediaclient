package o;

import kotlinx.serialization.json.internal.WriteMode;

/* renamed from: o.dEv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7773dEv implements InterfaceC7702dCe {
    public static final e a = new e(null);
    private final C7777dEz b;
    private final C7792dFn c;
    private final dFP e;

    public /* synthetic */ AbstractC7773dEv(C7777dEz c7777dEz, dFP dfp, C8627dsp c8627dsp) {
        this(c7777dEz, dfp);
    }

    public final C7777dEz a() {
        return this.b;
    }

    public final C7792dFn b() {
        return this.c;
    }

    @Override // o.dBY
    public dFP d() {
        return this.e;
    }

    private AbstractC7773dEv(C7777dEz c7777dEz, dFP dfp) {
        this.b = c7777dEz;
        this.e = dfp;
        this.c = new C7792dFn();
    }

    /* renamed from: o.dEv$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC7773dEv {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super(new C7777dEz(false, false, false, false, false, false, null, false, false, null, false, false, null, false, 16383, null), dFU.a(), null);
        }
    }

    @Override // o.InterfaceC7702dCe
    public final <T> String e(dBZ<? super T> dbz, T t) {
        C8632dsu.c((Object) dbz, "");
        C7803dFy c7803dFy = new C7803dFy();
        try {
            dFA.d(this, c7803dFy, dbz, t);
            return c7803dFy.toString();
        } finally {
            c7803dFy.a();
        }
    }

    public final <T> T d(dBP<? extends T> dbp, String str) {
        C8632dsu.c((Object) dbp, "");
        C8632dsu.c((Object) str, "");
        dFI dfi = new dFI(str);
        T t = (T) new dFH(this, WriteMode.b, dfi, dbp.e(), null).d(dbp);
        dfi.o();
        return t;
    }

    public final <T> T e(dBP<? extends T> dbp, dEI dei) {
        C8632dsu.c((Object) dbp, "");
        C8632dsu.c((Object) dei, "");
        return (T) dFM.c(this, dei, dbp);
    }

    public final dEI e(String str) {
        C8632dsu.c((Object) str, "");
        return (dEI) d(dEF.a, str);
    }
}
