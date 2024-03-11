package o;

import androidx.compose.foundation.layout.PaddingValues;
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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8632dsu;
import o.LX;
import o.dpR;

/* renamed from: o.Mb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1034Mb implements MeasurePolicy {
    private final PaddingValues a;
    private final float c;
    private final boolean e;

    public C1034Mb(boolean z, float f, PaddingValues paddingValues) {
        C8632dsu.c((Object) paddingValues, "");
        this.e = z;
        this.c = f;
        this.a = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Placeable placeable;
        final Placeable placeable2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        final int a;
        C8632dsu.c((Object) measureScope, "");
        C8632dsu.c((Object) list, "");
        final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.a.mo251calculateTopPaddingD9Ej5fM());
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.a.mo248calculateBottomPaddingD9Ej5fM());
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
        if (measurable3 != null) {
            placeable = mo1803measureBRTryo02;
            placeable2 = measurable3.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b2, 0, 2, null));
        } else {
            placeable = mo1803measureBRTryo02;
            placeable2 = null;
        }
        int b3 = b2 + C1033Ma.b(placeable2);
        int max3 = Math.max(max2, C1033Ma.c(placeable2));
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
        final Placeable mo1803measureBRTryo03 = measurable4 != null ? measurable4.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b3, 0, 2, null)) : null;
        int b4 = C1033Ma.b(mo1803measureBRTryo03);
        int max4 = Math.max(max3, C1033Ma.c(mo1803measureBRTryo03));
        int i = -(b3 + b4);
        long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(m2464copyZbe2FdA$default, i, -mo187roundToPx0680j_42);
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj5), (Object) "Label")) {
                break;
            }
        }
        Measurable measurable5 = (Measurable) obj5;
        final Placeable mo1803measureBRTryo04 = measurable5 != null ? measurable5.mo1803measureBRTryo0(m2488offsetNN6EwU) : null;
        Iterator<T> it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it6.next();
            if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj6), (Object) "Supporting")) {
                break;
            }
        }
        Measurable measurable6 = (Measurable) obj6;
        int minIntrinsicHeight = measurable6 != null ? measurable6.minIntrinsicHeight(Constraints.m2475getMinWidthimpl(j)) : 0;
        int c = C1033Ma.c(mo1803measureBRTryo04) + mo187roundToPx0680j_4;
        long m2488offsetNN6EwU2 = ConstraintsKt.m2488offsetNN6EwU(Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i, ((-c) - mo187roundToPx0680j_42) - minIntrinsicHeight);
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            Measurable measurable7 = (Measurable) it7.next();
            Iterator it8 = it7;
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable7), (Object) "TextField")) {
                final Placeable mo1803measureBRTryo05 = measurable7.mo1803measureBRTryo0(m2488offsetNN6EwU2);
                long m2464copyZbe2FdA$default2 = Constraints.m2464copyZbe2FdA$default(m2488offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    Object next = it9.next();
                    Iterator it10 = it9;
                    if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) next), (Object) "Hint")) {
                        obj7 = next;
                        break;
                    }
                    it9 = it10;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable mo1803measureBRTryo06 = measurable8 != null ? measurable8.mo1803measureBRTryo0(m2464copyZbe2FdA$default2) : null;
                int max5 = Math.max(max4, Math.max(C1033Ma.c(mo1803measureBRTryo05), C1033Ma.c(mo1803measureBRTryo06)) + c + mo187roundToPx0680j_42);
                final int a2 = LX.a(C1033Ma.b(mo1803measureBRTryo0), C1033Ma.b(placeable), C1033Ma.b(placeable2), C1033Ma.b(mo1803measureBRTryo03), mo1803measureBRTryo05.getWidth(), C1033Ma.b(mo1803measureBRTryo04), C1033Ma.b(mo1803measureBRTryo06), j);
                final Placeable mo1803measureBRTryo07 = measurable6 != null ? measurable6.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, 0, -max5, 1, null), 0, a2, 0, 0, 9, null)) : null;
                int c2 = C1033Ma.c(mo1803measureBRTryo07);
                a = LX.a(mo1803measureBRTryo05.getHeight(), C1033Ma.c(mo1803measureBRTryo04), C1033Ma.c(mo1803measureBRTryo0), C1033Ma.c(placeable), C1033Ma.c(placeable2), C1033Ma.c(mo1803measureBRTryo03), C1033Ma.c(mo1803measureBRTryo06), C1033Ma.c(mo1803measureBRTryo07), this.c, j, measureScope.getDensity(), this.a);
                int i2 = a - c2;
                for (Measurable measurable9 : list) {
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable9), (Object) "Container")) {
                        final Placeable mo1803measureBRTryo08 = measurable9.mo1803measureBRTryo0(ConstraintsKt.Constraints(a2 != Integer.MAX_VALUE ? a2 : 0, a2, i2 != Integer.MAX_VALUE ? i2 : 0, i2));
                        final Placeable placeable3 = mo1803measureBRTryo06;
                        final Placeable placeable4 = mo1803measureBRTryo0;
                        final Placeable placeable5 = placeable;
                        return MeasureScope.layout$default(measureScope, a2, a, null, new drM<Placeable.PlacementScope, dpR>() { // from class: com.netflix.hawkins.internal.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                c(placementScope);
                                return dpR.c;
                            }

                            public final void c(Placeable.PlacementScope placementScope) {
                                boolean z;
                                PaddingValues paddingValues;
                                boolean z2;
                                float f;
                                C8632dsu.c((Object) placementScope, "");
                                Placeable placeable6 = Placeable.this;
                                if (placeable6 != null) {
                                    int i3 = a2;
                                    int i4 = a;
                                    Placeable placeable7 = mo1803measureBRTryo05;
                                    Placeable placeable8 = placeable3;
                                    Placeable placeable9 = placeable4;
                                    Placeable placeable10 = placeable5;
                                    Placeable placeable11 = placeable2;
                                    Placeable placeable12 = mo1803measureBRTryo03;
                                    Placeable placeable13 = mo1803measureBRTryo08;
                                    Placeable placeable14 = mo1803measureBRTryo07;
                                    z2 = this.e;
                                    int i5 = mo187roundToPx0680j_4;
                                    int height = Placeable.this.getHeight();
                                    f = this.c;
                                    LX.e(placementScope, i3, i4, placeable7, placeable6, placeable8, placeable9, placeable10, placeable11, placeable12, placeable13, placeable14, z2, i5, i5 + height, f, measureScope.getDensity());
                                    return;
                                }
                                int i6 = a2;
                                int i7 = a;
                                Placeable placeable15 = mo1803measureBRTryo05;
                                Placeable placeable16 = placeable3;
                                Placeable placeable17 = placeable4;
                                Placeable placeable18 = placeable5;
                                Placeable placeable19 = placeable2;
                                Placeable placeable20 = mo1803measureBRTryo03;
                                Placeable placeable21 = mo1803measureBRTryo08;
                                Placeable placeable22 = mo1803measureBRTryo07;
                                z = this.e;
                                float density = measureScope.getDensity();
                                paddingValues = this.a;
                                LX.d(placementScope, i6, i7, placeable15, placeable16, placeable17, placeable18, placeable19, placeable20, placeable21, placeable22, z, density, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it7 = it8;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return d(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return c(intrinsicMeasurable, num.intValue());
            }

            public final Integer c(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return d(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return a(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return e(intrinsicMeasurable, num.intValue());
            }

            public final Integer e(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return a(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.material3.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return e(intrinsicMeasurable, num.intValue());
            }

            public final Integer e(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int d(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
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
        int a;
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
        int intValue = intrinsicMeasurable3 != null ? drx.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue() : 0;
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
                a = LX.a(intValue4, intValue, i3, i4, i5, i6, intValue5, intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0, this.c, C1033Ma.f(), intrinsicMeasureScope.getDensity(), this.a);
                return a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int a(List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
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
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj4), (Object) "Prefix")) {
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
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj5), (Object) "Suffix")) {
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
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj6), (Object) "Leading")) {
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
                return LX.a(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, intrinsicMeasurable6 != null ? drx.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0, C1033Ma.f());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
