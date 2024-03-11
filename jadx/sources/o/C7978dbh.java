package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.UpNextFeedSection;
import java.util.List;
import java.util.Set;
import o.AbstractC7916daY;

/* renamed from: o.dbh */
/* loaded from: classes5.dex */
public final class C7978dbh implements InterfaceC8962gc {
    private final Set<Integer> a;
    private final boolean b;
    private final List<Long> c;
    private final AbstractC8918fl<C4003bSq> d;
    private final AbstractC8918fl<C4003bSq> e;
    private final AbstractC7916daY h;
    private final Integer i;
    private final List<UpNextFeedSection> j;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7978dbh copy$default(C7978dbh c7978dbh, Integer num, List list, List list2, AbstractC7916daY abstractC7916daY, Set set, boolean z, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, int i, Object obj) {
        return c7978dbh.b((i & 1) != 0 ? c7978dbh.i : num, (i & 2) != 0 ? c7978dbh.j : list, (i & 4) != 0 ? c7978dbh.c : list2, (i & 8) != 0 ? c7978dbh.h : abstractC7916daY, (i & 16) != 0 ? c7978dbh.a : set, (i & 32) != 0 ? c7978dbh.b : z, (i & 64) != 0 ? c7978dbh.d : abstractC8918fl, (i & 128) != 0 ? c7978dbh.e : abstractC8918fl2);
    }

    public final List<Long> a() {
        return this.c;
    }

    public final Set<Integer> b() {
        return this.a;
    }

    public final C7978dbh b(Integer num, List<? extends UpNextFeedSection> list, List<Long> list2, AbstractC7916daY abstractC7916daY, Set<Integer> set, boolean z, AbstractC8918fl<C4003bSq> abstractC8918fl, AbstractC8918fl<C4003bSq> abstractC8918fl2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) abstractC7916daY, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        return new C7978dbh(num, list, list2, abstractC7916daY, set, z, abstractC8918fl, abstractC8918fl2);
    }

    public final AbstractC8918fl<C4003bSq> c() {
        return this.d;
    }

    public final Integer component1() {
        return this.i;
    }

    public final List<UpNextFeedSection> component2() {
        return this.j;
    }

    public final List<Long> component3() {
        return this.c;
    }

    public final AbstractC7916daY component4() {
        return this.h;
    }

    public final Set<Integer> component5() {
        return this.a;
    }

    public final boolean component6() {
        return this.b;
    }

    public final AbstractC8918fl<C4003bSq> component7() {
        return this.d;
    }

    public final AbstractC8918fl<C4003bSq> component8() {
        return this.e;
    }

    public final AbstractC7916daY d() {
        return this.h;
    }

    public final AbstractC8918fl<C4003bSq> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7978dbh) {
            C7978dbh c7978dbh = (C7978dbh) obj;
            return C8632dsu.c(this.i, c7978dbh.i) && C8632dsu.c(this.j, c7978dbh.j) && C8632dsu.c(this.c, c7978dbh.c) && C8632dsu.c(this.h, c7978dbh.h) && C8632dsu.c(this.a, c7978dbh.a) && this.b == c7978dbh.b && C8632dsu.c(this.d, c7978dbh.d) && C8632dsu.c(this.e, c7978dbh.e);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.i;
        return ((((((((((((((num == null ? 0 : num.hashCode()) * 31) + this.j.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final boolean i() {
        return this.b;
    }

    public final List<UpNextFeedSection> j() {
        return this.j;
    }

    public String toString() {
        Integer num = this.i;
        List<UpNextFeedSection> list = this.j;
        List<Long> list2 = this.c;
        AbstractC7916daY abstractC7916daY = this.h;
        Set<Integer> set = this.a;
        boolean z = this.b;
        AbstractC8918fl<C4003bSq> abstractC8918fl = this.d;
        AbstractC8918fl<C4003bSq> abstractC8918fl2 = this.e;
        return "UpNextFeedState(maxNumberSections=" + num + ", upNextFeedSections=" + list + ", feedPlaylistIds=" + list2 + ", lastFetchResult=" + abstractC7916daY + ", actionsHandled=" + set + ", isNewSession=" + z + ", continueWatchingVideos=" + abstractC8918fl + ", games=" + abstractC8918fl2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7978dbh(Integer num, List<? extends UpNextFeedSection> list, List<Long> list2, AbstractC7916daY abstractC7916daY, Set<Integer> set, boolean z, AbstractC8918fl<C4003bSq> abstractC8918fl, AbstractC8918fl<C4003bSq> abstractC8918fl2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) abstractC7916daY, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        this.i = num;
        this.j = list;
        this.c = list2;
        this.h = abstractC7916daY;
        this.a = set;
        this.b = z;
        this.d = abstractC8918fl;
        this.e = abstractC8918fl2;
    }

    public /* synthetic */ C7978dbh(Integer num, List list, List list2, AbstractC7916daY abstractC7916daY, Set set, boolean z, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : num, list, list2, abstractC7916daY, set, z, (i & 64) != 0 ? C8974go.e : abstractC8918fl, (i & 128) != 0 ? C8974go.e : abstractC8918fl2);
    }

    public final Status h() {
        if (!this.j.isEmpty()) {
            return new NetflixStatus(StatusCode.OK, 0);
        }
        if (this.h instanceof AbstractC7916daY.d) {
            return new NetflixStatus(StatusCode.NETWORK_ERROR, 0);
        }
        return null;
    }
}
