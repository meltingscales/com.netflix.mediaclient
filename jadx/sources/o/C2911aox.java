package o;

/* renamed from: o.aox  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2911aox {
    private final AbstractC8997hK<String> d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final AbstractC8997hK<String> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2911aox) {
            C2911aox c2911aox = (C2911aox) obj;
            return C8632dsu.c((Object) this.e, (Object) c2911aox.e) && C8632dsu.c(this.d, c2911aox.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        AbstractC8997hK<String> abstractC8997hK = this.d;
        return "AddTitleProtectionInput(videoId=" + str + ", profileGuid=" + abstractC8997hK + ")";
    }

    public C2911aox(String str, AbstractC8997hK<String> abstractC8997hK) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = str;
        this.d = abstractC8997hK;
    }
}
