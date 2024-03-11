package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.C8632dsu;
import o.drX;

/* loaded from: classes.dex */
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion Companion = new Companion(null);
    private final Object align;
    private final drX<IntSize, LayoutDirection, IntOffset> alignmentCallback;
    private final Direction direction;
    private final String inspectorName;
    private final boolean unbounded;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(Direction direction, boolean z, drX<? super IntSize, ? super LayoutDirection, IntOffset> drx, Object obj, String str) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = drx;
        this.align = obj;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WrapContentElement.class == obj.getClass()) {
            WrapContentElement wrapContentElement = (WrapContentElement) obj;
            return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && C8632dsu.c(this.align, wrapContentElement.align);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.direction.hashCode();
        return (((hashCode * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final WrapContentElement width(final Alignment.Horizontal horizontal, boolean z) {
            return new WrapContentElement(Direction.Horizontal, z, new drX<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$width$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m2525boximpl(m331invoke5SAbXVA(intSize.m2550unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA  reason: not valid java name */
                public final long m331invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                    return IntOffsetKt.IntOffset(Alignment.Horizontal.this.align(0, IntSize.m2547getWidthimpl(j), layoutDirection), 0);
                }
            }, horizontal, "wrapContentWidth");
        }

        public final WrapContentElement height(final Alignment.Vertical vertical, boolean z) {
            return new WrapContentElement(Direction.Vertical, z, new drX<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$height$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m2525boximpl(m329invoke5SAbXVA(intSize.m2550unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA  reason: not valid java name */
                public final long m329invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                    return IntOffsetKt.IntOffset(0, Alignment.Vertical.this.align(0, IntSize.m2546getHeightimpl(j)));
                }
            }, vertical, "wrapContentHeight");
        }

        public final WrapContentElement size(final Alignment alignment, boolean z) {
            return new WrapContentElement(Direction.Both, z, new drX<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$size$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m2525boximpl(m330invoke5SAbXVA(intSize.m2550unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA  reason: not valid java name */
                public final long m330invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                    return Alignment.this.mo1056alignKFBX0sM(IntSize.Companion.m2551getZeroYbymL2g(), j, layoutDirection);
                }
            }, alignment, "wrapContentSize");
        }
    }
}
