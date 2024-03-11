package o;

/* loaded from: classes3.dex */
public final class HW extends HY {
    private final String e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HW) && C8632dsu.c((Object) this.e, (Object) ((HW) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        return "JsonGraphPrimitiveString(value=" + str + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HW(String str) {
        super(null);
        C8632dsu.c((Object) str, "");
        this.e = str;
    }
}
