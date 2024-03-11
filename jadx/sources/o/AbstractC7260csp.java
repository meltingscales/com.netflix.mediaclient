package o;

import android.content.Context;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.AbstractC7260csp;
import o.C1030Lx;
import o.C7350cuZ;
import o.C7373cuw;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.csp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7260csp extends AbstractC7258csn<c> {
    private static int B = 1;
    private static int C;
    public static final d b;
    public static final int c;
    private static byte e$ss2$4124;
    public DownloadButton.ButtonState d;
    public WatchState f;
    public DownloadState g;
    public String h;
    public String i;
    public VideoType j;
    private CharSequence k;
    private int l;
    private int m;
    private View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    private long f13767o;
    private View.OnLongClickListener p;
    private int q;
    private boolean r;
    private int t;
    private Integer v;
    private CharSequence w;
    private boolean x;
    private StopReason y;
    private boolean s = true;
    private TrackingInfoHolder u = new TrackingInfoHolder(PlayLocationType.DOWNLOADS);

    /* renamed from: o.csp$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DownloadState.values().length];
            try {
                iArr[DownloadState.InProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadState.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadState.Complete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadState.Creating.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadState.CreateFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DownloadState.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DownloadState.Deleted.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DownloadState.DeleteComplete.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            e = iArr;
            int[] iArr2 = new int[WatchState.Simplified.values().length];
            try {
                iArr2[WatchState.Simplified.EXPIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WatchState.Simplified.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[WatchState.Simplified.NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr2;
        }
    }

    static {
        I();
        b = new d(null);
        c = 8;
    }

    static void I() {
        e$ss2$4124 = (byte) 24;
    }

    public final StopReason A() {
        return this.y;
    }

    public final TrackingInfoHolder D() {
        return this.u;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.R;
    }

    public final void a(boolean z) {
        this.s = z;
    }

    public final void b(int i) {
        this.l = i;
    }

    public final void b(long j) {
        this.f13767o = j;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public final void b(StopReason stopReason) {
        this.y = stopReason;
    }

    public final void b(Integer num) {
        this.v = num;
    }

    public final void b(boolean z) {
        this.r = z;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void c(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.u = trackingInfoHolder;
    }

    public final void c(CharSequence charSequence) {
        this.k = charSequence;
    }

    public final void d(int i) {
        this.t = i;
    }

    public final void d(View.OnLongClickListener onLongClickListener) {
        this.p = onLongClickListener;
    }

    public final void e(int i) {
        this.q = i;
    }

    public final View.OnClickListener l() {
        return this.n;
    }

    public final CharSequence o() {
        return this.k;
    }

    public final int p() {
        return this.l;
    }

    public final long q() {
        return this.f13767o;
    }

    public final int r() {
        return this.m;
    }

    public final boolean s() {
        return this.r;
    }

    public final View.OnLongClickListener u() {
        return this.p;
    }

    public final boolean v() {
        return this.s;
    }

    public final int x() {
        return this.q;
    }

    public final int y() {
        return this.t;
    }

    public final Integer z() {
        return this.v;
    }

    /* renamed from: o.csp$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DownloadedVideoModel");
        }

        public final C7264cst e(String str, InterfaceC5206buQ interfaceC5206buQ, C7460cwd c7460cwd, Integer num, final C5839cKg c5839cKg) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC5206buQ, "");
            C8632dsu.c((Object) c7460cwd, "");
            C8632dsu.c((Object) c5839cKg, "");
            C7264cst c7264cst = new C7264cst();
            InterfaceC5160btX aE_ = c7460cwd.aE_();
            C8632dsu.a(aE_, "");
            c7264cst.a((CharSequence) str);
            c7264cst.c(c7460cwd.isPlayable());
            c7264cst.b(c7460cwd.ay());
            c7264cst.c(aE_.aH_());
            c7264cst.e(c7460cwd.getType());
            c7264cst.j(c7460cwd.getTitle());
            c7264cst.i(aE_.g());
            c7264cst.d((CharSequence) c7460cwd.k());
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
            c7264cst.d(c7460cwd.aA());
            c7264cst.d(interfaceC5206buQ.C());
            c7264cst.e(num);
            c7264cst.a(interfaceC5206buQ.ax_());
            c7264cst.c(interfaceC5206buQ.au_());
            c7264cst.e(interfaceC5206buQ.aM_());
            c7264cst.f(interfaceC5206buQ.aD_());
            c7264cst.e(new InterfaceC4573bh() { // from class: o.csu
                @Override // o.InterfaceC4573bh
                public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i, int i2) {
                    AbstractC7260csp.d.d(C5839cKg.this, (C7264cst) abstractC3073as, (AbstractC7260csp.c) obj, f, f2, i, i2);
                }
            });
            c7264cst.d(DownloadButton.b(interfaceC5206buQ, aE_));
            c7264cst.d(interfaceC5206buQ.h());
            if (c7264cst.M() == VideoType.EPISODE) {
                c7264cst.j(c7460cwd.aE_().x());
                c7264cst.g(c7460cwd.aw_());
                c7264cst.e(c7460cwd.aU_());
            }
            c7264cst.a(C7338cuN.d(c7264cst.D(), interfaceC5206buQ, c7460cwd, Integer.valueOf(C7353cuc.d(interfaceC5206buQ))));
            return c7264cst;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C5839cKg c5839cKg, C7264cst c7264cst, c cVar, float f, float f2, int i, int i2) {
            C8632dsu.c((Object) c5839cKg, "");
            if (f > 50.0f) {
                c5839cKg.d(c7264cst.w(), AppView.boxArt, c7264cst.D());
            }
        }
    }

    public final String w() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final VideoType C() {
        VideoType videoType = this.j;
        if (videoType != null) {
            return videoType;
        }
        C8632dsu.d("");
        return null;
    }

    public final WatchState B() {
        WatchState watchState = this.f;
        if (watchState != null) {
            return watchState;
        }
        C8632dsu.d("");
        return null;
    }

    public final DownloadState t() {
        DownloadState downloadState = this.g;
        if (downloadState != null) {
            return downloadState;
        }
        C8632dsu.d("");
        return null;
    }

    public final DownloadButton.ButtonState k() {
        DownloadButton.ButtonState buttonState = this.d;
        if (buttonState != null) {
            return buttonState;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0261  */
    @Override // o.AbstractC7258csn, o.AbstractC3336ax
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC7260csp.c r13) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7260csp.e(o.csp$c):void");
    }

    public boolean G() {
        return B() == WatchState.WATCHING_ALLOWED && !B().c();
    }

    public CharSequence d(Context context, WatchState watchState, long j) {
        int i = 2 % 2;
        int i2 = C + 11;
        B = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) watchState, "");
        int i4 = com.netflix.mediaclient.ui.R.c.e;
        WatchState.Simplified d2 = watchState.d();
        int i5 = d2 == null ? -1 : e.c[d2.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                String string = context.getString(com.netflix.mediaclient.ui.R.o.jb);
                if (string.startsWith("'!#+")) {
                    int i6 = C + 71;
                    B = i6 % 128;
                    if (i6 % 2 == 0) {
                        String substring = string.substring(4);
                        Object[] objArr = new Object[1];
                        J(substring, objArr);
                        ((String) objArr[0]).intern();
                        throw null;
                    }
                    Object[] objArr2 = new Object[1];
                    J(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                    int i7 = B + 15;
                    C = i7 % 128;
                    int i8 = i7 % 2;
                }
                str = string;
                i4 = C1030Lx.d.f;
                int i9 = C + 73;
                B = i9 % 128;
                int i10 = i9 % 2;
            } else if (i5 == 3) {
                i4 = C1030Lx.d.f;
                String string2 = context.getString(com.netflix.mediaclient.ui.R.o.jf);
                if (string2.startsWith("'!#+")) {
                    Object[] objArr3 = new Object[1];
                    J(string2.substring(4), objArr3);
                    string2 = ((String) objArr3[0]).intern();
                }
                str = string2;
            }
        } else if (j > 0) {
            int i11 = B + 99;
            C = i11 % 128;
            int i12 = i11 % 2;
            str = j > TimeUnit.DAYS.toMillis(1L) ? C1333Xq.d(com.netflix.mediaclient.ui.R.o.ja).a((int) TimeUnit.MILLISECONDS.toDays(j)).c() : j > TimeUnit.HOURS.toMillis(1L) ? C1333Xq.d(com.netflix.mediaclient.ui.R.o.ji).a((int) TimeUnit.MILLISECONDS.toHours(j)).c() : C1333Xq.d(com.netflix.mediaclient.ui.R.o.jj).a((int) TimeUnit.MILLISECONDS.toMinutes(j)).c();
            i4 = C1030Lx.d.f;
        }
        if (str != null) {
            return C8168dfL.d(context, str, i4);
        }
        return null;
    }

    /* renamed from: o.csp$c */
    /* loaded from: classes4.dex */
    public static class c extends AbstractC3179au {
        public NetflixImageView a;
        public CheckBox b;
        public DownloadButton c;
        public C1204Sr d;
        public View e;
        public ImageView f;
        public C1204Sr g;
        public C1204Sr h;
        public ProgressBar i;
        public C1204Sr j;

        public final void a(DownloadButton downloadButton) {
            C8632dsu.c((Object) downloadButton, "");
            this.c = downloadButton;
        }

        public final void b(View view) {
            C8632dsu.c((Object) view, "");
            this.e = view;
        }

        public final void b(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.g = c1204Sr;
        }

        public final void c(CheckBox checkBox) {
            C8632dsu.c((Object) checkBox, "");
            this.b = checkBox;
        }

        public final void c(ImageView imageView) {
            C8632dsu.c((Object) imageView, "");
            this.f = imageView;
        }

        public final void c(ProgressBar progressBar) {
            C8632dsu.c((Object) progressBar, "");
            this.i = progressBar;
        }

        public final void c(NetflixImageView netflixImageView) {
            C8632dsu.c((Object) netflixImageView, "");
            this.a = netflixImageView;
        }

        public final void c(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.d = c1204Sr;
        }

        public final void d(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.h = c1204Sr;
        }

        public final void e(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.j = c1204Sr;
        }

        public final View a() {
            View view = this.e;
            if (view != null) {
                return view;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr i() {
            C1204Sr c1204Sr = this.g;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr e() {
            C1204Sr c1204Sr = this.d;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr h() {
            C1204Sr c1204Sr = this.j;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr g() {
            C1204Sr c1204Sr = this.h;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final NetflixImageView d() {
            NetflixImageView netflixImageView = this.a;
            if (netflixImageView != null) {
                return netflixImageView;
            }
            C8632dsu.d("");
            return null;
        }

        public final ProgressBar j() {
            ProgressBar progressBar = this.i;
            if (progressBar != null) {
                return progressBar;
            }
            C8632dsu.d("");
            return null;
        }

        public final ImageView f() {
            ImageView imageView = this.f;
            if (imageView != null) {
                return imageView;
            }
            C8632dsu.d("");
            return null;
        }

        public final DownloadButton b() {
            DownloadButton downloadButton = this.c;
            if (downloadButton != null) {
                return downloadButton;
            }
            C8632dsu.d("");
            return null;
        }

        public final CheckBox c() {
            CheckBox checkBox = this.b;
            if (checkBox != null) {
                return checkBox;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            b(view);
            View findViewById = view.findViewById(C7373cuw.c.P);
            C8632dsu.a(findViewById, "");
            b((C1204Sr) findViewById);
            View findViewById2 = view.findViewById(com.netflix.mediaclient.ui.R.g.cF);
            C8632dsu.a(findViewById2, "");
            c((C1204Sr) findViewById2);
            View findViewById3 = view.findViewById(com.netflix.mediaclient.ui.R.g.fZ);
            C8632dsu.a(findViewById3, "");
            e((C1204Sr) findViewById3);
            View findViewById4 = view.findViewById(com.netflix.mediaclient.ui.R.g.ff);
            C8632dsu.a(findViewById4, "");
            d((C1204Sr) findViewById4);
            View findViewById5 = view.findViewById(com.netflix.mediaclient.ui.R.g.ac);
            C8632dsu.a(findViewById5, "");
            c((NetflixImageView) findViewById5);
            View findViewById6 = view.findViewById(com.netflix.mediaclient.ui.R.g.eP);
            C8632dsu.a(findViewById6, "");
            c((ProgressBar) findViewById6);
            View findViewById7 = view.findViewById(com.netflix.mediaclient.ui.R.g.ez);
            C8632dsu.a(findViewById7, "");
            c((ImageView) findViewById7);
            View findViewById8 = view.findViewById(com.netflix.mediaclient.ui.R.g.bd);
            C8632dsu.a(findViewById8, "");
            a((DownloadButton) findViewById8);
            View findViewById9 = view.findViewById(com.netflix.mediaclient.ui.R.g.as);
            C8632dsu.a(findViewById9, "");
            c((CheckBox) findViewById9);
        }
    }

    public CharSequence c(Context context, DownloadState downloadState, WatchState watchState, long j, StopReason stopReason, int i) {
        Map d2;
        Map k;
        Throwable th;
        int i2 = 2 % 2;
        String str = "";
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) downloadState, "");
        C8632dsu.c((Object) watchState, "");
        int i3 = C9834xU.c.I;
        switch (e.e[downloadState.ordinal()]) {
            case 1:
                return C8168dfL.d(context, C1333Xq.d(com.netflix.mediaclient.ui.R.o.fx).d("progress", Integer.valueOf(i)).c(), i3);
            case 2:
                if (stopReason == null || !stopReason.a()) {
                    if (i <= 0) {
                        str = C7353cuc.e(context);
                        break;
                    } else {
                        str = context.getString(C7350cuZ.a.t);
                        if (str.startsWith("'!#+")) {
                            int i4 = B + 125;
                            C = i4 % 128;
                            if (i4 % 2 != 0) {
                                Object[] objArr = new Object[1];
                                J(str.substring(4), objArr);
                                ((String) objArr[0]).intern();
                                throw null;
                            }
                            Object[] objArr2 = new Object[1];
                            J(str.substring(4), objArr2);
                            str = ((String) objArr2[0]).intern();
                            break;
                        }
                    }
                }
                break;
            case 3:
                return d(context, watchState, j);
            case 4:
                str = C7353cuc.e(context);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Wrong DownloadState (=" + downloadState + ")", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
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
                        int i5 = B + 99;
                        C = i5 % 128;
                        int i6 = i5 % 2;
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        int i7 = C + 95;
                        B = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return null;
        }
        SpannableString d3 = str != null ? C8168dfL.d(context, str, i3) : null;
        if (d3 == null) {
            int i9 = B + 51;
            C = i9 % 128;
            int i10 = i9 % 2;
            if (downloadState != DownloadState.Complete) {
                int i11 = B + 91;
                C = i11 % 128;
                int i12 = i11 % 2;
                if (G()) {
                    return d(context, watchState, j);
                }
            }
        }
        return d3;
    }

    private void J(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4124);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
