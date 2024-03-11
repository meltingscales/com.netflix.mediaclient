package o;

import o.AbstractC8997hK;

/* renamed from: o.axs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3381axs {
    private final AbstractC8997hK<String> a;
    private final String b;
    private final AbstractC8997hK<String> c;
    private final AbstractC8997hK<String> d;

    public final AbstractC8997hK<String> a() {
        return this.d;
    }

    public final AbstractC8997hK<String> b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final AbstractC8997hK<String> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3381axs) {
            C3381axs c3381axs = (C3381axs) obj;
            return C8632dsu.c((Object) this.b, (Object) c3381axs.b) && C8632dsu.c(this.c, c3381axs.c) && C8632dsu.c(this.d, c3381axs.d) && C8632dsu.c(this.a, c3381axs.a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        AbstractC8997hK<String> abstractC8997hK = this.c;
        AbstractC8997hK<String> abstractC8997hK2 = this.d;
        AbstractC8997hK<String> abstractC8997hK3 = this.a;
        return "VideoPlaylistInput(videoId=" + str + ", trackId=" + abstractC8997hK + ", signature=" + abstractC8997hK2 + ", profileGuid=" + abstractC8997hK3 + ")";
    }

    public C3381axs(String str, AbstractC8997hK<String> abstractC8997hK, AbstractC8997hK<String> abstractC8997hK2, AbstractC8997hK<String> abstractC8997hK3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        this.b = str;
        this.c = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.a = abstractC8997hK3;
    }

    public /* synthetic */ C3381axs(String str, AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3);
    }
}
