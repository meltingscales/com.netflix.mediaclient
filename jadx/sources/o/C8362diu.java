package o;

import android.view.View;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.viewportttr.impl.ShowImageTtrTracker$membershipTracker$1;
import com.netflix.mediaclient.viewportttr.impl.ShowImageTtrTracker$scrollTracker$1;
import com.netflix.mediaclient.viewportttr.impl.ViewPortMembershipTracker;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import o.C8362diu;
import o.C8632dsu;
import o.InterfaceC8358diq;
import o.dpR;

/* renamed from: o.diu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8362diu implements InterfaceC8357dip {
    public static final b b = new b(null);
    private Throwable a;
    private final InterfaceC1270Vf c;
    private long d;
    private boolean e;
    private final OneShotPreDrawListener f;
    private boolean g;
    private final ImageView h;
    private final ViewPortMembershipTracker i;
    private long j;
    private final ShowImageRequest.d k;
    private ShowImageRequest.a l;
    private final ViewTreeObserver$OnScrollChangedListenerC8317diB m;
    private final InterfaceC8358diq.d n;

    /* renamed from: o  reason: collision with root package name */
    private int f13843o;
    private final drO<dpR> p;
    private final long t;

    @Override // o.InterfaceC8357dip
    public long c() {
        return this.d;
    }

    @Override // o.InterfaceC8357dip
    public boolean e() {
        return (this.l == null && this.a == null) ? false : true;
    }

    public final long f() {
        return this.j;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.f13843o >= 4;
    }

    public final ShowImageRequest.a j() {
        return this.l;
    }

    public long k() {
        return this.t;
    }

    public C8362diu(ImageView imageView, ShowImageRequest.d dVar, InterfaceC1270Vf interfaceC1270Vf, InterfaceC8358diq.d dVar2, drO<dpR> dro) {
        C8632dsu.c((Object) imageView, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) dro, "");
        this.h = imageView;
        this.k = dVar;
        this.c = interfaceC1270Vf;
        this.n = dVar2;
        this.p = dro;
        this.t = interfaceC1270Vf.c();
        this.i = new ViewPortMembershipTracker(imageView, new ShowImageTtrTracker$membershipTracker$1(this));
        this.e = true;
        this.f = OneShotPreDrawListener.add(imageView, new e(imageView, this));
        this.m = ViewTreeObserver$OnScrollChangedListenerC8317diB.e.b(imageView, new ShowImageTtrTracker$scrollTracker$1(this));
    }

    /* renamed from: o.diu$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ViewPortTtr-Show");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        l();
    }

    private final void q() {
        this.f.removeListener();
    }

    private final void t() {
        this.m.d();
    }

    private final void l() {
        InterfaceC8358diq.d dVar;
        if (e() && !this.g && i() == ViewPortMembershipTracker.Membership.a) {
            this.g = true;
            ShowImageRequest.a aVar = this.l;
            if (aVar == null) {
                InterfaceC8358diq.d dVar2 = this.n;
                if (dVar2 != null) {
                    dVar2.c(this.h, this.k.a(), k(), null, this.a);
                }
            } else if (!aVar.b() && (dVar = this.n) != null) {
                dVar.c(this.h, this.k.a(), k(), aVar, null);
            }
        }
        this.p.invoke();
    }

    @Override // o.InterfaceC8357dip
    public void b(View view) {
        C8632dsu.c((Object) view, "");
        this.i.a(view);
    }

    @Override // o.InterfaceC8357dip
    public ViewPortMembershipTracker.Membership i() {
        return this.i.d();
    }

    @Override // o.InterfaceC8357dip
    public ImageDataSource d() {
        ShowImageRequest.a aVar = this.l;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    @Override // o.InterfaceC8357dip
    public InterfaceC8358diq.b b() {
        String m = this.k.a().m();
        if (m != null) {
            return new InterfaceC8358diq.b(m, k(), c(), d(), 0, this.a);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // o.InterfaceC8357dip
    public void a() {
        q();
        t();
        this.i.e();
    }

    public final Single<ShowImageRequest.a> b(Single<ShowImageRequest.a> single) {
        C8632dsu.c((Object) single, "");
        b.getLogTag();
        final drM<ShowImageRequest.a, dpR> drm = new drM<ShowImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.ShowImageTtrTracker$trackRequest$2
            {
                super(1);
            }

            public final void c(ShowImageRequest.a aVar) {
                C8362diu c8362diu = C8362diu.this;
                C8632dsu.d(aVar);
                c8362diu.b(aVar);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ShowImageRequest.a aVar) {
                c(aVar);
                return dpR.c;
            }
        };
        Single<ShowImageRequest.a> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.div
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8362diu.e(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.ShowImageTtrTracker$trackRequest$3
            {
                super(1);
            }

            public final void b(Throwable th) {
                C8362diu c8362diu = C8362diu.this;
                C8632dsu.d(th);
                c8362diu.d(th);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }
        };
        Single<ShowImageRequest.a> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dix
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8362diu.c(drM.this, obj);
            }
        });
        C8632dsu.a(doOnError, "");
        return doOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ShowImageRequest.a aVar) {
        b.getLogTag();
        this.l = aVar;
        this.d = this.c.c();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Throwable th) {
        b.getLogTag();
        this.l = this.l;
        this.a = th;
        this.d = this.c.c();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        b.getLogTag();
        this.e = false;
        this.j = this.c.c();
        q();
        if (e()) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f13843o++;
        b.getLogTag();
        if (this.f13843o >= 4) {
            t();
            l();
        }
    }

    /* renamed from: o.diu$e */
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {
        final /* synthetic */ C8362diu b;
        final /* synthetic */ View d;

        public e(View view, C8362diu c8362diu) {
            this.d = view;
            this.b = c8362diu;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.n();
        }
    }
}
