package o;

import java.util.Set;

/* renamed from: o.gV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8955gV extends AbstractC9015hc {
    private final Set<String> c;

    public final Set<String> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8955gV) && C8632dsu.c(this.c, ((C8955gV) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.c + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8955gV(Set<String> set) {
        super(null);
        C8632dsu.c((Object) set, "");
        this.c = set;
    }
}
