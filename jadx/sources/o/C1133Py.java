package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import o.C1133Py;
import o.C1140Qf;
import o.C8007dcJ;
import o.C8608drx;
import o.C8632dsu;
import o.InterfaceC9638uF;
import o.dpR;

/* renamed from: o.Py  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1133Py {
    public static final b a = new b(null);
    private static final Bitmap.CompressFormat b = Bitmap.CompressFormat.PNG;
    private final C1140Qf e;

    public C1133Py() {
        this(null, 1, null);
    }

    /* renamed from: o.Py$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public C1133Py(C1140Qf c1140Qf) {
        C8632dsu.c((Object) c1140Qf, "");
        this.e = c1140Qf;
    }

    public /* synthetic */ C1133Py(C1140Qf c1140Qf, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C1140Qf() : c1140Qf);
    }

    public final Single<File> b(final FragmentActivity fragmentActivity, final String str, final String str2, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Single<GetImageRequest.a> observeOn = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).d(i).c(i2).d(true).a()).observeOn(Schedulers.io());
        final drM<GetImageRequest.a, Bitmap> drm = new drM<GetImageRequest.a, Bitmap>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$createVerticalBillboardWithLogo$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Bitmap invoke(GetImageRequest.a aVar) {
                Bitmap d;
                C8632dsu.c((Object) aVar, "");
                Object a2 = C1140Qf.d.a();
                C1133Py c1133Py = C1133Py.this;
                synchronized (a2) {
                    d = c1133Py.d(aVar.b());
                }
                return d;
            }
        };
        Single observeOn2 = observeOn.map(new Function() { // from class: o.Pv
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap k;
                k = C1133Py.k(drM.this, obj);
                return k;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final drM<Bitmap, SingleSource<? extends Bitmap>> drm2 = new drM<Bitmap, SingleSource<? extends Bitmap>>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$createVerticalBillboardWithLogo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final SingleSource<? extends Bitmap> invoke(Bitmap bitmap) {
                Single a2;
                C8632dsu.c((Object) bitmap, "");
                a2 = C1133Py.this.a(fragmentActivity, bitmap, str2);
                return a2;
            }
        };
        Single flatMap = observeOn2.flatMap(new Function() { // from class: o.PC
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource o2;
                o2 = C1133Py.o(drM.this, obj);
                return o2;
            }
        });
        final drM<Bitmap, File> drm3 = new drM<Bitmap, File>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$createVerticalBillboardWithLogo$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final File invoke(Bitmap bitmap) {
                C1140Qf c1140Qf;
                Bitmap.CompressFormat compressFormat;
                C8632dsu.c((Object) bitmap, "");
                c1140Qf = C1133Py.this.e;
                File b2 = c1140Qf.b(str, "fullBillboard_", "png");
                FileOutputStream fileOutputStream = new FileOutputStream(b2);
                try {
                    compressFormat = C1133Py.b;
                    bitmap.compress(compressFormat, 80, fileOutputStream);
                    C8608drx.a(fileOutputStream, null);
                    return b2;
                } finally {
                }
            }
        };
        Single<File> map = flatMap.map(new Function() { // from class: o.PE
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                File l;
                l = C1133Py.l(drM.this, obj);
                return l;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Bitmap) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (File) drm.invoke(obj);
    }

    public final Single<File> c(FragmentActivity fragmentActivity, final String str, int i, int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        Single<GetImageRequest.a> observeOn = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).d(i).c(i2).d(true).a()).observeOn(Schedulers.io());
        final drM<GetImageRequest.a, File> drm = new drM<GetImageRequest.a, File>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$getVerticalBillboardWithGradient$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final File invoke(GetImageRequest.a aVar) {
                C1140Qf c1140Qf;
                Bitmap d;
                Bitmap.CompressFormat compressFormat;
                C8632dsu.c((Object) aVar, "");
                c1140Qf = C1133Py.this.e;
                File b2 = c1140Qf.b(str, "grad_", "png");
                Object a2 = C1140Qf.d.a();
                C1133Py c1133Py = C1133Py.this;
                synchronized (a2) {
                    d = c1133Py.d(aVar.b());
                    FileOutputStream fileOutputStream = new FileOutputStream(b2);
                    compressFormat = C1133Py.b;
                    d.compress(compressFormat, 80, fileOutputStream);
                    C8608drx.a(fileOutputStream, null);
                }
                return b2;
            }
        };
        Single map = observeOn.map(new Function() { // from class: o.PD
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                File n;
                n = C1133Py.n(drM.this, obj);
                return n;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (File) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap d(Bitmap bitmap) {
        Bitmap createBitmap;
        synchronized (C1140Qf.d.a()) {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            C8632dsu.a(createBitmap, "");
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, bitmap.getHeight(), 0, Integer.MIN_VALUE, Shader.TileMode.CLAMP));
            dpR dpr = dpR.c;
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
        }
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<Bitmap> a(FragmentActivity fragmentActivity, final Bitmap bitmap, String str) {
        Single<GetImageRequest.a> observeOn = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).d(bitmap.getWidth()).c(bitmap.getHeight()).d(true).a()).observeOn(Schedulers.io());
        final drM<GetImageRequest.a, Bitmap> drm = new drM<GetImageRequest.a, Bitmap>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$addLogoToBillboard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Bitmap invoke(GetImageRequest.a aVar) {
                C8632dsu.c((Object) aVar, "");
                Object a2 = C1140Qf.d.a();
                C1133Py c1133Py = C1133Py.this;
                Bitmap bitmap2 = bitmap;
                synchronized (a2) {
                    c1133Py.d(bitmap2, aVar.b());
                }
                return bitmap2;
            }
        };
        Single map = observeOn.map(new Function() { // from class: o.PA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap f;
                f = C1133Py.f(drM.this, obj);
                return f;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Bitmap) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        int height = (int) (bitmap.getHeight() * 0.15d);
        int width = (int) (bitmap.getWidth() * 0.2d);
        Paint d = d();
        synchronized (C1140Qf.d.a()) {
            new Canvas(bitmap).drawBitmap(bitmap2, (Rect) null, new Rect(width, (int) ((bitmap.getHeight() - height) - (bitmap2.getHeight() * ((bitmap.getWidth() - (width * 2)) / bitmap2.getWidth()))), bitmap.getWidth() - width, bitmap.getHeight() - height), d);
            dpR dpr = dpR.c;
        }
    }

    public final Single<File> e(FragmentActivity fragmentActivity, final String str, final int i, final int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        Single<GetImageRequest.a> observeOn = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).d(i).c(i2).d(true).c(true).a()).observeOn(Schedulers.io());
        final drM<GetImageRequest.a, File> drm = new drM<GetImageRequest.a, File>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$createBoxArtWithBlurredBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final File invoke(GetImageRequest.a aVar) {
                C1140Qf c1140Qf;
                File b2;
                Bitmap.CompressFormat compressFormat;
                C8632dsu.c((Object) aVar, "");
                Object a2 = C1140Qf.d.a();
                C1133Py c1133Py = C1133Py.this;
                int i3 = i;
                int i4 = i2;
                String str2 = str;
                synchronized (a2) {
                    Bitmap b3 = C8007dcJ.b(aVar.b());
                    Paint d = c1133Py.d();
                    Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                    C8632dsu.a(createBitmap, "");
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(b3, (Rect) null, new Rect(0, 0, i3, i4), d);
                    canvas.drawBitmap(aVar.b(), (createBitmap.getWidth() - aVar.b().getWidth()) / 2.0f, (createBitmap.getHeight() - aVar.b().getHeight()) / 2.0f, d);
                    c1140Qf = c1133Py.e;
                    b2 = c1140Qf.b(str2, "blurBoxArt_", "png");
                    FileOutputStream fileOutputStream = new FileOutputStream(b2);
                    compressFormat = C1133Py.b;
                    createBitmap.compress(compressFormat, 80, fileOutputStream);
                    dpR dpr = dpR.c;
                    C8608drx.a(fileOutputStream, null);
                }
                return b2;
            }
        };
        Single map = observeOn.map(new Function() { // from class: o.PB
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                File h;
                h = C1133Py.h(drM.this, obj);
                return h;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (File) drm.invoke(obj);
    }

    public final Single<File> d(FragmentActivity fragmentActivity, final String str, final int i, final int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        Single<GetImageRequest.a> observeOn = InterfaceC9638uF.a.d(fragmentActivity).b(GetImageRequest.c.d(fragmentActivity).a(str).d(i).c(i2).d(true).a()).observeOn(Schedulers.io());
        final drM<GetImageRequest.a, File> drm = new drM<GetImageRequest.a, File>() { // from class: com.netflix.mediaclient.android.sharing.impl.ImageUtils$createBlurredBoxArtBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final File invoke(GetImageRequest.a aVar) {
                C1140Qf c1140Qf;
                File b2;
                Bitmap.CompressFormat compressFormat;
                C8632dsu.c((Object) aVar, "");
                Object a2 = C1140Qf.d.a();
                C1133Py c1133Py = C1133Py.this;
                int i3 = i;
                int i4 = i2;
                String str2 = str;
                synchronized (a2) {
                    Bitmap b3 = C8007dcJ.b(aVar.b());
                    Paint d = c1133Py.d();
                    Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                    C8632dsu.a(createBitmap, "");
                    new Canvas(createBitmap).drawBitmap(b3, (Rect) null, new Rect(0, 0, i3, i4), d);
                    c1140Qf = c1133Py.e;
                    b2 = c1140Qf.b(str2, "blurBoxArt_", "png");
                    FileOutputStream fileOutputStream = new FileOutputStream(b2);
                    compressFormat = C1133Py.b;
                    createBitmap.compress(compressFormat, 80, fileOutputStream);
                    dpR dpr = dpR.c;
                    C8608drx.a(fileOutputStream, null);
                }
                return b2;
            }
        };
        Single map = observeOn.map(new Function() { // from class: o.Px
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                File g;
                g = C1133Py.g(drM.this, obj);
                return g;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (File) drm.invoke(obj);
    }

    public final Paint d() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    public final Single<File> c(FragmentActivity fragmentActivity, String str, final String str2, final int i, final int i2) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
        InterfaceC9638uF d = eVar.d(fragmentActivity);
        GetImageRequest.d dVar = GetImageRequest.c;
        Single<File> zip = Single.zip(d.b(dVar.d(fragmentActivity).a(str).d(i).c(i2).d(true).a()).observeOn(Schedulers.io()), eVar.d(fragmentActivity).b(dVar.d(fragmentActivity).a(str2).d(i).c(i2).d(true).a()).observeOn(Schedulers.io()), new BiFunction() { // from class: o.PI
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                File e;
                e = C1133Py.e(i, i2, this, str2, (GetImageRequest.a) obj, (GetImageRequest.a) obj2);
                return e;
            }
        });
        C8632dsu.a(zip, "");
        return zip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(int i, int i2, C1133Py c1133Py, String str, GetImageRequest.a aVar, GetImageRequest.a aVar2) {
        C8632dsu.c((Object) c1133Py, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) aVar2, "");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C8632dsu.a(createBitmap, "");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new Rect(0, 0, i, i2), paint);
        float f = i;
        int height = (int) ((aVar2.b().getHeight() / aVar2.b().getWidth()) * f);
        int i3 = (int) (f * 0.6f);
        int height2 = (int) (i3 * (aVar.b().getHeight() / aVar.b().getWidth()));
        int i4 = i2 - (height + height2);
        int i5 = i4 / 6;
        canvas.save();
        float f2 = i2 / 2.0f;
        float f3 = height / 2.0f;
        float f4 = (-(i4 + i5)) / 4;
        canvas.translate(0.0f, (f2 - f3) + f4);
        canvas.drawBitmap(aVar2.b(), (Rect) null, new Rect(0, 0, i, height), c1133Py.d());
        canvas.restore();
        canvas.save();
        canvas.translate((i - i3) / 2.0f, f2 + f3 + i5 + f4);
        canvas.drawBitmap(aVar.b(), (Rect) null, new Rect(0, 0, i3, height2), c1133Py.d());
        canvas.restore();
        File b2 = C1140Qf.b(c1133Py.e, str, "extrasPost_", null, 4, null);
        FileOutputStream fileOutputStream = new FileOutputStream(b2);
        try {
            createBitmap.compress(b, 80, fileOutputStream);
            C8608drx.a(fileOutputStream, null);
            return b2;
        } finally {
        }
    }

    public final Rect a(Uri uri) {
        C8632dsu.c((Object) uri, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C1332Xp c1332Xp = C1332Xp.b;
        InputStream openInputStream = ((Context) C1332Xp.b(Context.class)).getContentResolver().openInputStream(uri);
        try {
            BitmapFactory.decodeStream(openInputStream, null, options);
            C8608drx.a(openInputStream, null);
            return new Rect(0, 0, options.outWidth, options.outHeight);
        } finally {
        }
    }

    public final Rect b(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        float f4 = i3;
        float f5 = i4;
        if (f3 > f4 / f5) {
            return new Rect(0, 0, i3, (int) ((f2 / f) * f4));
        }
        return new Rect(0, 0, (int) (f3 * f5), i4);
    }
}
