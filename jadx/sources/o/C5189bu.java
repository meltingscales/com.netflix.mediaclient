package o;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8654dtp;
import o.InterfaceC5136bt;

/* renamed from: o.bu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5189bu<P extends InterfaceC5136bt> extends RecyclerView.OnScrollListener {
    public static final b e = new b(null);
    private C8646dth a;
    private final int b;
    private C8654dtp c;
    private final Z d;
    private final Map<Class<? extends AbstractC3073as<?>>, AbstractC4765bm<?, ?, ? extends P>> f;
    private final C5030br<P> g;
    private int h;
    private int i;
    private final C5083bs j;

    private final boolean c(int i) {
        return i == -1 || i >= this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C8632dsu.c((Object) recyclerView, "");
        this.i = i;
    }

    private C5189bu(Z z, drO<? extends P> dro, drX<? super Context, ? super RuntimeException, dpR> drx, int i, List<? extends AbstractC4765bm<?, ?, ? extends P>> list) {
        int d;
        int e2;
        int b2;
        this.d = z;
        this.b = i;
        C8654dtp.d dVar = C8654dtp.e;
        this.c = dVar.d();
        this.a = dVar.d();
        this.h = -1;
        d = C8572dqo.d(list, 10);
        e2 = dqD.e(d);
        b2 = C8657dts.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC4765bm) obj).e(), obj);
        }
        this.f = linkedHashMap;
        this.g = new C5030br<>(this.b, dro);
        this.j = new C5083bs(this.d, drx);
        if (this.b > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.b).toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5189bu(o.AbstractC2914ap r8, o.drO<? extends P> r9, o.drX<? super android.content.Context, ? super java.lang.RuntimeException, o.dpR> r10, int r11, java.util.List<? extends o.AbstractC4765bm<?, ?, ? extends P>> r12) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r12, r0)
            o.ar r2 = r8.getAdapter()
            o.C8632dsu.a(r2, r0)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5189bu.<init>(o.ap, o.drO, o.drX, int, java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5189bu(AbstractC2596aj abstractC2596aj, drO<? extends P> dro, drX<? super Context, ? super RuntimeException, dpR> drx, int i, List<? extends AbstractC4765bm<?, ?, ? extends P>> list) {
        this((Z) abstractC2596aj, (drO) dro, drx, i, (List) list);
        C8632dsu.c((Object) abstractC2596aj, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) list, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Set<Number> i3;
        C8632dsu.c((Object) recyclerView, "");
        if ((i == 0 && i2 == 0) || e(i) || e(i2)) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = false;
        this.h = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C8632dsu.d(layoutManager);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (c(findFirstVisibleItemPosition) || c(findLastVisibleItemPosition)) {
            C8654dtp.d dVar = C8654dtp.e;
            this.c = dVar.d();
            this.a = dVar.d();
            return;
        }
        C8654dtp c8654dtp = new C8654dtp(findFirstVisibleItemPosition, findLastVisibleItemPosition);
        if (C8632dsu.c(c8654dtp, this.c)) {
            return;
        }
        C8646dth e2 = e(findFirstVisibleItemPosition, findLastVisibleItemPosition, (c8654dtp.d() > this.c.d() || c8654dtp.e() > this.c.e()) ? true : true);
        i3 = C8576dqs.i(e2, this.a);
        for (Number number : i3) {
            b(number.intValue());
        }
        this.c = c8654dtp;
        this.a = e2;
    }

    private final boolean e(int i) {
        return Math.abs(i) > 75;
    }

    private final C8646dth e(int i, int i2, boolean z) {
        int i3 = z ? i2 + 1 : i - 1;
        int i4 = this.b;
        return C8646dth.c.a(a(i3), a((z ? i4 - 1 : 1 - i4) + i3), z ? 1 : -1);
    }

    private final int a(int i) {
        return Math.min(this.h - 1, Math.max(i, 0));
    }

    private final void b(int i) {
        AbstractC3073as<?> d = C1969aV.d(this.d, i);
        if (!(d instanceof AbstractC3073as)) {
            d = null;
        }
        if (d == null) {
            return;
        }
        AbstractC4765bm<?, ?, ? extends P> abstractC4765bm = this.f.get(d.getClass());
        AbstractC4765bm<?, ?, ? extends P> abstractC4765bm2 = abstractC4765bm instanceof AbstractC4765bm ? abstractC4765bm : null;
        if (abstractC4765bm2 == null) {
            return;
        }
        for (C5454bz<? extends Object> c5454bz : this.j.a(abstractC4765bm2, d, i)) {
            abstractC4765bm2.a(d, this.g.a(), c5454bz);
        }
    }

    public final void d() {
        this.g.d();
    }

    /* renamed from: o.bu$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final <P extends InterfaceC5136bt> C5189bu<P> a(AbstractC2914ap abstractC2914ap, drO<? extends P> dro, drX<? super Context, ? super RuntimeException, dpR> drx, int i, List<? extends AbstractC4765bm<? extends AbstractC3073as<?>, ? extends InterfaceC5295bw, ? extends P>> list) {
            C8632dsu.c((Object) abstractC2914ap, "");
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) drx, "");
            C8632dsu.c((Object) list, "");
            return new C5189bu<>(abstractC2914ap, dro, drx, i, list);
        }

        public final <P extends InterfaceC5136bt> C5189bu<P> a(AbstractC2596aj abstractC2596aj, drO<? extends P> dro, drX<? super Context, ? super RuntimeException, dpR> drx, int i, List<? extends AbstractC4765bm<? extends AbstractC3073as<?>, ? extends InterfaceC5295bw, ? extends P>> list) {
            C8632dsu.c((Object) abstractC2596aj, "");
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) drx, "");
            C8632dsu.c((Object) list, "");
            return new C5189bu<>(abstractC2596aj, (drO) dro, drx, i, (List) list);
        }
    }
}
