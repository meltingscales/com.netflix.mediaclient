package com.netflix.mediaclient.ui.lomo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.netflix.model.leafs.ArtworkColors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.C6429cdD;
import o.C6438cdM;
import o.C6472cdu;
import o.C8575dqr;
import o.C8600drp;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8598drn;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes4.dex */
public final class ImageColors {

    /* loaded from: classes4.dex */
    public static final class c {
        private final int a;
        private final int b;
        private final int d;
        private final int e;

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final int d() {
            return this.e;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a == cVar.a && this.d == cVar.d && this.b == cVar.b && this.e == cVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            int i = this.a;
            int i2 = this.d;
            int i3 = this.b;
            int i4 = this.e;
            return "UIImageColors(background=" + i + ", primary=" + i2 + ", secondary=" + i3 + ", detail=" + i4 + ")";
        }

        public c(int i, int i2, int i3, int i4) {
            this.a = i;
            this.d = i2;
            this.b = i3;
            this.e = i4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class UIImageColorsQuality {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ UIImageColorsQuality[] f;
        private final float h;
        public static final UIImageColorsQuality c = new UIImageColorsQuality("Lowest", 0, 50.0f);
        public static final UIImageColorsQuality e = new UIImageColorsQuality("Low", 1, 100.0f);
        public static final UIImageColorsQuality b = new UIImageColorsQuality("High", 2, 200.0f);
        public static final UIImageColorsQuality d = new UIImageColorsQuality("Highest", 3, 0.0f);

        private static final /* synthetic */ UIImageColorsQuality[] c() {
            return new UIImageColorsQuality[]{c, e, b, d};
        }

        public static UIImageColorsQuality valueOf(String str) {
            return (UIImageColorsQuality) Enum.valueOf(UIImageColorsQuality.class, str);
        }

        public static UIImageColorsQuality[] values() {
            return (UIImageColorsQuality[]) f.clone();
        }

        public final float a() {
            return this.h;
        }

        private UIImageColorsQuality(String str, int i, float f2) {
            this.h = f2;
        }

        static {
            UIImageColorsQuality[] c2 = c();
            f = c2;
            a = C8600drp.e(c2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private final int c;
        private final int d;

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.c == aVar.c && this.d == aVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.c) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.c;
            int i2 = this.d;
            return "ColorsCounter(color=" + i + ", count=" + i2 + ")";
        }

        public a(int i, int i2) {
            this.c = i;
            this.d = i2;
        }
    }

    public final void c(Bitmap bitmap, UIImageColorsQuality uIImageColorsQuality, drM<? super d, dpR> drm) {
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) uIImageColorsQuality, "");
        C8632dsu.c((Object) drm, "");
        drm.invoke(d(bitmap, uIImageColorsQuality));
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final List<a> d;
        private final c e;

        public final c d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            List<a> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            c cVar = this.e;
            List<a> list = this.d;
            return "ColorsResult(colors=" + cVar + ", colorCounts=" + list + ")";
        }

