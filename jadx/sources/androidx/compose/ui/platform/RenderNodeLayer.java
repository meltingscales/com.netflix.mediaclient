package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8627dsp;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class RenderNodeLayer implements OwnedLayer {
    private drM<? super Canvas, dpR> drawBlock;
    private boolean drawnWithZ;
    private drO<dpR> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final drX<DeviceRenderNode, Matrix, dpR> getMatrix = new drX<DeviceRenderNode, Matrix, dpR>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // o.drX
        public /* bridge */ /* synthetic */ dpR invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m1480getCenterSzJe1aQ();

    public RenderNodeLayer(AndroidComposeView androidComposeView, drM<? super Canvas, dpR> drm, drO<dpR> dro) {
        DeviceRenderNode renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = drm;
        this.invalidateParentLayer = dro;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        renderNodeApi23.setClipToBounds(false);
        this.renderNode = renderNodeApi23;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density) {
        drO<dpR> dro;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i = mutatedFields$ui_release & 4096;
        if (i != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo1349getTransformOriginSzJe1aQ();
        }
        boolean z = false;
        boolean z2 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields$ui_release & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m1317toArgb8_81llA(reusableGraphicsLayerScope.m1426getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m1317toArgb8_81llA(reusableGraphicsLayerScope.m1428getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & JSONzip.end) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i != 0) {
            this.renderNode.setPivotX(TransformOrigin.m1475getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m1476getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z3 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.renderNode.setClipToOutline(z3);
            this.renderNode.setClipToBounds(reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo1995setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.m1427getCompositingStrategyNrFUSI());
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z3, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getOutline());
        }
        if (z3 && !this.outlineResolver.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && update)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (dro = this.invalidateParentLayer) != null) {
            dro.invoke();
        }
        if ((mutatedFields$ui_release & 7963) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo1942isInLayerk4lQ0M(long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= m1137getXimpl && m1137getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= m1138getYimpl && m1138getYimpl < ((float) this.renderNode.getHeight());
        } else if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m2013isInOutlinek4lQ0M(j);
        } else {
            return true;
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo1945resizeozmzZPI(long j) {
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(j);
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(j);
        float f = m2547getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m1475getPivotFractionXimpl(this.transformOrigin) * f);
        float f2 = m2546getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m1476getPivotFractionYimpl(this.transformOrigin) * f2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m2547getWidthimpl, this.renderNode.getTop() + m2546getHeightimpl)) {
            this.outlineResolver.m2014updateuvyYCjk(SizeKt.Size(f, f2));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo1944movegyyYBs(long j) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m2533getXimpl = IntOffset.m2533getXimpl(j);
        int m2534getYimpl = IntOffset.m2534getYimpl(j);
        if (left == m2533getXimpl && top == m2534getYimpl) {
            return;
        }
        if (left != m2533getXimpl) {
            this.renderNode.offsetLeftAndRight(m2533getXimpl - left);
        }
        if (top != m2534getYimpl) {
            this.renderNode.offsetTopAndBottom(m2534getYimpl - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo1189concat58bKbWc(this.matrixCache.m2004calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        drM<? super Canvas, dpR> drm = this.drawBlock;
        if (drm != null) {
            drm.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            drM<? super Canvas, dpR> drm = this.drawBlock;
            if (drm != null) {
                this.renderNode.record(this.canvasHolder, clipPath, drm);
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo1943mapOffset8S9VItk(long j, boolean z) {
        if (z) {
            float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this.renderNode);
            return m2003calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1373mapMKHz9U(m2003calculateInverseMatrixbWbORWo, j) : Offset.Companion.m1147getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m1373mapMKHz9U(this.matrixCache.m2004calculateMatrixGrdbGEg(this.renderNode), j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        if (z) {
            float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this.renderNode);
            if (m2003calculateInverseMatrixbWbORWo == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                androidx.compose.ui.graphics.Matrix.m1374mapimpl(m2003calculateInverseMatrixbWbORWo, mutableRect);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m1374mapimpl(this.matrixCache.m2004calculateMatrixGrdbGEg(this.renderNode), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(drM<? super Canvas, dpR> drm, drO<dpR> dro) {
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m1480getCenterSzJe1aQ();
        this.drawBlock = drm;
        this.invalidateParentLayer = dro;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo1946transform58bKbWc(float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m1378timesAssign58bKbWc(fArr, this.matrixCache.m2004calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo1941inverseTransform58bKbWc(float[] fArr) {
        float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this.renderNode);
        if (m2003calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m1378timesAssign58bKbWc(fArr, m2003calculateInverseMatrixbWbORWo);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
