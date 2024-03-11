package com.netflix.mediaclient.ui.search.napa;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC6078cTd;
import o.AbstractC9944zY;
import o.C1045Mp;
import o.C1180Rt;
import o.C1204Sr;
import o.C1619aI;
import o.C6035cRo;
import o.C6089cTl;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1659aJm;
import o.InterfaceC8639dta;
import o.RG;
import o.cRE;
import o.cRJ;
import o.dsA;
import o.dsS;
import o.dsW;
import o.dtC;

/* loaded from: classes4.dex */
public class SearchUIViewOnNapa extends AbstractC9944zY<AbstractC6078cTd> implements LifecycleObserver, cRE {
    static final /* synthetic */ dtC<Object>[] c;
    public static final b e;
    private static byte e$ss2$3618 = 0;
    private static int q = 0;
    private static int r = 1;
    private SearchEpoxyController a;
    private final AppView b;
    private final int d;
    private final RG f;
    private C6089cTl g;
    private boolean h;
    private final Fragment i;
    private RecyclerView j;
    private final C1204Sr k;
    private final ViewGroup l;
    private final View m;
    private final cRJ n;

    /* renamed from: o  reason: collision with root package name */
    private final C1204Sr f13322o;
    private final View p;
    private final InterfaceC8639dta s;

    static void C() {
        e$ss2$3618 = (byte) 24;
    }

    private final int h() {
        return C6035cRo.d.n;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.p;
    }

    public int g() {
        return C6035cRo.e.t;
    }

    protected AppView l() {
        return this.b;
    }

    public final SearchEpoxyController m() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RG p() {
        return this.f;
    }

    public final RecyclerView q() {
        return this.j;
    }

    public final View r() {
        return this.m;
    }

