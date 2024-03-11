package o;

import kotlin.KotlinNothingValueException;
import o.AbstractC7715dCr;
import o.AbstractC7716dCs;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dFc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7781dFc extends dDG implements dEH {
    private final AbstractC7773dEv b;
    protected final C7777dEz c;
    private final dEI d;

    public /* synthetic */ AbstractC7781dFc(AbstractC7773dEv abstractC7773dEv, dEI dei, C8627dsp c8627dsp) {
        this(abstractC7773dEv, dei);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    protected abstract dEI c(String str);

    @Override // o.dDG
    public String d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return str2;
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
    }

    @Override // o.dEH
    public AbstractC7773dEv k() {
        return this.b;
    }

    public dEI r() {
        return this.d;
    }

    private AbstractC7781dFc(AbstractC7773dEv abstractC7773dEv, dEI dei) {
        this.b = abstractC7773dEv;
        this.d = dei;
        this.c = k().a();
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7717dCt
    public dFP n() {
        return k().d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dEI t() {
        dEI c;
        String cz_ = cz_();
        return (cz_ == null || (c = c(cz_)) == null) ? r() : c;
    }

    @Override // o.dEH
    public dEI l() {
        return t();
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7720dCw
    public <T> T d(dBP<? extends T> dbp) {
        C8632dsu.c((Object) dbp, "");
        return (T) dFC.c(this, dbp);
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7720dCw
    public InterfaceC7717dCt c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        dEI t = t();
        AbstractC7715dCr b = interfaceC7707dCj.b();
        if (!C8632dsu.c(b, AbstractC7716dCs.c.d) && !(b instanceof AbstractC7710dCm)) {
            if (!C8632dsu.c(b, AbstractC7716dCs.e.a)) {
                AbstractC7773dEv k = k();
                if (t instanceof dEP) {
                    return new C7802dFx(k, (dEP) t, null, null, 12, null);
                }
                throw C7797dFs.c(-1, "Expected " + dsA.a(dEP.class) + " as the serialized body of " + interfaceC7707dCj.d() + ", but had " + dsA.a(t.getClass()));
            }
            AbstractC7773dEv k2 = k();
            InterfaceC7707dCj c = dFN.c(interfaceC7707dCj.c(0), k2.d());
            AbstractC7715dCr b2 = c.b();
            if ((b2 instanceof AbstractC7709dCl) || C8632dsu.c(b2, AbstractC7715dCr.b.a)) {
                AbstractC7773dEv k3 = k();
                if (t instanceof dEP) {
                    return new dFG(k3, (dEP) t);
                }
                throw C7797dFs.c(-1, "Expected " + dsA.a(dEP.class) + " as the serialized body of " + interfaceC7707dCj.d() + ", but had " + dsA.a(t.getClass()));
            } else if (k2.a().a()) {
                AbstractC7773dEv k4 = k();
                if (t instanceof dEB) {
                    return new dFB(k4, (dEB) t);
                }
                throw C7797dFs.c(-1, "Expected " + dsA.a(dEB.class) + " as the serialized body of " + interfaceC7707dCj.d() + ", but had " + dsA.a(t.getClass()));
            } else {
                throw C7797dFs.b(c);
            }
        }
        AbstractC7773dEv k5 = k();
        if (t instanceof dEB) {
            return new dFB(k5, (dEB) t);
        }
        throw C7797dFs.c(-1, "Expected " + dsA.a(dEB.class) + " as the serialized body of " + interfaceC7707dCj.d() + ", but had " + dsA.a(t.getClass()));
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7720dCw
    public boolean i() {
        return !(t() instanceof dEQ);
    }

    protected final dET o(String str) {
        C8632dsu.c((Object) str, "");
        dEI c = c(str);
        dET det = c instanceof dET ? (dET) c : null;
        if (det != null) {
            return det;
        }
        throw C7797dFs.a(-1, "Expected JsonPrimitive at " + str + ", found " + c, t().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: c */
    public int b(String str, InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return C7801dFw.d(interfaceC7707dCj, k(), o(str).d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    public boolean i(String str) {
        C8632dsu.c((Object) str, "");
        return c(str) != dEQ.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public boolean b(String str) {
        C8632dsu.c((Object) str, "");
        dET o2 = o(str);
        if (!k().a().l() && e(o2, "boolean").e()) {
            throw C7797dFs.a(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", t().toString());
        }
        try {
            Boolean d = dEG.d(o2);
            if (d != null) {
                return d.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            m("boolean");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public byte a(String str) {
        C8632dsu.c((Object) str, "");
        try {
            int i = dEG.i(o(str));
            Byte valueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (valueOf == null) {
                m("byte");
                throw new KotlinNothingValueException();
            }
            return valueOf.byteValue();
        } catch (IllegalArgumentException unused) {
            m("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: k */
    public short h(String str) {
        C8632dsu.c((Object) str, "");
        try {
            int i = dEG.i(o(str));
            Short valueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (valueOf == null) {
                m("short");
                throw new KotlinNothingValueException();
            }
            return valueOf.shortValue();
        } catch (IllegalArgumentException unused) {
            m("short");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: h  reason: avoid collision after fix types in other method */
    public int j(String str) {
        C8632dsu.c((Object) str, "");
        try {
            return dEG.i(o(str));
        } catch (IllegalArgumentException unused) {
            m("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    public long f(String str) {
        C8632dsu.c((Object) str, "");
        try {
            return dEG.f(o(str));
        } catch (IllegalArgumentException unused) {
            m("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: g  reason: avoid collision after fix types in other method */
    public float e(String str) {
        C8632dsu.c((Object) str, "");
        try {
            float b = dEG.b(o(str));
            if (k().a().b() || !(Float.isInfinite(b) || Float.isNaN(b))) {
                return b;
            }
            throw C7797dFs.c(Float.valueOf(b), str, t().toString());
        } catch (IllegalArgumentException unused) {
            m("float");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: j  reason: avoid collision after fix types in other method */
    public double d(String str) {
        C8632dsu.c((Object) str, "");
        try {
            double e = dEG.e(o(str));
            if (k().a().b() || !(Double.isInfinite(e) || Double.isNaN(e))) {
                return e;
            }
            throw C7797dFs.c(Double.valueOf(e), str, t().toString());
        } catch (IllegalArgumentException unused) {
            m("double");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public char c(String str) {
        char s;
        C8632dsu.c((Object) str, "");
        try {
            s = duB.s(o(str).d());
            return s;
        } catch (IllegalArgumentException unused) {
            m("char");
            throw new KotlinNothingValueException();
        }
    }

    private final Void m(String str) {
        throw C7797dFs.a(-1, "Failed to parse literal as '" + str + "' value", t().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    /* renamed from: n */
    public String g(String str) {
        C8632dsu.c((Object) str, "");
        dET o2 = o(str);
        if (!k().a().l() && !e(o2, "string").e()) {
            throw C7797dFs.a(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", t().toString());
        } else if (o2 instanceof dEQ) {
            throw C7797dFs.a(-1, "Unexpected 'null' value instead of string literal", t().toString());
        } else {
            return o2.d();
        }
    }

    private final dEJ e(dET det, String str) {
        dEJ dej = det instanceof dEJ ? (dEJ) det : null;
        if (dej != null) {
            return dej;
        }
        throw C7797dFs.c(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7757dEf
    public InterfaceC7720dCw a(String str, InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return dFL.a(interfaceC7707dCj) ? new C7800dFv(new dFI(o(str).d()), k()) : super.a((AbstractC7781dFc) str, interfaceC7707dCj);
    }

    @Override // o.AbstractC7757dEf, o.InterfaceC7720dCw
    public InterfaceC7720dCw a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return cz_() != null ? super.a(interfaceC7707dCj) : new C7804dFz(k(), r()).a(interfaceC7707dCj);
    }
}
