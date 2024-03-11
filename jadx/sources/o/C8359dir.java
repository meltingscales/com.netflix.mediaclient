package o;

import android.graphics.Bitmap;
import android.view.View;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.viewportttr.impl.GetImageTtrTracker$membershipTracker$1;
import com.netflix.mediaclient.viewportttr.impl.ViewPortMembershipTracker;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import o.C8359dir;
import o.C8632dsu;
import o.InterfaceC8358diq;
import o.dpR;

/* renamed from: o.dir  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8359dir implements InterfaceC8357dip {
    public static final e b = new e(null);
    private Throwable a;
    private final InterfaceC1270Vf c;
    private boolean d;
    private long e;
    private GetImageRequest.a f;
    private final ViewPortMembershipTracker g;
    private final InterfaceC8358diq.d h;
    private final GetImageRequest.e i;
    private final long j;
    private final drO<dpR> k;

    @Override // o.InterfaceC8357dip
    public long c() {
        return this.e;
    }

    @Override // o.InterfaceC8357dip
    public boolean e() {
        return (this.f == null && this.a == null) ? false : true;
    }

    public long j() {
        return this.j;
    }

    public C8359dir(GetImageRequest.e eVar, InterfaceC1270Vf interfaceC1270Vf, InterfaceC8358diq.d dVar, drO<dpR> dro) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) dro, "");
        this.i = eVar;
        this.c = interfaceC1270Vf;
        this.h = dVar;
        this.k = dro;
        this.j = interfaceC1270Vf.c();
        View e2 = eVar.e();
        if (e2 != null) {
            this.g = new ViewPortMembershipTracker(e2, new GetImageTtrTracker$membershipTracker$1(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: o.dir$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ViewPortTtr-Get");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        g();
    }

    private final void g() {
        if (e() && !this.d && i() == ViewPortMembershipTracker.Membership.a) {
            this.d = true;
            if (this.f != null) {
                InterfaceC8358diq.d dVar = this.h;
                if (dVar != null) {
                    dVar.b(this.i, j(), this.f, null);
                }
            } else {
                InterfaceC8358diq.d dVar2 = this.h;
                if (dVar2 != null) {
                    dVar2.b(this.i, j(), null, this.a);
                }
            }
        }
        this.k.invoke();
    }

    @Override // o.InterfaceC8357dip
    public void b(View view) {
        C8632dsu.c((Object) view, "");
        this.g.a(view);
    }

    @Override // o.InterfaceC8357dip
    public ViewPortMembershipTracker.Membership i() {
        return this.g.d();
    }

    @Override // o.InterfaceC8357dip
    public ImageDataSource d() {
        GetImageRequest.a aVar = this.f;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // o.InterfaceC8357dip
    public InterfaceC8358diq.b b() {
        Bitmap b2;
        String m = this.i.m();
        long j = j();
        long c = c();
        ImageDataSource d = d();
        GetImageRequest.a aVar = this.f;
        return new InterfaceC8358diq.b(m, j, c, d, (aVar == null || (b2 = aVar.b()) == null) ? 0 : b2.getAllocationByteCount(), this.a);
    }

    @Override // o.InterfaceC8357dip
    public void a() {
        this.g.e();
    }

    public final Single<GetImageRequest.a> c(Single<GetImageRequest.a> single) {
        C8632dsu.c((Object) single, "");
        b.getLogTag();
        final drM<GetImageRequest.a, dpR> drm = new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.GetImageTtrTracker$trackRequest$2
            {
                super(1);
            }

            public final void a(GetImageRequest.a aVar) {
                C8359dir c8359dir = C8359dir.this;
                C8632dsu.d(aVar);
                c8359dir.a(aVar);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                a(aVar);
                return dpR.c;
            }
        };
        Single<GetImageRequest.a> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.dio
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8359dir.e(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.GetImageTtrTracker$trackRequest$3
            {
                super(1);
            }

            public final void a(Throwable th) {
                C8359dir c8359dir = C8359dir.this;
                C8632dsu.d(th);
                c8359dir.e(th);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }
        };
        Single<GetImageRequest.a> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dis
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8359dir.a(drM.this, obj);
            }
        });
        C8632dsu.a(doOnError, "");
        return doOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(GetImageRequest.a aVar) {
        b.getLogTag();
        this.f = aVar;
        this.e = this.c.c();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Throwable th) {
        b.getLogTag();
        this.a = th;
        this.e = this.c.c();
        g();
    }
}
