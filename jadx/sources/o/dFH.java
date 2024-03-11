package o;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.WriteMode;
import o.AbstractC7715dCr;

/* loaded from: classes5.dex */
public class dFH extends AbstractC7712dCo implements dEH {
    private final C7777dEz b;
    private int c;
    public final dEU d;
    private a e;
    private final WriteMode f;
    private final C7798dFt g;
    private final AbstractC7773dEv h;
    private final dFP i;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            e = iArr;
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public Void g() {
        return null;
    }

    @Override // o.dEH
    public final AbstractC7773dEv k() {
        return this.h;
    }

    @Override // o.InterfaceC7717dCt
    public dFP n() {
        return this.i;
    }

    public dFH(AbstractC7773dEv abstractC7773dEv, WriteMode writeMode, dEU deu, InterfaceC7707dCj interfaceC7707dCj, a aVar) {
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) writeMode, "");
        C8632dsu.c((Object) deu, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        this.h = abstractC7773dEv;
        this.f = writeMode;
        this.d = deu;
        this.i = abstractC7773dEv.d();
        this.c = -1;
        this.e = aVar;
        C7777dEz a2 = abstractC7773dEv.a();
        this.b = a2;
        this.g = a2.j() ? null : new C7798dFt(interfaceC7707dCj);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public String b;

        public a(String str) {
            this.b = str;
        }
    }

    private final boolean d(a aVar, String str) {
        if (aVar != null && C8632dsu.c((Object) aVar.b, (Object) str)) {
            aVar.b = null;
            return true;
        }
        return false;
    }

    @Override // o.dEH
    public dEI l() {
        return new dFF(this.h.a(), this.d).b();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public <T> T d(dBP<? extends T> dbp) {
        boolean d;
        C8632dsu.c((Object) dbp, "");
        try {
            if ((dbp instanceof dCC) && !this.h.a().k()) {
                String c = dFC.c(dbp.e(), this.h);
                String d2 = this.d.d(c, this.b.l());
                dBP<T> d3 = d2 != null ? ((dCC) dbp).d(this, d2) : null;
                if (d3 == null) {
                    return (T) dFC.c(this, dbp);
                }
                this.e = new a(c);
                return d3.b(this);
            }
            return dbp.b(this);
        } catch (MissingFieldException e2) {
            String message = e2.getMessage();
            C8632dsu.d((Object) message);
            d = duD.d((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null);
            if (d) {
                throw e2;
            }
            List<String> c2 = e2.c();
            throw new MissingFieldException(c2, e2.getMessage() + " at path: " + this.d.c.e(), e2);
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public InterfaceC7717dCt c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        WriteMode c = dFN.c(this.h, interfaceC7707dCj);
        this.d.c.c(interfaceC7707dCj);
        this.d.c(c.d);
        q();
        int i = e.e[c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new dFH(this.h, c, this.d, interfaceC7707dCj, this.e);
        }
        return (this.f == c && this.h.a().j()) ? this : new dFH(this.h, c, this.d, interfaceC7707dCj, this.e);
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (this.h.a().f() && interfaceC7707dCj.e() == 0) {
            g(interfaceC7707dCj);
        }
        this.d.c(this.f.j);
        this.d.c.b();
    }

    private final void g(InterfaceC7707dCj interfaceC7707dCj) {
        do {
        } while (h(interfaceC7707dCj) != -1);
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public boolean i() {
        C7798dFt c7798dFt = this.g;
        return (c7798dFt == null || !c7798dFt.c()) && !dEU.a(this.d, false, 1, null);
    }

    private final void q() {
        if (this.d.n() != 4) {
            return;
        }
        dEU.d(this.d, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7717dCt
    public <T> T d(InterfaceC7707dCj interfaceC7707dCj, int i, dBP<? extends T> dbp, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbp, "");
        boolean z = this.f == WriteMode.e && (i & 1) == 0;
        if (z) {
            this.d.c.c();
        }
        T t2 = (T) super.d(interfaceC7707dCj, i, dbp, t);
        if (z) {
            this.d.c.c(t2);
        }
        return t2;
    }

    @Override // o.InterfaceC7717dCt
    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        int t;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        int i = e.e[this.f.ordinal()];
        if (i == 2) {
            t = t();
        } else if (i == 4) {
            t = j(interfaceC7707dCj);
        } else {
            t = p();
        }
        if (this.f != WriteMode.e) {
            this.d.c.b(t);
        }
        return t;
    }

    private final int t() {
        int i;
        int i2;
        int i3 = this.c;
        boolean z = false;
        boolean z2 = i3 % 2 != 0;
        if (!z2) {
            this.d.c(':');
        } else if (i3 != -1) {
            z = this.d.q();
        }
        if (!this.d.b()) {
            if (z) {
                dEU.d(this.d, "Expected '}', but had ',' instead", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        if (z2) {
            if (this.c == -1) {
                dEU deu = this.d;
                i2 = deu.d;
                if (!(!z)) {
                    dEU.d(deu, "Unexpected trailing comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                dEU deu2 = this.d;
                i = deu2.d;
                if (!z) {
                    dEU.d(deu2, "Expected comma after the key-value pair", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i4 = this.c + 1;
        this.c = i4;
        return i4;
    }

    private final boolean l(InterfaceC7707dCj interfaceC7707dCj, int i) {
        String a2;
        AbstractC7773dEv abstractC7773dEv = this.h;
        InterfaceC7707dCj c = interfaceC7707dCj.c(i);
        if (c.i() || !this.d.e(true)) {
            if (!C8632dsu.c(c.b(), AbstractC7715dCr.b.a) || ((c.i() && this.d.e(false)) || (a2 = this.d.a(this.b.l())) == null || C7801dFw.e(c, abstractC7773dEv, a2) != -3)) {
                return false;
            }
            this.d.h();
            return true;
        }
        return true;
    }

    private final int j(InterfaceC7707dCj interfaceC7707dCj) {
        boolean z;
        boolean q = this.d.q();
        while (this.d.b()) {
            String s = s();
            this.d.c(':');
            int e2 = C7801dFw.e(interfaceC7707dCj, this.h, s);
            boolean z2 = false;
            if (e2 == -3) {
                z2 = true;
                z = false;
            } else if (!this.b.e() || !l(interfaceC7707dCj, e2)) {
                C7798dFt c7798dFt = this.g;
                if (c7798dFt != null) {
                    c7798dFt.a(e2);
                }
                return e2;
            } else {
                z = this.d.q();
            }
            q = z2 ? c(s) : z;
        }
        if (q) {
            dEU.d(this.d, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        C7798dFt c7798dFt2 = this.g;
        if (c7798dFt2 != null) {
            return c7798dFt2.d();
        }
        return -1;
    }

    private final boolean c(String str) {
        if (this.b.f() || d(this.e, str)) {
            this.d.b(this.b.l());
        } else {
            this.d.e(str);
        }
        return this.d.q();
    }

    private final int p() {
        boolean q = this.d.q();
        if (!this.d.b()) {
            if (q) {
                dEU.d(this.d, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        int i = this.c;
        if (i != -1 && !q) {
            dEU.d(this.d, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = i + 1;
        this.c = i2;
        return i2;
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public boolean c() {
        if (this.b.l()) {
            return this.d.d();
        }
        return this.d.e();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public byte a() {
        long f = this.d.f();
        byte b = (byte) f;
        if (f == b) {
            return b;
        }
        dEU deu = this.d;
        dEU.d(deu, "Failed to parse byte for input '" + f + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public short o() {
        long f = this.d.f();
        short s = (short) f;
        if (f == s) {
            return s;
        }
        dEU deu = this.d;
        dEU.d(deu, "Failed to parse short for input '" + f + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public int f() {
        long f = this.d.f();
        int i = (int) f;
        if (f == i) {
            return i;
        }
        dEU deu = this.d;
        dEU.d(deu, "Failed to parse int for input '" + f + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public long j() {
        return this.d.f();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public char e() {
        String j = this.d.j();
        if (j.length() != 1) {
            dEU deu = this.d;
            dEU.d(deu, "Expected single char, but got '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return j.charAt(0);
    }

    private final String s() {
        if (this.b.l()) {
            return this.d.g();
        }
        return this.d.a();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public String m() {
        if (this.b.l()) {
            return this.d.g();
        }
        return this.d.h();
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public InterfaceC7720dCw a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return dFL.a(interfaceC7707dCj) ? new C7800dFv(this.d, this.h) : super.a(interfaceC7707dCj);
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public int d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        AbstractC7773dEv abstractC7773dEv = this.h;
        String m = m();
        return C7801dFw.b(interfaceC7707dCj, abstractC7773dEv, m, " at path " + this.d.c.e());
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public float b() {
        dEU deu = this.d;
        String j = deu.j();
        try {
            float parseFloat = Float.parseFloat(j);
            if (this.h.a().b() || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            C7797dFs.e(this.d, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'float' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.AbstractC7712dCo, o.InterfaceC7720dCw
    public double d() {
        dEU deu = this.d;
        String j = deu.j();
        try {
            double parseDouble = Double.parseDouble(j);
            if (this.h.a().b() || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            C7797dFs.e(this.d, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            dEU.d(deu, "Failed to parse type 'double' for input '" + j + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