        public d(c cVar, List<a> list) {
            C8632dsu.c((Object) cVar, "");
            this.e = cVar;
            this.d = list;
        }
    }

    private final d d(Bitmap bitmap, UIImageColorsQuality uIImageColorsQuality) {
        Bitmap bitmap2;
        int b2;
        a aVar;
        boolean a2;
        boolean e;
        boolean e2;
        int i;
        boolean d2;
        boolean d3;
        boolean a3;
        boolean d4;
        boolean a4;
        boolean a5;
        int a6;
        boolean e3;
        boolean a7;
        PointF pointF;
        int e4;
        int e5;
        long currentTimeMillis = System.currentTimeMillis();
        new PointF(bitmap.getWidth(), bitmap.getHeight());
        if (uIImageColorsQuality != UIImageColorsQuality.d) {
            if (bitmap.getWidth() < bitmap.getHeight()) {
                pointF = new PointF((float) (uIImageColorsQuality.a() / (bitmap.getHeight() / bitmap.getWidth())), uIImageColorsQuality.a());
            } else {
                pointF = new PointF(uIImageColorsQuality.a(), (float) (uIImageColorsQuality.a() / (bitmap.getWidth() / bitmap.getHeight())));
            }
            float f = 2;
            float f2 = pointF.x * f;
            pointF.x = f2;
            pointF.y *= f;
            e4 = dsT.e(f2);
            e5 = dsT.e(pointF.y);
            Bitmap createBitmap = Bitmap.createBitmap(e4, e5, Bitmap.Config.ARGB_8888);
            C8632dsu.a(createBitmap, "");
            float width = pointF.x / bitmap.getWidth();
            float height = pointF.y / bitmap.getHeight();
            float f3 = pointF.x / 2.0f;
            float f4 = pointF.y / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(width, height, f3, f4);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setMatrix(matrix);
            canvas.drawBitmap(bitmap, f3 - (bitmap.getWidth() / 2), f4 - (bitmap.getHeight() / 2), new Paint(3));
            C6472cdu c6472cdu = C6472cdu.b;
            long currentTimeMillis2 = System.currentTimeMillis();
            c6472cdu.c("=== Time to resize image: " + (currentTimeMillis2 - currentTimeMillis));
            bitmap2 = createBitmap;
        } else {
            bitmap2 = bitmap;
        }
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        b2 = dsT.b(height2 * 0.01d);
        Integer[] numArr = {0, 0, 0, 0};
        C6438cdM c6438cdM = new C6438cdM();
        long currentTimeMillis3 = System.currentTimeMillis();
        int[] iArr = new int[bitmap2.getWidth() * bitmap2.getHeight()];
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        for (int i2 = 0; i2 < width2; i2++) {
            for (int i3 = 0; i3 < height2; i3++) {
                int i4 = iArr[(i3 * width2) + i2];
                if (Color.alpha(i4) >= 127) {
                    c6438cdM.d(Integer.valueOf(i4));
                }
            }
        }
        C6472cdu c6472cdu2 = C6472cdu.b;
        long currentTimeMillis4 = System.currentTimeMillis();
        c6472cdu2.c("=== Time to read pixels: " + (currentTimeMillis4 - currentTimeMillis3));
        b bVar = new b();
        ArrayList arrayList = new ArrayList(c6438cdM.d());
        Iterator c2 = c6438cdM.c();
        while (c2.hasNext()) {
            int intValue = ((Number) c2.next()).intValue();
            int e6 = c6438cdM.e(Integer.valueOf(intValue));
            if (b2 < e6) {
                arrayList.add(new a(intValue, e6));
            }
        }
        C8575dqr.c(arrayList, bVar);
        if (arrayList.isEmpty()) {
            aVar = new a(0, 1);
        } else {
            Object obj = arrayList.get(0);
            C8632dsu.d(obj);
            aVar = (a) obj;
        }
        a2 = C6429cdD.a(aVar.c());
        if (a2 && arrayList.size() > 0) {
            int size = arrayList.size();
            int i5 = 1;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i5);
                C8632dsu.a(obj2, "");
                a aVar2 = (a) obj2;
                if (aVar2.b() / aVar.b() <= 0.3d) {
                    break;
                }
                a7 = C6429cdD.a(aVar2.c());
                if (!a7) {
                    aVar = aVar2;
                    break;
                }
                i5++;
            }
        }
        numArr[0] = Integer.valueOf(aVar.c());
        Iterator c3 = c6438cdM.c();
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(c6438cdM.d());
        e = C6429cdD.e(numArr[0].intValue());
        long currentTimeMillis5 = System.currentTimeMillis();
        while (c3.hasNext()) {
            int intValue2 = ((Number) c3.next()).intValue();
            a6 = C6429cdD.a(intValue2, 0.15d);
            e3 = C6429cdD.e(a6);
            if (e3 == (!e)) {
                arrayList2.add(new a(a6, c6438cdM.e(Integer.valueOf(intValue2))));
            }
        }
        C6472cdu c6472cdu3 = C6472cdu.b;
        long currentTimeMillis6 = System.currentTimeMillis();
        c6472cdu3.c("=== Time to filter for darkness: " + (currentTimeMillis6 - currentTimeMillis5));
        C8575dqr.c(arrayList2, bVar);
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int c4 = ((a) it.next()).c();
            if (numArr[1].intValue() == 0) {
                d2 = C6429cdD.d(c4, numArr[0].intValue());
                if (d2) {
                    numArr[1] = Integer.valueOf(c4);
                }
            } else if (numArr[2].intValue() == 0) {
                d3 = C6429cdD.d(c4, numArr[0].intValue());
                if (d3) {
                    a3 = C6429cdD.a(numArr[1].intValue(), c4);
                    if (a3) {
                        numArr[2] = Integer.valueOf(c4);
                    }
                }
            } else if (numArr[3].intValue() == 0) {
                d4 = C6429cdD.d(c4, numArr[0].intValue());
                if (d4) {
                    a4 = C6429cdD.a(numArr[2].intValue(), c4);
                    if (a4) {
                        a5 = C6429cdD.a(numArr[1].intValue(), c4);
                        if (a5) {
                            numArr[3] = Integer.valueOf(c4);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        e2 = C6429cdD.e(numArr[0].intValue());
        for (int i6 = 1; i6 < 4; i6++) {
            if (numArr[i6].intValue() == 0) {
                numArr[i6] = Integer.valueOf(e2 ? -1 : ArtworkColors.DEFAULT_BACKGROUND_COLOR);
            }
        }
        C6472cdu c6472cdu4 = C6472cdu.b;
        c6472cdu4.c("background: " + C6429cdD.b(numArr[0].intValue()));
        c6472cdu4.c("primary: " + C6429cdD.b(numArr[1].intValue()));
        c6472cdu4.c("secondary: " + C6429cdD.b(numArr[2].intValue()));
        c6472cdu4.c("detail: " + C6429cdD.b(numArr[3].intValue()));
        c cVar = new c(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
        i = C8657dts.i(arrayList2.size(), 10);
        return new d(cVar, arrayList2.subList(0, i));
    }

    /* loaded from: classes4.dex */
    public static final class b implements Comparator<a> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: c */
        public int compare(a aVar, a aVar2) {
            if (aVar != null && aVar2 != null) {
                if (aVar.b() < aVar2.b()) {
                    return 1;
                }
                if (aVar.b() != aVar2.b()) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
