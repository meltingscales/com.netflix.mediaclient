package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class aOB extends AbstractC1793aOl {
    private final List<C1255Uq> e;

    public final List<C1255Uq> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aOB) && C8632dsu.c(this.e, ((aOB) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        List<C1255Uq> list = this.e;
        return "PromptedPairingData(devices=" + list + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aOB(List<C1255Uq> list) {
        super(null);
        C8632dsu.c((Object) list, "");
        this.e = list;
    }
}
