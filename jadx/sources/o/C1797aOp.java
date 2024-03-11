package o;

/* renamed from: o.aOp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1797aOp extends AbstractC1793aOl {
    private final C1255Uq b;

    public final C1255Uq e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1797aOp) && C8632dsu.c(this.b, ((C1797aOp) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C1255Uq c1255Uq = this.b;
        return "ImplicitPairingData(target=" + c1255Uq + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797aOp(C1255Uq c1255Uq) {
        super(null);
        C8632dsu.c((Object) c1255Uq, "");
        this.b = c1255Uq;
    }
}
