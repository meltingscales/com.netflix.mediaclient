package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxHeight;
    private static final FillElement FillWholeMaxSize;
    private static final FillElement FillWholeMaxWidth;
    private static final WrapContentElement WrapContentHeightCenter;
    private static final WrapContentElement WrapContentHeightTop;
    private static final WrapContentElement WrapContentSizeCenter;
    private static final WrapContentElement WrapContentSizeTopStart;
    private static final WrapContentElement WrapContentWidthCenter;
    private static final WrapContentElement WrapContentWidthStart;

    /* renamed from: size-6HolHcs */
    public static final Modifier m296size6HolHcs(Modifier modifier, long j) {
        return m297sizeVpY3zN4(modifier, DpSize.m2519getWidthD9Ej5fM(j), DpSize.m2518getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m302widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m301widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m290heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m289heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m299sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m298sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m294requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m293requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f));
    }

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f));
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        WrapContentElement width;
        Alignment.Companion companion = Alignment.Companion;
        if (!C8632dsu.c(horizontal, companion.getCenterHorizontally()) || z) {
            width = (!C8632dsu.c(horizontal, companion.getStart()) || z) ? WrapContentElement.Companion.width(horizontal, z) : WrapContentWidthStart;
        } else {
            width = WrapContentWidthCenter;
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        WrapContentElement height;
        Alignment.Companion companion = Alignment.Companion;
        if (!C8632dsu.c(vertical, companion.getCenterVertically()) || z) {
            height = (!C8632dsu.c(vertical, companion.getTop()) || z) ? WrapContentElement.Companion.height(vertical, z) : WrapContentHeightTop;
        } else {
            height = WrapContentHeightCenter;
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        WrapContentElement size;
        Alignment.Companion companion = Alignment.Companion;
        if (!C8632dsu.c(alignment, companion.getCenter()) || z) {
            size = (!C8632dsu.c(alignment, companion.getTopStart()) || z) ? WrapContentElement.Companion.size(alignment, z) : WrapContentSizeTopStart;
        } else {
            size = WrapContentSizeCenter;
        }
        return modifier.then(size);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m287defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m286defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m286defaultMinSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: width-3ABfNKs */
    public static final Modifier m300width3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                inspectorInfo.setValue(Dp.m2490boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs */
    public static final Modifier m288height3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                inspectorInfo.setValue(Dp.m2490boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: size-3ABfNKs */
    public static final Modifier m295size3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m2490boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4 */
    public static final Modifier m297sizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set(InteractiveAnimation.ANIMATION_TYPE.WIDTH, Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m301widthInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m289heightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m298sizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("minHeight", Dp.m2490boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", Dp.m2490boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", Dp.m2490boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m292requiredSize3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m2490boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m291requiredHeightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m293requiredSizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("minHeight", Dp.m2490boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", Dp.m2490boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", Dp.m2490boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }
}
