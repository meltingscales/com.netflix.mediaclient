package o;

import com.netflix.clcs.models.FieldValueProvider;

/* loaded from: classes2.dex */
public final class FI {
    private final FJ b;
    private final FieldValueProvider c;

    public final FJ c() {
        return this.b;
    }

    public final FieldValueProvider e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FI) {
            FI fi2 = (FI) obj;
            return C8632dsu.c(this.b, fi2.b) && this.c == fi2.c;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        FJ fj = this.b;
        FieldValueProvider fieldValueProvider = this.c;
        return "FieldInitialization(field=" + fj + ", valueProvider=" + fieldValueProvider + ")";
    }

    public FI(FJ fj, FieldValueProvider fieldValueProvider) {
        C8632dsu.c((Object) fj, "");
        C8632dsu.c((Object) fieldValueProvider, "");
        this.b = fj;
        this.c = fieldValueProvider;
    }
}