    public final Fragment s() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        return this.h;
    }

    public final ViewGroup w() {
        return this.l;
    }

    public final cRJ x() {
        return this.n;
    }

    /* loaded from: classes4.dex */
    public static final class a extends dsS<Boolean> {
        final /* synthetic */ SearchUIViewOnNapa e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, SearchUIViewOnNapa searchUIViewOnNapa) {
            super(obj);
            this.e = searchUIViewOnNapa;
        }

        @Override // o.dsS
        public void afterChange(dtC<?> dtc, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) dtc, "");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() != booleanValue) {
                this.e.b(booleanValue);
            }
        }
    }

    @Override // o.cRE
    public /* synthetic */ void a(AbstractC6078cTd abstractC6078cTd) {
        b((SearchUIViewOnNapa) abstractC6078cTd);
    }

    public /* synthetic */ SearchUIViewOnNapa(ViewGroup viewGroup, AppView appView, C9935zP c9935zP, cRJ crj, Fragment fragment, SearchEpoxyController.b bVar, int i, C8627dsp c8627dsp) {
        this(viewGroup, (i & 2) != 0 ? AppView.searchTitleResults : appView, c9935zP, crj, fragment, bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchUIViewOnNapa(ViewGroup viewGroup, AppView appView, C9935zP c9935zP, cRJ crj, Fragment fragment, SearchEpoxyController.b bVar) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) crj, "");
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) bVar, "");
        this.b = appView;
        this.n = crj;
        this.i = fragment;
        this.h = true;
        View b2 = b(viewGroup);
        this.m = b2;
        View findViewById = b2.findViewById(h());
        C8632dsu.a(findViewById, "");
        this.p = findViewById;
        this.d = e().getId();
        View findViewById2 = b2.findViewById(h());
        C8632dsu.a(findViewById2, "");
        this.j = (RecyclerView) findViewById2;
        this.f = new RG(b2, new C1180Rt.d() { // from class: o.cRW
            @Override // o.C1180Rt.d
            public final void e() {
                SearchUIViewOnNapa.b(SearchUIViewOnNapa.this);
            }
        });
        View findViewById3 = b2.findViewById(R.g.fM);
        C8632dsu.a(findViewById3, "");
        this.l = (ViewGroup) findViewById3;
        this.f13322o = (C1204Sr) b2.findViewById(R.g.cK);
        this.k = (C1204Sr) b2.findViewById(R.g.cI);
        Context context = b2.getContext();
        C8632dsu.a(context, "");
        this.a = new SearchEpoxyController(bVar, this, c9935zP, context);
        dsW dsw = dsW.a;
        this.s = new a(Boolean.TRUE, this);
        j();
        InterfaceC1659aJm.b.e().c(this.j, l(), "search_scroll");
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("SearchUIView_Ab22078");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SearchUIViewOnNapa searchUIViewOnNapa) {
        C8632dsu.c((Object) searchUIViewOnNapa, "");
        searchUIViewOnNapa.b((SearchUIViewOnNapa) AbstractC6078cTd.x.a);
    }

    static {
        C();
        c = new dtC[]{dsA.b(new MutablePropertyReference1Impl(SearchUIViewOnNapa.class, "visibility", "getVisibility()Z", 0))};
        e = new b(null);
    }

    public final void a(boolean z) {
        this.s.setValue(this, c[0], Boolean.valueOf(z));
    }

    public View b(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(g(), viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    public void j() {
        RecyclerView recyclerView = this.j;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 instanceof EpoxyRecyclerView) {
            C8632dsu.d(recyclerView2);
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) recyclerView2;
            this.a.setShowHeader(false);
            epoxyRecyclerView.setController(this.a);
            this.j.setItemAnimator(null);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(epoxyRecyclerView.getContext(), 1, 1, false);
            gridLayoutManager.setSpanSizeLookup(this.a.getSpanSizeLookup());
            epoxyRecyclerView.setLayoutManager(gridLayoutManager);
            C1619aI c1619aI = new C1619aI();
            c1619aI.b((Integer) 50);
            c1619aI.d(this.j);
            epoxyRecyclerView.addOnScrollListener(new c());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.OnScrollListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
            if (i == 0) {
                SearchUIViewOnNapa.this.n();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            if (C8153dex.l()) {
                SearchUIViewOnNapa.this.b((SearchUIViewOnNapa) new AbstractC6078cTd.s(i2));
            }
        }
    }

    private final void A() {
        RecyclerView recyclerView = this.j;
        if (recyclerView instanceof EpoxyRecyclerView) {
            C8632dsu.d(recyclerView);
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) recyclerView;
            epoxyRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new e(epoxyRecyclerView, this));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ SearchUIViewOnNapa c;
        final /* synthetic */ EpoxyRecyclerView d;

        e(EpoxyRecyclerView epoxyRecyclerView, SearchUIViewOnNapa searchUIViewOnNapa) {
            this.d = epoxyRecyclerView;
            this.c = searchUIViewOnNapa;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.c.q().getChildCount() > 0 && this.c.q().getVisibility() == 0 && this.c.s().isVisible()) {
                this.c.n();
            }
        }
    }

    public void a(C6089cTl c6089cTl) {
        if (c6089cTl == null || c6089cTl.h().isEmpty()) {
            i();
            return;
        }
        A();
        this.f.b(false);
        this.g = c6089cTl;
        e(c6089cTl);
        E();
        this.j.requestLayout();
    }

    public final void n() {
        C6089cTl c6089cTl = this.g;
        if (c6089cTl != null) {
            this.n.a(c6089cTl);
        }
    }

    public void D() {
        this.n.c();
    }

    public final void B() {
        this.n.b();
    }

    private final void e(C6089cTl c6089cTl) {
        this.a.setData(c6089cTl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009a, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
        r11 = new android.text.SpannableString(r1);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r4, 0, r1.length(), java.lang.Object.class, r11, 0);
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cf, code lost:
        r6 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa.r
            int r2 = r2 + 41
            int r3 = r2 % 128
            com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa.q = r3
            int r2 = r2 % r1
            o.RG r2 = r0.f
            r3 = 0
            r2.b(r3)
            o.Sr r2 = r0.f13322o
            int r4 = com.netflix.mediaclient.ui.search.SearchUtils.b()
            android.content.Context r5 = r2.getContext()
            java.lang.String r6 = r5.getString(r4)
            java.lang.String r7 = "'!#+"
            boolean r8 = r6.startsWith(r7)
            r9 = 1
            r10 = 4
            if (r8 == 0) goto L5e
            java.lang.String r6 = r6.substring(r10)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            r0.F(r6, r8)
            r6 = r8[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.CharSequence r4 = r5.getText(r4)
            boolean r5 = r4 instanceof android.text.Spanned
            if (r5 == 0) goto L5e
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r6)
            r11 = r4
            android.text.SpannedString r11 = (android.text.SpannedString) r11
            r12 = 0
            int r13 = r6.length()
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r4 = r5
            android.text.SpannableString r4 = (android.text.SpannableString) r4
            r16 = 0
            r15 = r5
            android.text.TextUtils.copySpansFrom(r11, r12, r13, r14, r15, r16)
            r6 = r5
        L5e:
            r2.setText(r6)
            o.Sr r2 = r0.k
            int r4 = com.netflix.mediaclient.ui.search.SearchUtils.c()
            android.content.Context r5 = r2.getContext()
            java.lang.String r6 = r5.getString(r4)
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto Ld0
            int r7 = com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa.r
            int r7 = r7 + 115
            int r8 = r7 % 128
            com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa.q = r8
            int r7 = r7 % r1
            if (r7 == 0) goto L9d
            java.lang.String r1 = r6.substring(r10)
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r0.F(r1, r6)
            r1 = r6[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.CharSequence r4 = r5.getText(r4)
            boolean r5 = r4 instanceof android.text.Spanned
            r6 = 22
            int r6 = r6 / r3
            if (r5 == 0) goto Lcf
            goto Lb6
        L9d:
            java.lang.String r1 = r6.substring(r10)
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r0.F(r1, r6)
            r1 = r6[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.CharSequence r4 = r5.getText(r4)
            boolean r5 = r4 instanceof android.text.Spanned
            if (r5 == 0) goto Lcf
        Lb6:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r1)
            r5 = r4
            android.text.SpannedString r5 = (android.text.SpannedString) r5
            r6 = 0
            int r7 = r1.length()
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r1 = r11
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            r10 = 0
            r9 = r11
            android.text.TextUtils.copySpansFrom(r5, r6, r7, r8, r9, r10)
            r6 = r11
            goto Ld0
        Lcf:
            r6 = r1
        Ld0:
            r2.setText(r6)
            android.view.ViewGroup r1 = r0.l
            r1.setVisibility(r3)
            r17.f()
            r17.D()
            r17.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa.i():void");
    }

    public void o() {
        int i = 2 % 2;
        this.f.a(true);
        C1204Sr c1204Sr = this.f13322o;
        int e2 = SearchUtils.e();
        Context context = c1204Sr.getContext();
        String string = context.getString(e2);
        if (string.startsWith("'!#+")) {
            int i2 = r + 33;
            q = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            F(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(e2);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            }
        }
        c1204Sr.setText(string);
        C1204Sr c1204Sr2 = this.k;
        int a2 = SearchUtils.a();
        Context context2 = c1204Sr2.getContext();
        String string2 = context2.getString(a2);
        if (string2.startsWith("'!#+")) {
            int i4 = r + 77;
            q = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                F(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                boolean z = context2.getText(a2) instanceof Spanned;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr3 = new Object[1];
            F(string2.substring(4), objArr3);
            string2 = ((String) objArr3[0]).intern();
            CharSequence text2 = context2.getText(a2);
            if (text2 instanceof Spanned) {
                SpannableString spannableString2 = new SpannableString(string2);
                TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                string2 = spannableString2;
            }
        }
        c1204Sr2.setText(string2);
        this.l.setVisibility(8);
        f();
        D();
        B();
    }

    private final void E() {
        this.j.setVisibility(0);
        this.l.setVisibility(8);
    }

    private final void f() {
        this.j.setVisibility(4);
    }

    public final void z() {
        this.f.a(true);
    }

    public final void u() {
        this.f.b(true);
    }

    public void k() {
        f();
        this.f.c(false);
        D();
        B();
    }

    protected final void b(boolean z) {
        if (z) {
            return;
        }
        D();
    }

    private void F(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3618);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
