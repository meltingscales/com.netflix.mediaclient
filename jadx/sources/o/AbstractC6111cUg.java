package o;

import com.netflix.mediaclient.ui.search.v2.SearchUIComponents;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6035cRo;

/* renamed from: o.cUg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6111cUg extends AbstractC3336ax<e> {
    public String b;
    private String c;
    private String d;
    private String i;

    public final void ae_(String str) {
        this.c = str;
    }

    public final void af_(String str) {
        this.d = str;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void c(String str) {
        this.i = str;
    }

    public final String i() {
        return this.c;
    }

    public final String l() {
        return this.i;
    }

    public final String n() {
        return this.d;
    }

    public final String m() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        String str = this.d;
        if (str == null || str.length() == 0) {
            eVar.d().setVisibility(8);
        } else {
            eVar.d().setVisibility(0);
            eVar.d().setText(this.d);
        }
        eVar.b().setText(m());
    }

    @Override // o.AbstractC3073as
    public int a() {
        if (C8632dsu.c((Object) this.c, (Object) "InQuerySearch")) {
            return C6035cRo.e.d;
        }
        if (C8632dsu.c((Object) this.c, (Object) "QuerySearch")) {
            SearchUIComponents.d dVar = SearchUIComponents.a;
            String str = this.i;
            C8632dsu.d((Object) str);
            return dVar.c(str) == SearchUIComponents.b ? C6035cRo.e.l : C6035cRo.e.m;
        }
        return C6035cRo.e.e;
    }

    /* renamed from: o.cUg$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "secondaryTitleView", "getSecondaryTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C6035cRo.d.q, false, 2, null);
        private final dsZ e = bIF.d(this, C6035cRo.d.l, false, 2, null);

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, c[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.e.getValue(this, c[1]);
        }
    }
}
