package o;

/* renamed from: o.auh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3212auh {
    private final String a;
    private final AbstractC8997hK<String> b;

    public final String d() {
        return this.a;
    }

    public final AbstractC8997hK<String> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3212auh) {
            C3212auh c3212auh = (C3212auh) obj;
            return C8632dsu.c((Object) this.a, (Object) c3212auh.a) && C8632dsu.c(this.b, c3212auh.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        AbstractC8997hK<String> abstractC8997hK = this.b;
        return "RemoveTitleProtectionInput(videoId=" + str + ", profileGuid=" + abstractC8997hK + ")";
    }

    public C3212auh(String str, AbstractC8997hK<String> abstractC8997hK) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = str;
        this.b = abstractC8997hK;
    }
}
