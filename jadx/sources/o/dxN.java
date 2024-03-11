package o;

/* loaded from: classes5.dex */
public abstract class dxN extends dwQ {
    public abstract dxN c();

    @Override // o.dwQ
    public String toString() {
        String d = d();
        if (d == null) {
            return dwW.c(this) + '@' + dwW.a(this);
        }
        return d;
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return this;
    }

    public final String d() {
        dxN dxn;
        dxN d = C8752dxf.d();
        if (this == d) {
            return "Dispatchers.Main";
        }
        try {
            dxn = d.c();
        } catch (UnsupportedOperationException unused) {
            dxn = null;
        }
        if (this == dxn) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
