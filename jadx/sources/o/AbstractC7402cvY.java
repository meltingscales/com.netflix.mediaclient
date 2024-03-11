package o;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cvY  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7402cvY extends AbstractC7258csn<a> {
    public static final d c = new d(null);
    public static final int d = 8;
    public DownloadState b;
    private boolean f;
    public VideoType g;
    public WatchState h;
    public String i;
    public String j;
    private View.OnClickListener k;
    private CharSequence l;
    private int m;
    private View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    private int f13780o;
    private View.OnClickListener p;
    private int q;
    private View.OnLongClickListener r;
    private long s;
    private boolean t;
    private int u = -250;
    private CharSequence v;
    private int w;
    private boolean x;
    private StopReason y;

    public final int A() {
        return this.u;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.S;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    public final void b(int i) {
        this.w = i;
    }

    public final void b(long j) {
        this.s = j;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void c(StopReason stopReason) {
        this.y = stopReason;
    }

    public final void d(int i) {
        this.q = i;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public final void d(View.OnLongClickListener onLongClickListener) {
        this.r = onLongClickListener;
    }

    public final void d(CharSequence charSequence) {
        this.l = charSequence;
    }

    public final void e(int i) {
        this.f13780o = i;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public final void e(boolean z) {
        this.t = z;
    }

    public final void g(int i) {
        this.u = i;
    }

    public final boolean k() {
        return this.f;
    }

    public final View.OnClickListener l() {
        return this.k;
    }

    public final CharSequence o() {
        return this.l;
    }

    public final int q() {
        return this.m;
    }

    public final long r() {
        return this.s;
    }

    public final View.OnClickListener s() {
        return this.n;
    }

    public final int t() {
        return this.f13780o;
    }

    public final int u() {
        return this.q;
    }

    public final View.OnClickListener v() {
        return this.p;
    }

    public final View.OnLongClickListener w() {
        return this.r;
    }

    public final boolean x() {
        return this.t;
    }

    public final int y() {
        return this.w;
    }

    public final StopReason z() {
        return this.y;
    }

    /* renamed from: o.cvY$d */
    /* loaded from: classes6.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DownloadedErrorVideoModel");
        }

        public final C7457cwa c(String str, InterfaceC5206buQ interfaceC5206buQ, C7460cwd c7460cwd) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC5206buQ, "");
            C8632dsu.c((Object) c7460cwd, "");
            C7457cwa c7457cwa = new C7457cwa();
            InterfaceC5160btX aE_ = c7460cwd.aE_();
            C8632dsu.a(aE_, "");
            c7457cwa.a((CharSequence) str);
            c7457cwa.a(c7460cwd.ay());
            c7457cwa.d(aE_.aH_());
            c7457cwa.a(c7460cwd.getType());
            c7457cwa.f(c7460cwd.getTitle());
            c7457cwa.j(aE_.aJ_());
            c7457cwa.b((CharSequence) c7460cwd.k());
            if (c7460cwd.aA() == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str2 = "realmHorzDispUrl for video movie? " + C8632dsu.c((Object) c7460cwd.aE_().aO_(), (Object) c7460cwd.aE_().aH_()) + " is null";
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
            c7457cwa.c(c7460cwd.aA());
            c7457cwa.e(interfaceC5206buQ.C());
            c7457cwa.d(interfaceC5206buQ.ax_());
            c7457cwa.a(interfaceC5206buQ.au_());
            c7457cwa.e(interfaceC5206buQ.aM_());
            c7457cwa.f(interfaceC5206buQ.aD_());
            c7457cwa.c(interfaceC5206buQ.C().b());
            c7457cwa.a(interfaceC5206buQ.h());
            if (c7457cwa.I() == VideoType.EPISODE) {
                c7457cwa.n(c7460cwd.aE_().x());
                c7457cwa.h(c7460cwd.aw_());
                c7457cwa.b(c7460cwd.aU_());
            }
            c7457cwa.m(interfaceC5206buQ.l());
            return c7457cwa;
        }
    }

    public final VideoType D() {
        VideoType videoType = this.g;
        if (videoType != null) {
            return videoType;
        }
        C8632dsu.d("");
        return null;
    }

    public final WatchState C() {
        WatchState watchState = this.h;
        if (watchState != null) {
            return watchState;
        }
        C8632dsu.d("");
        return null;
    }

    public final DownloadState p() {
        DownloadState downloadState = this.b;
        if (downloadState != null) {
            return downloadState;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC7258csn, o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        String string;
        boolean g;
        CharSequence charSequence;
        C8632dsu.c((Object) aVar, "");
        Context context = aVar.d().getContext();
        if (D() == VideoType.EPISODE) {
            C1204Sr g2 = aVar.g();
            if (this.t) {
                charSequence = n();
            } else {
                dsE dse = dsE.b;
                String format = String.format("%d. %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f13780o), n()}, 2));
                C8632dsu.a(format, "");
                charSequence = format;
            }
            g2.setText(charSequence);
            aVar.d().setText(context.getString(com.netflix.mediaclient.ui.R.o.fk, C8178dfV.d(this.q, context), C8176dfT.d(context, m())));
        } else {
            aVar.g().setText(n());
            C1204Sr d2 = aVar.d();
            if (TextUtils.isEmpty(this.l)) {
                string = C8176dfT.d(context, m());
            } else {
                string = context.getString(com.netflix.mediaclient.ui.R.o.fk, this.l, C8310dhv.d(C8176dfT.d(context, m())));
            }
            d2.setText(string);
        }
        if (!this.x) {
            C8258dgw e = C8258dgw.a.e();
            C8632dsu.d(context);
            this.v = e.e(context, p(), C(), this.s, this.y, this.m);
            this.x = true;
        }
        aVar.h().setText(this.v);
        aVar.h().setVisibility(C8168dfL.b(this.v) ? 0 : 8);
        String i = i();
        if (i != null) {
            g = C8691duz.g(i);
            if (!g) {
                aVar.e().showImage(i);
                C9702vQ.a(aVar.e(), N() ? 0.8f : 1.0f);
                if (K()) {
                    aVar.b().setVisibility(0);
                    aVar.b().setChecked(N());
                    aVar.b().setContentDescription(n());
                    aVar.b().setClickable(false);
                    aVar.a().setVisibility(8);
                    aVar.c().setVisibility(8);
                } else {
                    aVar.b().setVisibility(8);
                    aVar.a().setVisibility(0);
                    if (this.f) {
                        aVar.a().setText(context.getText(com.netflix.mediaclient.ui.R.o.bt));
                        aVar.a().setOnClickListener(this.p);
                        aVar.c().setVisibility(0);
                        aVar.c().setText(context.getText(com.netflix.mediaclient.ui.R.o.br));
                        aVar.c().setOnClickListener(this.n);
                    } else {
                        aVar.a().setText(context.getText(com.netflix.mediaclient.ui.R.o.br));
                        aVar.a().setOnClickListener(this.n);
                        aVar.c().setVisibility(8);
                    }
                }
                aVar.r().setOnClickListener(K() ? this.k : null);
                aVar.r().setOnLongClickListener(this.r);
                return;
            }
        }
        throw new IllegalStateException("image url is empty");
    }

    /* renamed from: o.cvY$a */
    /* loaded from: classes6.dex */
    public static class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "infoView", "getInfoView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "statusView", "getStatusView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "boxShotView", "getBoxShotView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "checkBoxView", "getCheckBoxView()Landroid/widget/CheckBox;", 0)), dsA.c(new PropertyReference1Impl(a.class, "primaryButton", "getPrimaryButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(a.class, "secondaryButton", "getSecondaryButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int a = 8;
        private final dsZ f = bIF.d(this, C7373cuw.c.P, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.cF, false, 2, null);
        private final dsZ j = bIF.d(this, com.netflix.mediaclient.ui.R.g.fZ, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.ac, false, 2, null);
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.as, false, 2, null);
        private final dsZ h = bIF.d(this, com.netflix.mediaclient.ui.R.g.eG, false, 2, null);
        private final dsZ g = bIF.d(this, com.netflix.mediaclient.ui.R.g.fy, false, 2, null);

        public final C1204Sr g() {
            return (C1204Sr) this.f.getValue(this, c[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.e.getValue(this, c[1]);
        }

        public final C1204Sr h() {
            return (C1204Sr) this.j.getValue(this, c[2]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.b.getValue(this, c[3]);
        }

        public final CheckBox b() {
            return (CheckBox) this.d.getValue(this, c[4]);
        }

        public final C1203Sq a() {
            return (C1203Sq) this.h.getValue(this, c[5]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.g.getValue(this, c[6]);
        }
    }
}
