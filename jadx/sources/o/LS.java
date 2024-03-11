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
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.LW;
import o.dpR;

/* loaded from: classes3.dex */
public final class LS implements MeasurePolicy {
    private final float a;
    private final HawkinsInputSize c;
    private final boolean d;
    private final PaddingValues e;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HawkinsInputSize.values().length];
            try {
                iArr[HawkinsInputSize.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HawkinsInputSize.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public LS(boolean z, float f, PaddingValues paddingValues, HawkinsInputSize hawkinsInputSize) {
        C8632dsu.c((Object) paddingValues, "");
        C8632dsu.c((Object) hawkinsInputSize, "");
        this.d = z;
        this.a = f;
        this.e = paddingValues;
        this.c = hawkinsInputSize;
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
        float c;
        C8632dsu.c((Object) measureScope, "");
        C8632dsu.c((Object) list, "");
        final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.e.mo251calculateTopPaddingD9Ej5fM());
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.e.mo248calculateBottomPaddingD9Ej5fM());
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
        int b2 = C1033Ma.b(mo1803measureBRTryo0);
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
        Placeable mo1803measureBRTryo02 = measurable2 != null ? measurable2.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b2, 0, 2, null)) : null;
        int b3 = b2 + C1033Ma.b(mo1803measureBRTryo02);
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
            placeable2 = measurable3.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b3, 0, 2, null));
        } else {
            placeable = mo1803measureBRTryo02;
            placeable2 = null;
        }
        int b4 = b3 + C1033Ma.b(placeable2);
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
        final Placeable mo1803measureBRTryo03 = measurable4 != null ? measurable4.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -b4, 0, 2, null)) : null;
        int b5 = C1033Ma.b(mo1803measureBRTryo03);
        int max4 = Math.max(max3, C1033Ma.c(mo1803measureBRTryo03));
        int i = -(b4 + b5);
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
        int c2 = C1033Ma.c(mo1803measureBRTryo04) + mo187roundToPx0680j_4;
        long m2488offsetNN6EwU2 = ConstraintsKt.m2488offsetNN6EwU(Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i, (-c2) - mo187roundToPx0680j_42);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Measurable measurable6 = (Measurable) it6.next();
            Iterator it7 = it6;
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable6), (Object) "TextField")) {
                final Placeable mo1803measureBRTryo05 = measurable6.mo1803measureBRTryo0(m2488offsetNN6EwU2);
                long m2464copyZbe2FdA$default2 = Constraints.m2464copyZbe2FdA$default(m2488offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    Object next = it8.next();
                    Iterator it9 = it8;
                    if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) next), (Object) "Hint")) {
                        obj6 = next;
                        break;
                    }
                    it8 = it9;
                }
                Measurable measurable7 = (Measurable) obj6;
                Placeable mo1803measureBRTryo06 = measurable7 != null ? measurable7.mo1803measureBRTryo0(m2464copyZbe2FdA$default2) : null;
                long m2464copyZbe2FdA$default3 = Constraints.m2464copyZbe2FdA$default(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, 0, -Math.max(max4, Math.max(C1033Ma.c(mo1803measureBRTryo05), C1033Ma.c(mo1803measureBRTryo06)) + c2 + mo187roundToPx0680j_42), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it10.next();
                    if (C8632dsu.c(LayoutIdKt.getLayoutId((Measurable) obj7), (Object) "Supporting")) {
                        break;
                    }
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable mo1803measureBRTryo07 = measurable8 != null ? measurable8.mo1803measureBRTryo0(m2464copyZbe2FdA$default3) : null;
                int c3 = C1033Ma.c(mo1803measureBRTryo07);
                final int a = LX.a(C1033Ma.b(mo1803measureBRTryo0), C1033Ma.b(placeable), C1033Ma.b(placeable2), C1033Ma.b(mo1803measureBRTryo03), mo1803measureBRTryo05.getWidth(), C1033Ma.b(mo1803measureBRTryo04), C1033Ma.b(mo1803measureBRTryo06), j);
                int i2 = b.a[this.c.ordinal()];
                if (i2 == 1) {
                    c = LQ.c();
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    c = LQ.d();
                }
                final int mo193toPx0680j_4 = ((int) measureScope.mo193toPx0680j_4(c)) + c3;
                int i3 = mo193toPx0680j_4 - c3;
                for (Measurable measurable9 : list) {
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable9), (Object) "Container")) {
                        final Placeable mo1803measureBRTryo08 = measurable9.mo1803measureBRTryo0(ConstraintsKt.Constraints(a != Integer.MAX_VALUE ? a : 0, a, i3 != Integer.MAX_VALUE ? i3 : 0, i3));
                        final Placeable placeable3 = mo1803measureBRTryo06;
                        final Placeable placeable4 = mo1803measureBRTryo0;
                        final Placeable placeable5 = placeable;
                        final Placeable placeable6 = mo1803measureBRTryo07;
                        return MeasureScope.layout$default(measureScope, a, mo193toPx0680j_4, null, new drM<Placeable.PlacementScope, dpR>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldMeasurePolicy$measure$1
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
                                boolean z;
                                PaddingValues paddingValues;
                                boolean z2;
                                float f;
                                HawkinsInputSize hawkinsInputSize;
                                C8632dsu.c((Object) placementScope, "");
                                Placeable placeable7 = Placeable.this;
                                if (placeable7 != null) {
                                    int i4 = a;
                                    int i5 = mo193toPx0680j_4;
                                    Placeable placeable8 = mo1803measureBRTryo05;
                                    Placeable placeable9 = placeable3;
                                    Placeable placeable10 = placeable4;
                                    Placeable placeable11 = placeable5;
                                    Placeable placeable12 = placeable2;
                                    Placeable placeable13 = mo1803measureBRTryo03;
                                    Placeable placeable14 = mo1803measureBRTryo08;
                                    Placeable placeable15 = placeable6;
                                    z2 = this.d;
                                    int i6 = mo187roundToPx0680j_4;
                                    int height = Placeable.this.getHeight();
                                    f = this.a;
                                    float density = measureScope.getDensity();
                                    hawkinsInputSize = this.c;
                                    LW.e(placementScope, i4, i5, placeable8, placeable7, placeable9, placeable10, placeable11, placeable12, placeable13, placeable14, placeable15, z2, i6, i6 + height, f, density, hawkinsInputSize);
                                    return;
                                }
                                int i7 = a;
                                int i8 = mo193toPx0680j_4;
                                Placeable placeable16 = mo1803measureBRTryo05;
                                Placeable placeable17 = placeable3;
                                Placeable placeable18 = placeable4;
                                Placeable placeable19 = placeable5;
                                Placeable placeable20 = placeable2;
                                Placeable placeable21 = mo1803measureBRTryo03;
                                Placeable placeable22 = mo1803measureBRTryo08;
                                Placeable placeable23 = placeable6;
                                z = this.d;
                                float density2 = measureScope.getDensity();
                                paddingValues = this.e;
                                LW.d(placementScope, i7, i8, placeable16, placeable17, placeable18, placeable19, placeable20, placeable21, placeable22, placeable23, z, density2, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it6 = it7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return b(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return b(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return b(intrinsicMeasurable, num.intValue());
            }

            public final Integer b(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                C8632dsu.c((Object) intrinsicMeasurable, "");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C8632dsu.c((Object) intrinsicMeasureScope, "");
        C8632dsu.c((Object) list, "");
        return b(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return b(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldMeasurePolicy$minIntrinsicWidth$1
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
    private final int b(List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final int b(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int e;
        for (Object obj8 : list) {
            if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj8), (Object) "TextField")) {
                int intValue = drx.invoke(obj8, Integer.valueOf(i)).intValue();
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
                        obj7 = null;
                        break;
                    }
                    obj7 = it6.next();
                    if (C8632dsu.c(C1033Ma.b((IntrinsicMeasurable) obj7), (Object) "Hint")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj7;
                int intValue7 = intrinsicMeasurable6 != null ? drx.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0;
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
                e = LW.e(intValue, intValue2, intValue4, intValue3, intValue5, intValue6, intValue7, intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0, this.a, C1033Ma.f(), intrinsicMeasureScope.getDensity(), this.e);
                return e;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
