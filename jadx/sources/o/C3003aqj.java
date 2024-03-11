package o;

import com.netflix.mediaclient.graphql.models.type.BillboardType;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.aqj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3003aqj {
    private final AbstractC8997hK<String> a;
    private final AbstractC8997hK<List<String>> b;
    private final AbstractC8997hK<List<String>> c;
    private final AbstractC8997hK<List<BillboardType>> d;
    private final AbstractC8997hK<String> e;
    private final AbstractC8997hK<String> j;

    public C3003aqj() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C3003aqj e(C3003aqj c3003aqj, AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, int i, Object obj) {
        AbstractC8997hK<List<String>> abstractC8997hK7 = abstractC8997hK;
        if ((i & 1) != 0) {
            abstractC8997hK7 = c3003aqj.b;
        }
        AbstractC8997hK<List<BillboardType>> abstractC8997hK8 = abstractC8997hK2;
        if ((i & 2) != 0) {
            abstractC8997hK8 = c3003aqj.d;
        }
        AbstractC8997hK abstractC8997hK9 = abstractC8997hK8;
        AbstractC8997hK<List<String>> abstractC8997hK10 = abstractC8997hK3;
        if ((i & 4) != 0) {
            abstractC8997hK10 = c3003aqj.c;
        }
        AbstractC8997hK abstractC8997hK11 = abstractC8997hK10;
        AbstractC8997hK<String> abstractC8997hK12 = abstractC8997hK4;
        if ((i & 8) != 0) {
            abstractC8997hK12 = c3003aqj.e;
        }
        AbstractC8997hK abstractC8997hK13 = abstractC8997hK12;
        AbstractC8997hK<String> abstractC8997hK14 = abstractC8997hK5;
        if ((i & 16) != 0) {
            abstractC8997hK14 = c3003aqj.a;
        }
        AbstractC8997hK abstractC8997hK15 = abstractC8997hK14;
        AbstractC8997hK<String> abstractC8997hK16 = abstractC8997hK6;
        if ((i & 32) != 0) {
            abstractC8997hK16 = c3003aqj.j;
        }
        return c3003aqj.b(abstractC8997hK7, abstractC8997hK9, abstractC8997hK11, abstractC8997hK13, abstractC8997hK15, abstractC8997hK16);
    }

    public final AbstractC8997hK<List<BillboardType>> a() {
        return this.d;
    }

    public final C3003aqj b(AbstractC8997hK<? extends List<String>> abstractC8997hK, AbstractC8997hK<? extends List<? extends BillboardType>> abstractC8997hK2, AbstractC8997hK<? extends List<String>> abstractC8997hK3, AbstractC8997hK<String> abstractC8997hK4, AbstractC8997hK<String> abstractC8997hK5, AbstractC8997hK<String> abstractC8997hK6) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        return new C3003aqj(abstractC8997hK, abstractC8997hK2, abstractC8997hK3, abstractC8997hK4, abstractC8997hK5, abstractC8997hK6);
    }

    public final AbstractC8997hK<String> b() {
        return this.e;
    }

    public final AbstractC8997hK<List<String>> c() {
        return this.b;
    }

    public final AbstractC8997hK<String> d() {
        return this.a;
    }

    public final AbstractC8997hK<List<String>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3003aqj) {
            C3003aqj c3003aqj = (C3003aqj) obj;
            return C8632dsu.c(this.b, c3003aqj.b) && C8632dsu.c(this.d, c3003aqj.d) && C8632dsu.c(this.c, c3003aqj.c) && C8632dsu.c(this.e, c3003aqj.e) && C8632dsu.c(this.a, c3003aqj.a) && C8632dsu.c(this.j, c3003aqj.j);
        }
        return false;
    }

    public final AbstractC8997hK<String> f() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.j.hashCode();
    }

    public String toString() {
        AbstractC8997hK<List<String>> abstractC8997hK = this.b;
        AbstractC8997hK<List<BillboardType>> abstractC8997hK2 = this.d;
        AbstractC8997hK<List<String>> abstractC8997hK3 = this.c;
        AbstractC8997hK<String> abstractC8997hK4 = this.e;
        AbstractC8997hK<String> abstractC8997hK5 = this.a;
        AbstractC8997hK<String> abstractC8997hK6 = this.j;
        return "LolomoCxuiAnnotations(billboardTypesSupported=" + abstractC8997hK + ", supportedBillboardTypes=" + abstractC8997hK2 + ", supportedLolomoFeatures=" + abstractC8997hK3 + ", idiom=" + abstractC8997hK4 + ", platform=" + abstractC8997hK5 + ", uiVersion=" + abstractC8997hK6 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3003aqj(AbstractC8997hK<? extends List<String>> abstractC8997hK, AbstractC8997hK<? extends List<? extends BillboardType>> abstractC8997hK2, AbstractC8997hK<? extends List<String>> abstractC8997hK3, AbstractC8997hK<String> abstractC8997hK4, AbstractC8997hK<String> abstractC8997hK5, AbstractC8997hK<String> abstractC8997hK6) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        C8632dsu.c((Object) abstractC8997hK6, "");
        this.b = abstractC8997hK;
        this.d = abstractC8997hK2;
        this.c = abstractC8997hK3;
        this.e = abstractC8997hK4;
        this.a = abstractC8997hK5;
        this.j = abstractC8997hK6;
    }

    public /* synthetic */ C3003aqj(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, AbstractC8997hK abstractC8997hK6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5, (i & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK6);
    }
}
