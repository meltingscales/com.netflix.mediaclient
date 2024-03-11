package o;

import java.util.List;

/* renamed from: o.Gd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0880Gd implements FJ {
    private final String b;
    private final List<FZ> c;
    private final String d;

    public final List<FZ> a() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    @Override // o.FJ
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0880Gd) {
            C0880Gd c0880Gd = (C0880Gd) obj;
            return C8632dsu.c((Object) this.d, (Object) c0880Gd.d) && C8632dsu.c((Object) this.b, (Object) c0880Gd.b) && C8632dsu.c(this.c, c0880Gd.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        String str = this.b;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        List<FZ> list = this.c;
        return "StringField(id=" + str + ", initialValue=" + str2 + ", validations=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0880Gd(String str, String str2, List<? extends FZ> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.d = str;
        this.b = str2;
        this.c = list;
    }
}
