package o;

import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7939dav;
import o.InterfaceC3825bMa;
import o.aLX;

/* loaded from: classes5.dex */
public abstract class cYL extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    private String b;
    public drO<? extends TrackingInfo> c;
    public AppView d;
    private String f;
    private boolean g;
    private InterfaceC3825bMa.a h;
    private View.OnClickListener i;
    private String j;

    /* renamed from: o  reason: collision with root package name */
    private TrackingInfoHolder f13706o;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.a;
    }

    public final void a(TrackingInfoHolder trackingInfoHolder) {
        this.f13706o = trackingInfoHolder;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void aj_(String str) {
        this.f = str;
    }

    public void d(InterfaceC3825bMa.a aVar) {
        this.h = aVar;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final String k() {
        return this.f;
    }

    public final boolean l() {
        return this.g;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final String o() {
        return this.b;
    }

    public final View.OnClickListener q() {
        return this.i;
    }

    public final String r() {
        return this.j;
    }

    public final TrackingInfoHolder s() {
        return this.f13706o;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.c;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.d;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.cYL.a r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cYL.e(o.cYL$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        ViewGroup a2 = aVar.a();
        a2.setOnClickListener(null);
        a2.setClickable(false);
        aVar.b().setBackground(null);
        aVar.b().setForeground(null);
        aVar.b().onViewRecycled();
        aVar.e().setText((CharSequence) null);
        aVar.e().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        super.b((cYL) aVar);
    }

    /* loaded from: classes5.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "parent", "getParent()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "cta", "getCta()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, C7939dav.d.u, false, 2, null);
        private final dsZ b = bIF.d(this, C7939dav.d.l, false, 2, null);
        private final dsZ e = bIF.d(this, C7939dav.d.A, false, 2, null);
        private final dsZ c = bIF.d(this, C7939dav.d.d, false, 2, null);

        public final ViewGroup a() {
            return (ViewGroup) this.d.getValue(this, a[0]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.b.getValue(this, a[1]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.e.getValue(this, a[2]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.c.getValue(this, a[3]);
        }

        public final boolean c() {
            return b().isImageLoaded();
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setTag(aLX.a.e, Boolean.TRUE);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).c();
    }
}
