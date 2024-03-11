package o;

/* loaded from: classes4.dex */
public abstract class bJU extends AbstractC1754aN {
    private int d;

    public bJU() {
    }

    public bJU(int i) {
        super(i);
    }

    @Override // o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        super.e(c2077aZ);
        this.d = c2077aZ.b().getImportantForAccessibility();
        c2077aZ.b().setImportantForAccessibility(2);
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        c2077aZ.b().setImportantForAccessibility(this.d);
        super.e(c2077aZ);
    }
}
