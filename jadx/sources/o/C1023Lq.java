package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import o.C1023Lq;
import o.C1025Ls;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.Lq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1023Lq {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final o.C1025Ls.c r22, androidx.compose.ui.Modifier r23, java.lang.Integer r24, java.lang.Integer r25, float r26, float r27, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1023Lq.c(o.Ls$c, androidx.compose.ui.Modifier, java.lang.Integer, java.lang.Integer, float, float, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier a(Modifier modifier, C1025Ls.c cVar, Integer num, Integer num2, Density density) {
        C1025Ls.b j = cVar.j();
        if (C8632dsu.c(j, C1025Ls.b.C0087b.b) || C8632dsu.c(j, C1025Ls.b.a.a)) {
            return SizeKt.m299sizeInqDBjuR0$default(modifier, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(cVar.a() * 2) + androidx.compose.ui.unit.Dp.m2492constructorimpl(Math.max(cVar.i(), cVar.g()))), num != null ? density.mo190toDpu2uoSUM(num.intValue()) : androidx.compose.ui.unit.Dp.Companion.m2501getUnspecifiedD9Ej5fM(), num2 != null ? density.mo190toDpu2uoSUM(num2.intValue()) : androidx.compose.ui.unit.Dp.Companion.m2501getUnspecifiedD9Ej5fM(), 1, null);
        } else if (C8632dsu.c(j, C1025Ls.b.e.b) || C8632dsu.c(j, C1025Ls.b.h.c) || C8632dsu.c(j, C1025Ls.b.f.e) || C8632dsu.c(j, C1025Ls.b.i.b) || C8632dsu.c(j, C1025Ls.b.c.a) || C8632dsu.c(j, C1025Ls.b.d.e)) {
            return SizeKt.m299sizeInqDBjuR0$default(modifier, androidx.compose.ui.unit.Dp.m2492constructorimpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(cVar.a() * 2) + androidx.compose.ui.unit.Dp.m2492constructorimpl(Math.max(cVar.i(), cVar.g()))), 0.0f, num != null ? density.mo190toDpu2uoSUM(num.intValue()) : androidx.compose.ui.unit.Dp.Companion.m2501getUnspecifiedD9Ej5fM(), num2 != null ? density.mo190toDpu2uoSUM(num2.intValue()) : androidx.compose.ui.unit.Dp.Companion.m2501getUnspecifiedD9Ej5fM(), 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final Modifier d(Modifier modifier, C1025Ls.c cVar, Density density, float f, float f2) {
        return BackgroundKt.m109backgroundbw27NRU(modifier, Color.m1292copywmQWz5c$default(cVar.d(), f2, 0.0f, 0.0f, 0.0f, 14, null), c(cVar, f, density));
    }

    private static final GenericShape c(final C1025Ls.c cVar, final float f, final Density density) {
        return new GenericShape(new InterfaceC8612dsa<Path, Size, LayoutDirection, dpR>() { // from class: com.netflix.hawkins.consumer.component.tooltip.HawkinsTooltipContainerKt$arrowTipShape$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Path path, Size size, LayoutDirection layoutDirection) {
                a(path, size.m1180unboximpl(), layoutDirection);
                return dpR.c;
            }

            public final void a(Path path, long j, LayoutDirection layoutDirection) {
                C8632dsu.c((Object) path, "");
                C8632dsu.c((Object) layoutDirection, "");
                Density density2 = Density.this;
                C1025Ls.c cVar2 = cVar;
                long Size = androidx.compose.ui.geometry.SizeKt.Size(density2.mo193toPx0680j_4(cVar2.i()), density2.mo193toPx0680j_4(cVar2.g()));
                C1025Ls.b j2 = cVar.j();
                if (C8632dsu.c(j2, C1025Ls.b.h.c) || C8632dsu.c(j2, C1025Ls.b.f.e) || C8632dsu.c(j2, C1025Ls.b.i.b)) {
                    C1023Lq.a(path, Size, j, f);
                } else if (C8632dsu.c(j2, C1025Ls.b.e.b) || C8632dsu.c(j2, C1025Ls.b.c.a) || C8632dsu.c(j2, C1025Ls.b.d.e)) {
                    C1023Lq.b(path, Size, j, f, layoutDirection == LayoutDirection.Rtl);
                } else if (C8632dsu.c(j2, C1025Ls.b.a.a)) {
                    LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                    float f2 = f;
                    if (layoutDirection == layoutDirection2) {
                        C1023Lq.b(path, Size, j, f2);
                    } else {
                        C1023Lq.h(path, Size, j, f2);
                    }
                } else if (C8632dsu.c(j2, C1025Ls.b.C0087b.b)) {
                    LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
                    float f3 = f;
                    if (layoutDirection == layoutDirection3) {
                        C1023Lq.h(path, Size, j, f3);
                    } else {
                        C1023Lq.b(path, Size, j, f3);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Path path, long j, long j2, float f) {
        float m1176getWidthimpl = Size.m1176getWidthimpl(j2) * f;
        float m1174getHeightimpl = Size.m1174getHeightimpl(j2);
        path.moveTo(m1176getWidthimpl - Size.m1176getWidthimpl(j), m1174getHeightimpl);
        path.lineTo(m1176getWidthimpl, Size.m1174getHeightimpl(j) + m1174getHeightimpl);
        path.lineTo(m1176getWidthimpl + Size.m1176getWidthimpl(j), m1174getHeightimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Path path, long j, long j2, float f, boolean z) {
        float m1176getWidthimpl = Size.m1176getWidthimpl(j2);
        float f2 = z ? m1176getWidthimpl * (1 - f) : m1176getWidthimpl * f;
        path.moveTo(f2 - Size.m1176getWidthimpl(j), 0.0f);
        path.lineTo(f2, 0.0f - Size.m1174getHeightimpl(j));
        path.lineTo(f2 + Size.m1176getWidthimpl(j), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Path path, long j, long j2, float f) {
        float m1174getHeightimpl = Size.m1174getHeightimpl(j2) * f;
        path.moveTo(0.0f, m1174getHeightimpl - Size.m1176getWidthimpl(j));
        path.lineTo(0.0f - Size.m1174getHeightimpl(j), m1174getHeightimpl);
        path.lineTo(0.0f, m1174getHeightimpl + Size.m1176getWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Path path, long j, long j2, float f) {
        float m1176getWidthimpl = Size.m1176getWidthimpl(j2);
        float m1174getHeightimpl = Size.m1174getHeightimpl(j2) * f;
        path.moveTo(m1176getWidthimpl, m1174getHeightimpl - Size.m1176getWidthimpl(j));
        path.lineTo(Size.m1174getHeightimpl(j) + m1176getWidthimpl, m1174getHeightimpl);
        path.lineTo(m1176getWidthimpl, m1174getHeightimpl + Size.m1176getWidthimpl(j));
    }
}
