package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;
import o.InterfaceC3825bMa;
import o.aLX;

/* loaded from: classes4.dex */
public abstract class bLG extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    private AppView c = AppView.UNKNOWN;
    private Float d;
    public drO<? extends TrackingInfo> f;
    private CharSequence g;
    private String h;
    private Integer i;
    private InterfaceC3825bMa.a k;
    private String l;
    private View.OnClickListener m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private String f13519o;
    public static final d j = new d(null);
    public static final int b = 8;

    public final void A_(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.F;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public void a_(InterfaceC3825bMa.a aVar) {
        this.k = aVar;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        return this.c;
    }

    public void b_(AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.c = appView;
    }

    public final void c(Float f) {
        this.d = f;
    }

    public final void f(String str) {
        this.l = str;
    }

    public final void g(String str) {
        this.h = str;
    }

    public final void h(String str) {
        this.f13519o = str;
    }

    public final String k() {
        return this.h;
    }

    public final Integer l() {
        return this.i;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.k;
    }

    public final Float o() {
        return this.d;
    }

    public final String p() {
        return this.f13519o;
    }

    public final CharSequence q() {
        return this.g;
    }

    public final View.OnClickListener r() {
        return this.m;
    }

    public final boolean s() {
        return this.n;
    }

    public final String t() {
        return this.l;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("VideoModel");
        }
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.f;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.bLG.a r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bLG.e(o.bLG$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        NetflixImageView d2 = aVar.d();
        d2.setOnClickListener(null);
        d2.setClickable(false);
        aVar.d().setBackground(null);
        aVar.d().setForeground(null);
        aVar.d().removeAllOverlays();
        aVar.d().onViewRecycled();
        aVar.a((String) null);
        aVar.d().setTag(C3796bKz.a.A, null);
        super.b((bLG) aVar);
    }

    /* loaded from: classes4.dex */
    public static class a extends bIG {
        private ST d;
        private final dsZ e = bIF.d(this, C3796bKz.a.b, false, 2, null);
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final int b = 8;

        public final NetflixImageView d() {
            return (NetflixImageView) this.e.getValue(this, c[0]);
        }

        public final boolean a() {
            return d().isImageLoaded();
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            Context context = view.getContext();
            C8632dsu.a(context, "");
            ST st = new ST(context);
            Context context2 = view.getContext();
            C8632dsu.a(context2, "");
            bLF.e(context2, st, Integer.valueOf(d().getImageLoaderThemeProvider().get().e()));
            this.d = st;
            view.setTag(aLX.a.e, Boolean.TRUE);
        }

        public final void a(String str) {
            ST st = this.d;
            ST st2 = null;
            if (st == null) {
                C8632dsu.d("");
                st = null;
            }
            st.d(str);
            if (str == null) {
                d().setImageDrawable(null);
                return;
            }
            NetflixImageView d = d();
            ST st3 = this.d;
            if (st3 == null) {
                C8632dsu.d("");
            } else {
                st2 = st3;
            }
            d.setImageDrawable(st2);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).a();
    }
}
