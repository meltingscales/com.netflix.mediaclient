package o;

/* renamed from: o.cbt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6365cbt {
    private final String b;
    private final long c;
    private final String e;

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6365cbt) {
            C6365cbt c6365cbt = (C6365cbt) obj;
            return C8632dsu.c((Object) this.b, (Object) c6365cbt.b) && C8632dsu.c((Object) this.e, (Object) c6365cbt.e) && this.c == c6365cbt.c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.e;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        long j = this.c;
        return "RecaptchaResponse(token=" + str + ", error=" + str2 + ", responseTime=" + j + ")";
    }

    public C6365cbt(String str, String str2, long j) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.e = str2;
        this.c = j;
    }
}
