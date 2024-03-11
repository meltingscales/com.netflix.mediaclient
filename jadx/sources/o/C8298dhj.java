package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.netflix.android.imageloader.api.BlurProcessor;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.util.gfx.ImageLoadCanceledError;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C8291dhc;
import o.C8298dhj;
import o.C8632dsu;
import o.C9645uM;
import o.C9684uz;
import o.C9864xy;
import o.dpR;

/* renamed from: o.dhj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8298dhj implements ImageLoader, InterfaceC9636uD {
    public static final b b = new b(null);
    private final boolean a;
    private final HashMap<String, C8255dgt> c;
    private final d d;
    private final File e;
    private final HashMap<String, C8255dgt> f;
    private final InterfaceC8230dgU g;
    private final Handler h;
    private ConcurrentHashMap<String, InteractiveTrackerInterface> i;
    private final long j;
    private final C9865xz l;
    private Runnable m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13840o;

    /* renamed from: o.dhj$d */
    /* loaded from: classes5.dex */
    public interface d {
        void c(String str, Bitmap bitmap);

        Bitmap d(String str);
    }

    /* renamed from: o.dhj$e */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.boxArt.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.merchStill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetType.heroImage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetType.profileAvatar.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetType.titleLogo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetType.postplayBackground.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AssetType.verticalBillboard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AssetType.interactiveContent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr;
        }
    }

    public C8298dhj(InterfaceC8230dgU interfaceC8230dgU, C9865xz c9865xz, int i, long j, File file) {
        C8632dsu.c((Object) interfaceC8230dgU, "");
        C8632dsu.c((Object) c9865xz, "");
        C8632dsu.c((Object) file, "");
        this.g = interfaceC8230dgU;
        this.l = c9865xz;
        this.f13840o = i;
        this.j = j;
        this.e = file;
        this.n = "IMAGE";
        this.f = new HashMap<>();
        this.c = new HashMap<>();
        this.h = new Handler(Looper.getMainLooper());
        this.i = new ConcurrentHashMap<>();
        this.d = C8295dhg.b.b(interfaceC8230dgU);
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader
    public void e(InteractiveTrackerInterface interactiveTrackerInterface) {
        C8632dsu.c((Object) interactiveTrackerInterface, "");
        interactiveTrackerInterface.a(null);
        this.i.remove(interactiveTrackerInterface.a());
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader
    public InteractiveTrackerInterface a(String str) {
        C8632dsu.c((Object) str, "");
        return this.i.get(str);
    }

    @Override // o.InterfaceC9636uD
    public void b() {
        this.l.d(this.n);
        for (Map.Entry<String, C8255dgt> entry : this.f.entrySet()) {
            C8255dgt value = entry.getValue();
            value.c(new ImageLoadCanceledError());
            a(entry.getKey(), value);
        }
        this.f.clear();
        for (InteractiveTrackerInterface interactiveTrackerInterface : this.i.values()) {
            interactiveTrackerInterface.c("cancelled, player video session opened");
        }
    }

    @Override // o.InterfaceC9636uD
    public Single<C9684uz.d> c(final String str, int i, int i2, final int i3) {
        boolean g;
        C8632dsu.c((Object) str, "");
        C8166dfJ.e(null, false, 3, null);
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("image url is blank".toString());
        }
        Single<C8291dhc> b2 = b(str, AssetType.boxArt, i, i2, i3, Bitmap.Config.RGB_565, true, false);
        final drM<C8291dhc, SingleSource<? extends C9684uz.d>> drm = new drM<C8291dhc, SingleSource<? extends C9684uz.d>>() { // from class: com.netflix.mediaclient.util.gfx.volley.VolleyImageLoader$forMigrationOnlyDownloadImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends C9684uz.d> invoke(C8291dhc c8291dhc) {
                Single e2;
                C8632dsu.c((Object) c8291dhc, "");
                e2 = C8298dhj.this.e(str, i3);
                return e2;
            }
        };
        Single flatMap = b2.flatMap(new Function() { // from class: o.dhq
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c2;
                c2 = C8298dhj.c(drM.this, obj);
                return c2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<C9684uz.d> e(final String str, final int i) {
        Single<C9684uz.d> create = Single.create(new SingleOnSubscribe() { // from class: o.dhi
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8298dhj.c(str, this, i, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* renamed from: o.dhj$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC4943bpS {
        final /* synthetic */ SingleEmitter<C9684uz.d> a;

        @Override // o.InterfaceC4943bpS
        public void b(String str, String str2, long j, long j2, Status status) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) status, "");
        }

        @Override // o.InterfaceC4943bpS
        public void d(String str, byte[] bArr, Status status) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bArr, "");
            C8632dsu.c((Object) status, "");
        }

        c(SingleEmitter<C9684uz.d> singleEmitter) {
            this.a = singleEmitter;
        }

        @Override // o.InterfaceC4943bpS
        public void b(String str, String str2, Status status) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) status, "");
            this.a.onSuccess(new C9684uz.d(new File(URI.create(str2)), ImageDataSource.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, C8298dhj c8298dhj, int i, final SingleEmitter singleEmitter) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c8298dhj, "");
        C8632dsu.c((Object) singleEmitter, "");
        c8298dhj.l.e(new C4939bpO(str, new c(singleEmitter), new C9864xy.b() { // from class: o.dhm
            @Override // o.C9864xy.b
            public final void b(VolleyError volleyError) {
                C8298dhj.b(SingleEmitter.this, volleyError);
            }
        }, c8298dhj.f13840o, c8298dhj.e(i), c8298dhj.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SingleEmitter singleEmitter, VolleyError volleyError) {
        C8632dsu.c((Object) singleEmitter, "");
        C8632dsu.c((Object) volleyError, "");
        singleEmitter.tryOnError(volleyError);
    }

    @Override // o.InterfaceC9636uD
    public void e(C9644uL c9644uL, String str, int i, int i2, InterfaceC1741aMn interfaceC1741aMn, boolean z, int i3, Bitmap.Config config, boolean z2) {
        List<? extends InterfaceC9642uJ> i4;
        C8632dsu.c((Object) c9644uL, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1741aMn, "");
        C8632dsu.c((Object) config, "");
        AssetType assetType = AssetType.boxArt;
        ImageLoader.b a2 = a(interfaceC1741aMn);
        Request.Priority e2 = e(i3);
        i4 = C8569dql.i();
        e(str, assetType, a2, i, i2, e2, config, z, z2, i4);
    }

    @Override // o.InterfaceC9636uD
    public void d(C9644uL c9644uL, String str, int i, int i2, C8261dgz c8261dgz, boolean z, int i3, Bitmap.Config config, boolean z2) {
        List<? extends InterfaceC9642uJ> i4;
        C8632dsu.c((Object) c9644uL, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c8261dgz, "");
        C8632dsu.c((Object) config, "");
        AssetType assetType = AssetType.boxArt;
        Request.Priority e2 = e(i3);
        i4 = C8569dql.i();
        e(str, assetType, c8261dgz, i, i2, e2, config, z, z2, i4);
    }

    @Override // o.InterfaceC9636uD
    public void b(C9644uL c9644uL, String str, int i, int i2, InterfaceC1741aMn interfaceC1741aMn, boolean z, int i3, Bitmap.Config config, boolean z2) {
        List<? extends InterfaceC9642uJ> i4;
        C8632dsu.c((Object) c9644uL, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1741aMn, "");
        C8632dsu.c((Object) config, "");
        AssetType assetType = AssetType.boxArt;
        ImageLoader.b a2 = a(interfaceC1741aMn);
        Request.Priority e2 = e(i3);
        i4 = C8569dql.i();
        e(str, assetType, a2, i, i2, e2, config, z, z2, i4);
    }

    private final Request.Priority e(int i) {
        if (i != 0) {
            if (i == 1) {
                return Request.Priority.NORMAL;
            }
            throw new IllegalArgumentException("Unsupported priority: " + i);
        }
        return Request.Priority.LOW;
    }

    /* renamed from: o.dhj$f */
    /* loaded from: classes5.dex */
    public static final class f implements ImageLoader.b {
        final /* synthetic */ InterfaceC1741aMn e;

        f(InterfaceC1741aMn interfaceC1741aMn) {
            this.e = interfaceC1741aMn;
        }

        @Override // o.C9864xy.b
        public void b(VolleyError volleyError) {
            this.e.e(volleyError != null ? volleyError.getMessage() : null);
        }

        @Override // com.netflix.mediaclient.util.gfx.ImageLoader.b
        public void e(C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
            C8632dsu.c((Object) c8259dgx, "");
            C8632dsu.c((Object) assetLocationType, "");
            this.e.c(c8259dgx.d(), c8259dgx.e(), assetLocationType, interfaceC9640uH);
        }
    }

    private final ImageLoader.b a(InterfaceC1741aMn interfaceC1741aMn) {
        return new f(interfaceC1741aMn);
    }

    public void a() {
        d dVar = this.d;
        C8632dsu.d(dVar);
        ((LruCache) dVar).evictAll();
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader
    public void d(int i) {
        if (i >= 60) {
            a();
        }
    }

    @Override // o.InterfaceC9636uD
    public void c(C9644uL c9644uL, ImageLoader.a aVar, String str, ImageLoader.c cVar, boolean z, int i, Bitmap.Config config, boolean z2, SingleObserver<ShowImageRequest.a> singleObserver, boolean z3, List<? extends InterfaceC9642uJ> list) {
        C8632dsu.c((Object) c9644uL, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) list, "");
        e(aVar, str, AssetType.boxArt, cVar, z, i, config, z2, singleObserver, list);
    }

    private final void e(ImageLoader.a aVar, String str, AssetType assetType, ImageLoader.c cVar, boolean z, int i, Bitmap.Config config, boolean z2, SingleObserver<ShowImageRequest.a> singleObserver, List<? extends InterfaceC9642uJ> list) {
        RJ imageLoaderInfo = aVar.getImageLoaderInfo();
        String str2 = imageLoaderInfo != null ? imageLoaderInfo.e : null;
        RJ rj = new RJ(str, cVar, config, assetType);
        aVar.setImageLoaderInfo(rj);
        if (imageLoaderInfo != null && imageLoaderInfo.a && TextUtils.equals(imageLoaderInfo.e, str)) {
            rj.a(true);
        }
        if (str == null) {
            aVar.setImageDrawable(null);
        } else if (!C8632dsu.c((Object) str, (Object) str2)) {
            b(aVar, str, assetType, cVar, z, i, config, z2, singleObserver, list);
        } else if (singleObserver != null) {
            singleObserver.onSuccess(new ShowImageRequest.a(true, null));
        }
    }

    private final void b(ImageLoader.a aVar, String str, AssetType assetType, ImageLoader.c cVar, boolean z, int i, Bitmap.Config config, boolean z2, SingleObserver<ShowImageRequest.a> singleObserver, List<? extends InterfaceC9642uJ> list) {
        ImageLoader.b c8292dhd;
        if (cVar.e()) {
            c8292dhd = new C8290dhb(aVar, str, cVar, singleObserver);
        } else if (z) {
            c8292dhd = new C8294dhf(aVar, str, cVar, singleObserver);
        } else {
            c8292dhd = new C8292dhd(aVar, str, cVar, singleObserver);
        }
        e(str, assetType, c8292dhd, 0, 0, i > 0 ? Request.Priority.NORMAL : Request.Priority.LOW, z2 ? Bitmap.Config.ARGB_8888 : config, true, z2, list);
    }

    @Override // o.InterfaceC9636uD
    public void e(ImageLoader.a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.setContentDescription(null);
        aVar.setImageLoaderInfo(null);
        if (aVar instanceof View) {
            View view = (View) aVar;
            Runnable runnable = (Runnable) view.getTag(C9645uM.c.d);
            if (runnable != null) {
                C8187dfe.e(runnable);
                view.setTag(C9645uM.c.d, null);
            }
        }
    }

    private final Single<C8291dhc> b(final String str, final AssetType assetType, final int i, final int i2, final int i3, final Bitmap.Config config, final boolean z, final boolean z2) {
        Single<C8291dhc> create = Single.create(new SingleOnSubscribe() { // from class: o.dho
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8298dhj.c(C8298dhj.this, str, assetType, i, i2, i3, config, z, z2, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* renamed from: o.dhj$a */
    /* loaded from: classes5.dex */
    public static final class a implements ImageLoader.b {
        final /* synthetic */ String a;
        final /* synthetic */ SingleEmitter<C8291dhc> b;

        a(SingleEmitter<C8291dhc> singleEmitter, String str) {
            this.b = singleEmitter;
            this.a = str;
        }

        @Override // com.netflix.mediaclient.util.gfx.ImageLoader.b
        public void e(C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
            C8632dsu.c((Object) c8259dgx, "");
            C8632dsu.c((Object) assetLocationType, "");
            Bitmap d = c8259dgx.d();
            if (d != null) {
                this.b.onSuccess(new C8291dhc(d, assetLocationType));
            }
        }

        @Override // o.C9864xy.b
        public void b(VolleyError volleyError) {
            C8632dsu.c((Object) volleyError, "");
            this.b.tryOnError(volleyError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C8298dhj c8298dhj, String str, AssetType assetType, int i, int i2, int i3, Bitmap.Config config, boolean z, boolean z2, SingleEmitter singleEmitter) {
        List<? extends InterfaceC9642uJ> i4;
        C8632dsu.c((Object) c8298dhj, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) assetType, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) singleEmitter, "");
        a aVar = new a(singleEmitter, str);
        Request.Priority e2 = c8298dhj.e(i3);
        i4 = C8569dql.i();
        c8298dhj.e(str, assetType, aVar, i, i2, e2, config, z, z2, i4);
    }

    public final C8259dgx e(String str, AssetType assetType, ImageLoader.b bVar, int i, int i2, Request.Priority priority, Bitmap.Config config, boolean z, boolean z2, List<? extends InterfaceC9642uJ> list) {
        String d2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) assetType, "");
        C8632dsu.c((Object) priority, "");
        C8632dsu.c((Object) config, "");
        C8632dsu.c((Object) list, "");
        C8166dfJ.e(null, false, 3, null);
        b bVar2 = b;
        if (!bVar2.c(str)) {
            String str2 = "Request URL is NOT valid, unable to load " + str;
            bVar2.getLogTag();
            C8259dgx c8259dgx = new C8259dgx(null, str, "ERROR", bVar, this.f, this.c);
            if (bVar != null) {
                bVar.b(new VolleyError(str2));
                dpR dpr = dpR.c;
            }
            return c8259dgx;
        }
        if (bVar instanceof C8261dgz) {
            ((C8261dgz) bVar).e(this.i);
        }
        if (z2) {
            d2 = bVar2.d(str, list) + "blurry515";
        } else {
            d2 = bVar2.d(str, list);
        }
        String str3 = d2;
        C8259dgx b2 = b(str3, str, bVar);
        if (b2 != null) {
            return b2;
        }
        C8259dgx c8259dgx2 = new C8259dgx(null, str, str3, bVar, this.f, this.c);
        if (bVar != null) {
            bVar.e(c8259dgx2, ImageLoader.AssetLocationType.PLACEHOLDER, null);
        }
        if (c(str3, str, c8259dgx2) != null) {
            return c8259dgx2;
        }
        c(str, str3, z2, list, z, i, i2, config, priority, assetType, c8259dgx2);
        return c8259dgx2;
    }

    private final C8255dgt c(String str, String str2, C8259dgx c8259dgx) {
        C8255dgt c8255dgt = this.f.get(str);
        if (c8255dgt != null) {
            c8255dgt.d(c8259dgx);
            return c8255dgt;
        }
        return null;
    }

    private final C8259dgx b(String str, String str2, ImageLoader.b bVar) {
        Bitmap d2 = this.d.d(str);
        if (d2 != null) {
            C8259dgx c8259dgx = new C8259dgx(d2, str2, null, null, this.f, this.c);
            if (bVar != null) {
                bVar.e(c8259dgx, ImageLoader.AssetLocationType.MEMCACHE, null);
            }
            return c8259dgx;
        }
        return null;
    }

    private final void c(String str, final String str2, final boolean z, final List<? extends InterfaceC9642uJ> list, final boolean z2, int i, int i2, Bitmap.Config config, Request.Priority priority, AssetType assetType, C8259dgx c8259dgx) {
        C8233dgX c8233dgX = new C8233dgX(str, new C9864xy.a() { // from class: o.dhl
            @Override // o.C9864xy.a
            public final void b(Object obj) {
                C8298dhj.a(z, list, this, str2, z2, (Bitmap) obj);
            }
        }, i, i2, config, new C9864xy.b() { // from class: o.dhn
            @Override // o.C9864xy.b
            public final void b(VolleyError volleyError) {
                C8298dhj.e(C8298dhj.this, str2, volleyError);
            }
        }, priority, this.f13840o, this.j, new C8293dhe(this.g, str), this.g);
        c8233dgX.d((Object) this.n);
        switch (e.b[assetType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                c8233dgX.c(NetworkRequestType.CONTENT_BOXART);
                break;
            default:
                b.getLogTag();
                break;
        }
        this.l.e(c8233dgX);
        this.f.put(str2, new C8255dgt(c8233dgX, c8259dgx));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, List list, final C8298dhj c8298dhj, final String str, final boolean z2, Bitmap bitmap) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c8298dhj, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bitmap, "");
        if (z || (!list.isEmpty())) {
            Single<Bitmap> observeOn = c8298dhj.d(bitmap, z, list).observeOn(AndroidSchedulers.mainThread());
            final drM<Bitmap, dpR> drm = new drM<Bitmap, dpR>() { // from class: com.netflix.mediaclient.util.gfx.volley.VolleyImageLoader$submitNewImageDownloadRequest$newRequest$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Bitmap bitmap2) {
                    a(bitmap2);
                    return dpR.c;
                }

                public final void a(Bitmap bitmap2) {
                    C8632dsu.c((Object) bitmap2, "");
                    C8298dhj.this.a(str, bitmap2, z2);
                }
            };
            observeOn.subscribe(new Consumer() { // from class: o.dhk
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8298dhj.d(drM.this, obj);
                }
            });
            return;
        }
        c8298dhj.a(str, bitmap, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C8298dhj c8298dhj, String str, VolleyError volleyError) {
        C8632dsu.c((Object) c8298dhj, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) volleyError, "");
        c8298dhj.b(str, volleyError);
    }

    private final Single<Bitmap> d(final Bitmap bitmap, final boolean z, final List<? extends InterfaceC9642uJ> list) {
        Single<Bitmap> subscribeOn = Single.create(new SingleOnSubscribe() { // from class: o.dhp
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C8298dhj.c(bitmap, z, list, singleEmitter);
            }
        }).subscribeOn(Schedulers.computation());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Bitmap bitmap, boolean z, List list, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) singleEmitter, "");
        Context d2 = AbstractApplicationC1040Mh.d();
        if (z) {
            BlurProcessor.c cVar = BlurProcessor.c;
            Context d3 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d3, "");
            bitmap = cVar.a(d3).c(bitmap, BlurProcessor.Intensity.e);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8632dsu.d(d2);
            bitmap = ((InterfaceC9642uJ) it.next()).a(d2, bitmap, width, height);
        }
        singleEmitter.onSuccess(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Bitmap bitmap, boolean z) {
        C8166dfJ.e(null, false, 3, null);
        if (z && !this.a) {
            this.d.c(str, bitmap);
        }
        C8255dgt remove = this.f.remove(str);
        if (remove != null) {
            remove.d = bitmap;
            a(str, remove);
        }
    }

    private final void b(String str, VolleyError volleyError) {
        C8166dfJ.e(null, false, 3, null);
        C8255dgt remove = this.f.remove(str);
        if (remove == null) {
            throw new IllegalStateException(("Could not find request with key " + str).toString());
        }
        remove.c(volleyError);
        a(str, remove);
    }

    private final void a(String str, final C8255dgt c8255dgt) {
        this.c.put(str, c8255dgt);
        if (this.m == null) {
            Runnable runnable = new Runnable() { // from class: o.dhh
                @Override // java.lang.Runnable
                public final void run() {
                    C8298dhj.b(C8298dhj.this, c8255dgt);
                }
            };
            this.h.postDelayed(runnable, 100L);
            this.m = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C8298dhj c8298dhj, C8255dgt c8255dgt) {
        List<C8255dgt> G;
        ImageLoader.AssetLocationType assetLocationType;
        C8632dsu.c((Object) c8298dhj, "");
        C8632dsu.c((Object) c8255dgt, "");
        Collection<C8255dgt> values = c8298dhj.c.values();
        C8632dsu.a(values, "");
        G = C8576dqs.G(values);
        for (C8255dgt c8255dgt2 : G) {
            LinkedList<C8259dgx> linkedList = c8255dgt2.e;
            C8632dsu.a(linkedList, "");
            ArrayList<C8259dgx> arrayList = new ArrayList();
            for (Object obj : linkedList) {
                if (((C8259dgx) obj).a != null) {
                    arrayList.add(obj);
                }
            }
            for (C8259dgx c8259dgx : arrayList) {
                ImageLoader.b bVar = c8259dgx.a;
                if (c8255dgt2.c() == null) {
                    c8259dgx.e = c8255dgt2.d;
                    if (c8255dgt.e() == Request.ResourceLocationType.CACHE) {
                        assetLocationType = ImageLoader.AssetLocationType.DISKCACHE;
                    } else {
                        assetLocationType = ImageLoader.AssetLocationType.NETWORK;
                    }
                    bVar.e(c8259dgx, assetLocationType, null);
                } else {
                    bVar.b(c8255dgt2.c());
                }
            }
        }
        c8298dhj.c.clear();
        c8298dhj.m = null;
    }

    /* renamed from: o.dhj$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("VolleyImageLoader");
        }

        public final String d(String str, List<? extends InterfaceC9642uJ> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            String a = a(str);
            if (list.isEmpty()) {
                return a;
            }
            StringBuilder sb = new StringBuilder(a);
            for (InterfaceC9642uJ interfaceC9642uJ : list) {
                sb.append(interfaceC9642uJ.d());
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }

        public final String a(String str) {
            C8632dsu.c((Object) str, "");
            String d = C8342dia.d(str);
            String e = C8342dia.e(str);
            if (e == null) {
                C8632dsu.d((Object) d);
                return d;
            }
            return d + e;
        }

        public final boolean c(String str) {
            boolean g;
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    try {
                        Uri parse = Uri.parse(str);
                        C8632dsu.d(parse);
                        if (parse.getHost() != null && parse.getScheme() != null) {
                            return true;
                        }
                    } catch (URISyntaxException unused) {
                    }
                }
            }
            return false;
        }
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader
    public void b(InteractiveTrackerInterface interactiveTrackerInterface) {
        C8632dsu.c((Object) interactiveTrackerInterface, "");
        b.getLogTag();
        InteractiveTrackerInterface interactiveTrackerInterface2 = this.i.get(interactiveTrackerInterface.a());
        if (interactiveTrackerInterface2 != null) {
            interactiveTrackerInterface2.a(null);
        }
        ConcurrentHashMap<String, InteractiveTrackerInterface> concurrentHashMap = this.i;
        String a2 = interactiveTrackerInterface.a();
        C8632dsu.a(a2, "");
        concurrentHashMap.put(a2, interactiveTrackerInterface);
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader
    public void d(ImageLoader.a aVar, AssetType assetType) {
        boolean g;
        List<? extends InterfaceC9642uJ> i;
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) assetType, "");
        b bVar = b;
        bVar.getLogTag();
        RJ imageLoaderInfo = aVar.getImageLoaderInfo();
        if (imageLoaderInfo != null) {
            String str = imageLoaderInfo.e;
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    C8632dsu.d((Object) str);
                    ImageLoader.c c2 = imageLoaderInfo.c();
                    C8632dsu.a(c2, "");
                    Bitmap.Config config = imageLoaderInfo.c;
                    C8632dsu.a(config, "");
                    i = C8569dql.i();
                    b(aVar, str, assetType, c2, false, 1, config, false, null, i);
                    return;
                }
            }
            bVar.getLogTag();
            return;
        }
        bVar.getLogTag();
    }
}
