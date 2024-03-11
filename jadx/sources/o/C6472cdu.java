package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.netflix.mediaclient.ui.lomo.ColorThieving$buildBillboardGradientsSingle$1;
import com.netflix.mediaclient.ui.lomo.ImageColors;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import o.C6472cdu;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cdu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6472cdu {
    public static final C6472cdu b = new C6472cdu();
    private static HashMap<c, b> d = new HashMap<>();
    public static final int a = 8;

    private C6472cdu() {
    }

    /* renamed from: o.cdu$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final GradientDrawable b;
        private final GradientDrawable c;
        private final List<Integer> d;
        private final ImageColors.d e;

        public final GradientDrawable b() {
            return this.b;
        }

        public final GradientDrawable c() {
            return this.c;
        }

        public final GradientDrawable d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            ImageColors.d dVar = this.e;
            return ((((((dVar == null ? 0 : dVar.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            ImageColors.d dVar = this.e;
            List<Integer> list = this.d;
            GradientDrawable gradientDrawable = this.c;
            GradientDrawable gradientDrawable2 = this.b;
            return "ColorThievingResult(imageColorResult=" + dVar + ", chosenColors=" + list + ", backgroundGradient=" + gradientDrawable + ", overlayGradient=" + gradientDrawable2 + ")";
        }

        public b(ImageColors.d dVar, List<Integer> list, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) gradientDrawable, "");
            C8632dsu.c((Object) gradientDrawable2, "");
            this.e = dVar;
            this.d = list;
            this.c = gradientDrawable;
            this.b = gradientDrawable2;
        }
    }

    /* renamed from: o.cdu$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private final boolean a;
        private final String c;
        private final Rect d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.d, cVar.d) && this.a == cVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.c;
            Rect rect = this.d;
            boolean z = this.a;
            return "CacheKey(imageUrl=" + str + ", rect=" + rect + ", rtl=" + z + ")";
        }

        public c(String str, Rect rect, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) rect, "");
            this.c = str;
            this.d = rect;
            this.a = z;
        }
    }

    public final Rect a(Bitmap bitmap) {
        int i;
        int b2;
        C8632dsu.c((Object) bitmap, "");
        i = C8657dts.i(bitmap.getWidth(), 100);
        b2 = dsT.b(bitmap.getHeight() / 3.0d);
        return new Rect(0, 0, i, b2);
    }

    public final Rect d(Bitmap bitmap) {
        int b2;
        int i;
        C8632dsu.c((Object) bitmap, "");
        b2 = dsT.b(bitmap.getHeight() / 3.0d);
        i = C8657dts.i(bitmap.getWidth(), 100);
        return new Rect(0, b2, i, bitmap.getHeight() - b2);
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        C1044Mm.a("ColorThieving", str);
    }

    private final b d(String str, Rect rect, boolean z) {
        return d.get(new c(str, rect, z));
    }

    public final Single<b> b(Bitmap bitmap, String str, Rect rect, boolean z) {
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) rect, "");
        return C7680dBj.e(null, new ColorThieving$buildBillboardGradientsSingle$1(bitmap, str, rect, z, null), 1, null);
    }

    public final Object c(final Bitmap bitmap, final String str, final Rect rect, final boolean z, InterfaceC8585dra<? super b> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e;
        b2 = C8590drf.b(interfaceC8585dra);
        final C8587drc c8587drc = new C8587drc(b2);
        C6472cdu c6472cdu = b;
        b d2 = c6472cdu.d(str, rect, z);
        if (d2 != null) {
            Result.c cVar = Result.e;
            c8587drc.resumeWith(Result.e(d2));
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            c6472cdu.d(bitmap, rect, new drX<ImageColors.d, List<? extends Integer>, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.ColorThieving$buildBillboardGradients$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(ImageColors.d dVar, List<? extends Integer> list) {
                    a(dVar, list);
                    return dpR.c;
                }

                public final void a(ImageColors.d dVar, List<Integer> list) {
                    C6472cdu.b c2;
                    HashMap hashMap;
                    C8632dsu.c((Object) list, "");
                    C6472cdu c6472cdu2 = C6472cdu.b;
                    c2 = c6472cdu2.c(bitmap, z, dVar, list);
                    hashMap = C6472cdu.d;
                    hashMap.put(new C6472cdu.c(str, rect, z), c2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j = currentTimeMillis;
                    c6472cdu2.c("=== Total time for billboard color thieving: " + (currentTimeMillis2 - j));
                    InterfaceC8585dra<C6472cdu.b> interfaceC8585dra2 = c8587drc;
                    Result.c cVar2 = Result.e;
                    interfaceC8585dra2.resumeWith(Result.e(c2));
                }
            });
        }
        Object b3 = c8587drc.b();
        e = C8586drb.e();
        if (b3 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b3;
    }

    private final GradientDrawable e(boolean z, List<Integer> list, boolean z2) {
        return e(z, list.size() >= 2 ? list.get(1).intValue() : ArtworkColors.DEFAULT_BACKGROUND_COLOR, z2);
    }

    public final GradientDrawable e(boolean z, int i, boolean z2) {
        if (!z) {
            GradientDrawable.Orientation orientation = z2 ? GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.BL_TR;
            int i2 = (i >> 16) & PrivateKeyType.INVALID;
            int i3 = (i >> 8) & PrivateKeyType.INVALID;
            int i4 = i & PrivateKeyType.INVALID;
            return new GradientDrawable(orientation, new int[]{Color.argb((int) PrivateKeyType.INVALID, i2, i3, i4), Color.argb(188, i2, i3, i4), Color.argb(120, i2, i3, i4), Color.argb(80, i2, i3, i4), Color.argb(0, i2, i3, i4), Color.argb(0, i2, i3, i4), Color.argb(0, i2, i3, i4)});
        }
        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
        int i5 = (i >> 16) & PrivateKeyType.INVALID;
        int i6 = (i >> 8) & PrivateKeyType.INVALID;
        int i7 = i & PrivateKeyType.INVALID;
        return new GradientDrawable(orientation2, new int[]{Color.argb(0, i5, i6, i7), Color.argb(127, i5, i6, i7), Color.argb(169, i5, i6, i7), Color.argb(212, i5, i6, i7), Color.argb((int) PrivateKeyType.INVALID, i5, i6, i7)});
    }

    private final void d(Bitmap bitmap, Rect rect, final drX<? super ImageColors.d, ? super List<Integer>, dpR> drx) {
        final List f;
        synchronized (this) {
            f = C8569dql.f(Integer.valueOf((int) ArtworkColors.DEFAULT_BACKGROUND_COLOR));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right, rect.bottom);
            C8632dsu.a(createBitmap, "");
            b(createBitmap, new drM<ImageColors.d, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.ColorThieving$colorsFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ImageColors.d dVar) {
                    e(dVar);
                    return dpR.c;
                }

                public final void e(final ImageColors.d dVar) {
                    if (dVar == null) {
                        drx.invoke(null, f);
                        return;
                    }
                    C6472cdu c6472cdu = C6472cdu.b;
                    final drX<ImageColors.d, List<Integer>, dpR> drx2 = drx;
                    c6472cdu.e(dVar, new drM<List<? extends Integer>, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.ColorThieving$colorsFor$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(List<? extends Integer> list) {
                            b(list);
                            return dpR.c;
                        }

                        public final void b(List<Integer> list) {
                            C8632dsu.c((Object) list, "");
                            drx2.invoke(dVar, list);
                        }
                    });
                }
            });
        }
    }

    private final void b(Bitmap bitmap, final drM<? super ImageColors.d, dpR> drm) {
        new ImageColors().c(bitmap, ImageColors.UIImageColorsQuality.b, new drM<ImageColors.d, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.ColorThieving$ungradedColors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ImageColors.d dVar) {
                b(dVar);
                return dpR.c;
            }

            public final void b(ImageColors.d dVar) {
                drm.invoke(dVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ImageColors.d dVar, drM<? super List<Integer>, dpR> drm) {
        List f;
        Object x;
        ImageColors.c d2 = dVar.d();
        f = C8569dql.f(Integer.valueOf(d2.b()), Integer.valueOf(d2.e()), Integer.valueOf(d2.a()), Integer.valueOf(d2.d()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            C6432cdG e = C6426cdA.e(((Number) obj).intValue());
            float e2 = e.e() / 360;
            float d3 = e.d();
            float b2 = e.b();
            double d4 = e2;
            boolean z = (((d4 > 0.1d ? 1 : (d4 == 0.1d ? 0 : -1)) > 0 && (d4 > 0.2d ? 1 : (d4 == 0.2d ? 0 : -1)) < 0 && (((double) d3) > 0.3d ? 1 : (((double) d3) == 0.3d ? 0 : -1)) > 0) ^ true) && !((((double) b2) > 0.02d ? 1 : (((double) b2) == 0.02d ? 0 : -1)) < 0);
            boolean z2 = ((double) (b2 - d3)) > 0.4d;
            if (z && !z2) {
                arrayList.add(obj);
            }
        }
        x = C8576dqs.x(arrayList);
        Integer num = (Integer) x;
        drm.invoke(e(num != null ? num.intValue() : d2.b()));
    }

    public final GradientDrawable b(int i) {
        int[] m;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        m = C8576dqs.m(e(i));
        return new GradientDrawable(orientation, m);
    }

    private final List<Integer> e(int i) {
        float h;
        float c2;
        float h2;
        float c3;
        List<Integer> f;
        C6432cdG e = C6426cdA.e(i);
        float e2 = e.e();
        float d2 = e.d();
        float b2 = e.b();
        double d3 = e2;
        if (0.169d <= d3 && d3 <= 0.33d) {
            c("green");
            d2 *= 0.6f;
            b2 *= 0.5f;
        }
        h = C8657dts.h(d2, 0.7f);
        float f2 = b2 <= 0.44f ? b2 - 0.03f : 0.44f;
        if (f2 > 0.1f) {
            c2 = C8657dts.c(f2, 0.2f);
        } else {
            c2 = C8657dts.c(f2, 0.15f);
        }
        h2 = C8657dts.h(0.17f + c2, 1.0f);
        int HSVToColor = Color.HSVToColor(new float[]{e2, h, h2});
        int HSVToColor2 = Color.HSVToColor(new float[]{e2, h, c2});
        c3 = C8657dts.c(c2 - 0.2f, 0.0f);
        f = C8569dql.f(Integer.valueOf(HSVToColor), Integer.valueOf(HSVToColor2), Integer.valueOf(HSVToColor2), Integer.valueOf(HSVToColor2), Integer.valueOf(Color.HSVToColor(new float[]{e2, h, c3})));
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b c(Bitmap bitmap, boolean z, ImageColors.d dVar, List<Integer> list) {
        int[] m;
        for (Number number : list) {
            int intValue = number.intValue();
            C6472cdu c6472cdu = b;
            String hexString = Integer.toHexString(intValue & 16777215);
            C8632dsu.a(hexString, "");
            c6472cdu.c(hexString);
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        m = C8576dqs.m(list);
        return new b(dVar, list, new GradientDrawable(orientation, m), e(bitmap.getHeight() > bitmap.getWidth(), list, z));
    }
}
