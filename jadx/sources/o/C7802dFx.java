package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC7715dCr;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dFx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7802dFx extends AbstractC7781dFc {
    private boolean b;
    private final String d;
    private final InterfaceC7707dCj e;
    private final dEP h;
    private int i;

    @Override // o.AbstractC7781dFc
    /* renamed from: q */
    public dEP r() {
        return this.h;
    }

    public /* synthetic */ C7802dFx(AbstractC7773dEv abstractC7773dEv, dEP dep, String str, InterfaceC7707dCj interfaceC7707dCj, int i, C8627dsp c8627dsp) {
        this(abstractC7773dEv, dep, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : interfaceC7707dCj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7802dFx(AbstractC7773dEv abstractC7773dEv, dEP dep, String str, InterfaceC7707dCj interfaceC7707dCj) {
        super(abstractC7773dEv, dep, null);
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) dep, "");
        this.h = dep;
        this.d = str;
        this.e = interfaceC7707dCj;
    }

    private final boolean b(InterfaceC7707dCj interfaceC7707dCj, int i, String str) {
        AbstractC7773dEv k = k();
        InterfaceC7707dCj c = interfaceC7707dCj.c(i);
        if (c.i() || !(c(str) instanceof dEQ)) {
            if (C8632dsu.c(c.b(), AbstractC7715dCr.b.a) && (!c.i() || !(c(str) instanceof dEQ))) {
                dEI c2 = c(str);
                dET det = c2 instanceof dET ? (dET) c2 : null;
                String a = det != null ? dEG.a(det) : null;
                if (a != null && C7801dFw.e(c, k, a) == -3) {
                }
            }
            return false;
        }
        return true;
    }

    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        while (this.i < interfaceC7707dCj.e()) {
            int i = this.i;
            this.i = i + 1;
            String n = n(interfaceC7707dCj, i);
            int i2 = this.i - 1;
            this.b = false;
            if (r().containsKey(n) || l(interfaceC7707dCj, i2)) {
                if (!((AbstractC7781dFc) this).c.e() || !b(interfaceC7707dCj, i2, n)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private final boolean l(InterfaceC7707dCj interfaceC7707dCj, int i) {
        boolean z = (k().a().j() || interfaceC7707dCj.e(i) || !interfaceC7707dCj.c(i).i()) ? false : true;
        this.b = z;
        return z;
    }

    @Override // o.AbstractC7781dFc, o.AbstractC7757dEf, o.InterfaceC7720dCw
    public boolean i() {
        return !this.b && super.i();
    }

    @Override // o.dDG
    public String o(InterfaceC7707dCj interfaceC7707dCj, int i) {
        Object obj;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        dES e = C7801dFw.e(interfaceC7707dCj, k());
        String a = interfaceC7707dCj.a(i);
        if (e != null || (((AbstractC7781dFc) this).c.m() && !r().keySet().contains(a))) {
            Map<String, Integer> e2 = C7801dFw.e(k(), interfaceC7707dCj);
            Iterator<T> it = r().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = e2.get((String) obj);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
            String b = e != null ? e.b(interfaceC7707dCj, i, a) : null;
            return b == null ? a : b;
        }
        return a;
    }

    @Override // o.AbstractC7781dFc
    protected dEI c(String str) {
        Object e;
        C8632dsu.c((Object) str, "");
        e = dqE.e(r(), str);
        return (dEI) e;
    }

    @Override // o.AbstractC7781dFc, o.AbstractC7757dEf, o.InterfaceC7720dCw
    public InterfaceC7717dCt c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (interfaceC7707dCj == this.e) {
            AbstractC7773dEv k = k();
            dEI t = t();
            InterfaceC7707dCj interfaceC7707dCj2 = this.e;
            if (t instanceof dEP) {
                return new C7802dFx(k, (dEP) t, this.d, interfaceC7707dCj2);
            }
            throw C7797dFs.c(-1, "Expected " + dsA.a(dEP.class) + " as the serialized body of " + interfaceC7707dCj2.d() + ", but had " + dsA.a(t.getClass()));
        }
        return super.c(interfaceC7707dCj);
    }

    @Override // o.AbstractC7781dFc, o.AbstractC7757dEf, o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        Set<String> c;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (((AbstractC7781dFc) this).c.f() || (interfaceC7707dCj.b() instanceof AbstractC7710dCm)) {
            return;
        }
        dES e = C7801dFw.e(interfaceC7707dCj, k());
        if (e == null && !((AbstractC7781dFc) this).c.m()) {
            c = C7743dDs.a(interfaceC7707dCj);
        } else if (e != null) {
            c = C7801dFw.e(k(), interfaceC7707dCj).keySet();
        } else {
            Set<String> a = C7743dDs.a(interfaceC7707dCj);
            Map map = (Map) dEX.c(k()).a(interfaceC7707dCj, C7801dFw.d());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = dqN.e();
            }
            c = dqM.c(a, keySet);
        }
        for (String str : r().keySet()) {
            if (!c.contains(str) && !C8632dsu.c((Object) str, (Object) this.d)) {
                throw C7797dFs.a(str, r().toString());
            }
        }
    }
}
