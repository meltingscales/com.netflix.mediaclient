package o;

import java.util.List;

/* renamed from: o.aoS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2880aoS {
    private final AbstractC8997hK<Boolean> a;
    private final AbstractC8997hK<Object> b;
    private final AbstractC8997hK<Boolean> c;
    private final AbstractC8997hK<String> d;
    private final AbstractC8997hK<List<Object>> e;
    private final String g;
    private final AbstractC8997hK<String> h;
    private final AbstractC8997hK<Boolean> i;
    private final AbstractC8997hK<Integer> j;

    public final AbstractC8997hK<Boolean> a() {
        return this.c;
    }

    public final AbstractC8997hK<String> b() {
        return this.d;
    }

    public final AbstractC8997hK<Object> c() {
        return this.b;
    }

    public final AbstractC8997hK<List<Object>> d() {
        return this.e;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2880aoS) {
            C2880aoS c2880aoS = (C2880aoS) obj;
            return C8632dsu.c((Object) this.g, (Object) c2880aoS.g) && C8632dsu.c(this.d, c2880aoS.d) && C8632dsu.c(this.h, c2880aoS.h) && C8632dsu.c(this.j, c2880aoS.j) && C8632dsu.c(this.i, c2880aoS.i) && C8632dsu.c(this.a, c2880aoS.a) && C8632dsu.c(this.c, c2880aoS.c) && C8632dsu.c(this.b, c2880aoS.b) && C8632dsu.c(this.e, c2880aoS.e);
        }
        return false;
    }

    public final String f() {
        return this.g;
    }

    public final AbstractC8997hK<Integer> g() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((((((((this.g.hashCode() * 31) + this.d.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + this.i.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public final AbstractC8997hK<Boolean> i() {
        return this.i;
    }

    public final AbstractC8997hK<String> j() {
        return this.h;
    }

    public String toString() {
        String str = this.g;
        AbstractC8997hK<String> abstractC8997hK = this.d;
        AbstractC8997hK<String> abstractC8997hK2 = this.h;
        AbstractC8997hK<Integer> abstractC8997hK3 = this.j;
        AbstractC8997hK<Boolean> abstractC8997hK4 = this.i;
        AbstractC8997hK<Boolean> abstractC8997hK5 = this.a;
        AbstractC8997hK<Boolean> abstractC8997hK6 = this.c;
        AbstractC8997hK<Object> abstractC8997hK7 = this.b;
        AbstractC8997hK<List<Object>> abstractC8997hK8 = this.e;
        return "EditProfileInput(id=" + str + ", avatarKey=" + abstractC8997hK + ", name=" + abstractC8997hK2 + ", maturityLevel=" + abstractC8997hK3 + ", isKids=" + abstractC8997hK4 + ", enableNextEpisodeAutoplay=" + abstractC8997hK5 + ", enablePreviewsAutoplay=" + abstractC8997hK6 + ", displayLanguage=" + abstractC8997hK7 + ", contentLanguages=" + abstractC8997hK8 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2880aoS(String str, AbstractC8997hK<String> abstractC8997hK, AbstractC8997hK<String> abstractC8997hK2, AbstractC8997hK<Integer> abstractC8997hK3, AbstractC8997hK<Boolean> abstractC8997hK4, AbstractC8997hK<Boolean> abstractC8997hK5, AbstractC8997hK<Boolean> abstractC8997hK6, AbstractC8997hK<? extends Object> abstractC8997hK7, AbstractC8997hK<? extends List<? extends Object>> abstractC8997hK8) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        C8632dsu.c((Object) abstractC8997hK7, "");
        C8632dsu.c((Object) abstractC8997hK8, "");
        this.g = str;
        this.d = abstractC8997hK;
        this.h = abstractC8997hK2;
        this.j = abstractC8997hK3;
        this.i = abstractC8997hK4;
        this.a = abstractC8997hK5;
        this.c = abstractC8997hK6;
        this.b = abstractC8997hK7;
        this.e = abstractC8997hK8;
    }
}
