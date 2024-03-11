package o;

import java.util.List;
import o.C8143den;

/* renamed from: o.Jz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0980Jz extends AbstractC0985Ke<InterfaceC5147btK> {
    public static final b d = new b(null);
    private final InterfaceC1242Ud a;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean a(List<? extends InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        return true;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean b() {
        return true;
    }

    public C0980Jz(String str, boolean z) {
        super("FetchLolopi", null, false, 6, null);
        InterfaceC1242Ud b2;
        if (str == null) {
            b2 = IE.b("lolopi", "-1", String.valueOf(z));
            C8632dsu.d(b2);
        } else {
            b2 = IE.b("lolopi", str, String.valueOf(z));
            C8632dsu.d(b2);
        }
        this.a = b2;
    }

    /* renamed from: o.Jz$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("FetchLolopiTask");
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.a);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: d */
    public InterfaceC5147btK e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b2 = interfaceC1240Ub.b(this.a);
        IH ih = b2 instanceof IH ? (IH) b2 : null;
        Object a = ih != null ? ih.a() : null;
        if (a instanceof InterfaceC5147btK) {
            return (InterfaceC5147btK) a;
        }
        return null;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> e;
        if (C8153dex.C()) {
            e = C8566dqi.e(new C8143den.d("enableKidsBrandRealignment", "true"));
            return e;
        }
        return super.c();
    }
}
