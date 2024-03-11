package o;

import com.netflix.mediaclient.graphql.models.type.MyListGenreFilter;
import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;
import com.netflix.mediaclient.graphql.models.type.MyListSort;
import o.AbstractC8997hK;

/* renamed from: o.aqW  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2990aqW {
    private final AbstractC8997hK<MyListSort> a;
    private final AbstractC8997hK<String> b;
    private final AbstractC8997hK<MyListProgressFilter> c;
    private final AbstractC8997hK<Integer> d;
    private final AbstractC8997hK<MyListGenreFilter> e;

    public C2990aqW() {
        this(null, null, null, null, null, 31, null);
    }

    public final AbstractC8997hK<MyListGenreFilter> a() {
        return this.e;
    }

    public final AbstractC8997hK<MyListSort> b() {
        return this.a;
    }

    public final AbstractC8997hK<String> c() {
        return this.b;
    }

    public final AbstractC8997hK<Integer> d() {
        return this.d;
    }

    public final AbstractC8997hK<MyListProgressFilter> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2990aqW) {
            C2990aqW c2990aqW = (C2990aqW) obj;
            return C8632dsu.c(this.e, c2990aqW.e) && C8632dsu.c(this.c, c2990aqW.c) && C8632dsu.c(this.a, c2990aqW.a) && C8632dsu.c(this.d, c2990aqW.d) && C8632dsu.c(this.b, c2990aqW.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<MyListGenreFilter> abstractC8997hK = this.e;
        AbstractC8997hK<MyListProgressFilter> abstractC8997hK2 = this.c;
        AbstractC8997hK<MyListSort> abstractC8997hK3 = this.a;
        AbstractC8997hK<Integer> abstractC8997hK4 = this.d;
        AbstractC8997hK<String> abstractC8997hK5 = this.b;
        return "MyListInput(genreFilter=" + abstractC8997hK + ", progressFilter=" + abstractC8997hK2 + ", sort=" + abstractC8997hK3 + ", first=" + abstractC8997hK4 + ", after=" + abstractC8997hK5 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2990aqW(AbstractC8997hK<? extends MyListGenreFilter> abstractC8997hK, AbstractC8997hK<? extends MyListProgressFilter> abstractC8997hK2, AbstractC8997hK<? extends MyListSort> abstractC8997hK3, AbstractC8997hK<Integer> abstractC8997hK4, AbstractC8997hK<String> abstractC8997hK5) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        C8632dsu.c((Object) abstractC8997hK5, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
        this.a = abstractC8997hK3;
        this.d = abstractC8997hK4;
        this.b = abstractC8997hK5;
    }

    public /* synthetic */ C2990aqW(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, AbstractC8997hK abstractC8997hK5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4, (i & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK5);
    }
}
