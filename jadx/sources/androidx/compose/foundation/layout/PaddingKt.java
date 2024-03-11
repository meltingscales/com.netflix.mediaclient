package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: padding-qDBjuR0  reason: not valid java name */
    public static final Modifier m276paddingqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, true, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("top", Dp.m2490boximpl(f2));
                inspectorInfo.getProperties().set("end", Dp.m2490boximpl(f3));
                inspectorInfo.getProperties().set("bottom", Dp.m2490boximpl(f4));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4  reason: not valid java name */
    public static final Modifier m274paddingVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new PaddingElement(f, f2, f, f2, true, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("vertical", Dp.m2490boximpl(f2));
            }
        }, null));
    }

    /* renamed from: padding-3ABfNKs  reason: not valid java name */
    public static final Modifier m273padding3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new PaddingElement(f, f, f, f, true, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m2490boximpl(f));
            }
        }, null));
    }

    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", PaddingValues.this);
            }
        }));
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo249calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo250calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo250calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo249calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* renamed from: PaddingValues-0680j_4  reason: not valid java name */
    public static final PaddingValues m269PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    /* renamed from: PaddingValues-YgX7TsA  reason: not valid java name */
    public static final PaddingValues m270PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-a9UjIt4  reason: not valid java name */
    public static final PaddingValues m272PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* renamed from: padding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m277paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m2492constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m2492constructorimpl(0);
        }
        return m276paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: padding-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m275paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        return m274paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: PaddingValues-YgX7TsA$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m271PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        return m270PaddingValuesYgX7TsA(f, f2);
    }
}
