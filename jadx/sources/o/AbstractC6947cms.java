package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6947cms;
import o.C8632dsu;
import o.InterfaceC6945cmq;
import o.dpR;
import o.drX;

/* renamed from: o.cms  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6947cms extends AbstractC3336ax<b> {
    public Observable<dpR> b;
    public String c;
    public TrackingInfoHolder d;
    private C6950cmv f;
    private boolean g;
    private boolean h;
    private String i;
    private InterfaceC6903cmA j;
    private boolean l = true;
    private VideoType m = VideoType.SHOW;
    private drX<? super Boolean, ? super InterfaceC6945cmq, dpR> n;

    public void G_(boolean z) {
        this.h = z;
    }

    public void a(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.m = videoType;
    }

    public final void a(InterfaceC6903cmA interfaceC6903cmA) {
        this.j = interfaceC6903cmA;
    }

    public final void ac_(String str) {
        this.i = str;
    }

    public void c(drX<? super Boolean, ? super InterfaceC6945cmq, dpR> drx) {
        this.n = drx;
    }

    public final String i() {
        return this.i;
    }

    public final InterfaceC6903cmA l() {
        return this.j;
    }

    public boolean m() {
        return this.l;
    }

    public boolean n() {
        return this.h;
    }

    public drX<Boolean, InterfaceC6945cmq, dpR> o() {
        return this.n;
    }

    public VideoType p() {
        return this.m;
    }

    public boolean q() {
        return this.g;
    }

    public void x_(boolean z) {
        this.g = z;
    }

    public String t() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public TrackingInfoHolder r() {
        TrackingInfoHolder trackingInfoHolder = this.d;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    public Observable<dpR> k() {
        Observable<dpR> observable = this.b;
        if (observable != null) {
            return observable;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return q() ? com.netflix.mediaclient.ui.R.i.bn : com.netflix.mediaclient.ui.R.i.aH;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C6950cmv c6950cmv = this.f;
        if (c6950cmv != null) {
            c6950cmv.b();
        }
        NetflixActivity requireNetflixActivity = NetflixActivity.requireNetflixActivity(bVar.r());
        C8632dsu.a(requireNetflixActivity, "");
        this.f = a(requireNetflixActivity, C6906cmD.d.d(bVar.c(), m()));
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C6950cmv c6950cmv = this.f;
        if (c6950cmv != null) {
            c6950cmv.b();
        }
        this.f = null;
    }

    private final C6950cmv a(NetflixActivity netflixActivity, InterfaceC6945cmq interfaceC6945cmq) {
        C6950cmv c6950cmv = new C6950cmv(netflixActivity, interfaceC6945cmq, k());
        C6950cmv.b(c6950cmv, t(), p(), r(), q(), null, 16, null);
        c6950cmv.d(s());
        c6950cmv.e(this.j);
        c6950cmv.e(n());
        return c6950cmv;
    }

    private final drX<Boolean, InterfaceC6945cmq, dpR> s() {
        return new drX<Boolean, InterfaceC6945cmq, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.MyListButtonModel$onStateChange$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Boolean bool, InterfaceC6945cmq interfaceC6945cmq) {
                b(bool.booleanValue(), interfaceC6945cmq);
                return dpR.c;
            }

            public final void b(boolean z, InterfaceC6945cmq interfaceC6945cmq) {
                C8632dsu.c((Object) interfaceC6945cmq, "");
                drX<Boolean, InterfaceC6945cmq, dpR> o2 = AbstractC6947cms.this.o();
                if (o2 != null) {
                    o2.invoke(Boolean.valueOf(z), interfaceC6945cmq);
                }
            }
        };
    }

    /* renamed from: o.cms$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "addToMyListButton", "getAddToMyListButton()Lcom/netflix/mediaclient/android/widget/NetflixToggleButton;", 0))};
        public static final int c = 8;
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.dT, false, 2, null);

        public final C1206St c() {
            return (C1206St) this.b.getValue(this, a[0]);
        }
    }
}
