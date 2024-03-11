package com.netflix.hawkins.consumer.component.tooltip;

import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.NoWhenBranchMatchedException;
import o.C1025Ls;
import o.C8600drp;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8598drn;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes3.dex */
public final class HawkinsTooltipPopupPositionProvider implements PopupPositionProvider {
    private final C1025Ls.c a;
    private final int b;
    private final drM<d, dpR> c;
    private final LayoutDirection d;
    private final Density e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HorizontalPosition.values().length];
            try {
                iArr[HorizontalPosition.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalPosition.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalPosition.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HawkinsTooltipPopupPositionProvider(Density density, LayoutDirection layoutDirection, C1025Ls.c cVar, drM<? super d, dpR> drm) {
        C8632dsu.c((Object) density, "");
        C8632dsu.c((Object) layoutDirection, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) drm, "");
        this.e = density;
        this.d = layoutDirection;
        this.a = cVar;
        this.c = drm;
        this.f = (int) density.mo193toPx0680j_4(cVar.l());
        this.b = (int) density.mo193toPx0680j_4(cVar.n());
        this.j = (int) density.mo193toPx0680j_4(c(layoutDirection) ? cVar.k() : cVar.m());
        this.i = (int) density.mo193toPx0680j_4(c(layoutDirection) ? cVar.m() : cVar.k());
        this.g = (int) density.mo193toPx0680j_4(Dp.m2492constructorimpl(36));
        this.h = (int) density.mo193toPx0680j_4(Dp.m2492constructorimpl(8));
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo521calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        C8632dsu.c((Object) intRect, "");
        C8632dsu.c((Object) layoutDirection, "");
        C1025Ls.b j3 = this.a.j();
        if (C8632dsu.c(j3, C1025Ls.b.h.c)) {
            return c(intRect, j, layoutDirection, j2, HorizontalPosition.a);
        }
        if (C8632dsu.c(j3, C1025Ls.b.f.e)) {
            return c(intRect, j, layoutDirection, j2, HorizontalPosition.b);
        }
        if (C8632dsu.c(j3, C1025Ls.b.i.b)) {
            return c(intRect, j, layoutDirection, j2, HorizontalPosition.d);
        }
        if (C8632dsu.c(j3, C1025Ls.b.e.b)) {
            return d(intRect, j, layoutDirection, j2, HorizontalPosition.a);
        }
        if (C8632dsu.c(j3, C1025Ls.b.c.a)) {
            return d(intRect, j, layoutDirection, j2, HorizontalPosition.b);
        }
        if (C8632dsu.c(j3, C1025Ls.b.d.e)) {
            return d(intRect, j, layoutDirection, j2, HorizontalPosition.d);
        }
        if (C8632dsu.c(j3, C1025Ls.b.a.a)) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return c(intRect, j, j2);
            }
            return d(intRect, j, j2);
        } else if (C8632dsu.c(j3, C1025Ls.b.C0087b.b)) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return d(intRect, j, j2);
            }
            return c(intRect, j, j2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final long c(IntRect intRect, long j, LayoutDirection layoutDirection, long j2, HorizontalPosition horizontalPosition) {
        int c;
        int i;
        int i2;
        Density density = this.e;
        int c2 = c(intRect, layoutDirection, j2, j, horizontalPosition);
        c = C8657dts.c(((intRect.getTop() - ((int) density.mo193toPx0680j_4(this.a.f()))) - IntSize.m2546getHeightimpl(j2)) - ((int) density.mo193toPx0680j_4(this.a.g())), this.g, intRect.getTop());
        drM<d, dpR> drm = this.c;
        int e2 = e(intRect, j, layoutDirection, horizontalPosition);
        int top = intRect.getTop();
        int i3 = this.g;
        int mo193toPx0680j_4 = (int) density.mo193toPx0680j_4(this.a.g());
        i = C8657dts.i(IntSize.m2547getWidthimpl(j2) + c2, IntSize.m2547getWidthimpl(j) - this.h);
        i2 = C8657dts.i(IntSize.m2546getHeightimpl(j2) + c, intRect.getTop());
        float m1475getPivotFractionXimpl = TransformOrigin.m1475getPivotFractionXimpl(d(intRect, new IntRect(c2, c, i, i2)));
        if (!c(layoutDirection)) {
            m1475getPivotFractionXimpl = 1 - m1475getPivotFractionXimpl;
        }
        drm.invoke(new d(e2, (top - i3) - mo193toPx0680j_4, m1475getPivotFractionXimpl));
        return IntOffsetKt.IntOffset(c2, c);
    }

    private final long d(IntRect intRect, long j, LayoutDirection layoutDirection, long j2, HorizontalPosition horizontalPosition) {
        int e2;
        int c;
        int i;
        int i2;
        Density density = this.e;
        int c2 = c(intRect, layoutDirection, j2, j, horizontalPosition);
        e2 = dsT.e(intRect.getBottom() + density.mo193toPx0680j_4(this.a.f()) + ((int) density.mo193toPx0680j_4(this.a.g())));
        c = C8657dts.c(e2, intRect.getBottom(), IntSize.m2546getHeightimpl(j) - this.h);
        drM<d, dpR> drm = this.c;
        int e3 = e(intRect, j, layoutDirection, horizontalPosition);
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(j);
        int bottom = intRect.getBottom();
        int i3 = this.h;
        int mo193toPx0680j_4 = (int) density.mo193toPx0680j_4(this.a.g());
        i = C8657dts.i(IntSize.m2547getWidthimpl(j2) + c2, IntSize.m2547getWidthimpl(j) - this.h);
        i2 = C8657dts.i(IntSize.m2546getHeightimpl(j2) + c, IntSize.m2546getHeightimpl(j) - this.h);
        float m1475getPivotFractionXimpl = TransformOrigin.m1475getPivotFractionXimpl(d(intRect, new IntRect(c2, c, i, i2)));
        if (!c(layoutDirection)) {
            m1475getPivotFractionXimpl = 1 - m1475getPivotFractionXimpl;
        }
        drm.invoke(new d(e3, ((m2546getHeightimpl - bottom) - i3) - mo193toPx0680j_4, m1475getPivotFractionXimpl));
        return IntOffsetKt.IntOffset(c2, c);
    }

    private final int e(IntRect intRect, long j, LayoutDirection layoutDirection, HorizontalPosition horizontalPosition) {
        int right;
        int i;
        int m2547getWidthimpl;
        int left;
        int i2 = e.d[horizontalPosition.ordinal()];
        if (i2 == 1) {
            if (layoutDirection == LayoutDirection.Ltr) {
                m2547getWidthimpl = IntSize.m2547getWidthimpl(j) - this.h;
                left = intRect.getLeft();
                return m2547getWidthimpl - left;
            }
            right = intRect.getRight();
            i = this.h;
            return right - i;
        }
        if (i2 == 2) {
            right = IntSize.m2547getWidthimpl(j);
            i = this.h * 2;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            if (layoutDirection == LayoutDirection.Ltr) {
                right = intRect.getRight();
                i = this.h;
            } else {
                m2547getWidthimpl = IntSize.m2547getWidthimpl(j) - this.h;
                left = intRect.getLeft();
                return m2547getWidthimpl - left;
            }
        }
        return right - i;
    }

    private final long c(IntRect intRect, long j, long j2) {
        int c;
        int c2;
        int i;
        int i2;
        Density density = this.e;
        c = C8657dts.c(intRect.getRight() + ((int) density.mo193toPx0680j_4(this.a.f())) + ((int) density.mo193toPx0680j_4(this.a.g())), this.h, IntSize.m2547getWidthimpl(j) - this.h);
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(j) - this.h;
        int a = a(intRect, j2, j);
        c2 = C8657dts.c(intRect.getRight() + ((int) density.mo193toPx0680j_4(this.a.f())) + ((int) density.mo193toPx0680j_4(this.a.g())), c, m2547getWidthimpl);
        drM<d, dpR> drm = this.c;
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(j);
        int i3 = this.g;
        int i4 = this.h;
        i = C8657dts.i(IntSize.m2547getWidthimpl(j2) + c2, m2547getWidthimpl);
        i2 = C8657dts.i(IntSize.m2546getHeightimpl(j2) + a, IntSize.m2546getHeightimpl(j) - this.h);
        drm.invoke(new d(m2547getWidthimpl - c, m2546getHeightimpl - (i3 + i4), TransformOrigin.m1476getPivotFractionYimpl(d(intRect, new IntRect(c2, a, i, i2)))));
        return IntOffsetKt.IntOffset(c2, a);
    }

    private final long d(IntRect intRect, long j, long j2) {
        int c;
        int c2;
        int i;
        int i2;
        Density density = this.e;
        int i3 = this.h;
        c = C8657dts.c((intRect.getLeft() - ((int) density.mo193toPx0680j_4(this.a.f()))) - ((int) density.mo193toPx0680j_4(this.a.g())), this.h, IntSize.m2547getWidthimpl(j) - this.h);
        c2 = C8657dts.c(c - IntSize.m2547getWidthimpl(j2), i3, c);
        int a = a(intRect, j2, j);
        drM<d, dpR> drm = this.c;
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(j);
        int i4 = this.g;
        int i5 = this.h;
        i = C8657dts.i(IntSize.m2547getWidthimpl(j2) + c2, c);
        i2 = C8657dts.i(IntSize.m2546getHeightimpl(j2) + a, IntSize.m2546getHeightimpl(j) - this.h);
        drm.invoke(new d(c - i3, m2546getHeightimpl - (i4 + i5), TransformOrigin.m1476getPivotFractionYimpl(d(intRect, new IntRect(c2, a, i, i2)))));
        return IntOffsetKt.IntOffset(c2, a);
    }

    private final int a(IntRect intRect, long j, long j2) {
        float f;
        int b;
        int c;
        Density density = this.e;
        double height = intRect.getHeight();
        float mo193toPx0680j_4 = density.mo193toPx0680j_4(Dp.m2492constructorimpl(Dp.m2492constructorimpl(this.a.a() * 2) + this.a.i()));
        b = dsT.b(((intRect.getTop() + (height * 0.5d)) - (mo193toPx0680j_4 / f)) - ((IntSize.m2546getHeightimpl(j) - mo193toPx0680j_4) * 0.5d));
        c = C8657dts.c(b, this.g, IntSize.m2546getHeightimpl(j2) - this.h);
        return c;
    }

    private final int c(IntRect intRect, LayoutDirection layoutDirection, long j, long j2, HorizontalPosition horizontalPosition) {
        int left;
        int c;
        int i = e.d[horizontalPosition.ordinal()];
        if (i == 1) {
            left = intRect.getLeft();
        } else if (i != 2) {
            if (i == 3) {
                left = intRect.getRight() - IntSize.m2547getWidthimpl(j);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (layoutDirection == LayoutDirection.Ltr) {
            left = dsT.b((intRect.getLeft() + (intRect.getWidth() * 0.5d)) - (IntSize.m2547getWidthimpl(j) / 2));
        } else {
            left = dsT.b((intRect.getRight() - (intRect.getWidth() * 0.5d)) - IntSize.m2547getWidthimpl(j));
        }
        c = C8657dts.c(left, this.h, IntSize.m2547getWidthimpl(j2) - this.h);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long d(androidx.compose.ui.unit.IntRect r12, androidx.compose.ui.unit.IntRect r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.hawkins.consumer.component.tooltip.HawkinsTooltipPopupPositionProvider.d(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class HorizontalPosition {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ HorizontalPosition[] e;
        public static final HorizontalPosition d = new HorizontalPosition("START", 0);
        public static final HorizontalPosition a = new HorizontalPosition("CENTER", 1);
        public static final HorizontalPosition b = new HorizontalPosition("END", 2);

        private static final /* synthetic */ HorizontalPosition[] b() {
            return new HorizontalPosition[]{d, a, b};
        }

        public static HorizontalPosition valueOf(String str) {
            return (HorizontalPosition) Enum.valueOf(HorizontalPosition.class, str);
        }

        public static HorizontalPosition[] values() {
            return (HorizontalPosition[]) e.clone();
        }

        private HorizontalPosition(String str, int i) {
        }

        static {
            HorizontalPosition[] b2 = b();
            e = b2;
            c = C8600drp.e(b2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final int a;
        private final float c;
        private final int e;

        public final float a() {
            return this.c;
        }

        public final int b() {
            return this.e;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.a == dVar.a && this.e == dVar.e && Float.compare(this.c, dVar.c) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.e)) * 31) + Float.hashCode(this.c);
        }

        public String toString() {
            int i = this.a;
            int i2 = this.e;
            float f = this.c;
            return "MetaData(availableWidth=" + i + ", availableHeight=" + i2 + ", bias=" + f + ")";
        }

        public d(int i, int i2, float f) {
            this.a = i;
            this.e = i2;
            this.c = f;
        }
    }

    private final boolean c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr;
    }
}
