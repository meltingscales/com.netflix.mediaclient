package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$getImage$single$1;
import com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$prefetchImage$single$1;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.gfx.ImageLoadCanceledError;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import o.C1079Nx;
import o.C1596aHd;
import o.C8632dsu;
import o.C9646uN;
import o.C9684uz;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC9636uD;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;

@Singleton
/* renamed from: o.uR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9650uR extends AbstractC5999cQf<InterfaceC4942bpR> implements InterfaceC9638uF, InterfaceC9637uE {
    public static final a b = new a(null);
    private final InterfaceC9643uK c;
    private final Context d;
    private final InterfaceC9651uS e;
    private final InterfaceC9639uG h;

    /* renamed from: o.uR$e */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ShowImageRequest.Priority.values().length];
            try {
                iArr[ShowImageRequest.Priority.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowImageRequest.Priority.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    @Override // o.InterfaceC9638uF
    public boolean d() {
        return true;
    }

    /* renamed from: o.uR$a */
    /* loaded from: classes2.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ImageLoaderRepositoryImpl");
        }
    }

    @Inject
    public C9650uR(@ApplicationContext Context context, InterfaceC9639uG interfaceC9639uG, InterfaceC9643uK interfaceC9643uK, InterfaceC9651uS interfaceC9651uS) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC9639uG, "");
        C8632dsu.c((Object) interfaceC9643uK, "");
        C8632dsu.c((Object) interfaceC9651uS, "");
        this.d = context;
        this.h = interfaceC9639uG;
        this.c = interfaceC9643uK;
        this.e = interfaceC9651uS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9638uF
    public Single<C9646uN.e> d(C9646uN.b bVar) {
        C8632dsu.c((Object) bVar, "");
        boolean b2 = bVar.b();
        Single<InterfaceC9636uD> b3 = this.e.b();
        final ImageLoaderRepositoryImpl$prefetchImage$single$1 imageLoaderRepositoryImpl$prefetchImage$single$1 = new ImageLoaderRepositoryImpl$prefetchImage$single$1(bVar, !b2, 0);
        Single flatMap = b3.flatMap(new Function() { // from class: o.uZ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource k;
                k = C9650uR.k(drM.this, obj);
                return k;
            }
        });
        C8632dsu.a(flatMap, "");
        Single single = flatMap;
        for (InterfaceC9635uC interfaceC9635uC : this.c.b()) {
            single = interfaceC9635uC.b(bVar, single);
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9638uF
    public Single<C9684uz.d> e(final C9684uz.a aVar) {
        C8632dsu.c((Object) aVar, "");
        Single<InterfaceC9636uD> b2 = this.e.b();
        final drM<InterfaceC9636uD, SingleSource<? extends C9684uz.d>> drm = new drM<InterfaceC9636uD, SingleSource<? extends C9684uz.d>>() { // from class: com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$downloadImage$single$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends C9684uz.d> invoke(InterfaceC9636uD interfaceC9636uD) {
                C8632dsu.c((Object) interfaceC9636uD, "");
                return interfaceC9636uD.c(C9684uz.a.this.e(), C9684uz.a.this.a(), C9684uz.a.this.b(), 0);
            }
        };
        Single flatMap = b2.flatMap(new Function() { // from class: o.va
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource h;
                h = C9650uR.h(drM.this, obj);
                return h;
            }
        });
        C8632dsu.a(flatMap, "");
        Single single = flatMap;
        for (InterfaceC9635uC interfaceC9635uC : this.c.b()) {
            single = interfaceC9635uC.c(aVar, single);
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9638uF
    public Single<GetImageRequest.a> b(GetImageRequest.e eVar) {
        C8632dsu.c((Object) eVar, "");
        C8166dfJ.e("ImageLoaderRepository called from non-main thread", true);
        boolean b2 = eVar.b();
        Bitmap.Config config = (eVar.a() || eVar.d()) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Single<InterfaceC9636uD> c = this.e.c();
        final ImageLoaderRepositoryImpl$getImage$single$1 imageLoaderRepositoryImpl$getImage$single$1 = new ImageLoaderRepositoryImpl$getImage$single$1(eVar, !b2, 0, config);
        Single flatMap = c.flatMap(new Function() { // from class: o.uW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource o2;
                o2 = C9650uR.o(drM.this, obj);
                return o2;
            }
        });
        C8632dsu.a(flatMap, "");
        Single single = flatMap;
        for (InterfaceC9635uC interfaceC9635uC : this.c.b()) {
            single = interfaceC9635uC.b(eVar, single);
        }
        return single;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9637uE
    public void d(ImageLoader.a aVar, ShowImageRequest.d dVar) {
        Bitmap.Config config;
        Lifecycle lifecycle;
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) dVar, "");
        int i = 1;
        C8166dfJ.e("ImageLoaderRepository called from non-main thread", true);
        ImageView imageView = aVar.getImageView();
        C8632dsu.a(imageView, "");
        d(imageView);
        final SingleObserver<ShowImageRequest.a> d = dVar.d();
        String m = dVar.a().m();
        if (m == null) {
            aVar.setImageDrawable(null);
            aVar.setImageLoaderInfo(null);
            if (d != null) {
                d.onSuccess(new ShowImageRequest.a(true, null));
                return;
            }
            return;
        }
        C9722vk a2 = a(dVar);
        if (!C9716ve.d(m)) {
            if (a2.b() != 0) {
                aVar.setImageResource(a2.b());
            }
            if (d != null) {
                d.onError(new IllegalArgumentException("Invalid URL: " + m));
                return;
            }
            return;
        }
        int i2 = e.b[dVar.a().i().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        int i3 = i;
        if (dVar.a().a() || dVar.a().c()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config2 = config;
        Single<InterfaceC9636uD> c = this.e.c();
        final ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1 imageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1 = new ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$single$1(dVar, aVar, m, a2, i3, config2);
        Single flatMap = c.flatMap(new Function() { // from class: o.uU
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource f;
                f = C9650uR.f(drM.this, obj);
                return f;
            }
        });
        C8632dsu.a(flatMap, "");
        for (InterfaceC9635uC interfaceC9635uC : this.c.b()) {
            ImageView imageView2 = aVar.getImageView();
            C8632dsu.a(imageView2, "");
            flatMap = interfaceC9635uC.b(imageView2, dVar, flatMap);
        }
        Fragment b2 = dVar.b();
        if (b2 == null || (lifecycle = b2.getLifecycle()) == null) {
            FragmentActivity c2 = dVar.c();
            Lifecycle lifecycle2 = c2 != null ? c2.getLifecycle() : null;
            C8632dsu.d(lifecycle2);
            lifecycle = lifecycle2;
        }
        AndroidLifecycleScopeProvider c3 = AndroidLifecycleScopeProvider.c(lifecycle, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(c3, "");
        Object as = flatMap.as(AutoDispose.b(c3));
        C8632dsu.b(as, "");
        final drM<ShowImageRequest.a, dpR> drm = new drM<ShowImageRequest.a, dpR>() { // from class: com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ShowImageRequest.a aVar2) {
                c(aVar2);
                return dpR.c;
            }

            public final void c(ShowImageRequest.a aVar2) {
                SingleObserver<ShowImageRequest.a> singleObserver = d;
                if (singleObserver != null) {
                    singleObserver.onSuccess(aVar2);
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.uX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9650uR.j(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.android.imageloader.impl.ImageLoaderRepositoryImpl$forImageViewsOnlyShowImage$2
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
                Map b3;
                Map k;
                Throwable th2;
                SingleObserver<ShowImageRequest.a> singleObserver = d;
                if (singleObserver != null) {
                    singleObserver.onError(th);
                }
                if (C1079Nx.e(th)) {
                    InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
                    b3 = dqD.b(dpD.a("errorSource", "ImageLoaderRepository"));
                    k = dqE.k(b3);
                    C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b4 = c1596aHd.b();
                        if (b4 != null) {
                            String c4 = errorType.c();
                            c1596aHd.a(c4 + " " + b4);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                    InterfaceC1597aHe c5 = dVar3.c();
                    if (c5 != null) {
                        c5.d(c1596aHd, th2);
                    } else {
                        dVar3.e().b(c1596aHd, th2);
                    }
                }
            }
        };
        ((SingleSubscribeProxy) as).c(consumer, new Consumer() { // from class: o.uY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9650uR.g(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC9637uE
    public void b(ImageLoader.a aVar) {
        InterfaceC9636uD d;
        C8632dsu.c((Object) aVar, "");
        C8166dfJ.e("ImageLoaderRepository called from non-main thread", true);
        if (b() == null || (d = this.e.d()) == null) {
            return;
        }
        d.e(aVar);
    }

    @Override // o.InterfaceC9638uF
    @SuppressLint({"CheckResult"})
    public void c() {
        C8166dfJ.e("ImageLoaderRepository called from non-main thread", true);
        if (b() == null) {
            return;
        }
        for (InterfaceC9635uC interfaceC9635uC : this.c.b()) {
            interfaceC9635uC.c();
        }
        InterfaceC9636uD d = this.e.d();
        if (d != null) {
            d.b();
        }
    }

    @Override // o.InterfaceC9638uF
    public boolean e(Throwable th) {
        C8632dsu.c((Object) th, "");
        return th instanceof ImageLoadCanceledError;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: e */
    public InterfaceC4942bpR a() {
        Object o2 = AbstractApplicationC1040Mh.getInstance().i().o();
        C8632dsu.d(o2);
        return (InterfaceC4942bpR) o2;
    }

    private final InterfaceC4942bpR b() {
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        if (i.r()) {
            return (InterfaceC4942bpR) i.o();
        }
        return null;
    }

    private final C9722vk a(ShowImageRequest.d dVar) {
        int e2;
        int i = 0;
        if (dVar.a().e()) {
            e2 = 0;
        } else if (dVar.a().j() != null) {
            Integer j = dVar.a().j();
            C8632dsu.d(j);
            e2 = j.intValue();
        } else {
            e2 = this.h.e();
        }
        if (!dVar.a().d()) {
            if (dVar.a().f() != null) {
                Integer f = dVar.a().f();
                C8632dsu.d(f);
                i = f.intValue();
            } else {
                i = this.h.b();
            }
        }
        return new C9722vk(e2, i);
    }

    private final void d(ImageView imageView) {
        if (imageView.getLayoutParams() != null) {
            if (imageView.getLayoutParams().width == -2) {
                b.getLogTag();
            }
            if (imageView.getLayoutParams().height == -2) {
                b.getLogTag();
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            boolean z = true;
            boolean z2 = width == 0 && height != 0;
            if (height != 0 || width == 0) {
                z = false;
            }
            if (z2 || z) {
                b.getLogTag();
                return;
            }
            return;
        }
        b.getLogTag();
    }
}
