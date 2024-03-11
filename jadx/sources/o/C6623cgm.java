package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.mdx2.NetflixMdxController;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cgm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6623cgm extends C6632cgv {
    public static final d c = new d(null);
    public static final int d = 8;
    private int a;
    private C6491ceM b;
    private boolean e;
    private final NetflixActivity g;
    private final NetflixMdxController h;

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public C6536cfE c() {
        return null;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public void c(int i) {
        this.a = i;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public void d(C6491ceM c6491ceM) {
        C8632dsu.c((Object) c6491ceM, "");
        this.b = c6491ceM;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public boolean g() {
        return this.e;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public int h() {
        return this.a;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public boolean i() {
        return false;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public void m() {
    }

    public C6623cgm(NetflixActivity netflixActivity, NetflixMdxController netflixMdxController) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) netflixMdxController, "");
        this.g = netflixActivity;
        this.h = netflixMdxController;
        this.e = true;
    }

    /* renamed from: o.cgm$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MdxTargetCallbackImpl");
        }
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public C6533cfB c(InterfaceC5131bsv interfaceC5131bsv) {
        C8632dsu.c((Object) interfaceC5131bsv, "");
        return new C6533cfB(interfaceC5131bsv.l(), interfaceC5131bsv.i(), false);
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public InterfaceC5160btX b() {
        InterfaceC5198buI s = this.h.s();
        if (s != null) {
            return s.aE_();
        }
        return null;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public boolean f() {
        return this.h.c() != null;
    }

    @Override // o.C6632cgv, o.InterfaceC3655bFx
    public void a(InterfaceC5227bul interfaceC5227bul) {
        dpR dpr;
        Map d2;
        Map k;
        Throwable th;
        if (interfaceC5227bul != null) {
            if (this.g.isDialogFragmentVisible()) {
                this.g.removeDialogFrag();
            }
            PlaybackLauncher a = aGH.a(this.g);
            InterfaceC5160btX aE_ = interfaceC5227bul.aE_();
            C8632dsu.a(aE_, "");
            VideoType type = interfaceC5227bul.getType();
            C8632dsu.a(type, "");
            PlaybackLauncher.b.a(a, aE_, type, d(), null, null, 24, null);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("episodeDetails is null", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public PlayContext d() {
        PlayContext playContext = PlayContextImp.j;
        C8632dsu.a(playContext, "");
        return playContext;
    }

    @Override // o.C6632cgv, o.InterfaceC6580cfw
    public void o() {
        this.h.r();
    }
}
