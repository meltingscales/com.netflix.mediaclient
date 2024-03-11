package o;

/* renamed from: o.aqM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2980aqM {
    private final AbstractC8997hK<C2983aqP> a;
    private final String b;
    private final String c;
    private final String d;
    private final AbstractC8997hK<Integer> e;
    private final boolean i;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final AbstractC8997hK<C2983aqP> c() {
        return this.a;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2980aqM) {
            C2980aqM c2980aqM = (C2980aqM) obj;
            return C8632dsu.c((Object) this.c, (Object) c2980aqM.c) && C8632dsu.c((Object) this.d, (Object) c2980aqM.d) && C8632dsu.c((Object) this.b, (Object) c2980aqM.b) && this.i == c2980aqM.i && C8632dsu.c(this.a, c2980aqM.a) && C8632dsu.c(this.e, c2980aqM.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public final boolean j() {
        return this.i;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.b;
        boolean z = this.i;
        AbstractC8997hK<C2983aqP> abstractC8997hK = this.a;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.e;
        return "LolomoRowRefreshInput(lolomoId=" + str + ", listId=" + str2 + ", listContext=" + str3 + ", volatileList=" + z + ", annotations=" + abstractC8997hK + ", listIndex=" + abstractC8997hK2 + ")";
    }

    public C2980aqM(String str, String str2, String str3, boolean z, AbstractC8997hK<C2983aqP> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = str;
        this.d = str2;
        this.b = str3;
        this.i = z;
        this.a = abstractC8997hK;
        this.e = abstractC8997hK2;
    }
}
