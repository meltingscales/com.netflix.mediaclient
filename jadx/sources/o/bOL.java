package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1596aHd;
import o.C3796bKz;
import o.C3895bOq;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;
import o.bOL;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public abstract class bOL extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public AppView b;
    public drM<? super drM<? super String, dpR>, dpR> c;
    public C9935zP d;
    public drO<? extends TrackingInfo> g;
    private InterfaceC3825bMa.a h;
    private Disposable j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.g;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public void e(InterfaceC3825bMa.a aVar) {
        this.h = aVar;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.g;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    public final drM<drM<? super String, dpR>, dpR> l() {
        drM drm = this.c;
        if (drm != null) {
            return drm;
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

    @Override // o.AbstractC3336ax
    public void e(final a aVar) {
        C8632dsu.c((Object) aVar, "");
        l().invoke(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.billboard.GamesFeatureEducationBillboardModel$bind$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                b(str);
                return dpR.c;
            }

            public final void b(String str) {
                boolean g;
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) str, "");
                g = C8691duz.g(str);
                if (g) {
                    bOL.a.this.e().clearImage();
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("BoxshotUrl is empty for Nlogo", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b);
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
                        return;
                    } else {
                        dVar.e().b(c1596aHd, th);
                        return;
                    }
                }
                bOL.a.this.e().showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a).d());
            }
        });
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().setBackground(null);
        aVar.e().setForeground(null);
        aVar.e().onViewRecycled();
        Disposable disposable = this.j;
        if (disposable != null) {
            disposable.dispose();
        }
        this.j = null;
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(a.class, "rootView", "getRootView()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(a.class, "nlogo", "getNlogo()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ c = bIF.d(this, C3796bKz.a.p, false, 2, null);
        private final dsZ b = bIF.d(this, C3895bOq.b.P, false, 2, null);

        public final boolean a() {
            return true;
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.b.getValue(this, d[1]);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).a();
    }
}
