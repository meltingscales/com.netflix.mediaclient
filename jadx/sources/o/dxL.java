package o;

/* loaded from: classes5.dex */
public abstract class dxL extends dwM implements InterfaceC8760dxn, dxA {
    public dxM a;

    @Override // o.dxA
    public dxQ cp_() {
        return null;
    }

    public final void d(dxM dxm) {
        this.a = dxm;
    }

    @Override // o.dxA
    public boolean d() {
        return true;
    }

    public final dxM b() {
        dxM dxm = this.a;
        if (dxm != null) {
            return dxm;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC8760dxn
    public void co_() {
        b().d(this);
    }

    @Override // o.C7664dAu
    public String toString() {
        return dwW.c(this) + '@' + dwW.a(this) + "[job@" + dwW.a(b()) + ']';
    }
}
