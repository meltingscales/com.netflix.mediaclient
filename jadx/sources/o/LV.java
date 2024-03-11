package o;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8632dsu;
import o.LT;
import o.dpR;

/* loaded from: classes3.dex */
public final class LV implements MeasurePolicy {
    private final drM<Size, dpR> b;
    private final float c;
    private final boolean d;
    private final PaddingValues e;

    /* JADX WARN: Multi-variable type inference failed */
    public LV(drM<? super Size, dpR> drm, boolean z, float f, PaddingValues paddingValues) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) paddingValues, "");
        this.b = drm;
        this.d = z;
        this.c = f;
        this.e = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Placeable placeable;
        Placeable placeable2;
        Object obj5;
        Object obj6;
        Object obj7;
        final int c;
        final int e;
        C8632dsu.c((Object) measureScope, "");
        C8632dsu.c((Object) list, "");
        int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.e.mo248calculateBottomPaddingD9Ej5fM());
        long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj), (Object) "Leading")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo1803measureBRTryo0 = measurable != null ? measurable.mo1803measureBRTryo0(m2464copyZbe2FdA$default) : null;
        int b = C1033Ma.b(mo1803measureBRTryo0);
        int max = Math.max(0, C1033Ma.c(mo1803measureBRTryo0));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj2), (Object) "Trailing")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo1803measureBRTryo02 = measurable2 != null ? measurable2.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b, 0, 2, null)) : null;
        int b2 = b + C1033Ma.b(mo1803measureBRTryo02);
        int max2 = Math.max(max, C1033Ma.c(mo1803measureBRTryo02));
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj3), (Object) "Prefix")) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo1803measureBRTryo03 = measurable3 != null ? measurable3.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b2, 0, 2, null)) : null;
        int b3 = b2 + C1033Ma.b(mo1803measureBRTryo03);
        int max3 = Math.max(max2, C1033Ma.c(mo1803measureBRTryo03));
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj4), (Object) "Suffix")) {
                break;
            }
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            placeable = mo1803measureBRTryo02;
            placeable2 = measurable4.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b3, 0, 2, null));
        } else {
            placeable = mo1803measureBRTryo02;
            placeable2 = null;
        }
        int b4 = C1033Ma.b(placeable2);
        int max4 = Math.max(max3, C1033Ma.c(placeable2));
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.e.mo249calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo187roundToPx0680j_4(this.e.mo250calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i = -(b3 + b4);
        int i2 = -mo187roundToPx0680j_4;
        long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(m2464copyZbe2FdA$default, MathHelpersKt.lerp(i - mo187roundToPx0680j_42, -mo187roundToPx0680j_42, this.c), i2);
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            Iterator it6 = it5;
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj5), (Object) "Label")) {
                break;
            }
            it5 = it6;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable mo1803measureBRTryo04 = measurable5 != null ? measurable5.mo1803measureBRTryo0(m2488offsetNN6EwU) : null;
        if (mo1803measureBRTryo04 != null) {
            this.b.invoke(Size.m1170boximpl(SizeKt.Size(mo1803measureBRTryo04.getWidth(), mo1803measureBRTryo04.getHeight())));
        }
        Iterator it7 = list.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it7.next();
            Iterator it8 = it7;
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj6), (Object) "Supporting")) {
                break;
            }
            it7 = it8;
        }
        Measurable measurable6 = (Measurable) obj6;
        int minIntrinsicHeight = measurable6 != null ? measurable6.minIntrinsicHeight(Constraints.m2475getMinWidthimpl(j)) : 0;
        int max5 = Math.max(C1033Ma.c(mo1803measureBRTryo04) / 2, measureScope.mo187roundToPx0680j_4(this.e.mo251calculateTopPaddingD9Ej5fM()));
        long m2464copyZbe2FdA$default2 = Constraints.m2464copyZbe2FdA$default(ConstraintsKt.m2488offsetNN6EwU(j, i, (i2 - max5) - minIntrinsicHeight), 0, 0, 0, 0, 11, null);
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            Measurable measurable7 = (Measurable) it9.next();
            Iterator it10 = it9;
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable7), (Object) "TextField")) {
                final Placeable mo1803measureBRTryo05 = measurable7.mo1803measureBRTryo0(m2464copyZbe2FdA$default2);
                long m2464copyZbe2FdA$default3 = Constraints.m2464copyZbe2FdA$default(m2464copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    Object next = it11.next();
                    Iterator it12 = it11;
                    if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) next), (Object) "Hint")) {
                        obj7 = next;
                        break;
                    }
                    it11 = it12;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable mo1803measureBRTryo06 = measurable8 != null ? measurable8.mo1803measureBRTryo0(m2464copyZbe2FdA$default3) : null;
                int max6 = Math.max(max4, Math.max(C1033Ma.c(mo1803measureBRTryo05), C1033Ma.c(mo1803measureBRTryo06)) + max5 + mo187roundToPx0680j_4);
                c = LT.c(C1033Ma.b(mo1803measureBRTryo0), C1033Ma.b(placeable), C1033Ma.b(mo1803measureBRTryo03), C1033Ma.b(placeable2), mo1803measureBRTryo05.getWidth(), C1033Ma.b(mo1803measureBRTryo04), C1033Ma.b(mo1803measureBRTryo06), this.c, j, measureScope.getDensity(), this.e);
                Placeable mo1803measureBRTryo07 = measurable6 != null ? measurable6.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, 0, -max6, 1, null), 0, c, 0, 0, 9, null)) : null;
                int c2 = C1033Ma.c(mo1803measureBRTryo07);
                e = LT.e(C1033Ma.c(mo1803measureBRTryo0), C1033Ma.c(placeable), C1033Ma.c(mo1803measureBRTryo03), C1033Ma.c(placeable2), mo1803measureBRTryo05.getHeight(), C1033Ma.c(mo1803measureBRTryo04), C1033Ma.c(mo1803measureBRTryo06), C1033Ma.c(mo1803measureBRTryo07), this.c, j, measureScope.getDensity(), this.e);
                int i3 = e - c2;
                for (Measurable measurable9 : list) {
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable9), (Object) "Container")) {
                        final Placeable mo1803measureBRTryo08 = measurable9.mo1803measureBRTryo0(ConstraintsKt.Constraints(c != Integer.MAX_VALUE ? c : 0, c, i3 != Integer.MAX_VALUE ? i3 : 0, i3));
                        final Placeable placeable3 = mo1803measureBRTryo0;
                        final Placeable placeable4 = placeable;
                        final Placeable placeable5 = mo1803measureBRTryo03;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = mo1803measureBRTryo04;
                        final Placeable placeable8 = mo1803measureBRTryo06;
                        final Placeable placeable9 = mo1803measureBRTryo07;
                        return MeasureScope.layout$default(measureScope, c, e, null, new drM<Placeable.PlacementScope, dpR>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldMeasurePolicy$measure$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                d(placementScope);
                                return dpR.c;
                            }

                            public final void d(Placeable.PlacementScope placementScope) {
                                float f;
                                boolean z;
                                PaddingValues paddingValues;
                                C8632dsu.c((Object) placementScope, "");
                                int i4 = e;
                                int i5 = c;
                                Placeable placeable10 = placeable3;
                                Placeable placeable11 = placeable4;
                                Placeable placeable12 = placeable5;
                                Placeable placeable13 = placeable6;
                                Placeable placeable14 = mo1803measureBRTryo05;
                                Placeable placeable15 = placeable7;
                                Placeable placeable16 = placeable8;
                                Placeable placeable17 = mo1803measureBRTryo08;
                                Placeable placeable18 = placeable9;
                                f = this.c;
                                z = this.d;
                                float density = measureScope.getDensity();
                                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                                paddingValues = this.e;
                                LT.c(placementScope, i4, i5, placeable10, placeable11, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, placeable18, f, z, density, layoutDirection, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it9 = it10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return b(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return e(intrinsicMeasurable, num.intValue());
            }

            public final Integer e(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return b(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return d(intrinsicMeasurable, num.intValue());
            }

            public final Integer d(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return d(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return d(intrinsicMeasurable, num.intValue());
            }

            public final Integer d(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return d(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return a(intrinsicMeasurable, num.intValue());
            }

            public final Integer a(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        Object obj5;
        int i5;
        Object obj6;
        int i6;
        Object obj7;
        int e;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj2), (Object) "Leading")) {
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            i2 = i - intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            i3 = drx.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj3), (Object) "Trailing")) {
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            i2 -= intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE);
            i4 = drx.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it3.next();
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj4), (Object) "Label")) {
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        int intValue = intrinsicMeasurable3 != null ? drx.invoke(intrinsicMeasurable3, Integer.valueOf(MathHelpersKt.lerp(i2, i, this.c))).intValue() : 0;
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it4.next();
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj5), (Object) "Prefix")) {
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            int intValue2 = drx.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue();
            i2 -= intrinsicMeasurable4.maxIntrinsicWidth(Integer.MAX_VALUE);
            i5 = intValue2;
        } else {
            i5 = 0;
        }
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it5.next();
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj6), (Object) "Suffix")) {
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
        if (intrinsicMeasurable5 != null) {
            int intValue3 = drx.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue();
            i2 -= intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE);
            i6 = intValue3;
        } else {
            i6 = 0;
        }
        for (Object obj8 : list) {
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj8), (Object) "TextField")) {
                int intValue4 = drx.invoke(obj8, Integer.valueOf(i2)).intValue();
                Iterator<T> it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it6.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj7), (Object) "Hint")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj7;
                int intValue5 = intrinsicMeasurable6 != null ? drx.invoke(intrinsicMeasurable6, Integer.valueOf(i2)).intValue() : 0;
                Iterator<T> it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next = it7.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) next), (Object) "Supporting")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj;
                e = LT.e(i3, i4, i5, i6, intValue4, intValue, intValue5, intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0, this.c, C1033Ma.f(), intrinsicMeasureScope.getDensity(), this.e);
                return e;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int d(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int c;
        for (Object obj7 : list) {
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj7), (Object) "TextField")) {
                int intValue = drx.invoke(obj7, Integer.valueOf(i)).intValue();
                Iterator<T> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj2), (Object) "Label")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? drx.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj3), (Object) "Trailing")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? drx.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj4), (Object) "Leading")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? drx.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it4.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj5), (Object) "Prefix")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int intValue5 = intrinsicMeasurable4 != null ? drx.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it5.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj6), (Object) "Suffix")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int intValue6 = intrinsicMeasurable5 != null ? drx.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next = it6.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) next), (Object) "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                c = LT.c(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intrinsicMeasurable6 != null ? drx.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0, this.c, C1033Ma.f(), intrinsicMeasureScope.getDensity(), this.e);
                return c;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
