package o;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dDt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7744dDt implements dtH {
    private final dtH b;

    public C7744dDt(dtH dth) {
        C8632dsu.c((Object) dth, "");
        this.b = dth;
    }

    @Override // o.InterfaceC8659dtu
    public List<Annotation> getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // o.dtH
    public List<dtJ> b() {
        return this.b.b();
    }

    @Override // o.dtH
    public InterfaceC8662dtx a() {
        return this.b.a();
    }

    @Override // o.dtH
    public boolean e() {
        return this.b.e();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        dtH dth = this.b;
        C7744dDt c7744dDt = obj instanceof C7744dDt ? (C7744dDt) obj : null;
        if (C8632dsu.c(dth, c7744dDt != null ? c7744dDt.b : null)) {
            InterfaceC8662dtx a = a();
            if (a instanceof InterfaceC8660dtv) {
                dtH dth2 = obj instanceof dtH ? (dtH) obj : null;
                InterfaceC8662dtx a2 = dth2 != null ? dth2.a() : null;
                if (a2 != null && (a2 instanceof InterfaceC8660dtv)) {
                    return C8632dsu.c(drI.e((InterfaceC8660dtv) a), drI.e((InterfaceC8660dtv) a2));
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.b;
    }
}
