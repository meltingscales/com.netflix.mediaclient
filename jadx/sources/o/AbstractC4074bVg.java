package o;

import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bVg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4074bVg extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    private String b;
    public AppView c;
    public drO<? extends TrackingInfo> d;
    private String f;
    private String g;
    private View.OnClickListener h;
    private boolean i;
    private InterfaceC3825bMa.a j;

    /* renamed from: o  reason: collision with root package name */
    private TrackingInfoHolder f13549o;

    public final void F_(String str) {
        this.g = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.p;
    }

    public final void a(TrackingInfoHolder trackingInfoHolder) {
        this.f13549o = trackingInfoHolder;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void c(String str) {
        this.f = str;
    }

    public void c_(InterfaceC3825bMa.a aVar) {
        this.j = aVar;
    }

    public final void d(boolean z) {
        this.i = z;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return this.f;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.j;
    }

    public final boolean o() {
        return this.i;
    }

    public final View.OnClickListener q() {
        return this.h;
    }

    public final String s() {
        return this.g;
    }

    public final TrackingInfoHolder t() {
        return this.f13549o;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.d;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
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
    public void e(o.AbstractC4074bVg.b r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4074bVg.e(o.bVg$b):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        ViewGroup d = bVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        bVar.c().setBackground(null);
        bVar.c().setForeground(null);
        bVar.c().onViewRecycled();
        bVar.a().setText((CharSequence) null);
        bVar.a().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        super.b((AbstractC4074bVg) bVar);
    }

    /* renamed from: o.bVg$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "parent", "getParent()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(b.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "cta", "getCta()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ c = bIF.d(this, C4022bTi.e.t, false, 2, null);
        private final dsZ e = bIF.d(this, C4022bTi.e.k, false, 2, null);
        private final dsZ b = bIF.d(this, C4022bTi.e.p, false, 2, null);
        private final dsZ d = bIF.d(this, C4022bTi.e.b, false, 2, null);

        public final ViewGroup d() {
            return (ViewGroup) this.c.getValue(this, a[0]);
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.e.getValue(this, a[1]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.b.getValue(this, a[2]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, a[3]);
        }

        public final boolean b() {
            return c().isImageLoaded();
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
        return ((b) C9726vo.d(abstractC3179au, b.class)).b();
    }
}
