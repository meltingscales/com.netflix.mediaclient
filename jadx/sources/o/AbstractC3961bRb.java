package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.C9645uM;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bRb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3961bRb extends AbstractC3336ax<d> implements InterfaceC3829bMe {
    private String b;
    public AppView c;
    public drO<? extends TrackingInfo> d;
    private String g;
    private InterfaceC3825bMa.a h;
    private String j;
    private TrackingInfoHolder k;
    private Integer m;
    private View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    private String f13536o;
    private Integer f = Integer.valueOf(C9645uM.d.e);
    private int i = 1;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.f;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void a(InterfaceC3825bMa.a aVar) {
        this.h = aVar;
    }

    public final void b(Integer num) {
        this.m = num;
    }

    public final void b(String str) {
        this.g = str;
    }

    public final void c(TrackingInfoHolder trackingInfoHolder) {
        this.k = trackingInfoHolder;
    }

    public final void d(String str) {
        this.f13536o = str;
    }

    public final void e(int i) {
        this.i = i;
    }

    public final void e(Integer num) {
        this.f = num;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final String k() {
        return this.j;
    }

    public final String l() {
        return this.b;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final int o() {
        return this.i;
    }

    public final Integer p() {
        return this.f;
    }

    public final View.OnClickListener q() {
        return this.n;
    }

    public final TrackingInfoHolder r() {
        return this.k;
    }

    public final String s() {
        return this.f13536o;
    }

    public final String t() {
        return this.g;
    }

    public final Integer w() {
        return this.m;
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC3961bRb.d r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3961bRb.e(o.bRb$d):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        View r = dVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        dVar.e().setBackground(null);
        dVar.e().setForeground(null);
        C1204Sr b = dVar.b();
        if (b != null) {
            b.setLines(3);
        }
        dVar.e().onViewRecycled();
        super.b((AbstractC3961bRb) dVar);
    }

    /* renamed from: o.bRb$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(d.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "genre", "getGenre()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "maxTextLinePlaceHolder", "getMaxTextLinePlaceHolder()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ c = bIF.d(this, C3895bOq.b.z, false, 2, null);
        private final dsZ d = bIF.d(this, C3895bOq.b.al, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.q, false, 2, null);
        private final dsZ b = bIF.c(this, C3895bOq.b.O);

        public final NetflixImageView e() {
            return (NetflixImageView) this.c.getValue(this, a[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, a[1]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.e.getValue(this, a[2]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, a[3]);
        }

        public final boolean d() {
            return e().isImageLoaded();
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
        return ((d) C9726vo.d(abstractC3179au, d.class)).d();
    }
}
