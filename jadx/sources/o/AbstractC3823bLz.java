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

/* renamed from: o.bLz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3823bLz extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> b;
    private String c;
    private AppView d = AppView.UNKNOWN;
    private CharSequence f;
    private View.OnClickListener g;
    private String h;
    private String i;
    private InterfaceC3825bMa.a j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.p;
    }

    public void a_(AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.d = appView;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        return this.d;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(String str) {
        this.i = str;
    }

    public void c(InterfaceC3825bMa.a aVar) {
        this.j = aVar;
    }

    public final void d(CharSequence charSequence) {
        this.f = charSequence;
    }

    public final void d_(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final CharSequence k() {
        return this.f;
    }

    public final View.OnClickListener l() {
        return this.g;
    }

    public final void m_(String str) {
        this.c = str;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.j;
    }

    public final String o() {
        return this.c;
    }

    public final String p() {
        return this.i;
    }

    public final String r() {
        return this.h;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.b;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC3823bLz.a r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3823bLz.e(o.bLz$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        NetflixImageView c = aVar.c();
        c.setOnClickListener(null);
        c.setClickable(false);
        aVar.c().onViewRecycled();
        aVar.d(null);
        super.b((AbstractC3823bLz) aVar);
    }

    /* renamed from: o.bLz$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final int c = 8;
        private ST d;
        private final dsZ e = bIF.d(this, C3796bKz.a.f13516o, false, 2, null);

        public final NetflixImageView c() {
            return (NetflixImageView) this.e.getValue(this, b[0]);
        }

        public final boolean e() {
            return c().isImageLoaded();
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            view.setTag(aLX.a.e, Boolean.TRUE);
            view.setTag(aLX.a.h, 2);
            Context context = view.getContext();
            C8632dsu.a(context, "");
            ST st = new ST(context);
            Context context2 = view.getContext();
            C8632dsu.a(context2, "");
            bLF.e(context2, st, Integer.valueOf(c().getImageLoaderThemeProvider().get().e()));
            this.d = st;
        }

        public final void d(String str) {
            ST st = this.d;
            ST st2 = null;
            if (st == null) {
                C8632dsu.d("");
                st = null;
            }
            st.d(str);
            if (str == null) {
                c().setImageDrawable(null);
                return;
            }
            NetflixImageView c2 = c();
            ST st3 = this.d;
            if (st3 == null) {
                C8632dsu.d("");
            } else {
                st2 = st3;
            }
            c2.setImageDrawable(st2);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).e();
    }
}
