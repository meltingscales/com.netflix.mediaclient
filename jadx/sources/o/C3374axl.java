package o;

import com.netflix.mediaclient.graphql.models.type.SubtitleDeviceGroup;

/* renamed from: o.axl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3374axl {
    private final AbstractC8997hK<C3225auu> a;
    private final AbstractC8997hK<C3183auD> b;
    private final AbstractC8997hK<SubtitleDeviceGroup> c;
    private final AbstractC8997hK<C3224aut> d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final AbstractC8997hK<C3183auD> b() {
        return this.b;
    }

    public final AbstractC8997hK<SubtitleDeviceGroup> c() {
        return this.c;
    }

    public final AbstractC8997hK<C3224aut> d() {
        return this.d;
    }

    public final AbstractC8997hK<C3225auu> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3374axl) {
            C3374axl c3374axl = (C3374axl) obj;
            return C8632dsu.c((Object) this.e, (Object) c3374axl.e) && C8632dsu.c(this.a, c3374axl.a) && C8632dsu.c(this.c, c3374axl.c) && C8632dsu.c(this.d, c3374axl.d) && C8632dsu.c(this.b, c3374axl.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        AbstractC8997hK<C3225auu> abstractC8997hK = this.a;
        AbstractC8997hK<SubtitleDeviceGroup> abstractC8997hK2 = this.c;
        AbstractC8997hK<C3224aut> abstractC8997hK3 = this.d;
        AbstractC8997hK<C3183auD> abstractC8997hK4 = this.b;
        return "UpdateSubtitleAppearanceInput(id=" + str + ", background=" + abstractC8997hK + ", deviceGroup=" + abstractC8997hK2 + ", text=" + abstractC8997hK3 + ", window=" + abstractC8997hK4 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3374axl(String str, AbstractC8997hK<C3225auu> abstractC8997hK, AbstractC8997hK<? extends SubtitleDeviceGroup> abstractC8997hK2, AbstractC8997hK<C3224aut> abstractC8997hK3, AbstractC8997hK<C3183auD> abstractC8997hK4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        this.e = str;
        this.a = abstractC8997hK;
        this.c = abstractC8997hK2;
        this.d = abstractC8997hK3;
        this.b = abstractC8997hK4;
    }
}
