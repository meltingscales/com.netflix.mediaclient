package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class ViewLayer extends View implements OwnedLayer {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private drM<? super Canvas, dpR> drawBlock;
    private boolean drawnWithZ;
    private drO<dpR> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final drX<View, Matrix, dpR> getMatrix = new drX<View, Matrix, dpR>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // o.drX
        public /* bridge */ /* synthetic */ dpR invoke(View view, Matrix matrix) {
            invoke2(view, matrix);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            OutlineResolver outlineResolver;
            C8632dsu.d(view);
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline outline2 = outlineResolver.getOutline();
            C8632dsu.d(outline2);
            outline.set(outline2);
        }
    };

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, drM<? super Canvas, dpR> drm, drO<dpR> dro) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = drm;
        this.invalidateParentLayer = dro;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m1480getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density) {
        drO<dpR> dro;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long mo1349getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo1349getTransformOriginSzJe1aQ();
            this.mTransformOrigin = mo1349getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m1475getPivotFractionXimpl(mo1349getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m1476getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & JSONzip.end) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z = true;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.clipToBounds = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z3);
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z3, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z4 = getManualClipPath() != null;
        if (z2 != z4 || (z4 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (dro = this.invalidateParentLayer) != null) {
            dro.invoke();
        }
        if ((mutatedFields$ui_release & 7963) != 0) {
            this.matrixCache.invalidate();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m1317toArgb8_81llA(reusableGraphicsLayerScope.m1426getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m1317toArgb8_81llA(reusableGraphicsLayerScope.m1428getSpotShadowColor0d7_KjU()));
            }
        }
        if (i >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & Privacy.DEFAULT) != 0) {
            int m1427getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.m1427getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m1320equalsimpl0(m1427getCompositingStrategyNrFUSI, companion.m1326getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m1320equalsimpl0(m1427getCompositingStrategyNrFUSI, companion.m1325getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                z = false;
            } else {
                setLayerType(0, null);
            }
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo1942isInLayerk4lQ0M(long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        if (this.clipToBounds) {
            return 0.0f <= m1137getXimpl && m1137getXimpl < ((float) getWidth()) && 0.0f <= m1138getYimpl && m1138getYimpl < ((float) getHeight());
        } else if (getClipToOutline()) {
            return this.outlineResolver.m2013isInOutlinek4lQ0M(j);
        } else {
            return true;
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getOutline() != null ? OutlineProvider : null);
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C8632dsu.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo1945resizeozmzZPI(long j) {
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(j);
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(j);
        if (m2547getWidthimpl == getWidth() && m2546getHeightimpl == getHeight()) {
            return;
        }
        float f = m2547getWidthimpl;
        setPivotX(TransformOrigin.m1475getPivotFractionXimpl(this.mTransformOrigin) * f);
        float f2 = m2546getHeightimpl;
        setPivotY(TransformOrigin.m1476getPivotFractionYimpl(this.mTransformOrigin) * f2);
        this.outlineResolver.m2014updateuvyYCjk(SizeKt.Size(f, f2));
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + m2547getWidthimpl, getTop() + m2546getHeightimpl);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo1944movegyyYBs(long j) {
        int m2533getXimpl = IntOffset.m2533getXimpl(j);
        if (m2533getXimpl != getLeft()) {
            offsetLeftAndRight(m2533getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m2534getYimpl = IntOffset.m2534getYimpl(j);
        if (m2534getYimpl != getTop()) {
            offsetTopAndBottom(m2534getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas) {
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo1943mapOffset8S9VItk(long j, boolean z) {
        if (z) {
            float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this);
            return m2003calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1373mapMKHz9U(m2003calculateInverseMatrixbWbORWo, j) : Offset.Companion.m1147getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m1373mapMKHz9U(this.matrixCache.m2004calculateMatrixGrdbGEg(this), j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        if (z) {
            float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this);
            if (m2003calculateInverseMatrixbWbORWo != null) {
                androidx.compose.ui.graphics.Matrix.m1374mapimpl(m2003calculateInverseMatrixbWbORWo, mutableRect);
                return;
            } else {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m1374mapimpl(this.matrixCache.m2004calculateMatrixGrdbGEg(this), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(drM<? super Canvas, dpR> drm, drO<dpR> dro) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m1480getCenterSzJe1aQ();
        this.drawBlock = drm;
        this.invalidateParentLayer = dro;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo1946transform58bKbWc(float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m1378timesAssign58bKbWc(fArr, this.matrixCache.m2004calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo1941inverseTransform58bKbWc(float[] fArr) {
        float[] m2003calculateInverseMatrixbWbORWo = this.matrixCache.m2003calculateInverseMatrixbWbORWo(this);
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

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z = true;
        }
        drM<? super Canvas, dpR> drm = this.drawBlock;
        if (drm != null) {
            drm.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }
}
