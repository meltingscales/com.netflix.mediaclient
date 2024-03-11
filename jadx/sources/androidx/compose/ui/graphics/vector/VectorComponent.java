package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    private final DrawCache cacheDrawScope;
    private final drM<DrawScope, dpR> drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private drO<dpR> invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final void setInvalidateCallback$ui_release(drO<dpR> dro) {
        this.invalidateCallback = dro;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new drM<VNode, dpR>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(VNode vNode) {
                invoke2(vNode);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new drO<dpR>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.intrinsicColorFilter$delegate = mutableStateOf$default;
        Size.Companion companion = Size.Companion;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1170boximpl(companion.m1182getZeroNHjbRc()), null, 2, null);
        this.viewportSize$delegate = mutableStateOf$default2;
        this.previousDrawSize = companion.m1181getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new drM<DrawScope, dpR>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                float f;
                float f2;
                GroupComponent root = VectorComponent.this.getRoot();
                VectorComponent vectorComponent = VectorComponent.this;
                f = vectorComponent.rootScaleX;
                f2 = vectorComponent.rootScaleY;
                long m1149getZeroF1C5BW0 = Offset.Companion.m1149getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo1544scale0AR0LA0(f, f2, m1149getZeroF1C5BW0);
                root.draw(drawScope);
                drawContext.getCanvas().restore();
                drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release  reason: not valid java name */
    public final int m1587getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo1197getConfig_sVssgQ() : ImageBitmapConfig.Companion.m1362getArgb8888_sVssgQ();
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m1589setViewportSizeuvyYCjk$ui_release(long j) {
        this.viewportSize$delegate.setValue(Size.m1170boximpl(j));
    }

    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        int m1362getArgb8888_sVssgQ;
        if (this.root.isTintable() && this.root.m1577getTintColor0d7_KjU() != Color.Companion.m1309getUnspecified0d7_KjU() && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) {
            m1362getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m1361getAlpha8_sVssgQ();
        } else {
            m1362getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m1362getArgb8888_sVssgQ();
        }
        int i = m1362getArgb8888_sVssgQ;
        if (this.isDirty || !Size.m1173equalsimpl0(this.previousDrawSize, drawScope.mo1562getSizeNHjbRc()) || !ImageBitmapConfig.m1357equalsimpl0(i, m1587getCacheBitmapConfig_sVssgQ$ui_release())) {
            this.tintFilter = ImageBitmapConfig.m1357equalsimpl0(i, ImageBitmapConfig.Companion.m1361getAlpha8_sVssgQ()) ? ColorFilter.Companion.m1312tintxETnrds$default(ColorFilter.Companion, this.root.m1577getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) / Size.m1176getWidthimpl(m1588getViewportSizeNHjbRc$ui_release());
            this.rootScaleY = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()) / Size.m1174getHeightimpl(m1588getViewportSizeNHjbRc$ui_release());
            this.cacheDrawScope.m1575drawCachedImageFqjB98A(i, IntSizeKt.IntSize((int) Math.ceil(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc())), (int) Math.ceil(Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo1562getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Size.m1176getWidthimpl(m1588getViewportSizeNHjbRc$ui_release()) + "\n\tviewportHeight: " + Size.m1174getHeightimpl(m1588getViewportSizeNHjbRc$ui_release()) + "\n";
        C8632dsu.a(str, "");
        return str;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m1588getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m1180unboximpl();
    }
}
