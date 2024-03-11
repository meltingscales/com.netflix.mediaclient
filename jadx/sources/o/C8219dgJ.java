package o;

import android.widget.ImageView;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import o.C1665aJs;
import o.C8222dgM;
import o.C8632dsu;
import o.C9646uN;
import o.C9684uz;
import o.InterfaceC8216dgG;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.dgJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8219dgJ implements InterfaceC9635uC {
    public static final a c = new a(null);
    private final InterfaceC8215dgF b;
    private final InterfaceC1270Vf d;
    private final InterfaceC8216dgG e;

    /* renamed from: o.dgJ$c */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GetImageRequest.Reason.values().length];
            try {
                iArr[GetImageRequest.Reason.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetImageRequest.Reason.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetImageRequest.Reason.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetImageRequest.Reason.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // o.InterfaceC9635uC
    public void c() {
    }

    @Inject
    public C8219dgJ(InterfaceC8215dgF interfaceC8215dgF, InterfaceC8216dgG interfaceC8216dgG, InterfaceC1270Vf interfaceC1270Vf) {
        C8632dsu.c((Object) interfaceC8215dgF, "");
        C8632dsu.c((Object) interfaceC8216dgG, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.b = interfaceC8215dgF;
        this.e = interfaceC8216dgG;
        this.d = interfaceC1270Vf;
    }

    /* renamed from: o.dgJ$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.InterfaceC9635uC
    public Single<C9646uN.e> b(final C9646uN.b bVar, Single<C9646uN.e> single) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) single, "");
        if (this.b.c()) {
            final C1665aJs c1665aJs = new C1665aJs(0L, null, false, this.d, 6, null);
            c1665aJs.d("ImagePerfTrace");
            final String str = bVar.j() ? "prefetch-f" : "prefetch-b";
            final drM<C9646uN.e, dpR> drm = new drM<C9646uN.e, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackPrefetchImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C9646uN.e eVar) {
                    b(eVar);
                    return dpR.c;
                }

                public final void b(C9646uN.e eVar) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject a2 = C8222dgM.a(eVar.a());
                    a2.put("type", str);
                    c1665aJs.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : C8222dgM.b(eVar.a()), (r17 & 4) != 0 ? NetflixTraceStatus.success : NetflixTraceStatus.success, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : Boolean.valueOf(C8222dgM.e(eVar.a())), (r17 & 64) != 0 ? null : C8222dgM.b(bVar.d(), bVar.c()), (r17 & 128) == 0 ? a2 : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<C9646uN.e> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.dgP
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.l(drM.this, obj);
                }
            });
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackPrefetchImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", str);
                    C1665aJs c1665aJs2 = c1665aJs;
                    C8632dsu.d(th);
                    c1665aJs2.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : C8222dgM.b(th), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : th.getMessage(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : C8222dgM.b(bVar.d(), bVar.c()), (r17 & 128) == 0 ? jSONObject : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<C9646uN.e> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dgO
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.m(drM.this, obj);
                }
            });
            C8632dsu.a(doOnError, "");
            return doOnError;
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC9635uC
    public Single<C9684uz.d> c(C9684uz.a aVar, Single<C9684uz.d> single) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) single, "");
        if (this.b.c()) {
            final C1665aJs c1665aJs = new C1665aJs(0L, null, false, this.d, 6, null);
            c1665aJs.d("ImagePerfTrace");
            final drM<C9684uz.d, dpR> drm = new drM<C9684uz.d, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackDownloadImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C9684uz.d dVar) {
                    e(dVar);
                    return dpR.c;
                }

                public final void e(C9684uz.d dVar) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject a2 = C8222dgM.a(dVar.d());
                    a2.put("type", r1);
                    c1665aJs.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : C8222dgM.b(dVar.d()), (r17 & 4) != 0 ? NetflixTraceStatus.success : NetflixTraceStatus.success, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : Boolean.valueOf(C8222dgM.e(dVar.d())), (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? a2 : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<C9684uz.d> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.dgK
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.i(drM.this, obj);
                }
            });
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackDownloadImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", r1);
                    C1665aJs c1665aJs2 = c1665aJs;
                    C8632dsu.d(th);
                    c1665aJs2.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : C8222dgM.b(th), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : th.getMessage(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? jSONObject : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<C9684uz.d> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dgL
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.h(drM.this, obj);
                }
            });
            C8632dsu.a(doOnError, "");
            return doOnError;
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC9635uC
    public Single<GetImageRequest.a> b(final GetImageRequest.e eVar, Single<GetImageRequest.a> single) {
        final String str;
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) single, "");
        if (this.b.c()) {
            final C1665aJs c1665aJs = new C1665aJs(0L, null, false, this.d, 6, null);
            c1665aJs.d("ImagePerfTrace");
            int i = c.a[eVar.h().ordinal()];
            if (i == 1) {
                str = "get-p";
            } else if (i == 2) {
                str = "get-v";
            } else if (i == 3) {
                str = "get-c";
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                str = "get-n";
            }
            final drM<GetImageRequest.a, dpR> drm = new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackGetImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    e(aVar);
                    return dpR.c;
                }

                public final void e(GetImageRequest.a aVar) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject a2 = C8222dgM.a(aVar.d());
                    a2.put("type", str);
                    a2.put("bytes", aVar.b().getAllocationByteCount());
                    c1665aJs.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : C8222dgM.b(aVar.d()), (r17 & 4) != 0 ? NetflixTraceStatus.success : NetflixTraceStatus.success, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : Boolean.valueOf(C8222dgM.e(aVar.d())), (r17 & 64) != 0 ? null : C8222dgM.b(eVar.c(), eVar.f()), (r17 & 128) == 0 ? a2 : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<GetImageRequest.a> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.dgI
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.k(drM.this, obj);
                }
            });
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackGetImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", str);
                    C1665aJs c1665aJs2 = c1665aJs;
                    C8632dsu.d(th);
                    c1665aJs2.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : C8222dgM.b(th), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : th.getMessage(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : C8222dgM.b(eVar.c(), eVar.f()), (r17 & 128) == 0 ? jSONObject : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<GetImageRequest.a> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dgH
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.o(drM.this, obj);
                }
            });
            C8632dsu.a(doOnError, "");
            return doOnError;
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC9635uC
    public Single<ShowImageRequest.a> b(ImageView imageView, final ShowImageRequest.d dVar, Single<ShowImageRequest.a> single) {
        C8632dsu.c((Object) imageView, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) single, "");
        if (this.b.c()) {
            final C1665aJs c1665aJs = new C1665aJs(0L, null, false, this.d, 6, null);
            c1665aJs.d("ImagePerfTrace");
            final drM<ShowImageRequest.a, dpR> drm = new drM<ShowImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackShowImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ShowImageRequest.a aVar) {
                    c(aVar);
                    return dpR.c;
                }

                public final void c(ShowImageRequest.a aVar) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    if (aVar.b()) {
                        return;
                    }
                    ImageDataSource c2 = aVar.c();
                    if (c2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    JSONObject a2 = C8222dgM.a(c2);
                    a2.put("type", r1);
                    c1665aJs.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : C8222dgM.b(c2), (r17 & 4) != 0 ? NetflixTraceStatus.success : NetflixTraceStatus.success, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : Boolean.valueOf(C8222dgM.e(c2)), (r17 & 64) != 0 ? null : C8222dgM.b(dVar.c(), dVar.b()), (r17 & 128) == 0 ? a2 : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<ShowImageRequest.a> doOnSuccess = single.doOnSuccess(new Consumer() { // from class: o.dgN
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.n(drM.this, obj);
                }
            });
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.util.gfx.perf.ImagePerfTraceTracker$trackShowImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
                    InterfaceC8216dgG interfaceC8216dgG;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", r1);
                    C1665aJs c1665aJs2 = c1665aJs;
                    C8632dsu.d(th);
                    c1665aJs2.e("ImagePerfTrace", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : C8222dgM.b(th), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : th.getMessage(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : C8222dgM.b(dVar.c(), dVar.b()), (r17 & 128) == 0 ? jSONObject : null);
                    interfaceC8216dgG = this.e;
                    interfaceC8216dgG.d(c1665aJs);
                }
            };
            Single<ShowImageRequest.a> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.dgQ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8219dgJ.p(drM.this, obj);
                }
            });
            C8632dsu.a(doOnError, "");
            return doOnError;
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
