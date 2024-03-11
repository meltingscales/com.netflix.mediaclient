package o;

import java.util.List;

/* renamed from: o.aus  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3223aus {
    private final List<C3151atY> b;

    public final List<C3151atY> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3223aus) && C8632dsu.c(this.b, ((C3223aus) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        List<C3151atY> list = this.b;
        return "ShouldRecordRdidInput(consentStates=" + list + ")";
    }

    public C3223aus(List<C3151atY> list) {
        C8632dsu.c((Object) list, "");
        this.b = list;
    }
}
