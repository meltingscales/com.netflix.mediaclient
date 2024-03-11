package o;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.lottie.drawables.RemindMeCheckableDrawable;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public abstract class bGK extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    private CharSequence A;
    private boolean B;
    private CharSequence C;
    private WatchState D;
    public AppView b;
    public DownloadButton.ButtonState c;
    public bIN d;
    public drO<? extends TrackingInfo> f;
    public TrackingInfoHolder g;
    private View.OnClickListener h;
    public C9935zP i;
    private boolean j;
    private int k;
    private boolean l;
    private String m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13504o;
    private boolean p;
    private InterfaceC3825bMa.a q;
    private CharSequence s;
    private String t;
    private CharSequence u;
    private CompoundButton.OnCheckedChangeListener v;
    private int w;
    private boolean y;
    private boolean z;
    private String x = "";
    private final CompoundButton.OnCheckedChangeListener r = new CompoundButton.OnCheckedChangeListener() { // from class: o.bGL
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            bGK.d(bGK.this, compoundButton, z);
        }
    };

    public final boolean A() {
        return this.B;
    }

    public final boolean B() {
        return this.z;
    }

    public final CompoundButton.OnCheckedChangeListener C() {
        return this.v;
    }

    public final String D() {
        return this.x;
    }

    public final CharSequence E() {
        return this.A;
    }

    public final CharSequence F() {
        return this.C;
    }

    public final WatchState G() {
        return this.D;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.G;
    }

    public final void a_(int i) {
        this.n = i;
    }

    public final void a_(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void b_(int i) {
        this.f13504o = i;
    }

    public final void c(WatchState watchState) {
        this.D = watchState;
    }

    public final void c_(int i) {
        this.k = i;
    }

    public final void c_(String str) {
        this.m = str;
    }

    public final void d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    public final void d_(int i) {
        this.w = i;
    }

    public final void d_(String str) {
        this.t = str;
    }

    public final void d_(boolean z) {
        this.j = z;
    }

    public final void e_(CharSequence charSequence) {
        this.s = charSequence;
    }

    public final void e_(String str) {
        C8632dsu.c((Object) str, "");
        this.x = str;
    }

    public final void e_(boolean z) {
        this.l = z;
    }

    public final void f_(CharSequence charSequence) {
        this.u = charSequence;
    }

    public final void f_(boolean z) {
        this.y = z;
    }

    public final void g_(CharSequence charSequence) {
        this.C = charSequence;
    }

    public final void g_(boolean z) {
        this.z = z;
    }

    public final void h_(CharSequence charSequence) {
        this.A = charSequence;
    }

    public final void h_(boolean z) {
        this.B = z;
    }

    public final boolean k() {
        return this.j;
    }

    public final View.OnClickListener l() {
        return this.h;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.q;
    }

    public final String o() {
        return this.m;
    }

    public final int q() {
        return this.n;
    }

    public final int r() {
        return this.f13504o;
    }

    public final boolean s() {
        return this.l;
    }

    public final int t() {
        return this.k;
    }

    public final boolean u() {
        return this.y;
    }

    public final CharSequence w() {
        return this.s;
    }

    public final CharSequence x() {
        return this.u;
    }

    public final String y() {
        return this.t;
    }

    public final int z() {
        return this.w;
    }

    public final bIN v() {
        bIN bin = this.d;
        if (bin != null) {
            return bin;
        }
        C8632dsu.d("");
        return null;
    }

    public final DownloadButton.ButtonState p() {
        DownloadButton.ButtonState buttonState = this.c;
        if (buttonState != null) {
            return buttonState;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.b;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
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

    public final TrackingInfoHolder H() {
        TrackingInfoHolder trackingInfoHolder = this.g;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bGK bgk, CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C8632dsu.c((Object) bgk, "");
        if (bgk.p || (onCheckedChangeListener = bgk.v) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(compoundButton, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.bGK.b r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bGK.e(o.bGK$b):void");
    }

    private final void d(b bVar) {
        Object tag = bVar.k().getTag(com.netflix.mediaclient.ui.R.g.bD);
        if (!C8632dsu.c((Object) (tag instanceof String ? (String) tag : null), (Object) this.x)) {
            C9696vK.a(bVar.k(), new RemindMeCheckableDrawable(), null, null, null, 14, null);
            bVar.k().setTag(com.netflix.mediaclient.ui.R.g.bD, this.x);
        }
        this.p = true;
        bVar.k().setChecked(this.z);
        this.p = false;
        bVar.k().setOnCheckedChangeListener(this.r);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        View r = bVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        bVar.k().setOnCheckedChangeListener(null);
        bVar.o().setTransitionListener(null);
        bVar.i().clearImage();
        bVar.k().setTag(com.netflix.mediaclient.ui.R.g.bD, null);
        super.b((bGK) bVar);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(b.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "synopsis", "getSynopsis()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "badgeView", "getBadgeView()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "playButton", "getPlayButton()Landroid/widget/ImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "downloadButton", "getDownloadButton()Lcom/netflix/mediaclient/ui/offline/DownloadButton;", 0)), dsA.c(new PropertyReference1Impl(b.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), dsA.c(new PropertyReference1Impl(b.class, "episodeTime", "getEpisodeTime()Landroid/widget/TextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "episodeStatus", "getEpisodeStatus()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "downloadingView", "getDownloadingView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "readyToPlayView", "getReadyToPlayView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "downloadProgress", "getDownloadProgress()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "remindMeButton", "getRemindMeButton()Lcom/netflix/mediaclient/android/widget/NetflixToggleButton;", 0))};
        private final InterfaceC8554dpx m;
        private final dsZ g = bIF.d(this, com.netflix.mediaclient.ui.R.g.bx, false, 2, null);
        private final dsZ p = bIF.d(this, com.netflix.mediaclient.ui.R.g.bF, false, 2, null);
        private final dsZ l = bIF.d(this, com.netflix.mediaclient.ui.R.g.bG, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.bz, false, 2, null);
        private final dsZ f = bIF.d(this, com.netflix.mediaclient.ui.R.g.bC, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.bA, false, 2, null);
        private final dsZ n = bIF.d(this, com.netflix.mediaclient.ui.R.g.bB, false, 2, null);
        private final dsZ h = bIF.d(this, com.netflix.mediaclient.ui.R.g.bJ, false, 2, null);
        private final dsZ j = bIF.d(this, com.netflix.mediaclient.ui.R.g.bI, false, 2, null);
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.bj, false, 2, null);

        /* renamed from: o  reason: collision with root package name */
        private final dsZ f13505o = bIF.d(this, com.netflix.mediaclient.ui.R.g.ff, false, 2, null);
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.bh, false, 2, null);
        private final dsZ k = bIF.d(this, com.netflix.mediaclient.ui.R.g.bD, false, 2, null);

        public final boolean n() {
            return true;
        }

        public b() {
            InterfaceC8554dpx b;
            b = dpB.b(new drO<RemindMeCheckableDrawable>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.epoxymodels.DpEpisodeRowModel$Holder$remindMeDrawable$2
                @Override // o.drO
                /* renamed from: e */
                public final RemindMeCheckableDrawable invoke() {
                    return new RemindMeCheckableDrawable();
                }
            });
            this.m = b;
        }

        public final NetflixImageView i() {
            return (NetflixImageView) this.g.getValue(this, d[0]);
        }

        public final TextView l() {
            return (TextView) this.p.getValue(this, d[1]);
        }

        public final TextView m() {
            return (TextView) this.l.getValue(this, d[2]);
        }

        public final TextView d() {
            return (TextView) this.b.getValue(this, d[3]);
        }

        public final ImageView j() {
            return (ImageView) this.f.getValue(this, d[4]);
        }

        public final DownloadButton e() {
            return (DownloadButton) this.e.getValue(this, d[5]);
        }

        public final ProgressBar h() {
            return (ProgressBar) this.n.getValue(this, d[6]);
        }

        public final TextView g() {
            return (TextView) this.h.getValue(this, d[7]);
        }

        public final View c() {
            return (View) this.j.getValue(this, d[8]);
        }

        public final View b() {
            return (View) this.c.getValue(this, d[9]);
        }

        public final View f() {
            return (View) this.f13505o.getValue(this, d[10]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.a.getValue(this, d[11]);
        }

        public final C1206St k() {
            return (C1206St) this.k.getValue(this, d[12]);
        }

        public final RemindMeCheckableDrawable o() {
            return (RemindMeCheckableDrawable) this.m.getValue();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((b) C9726vo.d(abstractC3179au, b.class)).n();
    }
}
