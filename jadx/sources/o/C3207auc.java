package o;

/* renamed from: o.auc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3207auc {
    private final String c;

    public final String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3207auc) && C8632dsu.c((Object) this.c, (Object) ((C3207auc) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        String str = this.c;
        return "RemoveProfileInput(id=" + str + ")";
    }

    public C3207auc(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }
}
