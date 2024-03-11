package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8627dsp;
import o.C8632dsu;
import o.dsT;

/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, C8627dsp c8627dsp) {
        this(imageBitmap, j, j2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release  reason: not valid java name */
    public final void m1571setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, C8627dsp c8627dsp) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m2538getZeronOccac() : j, (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m1333getLowfv9h1I();
        this.size = m1569validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        int e;
        int e2;
        ImageBitmap imageBitmap = this.image;
        long j = this.srcOffset;
        long j2 = this.srcSize;
        e = dsT.e(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()));
        e2 = dsT.e(Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()));
        DrawScope.m1548drawImageAZ2fEMs$default(drawScope, imageBitmap, j, j2, 0L, IntSizeKt.IntSize(e, e2), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long mo1570getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m2553toSizeozmzZPI(this.size);
    }

    /* renamed from: validateSize-N5eqBDc  reason: not valid java name */
    private final long m1569validateSizeN5eqBDc(long j, long j2) {
        if (IntOffset.m2533getXimpl(j) < 0 || IntOffset.m2534getYimpl(j) < 0 || IntSize.m2547getWidthimpl(j2) < 0 || IntSize.m2546getHeightimpl(j2) < 0 || IntSize.m2547getWidthimpl(j2) > this.image.getWidth() || IntSize.m2546getHeightimpl(j2) > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BitmapPainter) {
            BitmapPainter bitmapPainter = (BitmapPainter) obj;
            return C8632dsu.c(this.image, bitmapPainter.image) && IntOffset.m2532equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m2545equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m1329equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode();
        int m2535hashCodeimpl = IntOffset.m2535hashCodeimpl(this.srcOffset);
        return (((((hashCode * 31) + m2535hashCodeimpl) * 31) + IntSize.m2548hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m1330hashCodeimpl(this.filterQuality);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m2536toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m2549toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m1331toStringimpl(this.filterQuality)) + ')';
    }
}
