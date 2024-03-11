package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private int drawCount;
    private final MutableIntState invalidateCount$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    public VectorPainter() {
        this(null, 1, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    public VectorPainter(GroupComponent groupComponent) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1170boximpl(Size.Companion.m1182getZeroNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.autoMirror$delegate = mutableStateOf$default2;
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new drO<dpR>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                int i;
                int invalidateCount;
                int invalidateCount2;
                i = VectorPainter.this.drawCount;
                invalidateCount = VectorPainter.this.getInvalidateCount();
                if (i == invalidateCount) {
                    VectorPainter vectorPainter = VectorPainter.this;
                    invalidateCount2 = vectorPainter.getInvalidateCount();
                    vectorPainter.setInvalidateCount(invalidateCount2 + 1);
                }
            }
        });
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new GroupComponent() : groupComponent);
    }

    /* renamed from: setSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m1592setSizeuvyYCjk$ui_release(long j) {
        this.size$delegate.setValue(Size.m1170boximpl(j));
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m1593setViewportSizeuvyYCjk$ui_release(long j) {
        this.vector.m1589setViewportSizeuvyYCjk$ui_release(j);
    }

    public final void setName$ui_release(String str) {
        this.vector.setName(str);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1570getIntrinsicSizeNHjbRc() {
        return m1591getSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (!getAutoMirror$ui_release() || drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        } else {
            long mo1561getCenterF1C5BW0 = drawScope.mo1561getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo1544scale0AR0LA0(-1.0f, 1.0f, mo1561getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
        }
        this.drawCount = getInvalidateCount();
    }

    /* renamed from: getSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m1591getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m1180unboximpl();
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i) {
        this.invalidateCount$delegate.setIntValue(i);
    }
}
