package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C3550bC;
import o.C3658bG;
import o.C5242bv;
import o.C6478ce;
import o.C6955cn;
import o.C7112cq;
import o.C7218cs;
import o.C7883dS;
import o.C7997dc;
import o.C8050dd;
import o.C8315di;
import o.C8368dj;
import o.C8503do;
import o.C8830eC;
import o.C8853eZ;
import o.C8909fc;
import o.C8911fe;
import o.C8912ff;
import o.Choreographer$FrameCallbackC8908fb;
import o.InterfaceC5348bx;
import o.InterfaceC6637ch;
import o.InterfaceC8915fi;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private int alpha;
    private final Choreographer$FrameCallbackC8908fb animator;
    private Rect canvasClipBounds;
    private RectF canvasClipBoundsRectF;
    private boolean clipToCompositionBounds;
    private C3658bG composition;
    private C7883dS compositionLayer;
    String defaultFontFileExtension;
    private boolean enableMergePaths;
    C5242bv fontAssetDelegate;
    private C8050dd fontAssetManager;
    private Map<String, Typeface> fontMap;
    private boolean ignoreSystemAnimationsDisabled;
    private InterfaceC5348bx imageAssetDelegate;
    private C7997dc imageAssetManager;
    private String imageAssetsFolder;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isDirty;
    private final ArrayList<e> lazyCompositionTasks;
    private boolean maintainOriginalImageBounds;
    private OnVisibleAction onVisibleAction;
    private boolean outlineMasksAndMattes;
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private RenderMode renderMode;
    private final Matrix renderingMatrix;
    private boolean safeMode;
    private Bitmap softwareRenderingBitmap;
    private Canvas softwareRenderingCanvas;
    private Rect softwareRenderingDstBoundsRect;
    private RectF softwareRenderingDstBoundsRectF;
    private Matrix softwareRenderingOriginalCanvasMatrix;
    private Matrix softwareRenderingOriginalCanvasMatrixInverse;
    private Paint softwareRenderingPaint;
    private Rect softwareRenderingSrcBoundsRect;
    private RectF softwareRenderingTransformedBounds;
    private boolean systemAnimationsEnabled;
    C7218cs textDelegate;
    private boolean useSoftwareRendering;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    /* loaded from: classes2.dex */
    public interface e {
        void d(C3658bG c3658bG);
    }

    private boolean animationsEnabled() {
        return this.systemAnimationsEnabled || this.ignoreSystemAnimationsDisabled;
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public boolean getClipToCompositionBounds() {
        return this.clipToCompositionBounds;
    }

    public C3658bG getComposition() {
        return this.composition;
    }

    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.maintainOriginalImageBounds;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C7218cs getTextDelegate() {
        return this.textDelegate;
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.isApplyingOpacityToLayersEnabled = z;
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.ignoreSystemAnimationsDisabled = z;
    }

    public void setImagesAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.maintainOriginalImageBounds = z;
    }

    public void setSafeMode(boolean z) {
        this.safeMode = z;
    }

    public void setTextDelegate(C7218cs c7218cs) {
        this.textDelegate = c7218cs;
    }

    public LottieDrawable() {
        Choreographer$FrameCallbackC8908fb choreographer$FrameCallbackC8908fb = new Choreographer$FrameCallbackC8908fb();
        this.animator = choreographer$FrameCallbackC8908fb;
        this.systemAnimationsEnabled = true;
        this.ignoreSystemAnimationsDisabled = false;
        this.safeMode = false;
        this.onVisibleAction = OnVisibleAction.NONE;
        this.lazyCompositionTasks = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.compositionLayer != null) {
                    LottieDrawable.this.compositionLayer.e(LottieDrawable.this.animator.j());
                }
            }
        };
        this.progressUpdateListener = animatorUpdateListener;
        this.maintainOriginalImageBounds = false;
        this.clipToCompositionBounds = true;
        this.alpha = PrivateKeyType.INVALID;
        this.renderMode = RenderMode.AUTOMATIC;
        this.useSoftwareRendering = false;
        this.renderingMatrix = new Matrix();
        this.isDirty = false;
        choreographer$FrameCallbackC8908fb.addUpdateListener(animatorUpdateListener);
    }

    public boolean hasMasks() {
        C7883dS c7883dS = this.compositionLayer;
        return c7883dS != null && c7883dS.i();
    }

    public boolean hasMatte() {
        C7883dS c7883dS = this.compositionLayer;
        return c7883dS != null && c7883dS.j();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.enableMergePaths == z) {
            return;
        }
        this.enableMergePaths = z;
        if (this.composition != null) {
            buildCompositionLayer();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        if (z != this.clipToCompositionBounds) {
            this.clipToCompositionBounds = z;
            C7883dS c7883dS = this.compositionLayer;
            if (c7883dS != null) {
                c7883dS.e(z);
            }
            invalidateSelf();
        }
    }

    public boolean setComposition(C3658bG c3658bG) {
        if (this.composition == c3658bG) {
            return false;
        }
        this.isDirty = true;
        clearComposition();
        this.composition = c3658bG;
        buildCompositionLayer();
        this.animator.a(c3658bG);
        setProgress(this.animator.getAnimatedFraction());
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                eVar.d(c3658bG);
            }
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        c3658bG.c(this.performanceTrackingEnabled);
        computeRenderMode();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
        computeRenderMode();
    }

    public RenderMode getRenderMode() {
        return this.useSoftwareRendering ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    private void computeRenderMode() {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            return;
        }
        this.useSoftwareRendering = this.renderMode.a(Build.VERSION.SDK_INT, c3658bG.l(), c3658bG.h());
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        C3658bG c3658bG = this.composition;
        if (c3658bG != null) {
            c3658bG.c(z);
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.outlineMasksAndMattes == z) {
            return;
        }
        this.outlineMasksAndMattes = z;
        C7883dS c7883dS = this.compositionLayer;
        if (c7883dS != null) {
            c7883dS.c(z);
        }
    }

    public C6955cn getPerformanceTracker() {
        C3658bG c3658bG = this.composition;
        if (c3658bG != null) {
            return c3658bG.k();
        }
        return null;
    }

    private void buildCompositionLayer() {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            return;
        }
        C7883dS c7883dS = new C7883dS(this, C8830eC.c(c3658bG), c3658bG.i(), c3658bG);
        this.compositionLayer = c7883dS;
        if (this.outlineMasksAndMattes) {
            c7883dS.c(true);
        }
        this.compositionLayer.e(this.clipToCompositionBounds);
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.animator.f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.isDirty) {
            return;
        }
        this.isDirty = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C8909fc.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C3550bC.d("Drawable#draw");
        if (this.safeMode) {
            try {
                if (this.useSoftwareRendering) {
                    renderAndDrawAsBitmap(canvas, this.compositionLayer);
                } else {
                    drawDirectlyToCanvas(canvas);
                }
            } catch (Throwable th) {
                C8909fc.c("Lottie crashed in draw!", th);
            }
        } else if (this.useSoftwareRendering) {
            renderAndDrawAsBitmap(canvas, this.compositionLayer);
        } else {
            drawDirectlyToCanvas(canvas);
        }
        this.isDirty = false;
        C3550bC.a("Drawable#draw");
    }

    public void draw(Canvas canvas, Matrix matrix) {
        C7883dS c7883dS = this.compositionLayer;
        C3658bG c3658bG = this.composition;
        if (c7883dS == null || c3658bG == null) {
            return;
        }
        if (this.useSoftwareRendering) {
            canvas.save();
            canvas.concat(matrix);
            renderAndDrawAsBitmap(canvas, c7883dS);
            canvas.restore();
        } else {
            c7883dS.b(canvas, matrix, this.alpha);
        }
        this.isDirty = false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimation$0(C3658bG c3658bG) {
        playAnimation();
    }

    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bT
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$playAnimation$0(c3658bG);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.n();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.PLAY;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.animator.h();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.h();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeAnimation$1(C3658bG c3658bG) {
        resumeAnimation();
    }

    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.ca
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$resumeAnimation$1(c3658bG);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.t();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.RESUME;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.animator.h();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$2(int i, C3658bG c3658bG) {
        setMinFrame(i);
    }

    public void setMinFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bY
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$setMinFrame$2(i, c3658bG);
                }
            });
        } else {
            this.animator.a(i);
        }
    }

    public float getMinFrame() {
        return this.animator.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinProgress$3(float f, C3658bG c3658bG) {
        setMinProgress(f);
    }

    public void setMinProgress(final float f) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bV
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMinProgress$3(f, c3658bG2);
                }
            });
        } else {
            setMinFrame((int) C8853eZ.b(c3658bG.m(), this.composition.d(), f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$4(int i, C3658bG c3658bG) {
        setMaxFrame(i);
    }

    public void setMaxFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bW
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$setMaxFrame$4(i, c3658bG);
                }
            });
        } else {
            this.animator.d(i + 0.99f);
        }
    }

    public float getMaxFrame() {
        return this.animator.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxProgress$5(float f, C3658bG c3658bG) {
        setMaxProgress(f);
    }

    public void setMaxProgress(final float f) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bR
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMaxProgress$5(f, c3658bG2);
                }
            });
        } else {
            this.animator.d(C8853eZ.b(c3658bG.m(), this.composition.d(), f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$6(String str, C3658bG c3658bG) {
        setMinFrame(str);
    }

    public void setMinFrame(final String str) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.cb
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMinFrame$6(str, c3658bG2);
                }
            });
            return;
        }
        C8503do d = c3658bG.d(str);
        if (d == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        setMinFrame((int) d.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$7(String str, C3658bG c3658bG) {
        setMaxFrame(str);
    }

    public void setMaxFrame(final String str) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.cc
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMaxFrame$7(str, c3658bG2);
                }
            });
            return;
        }
        C8503do d = c3658bG.d(str);
        if (d == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        setMaxFrame((int) (d.d + d.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$8(String str, C3658bG c3658bG) {
        setMinAndMaxFrame(str);
    }

    public void setMinAndMaxFrame(final String str) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bU
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$8(str, c3658bG2);
                }
            });
            return;
        }
        C8503do d = c3658bG.d(str);
        if (d == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) d.d;
        setMinAndMaxFrame(i, ((int) d.b) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$9(String str, String str2, boolean z, C3658bG c3658bG) {
        setMinAndMaxFrame(str, str2, z);
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.cd
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$9(str, str2, z, c3658bG2);
                }
            });
            return;
        }
        C8503do d = c3658bG.d(str);
        if (d == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) d.d;
        C8503do d2 = this.composition.d(str2);
        if (d2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        setMinAndMaxFrame(i, (int) (d2.d + (z ? 1.0f : 0.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$10(int i, int i2, C3658bG c3658bG) {
        setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bX
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$10(i, i2, c3658bG);
                }
            });
        } else {
            this.animator.a(i, i2 + 0.99f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxProgress$11(float f, float f2, C3658bG c3658bG) {
        setMinAndMaxProgress(f, f2);
    }

    public void setMinAndMaxProgress(final float f, final float f2) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bQ
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG2) {
                    LottieDrawable.this.lambda$setMinAndMaxProgress$11(f, f2, c3658bG2);
                }
            });
        } else {
            setMinAndMaxFrame((int) C8853eZ.b(c3658bG.m(), this.composition.d(), f), (int) C8853eZ.b(this.composition.m(), this.composition.d(), f2));
        }
    }

    public void reverseAnimationSpeed() {
        this.animator.r();
    }

    public void setSpeed(float f) {
        this.animator.e(f);
    }

    public float getSpeed() {
        return this.animator.o();
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.addPauseListener(animatorPauseListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.removePauseListener(animatorPauseListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrame$12(int i, C3658bG c3658bG) {
        setFrame(i);
    }

    public void setFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bP
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$setFrame$12(i, c3658bG);
                }
            });
        } else {
            this.animator.a(i);
        }
    }

    public int getFrame() {
        return (int) this.animator.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgress$13(float f, C3658bG c3658bG) {
        setProgress(f);
    }

    public void setProgress(final float f) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bS
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$setProgress$13(f, c3658bG);
                }
            });
            return;
        }
        C3550bC.d("Drawable#setProgress");
        this.animator.a(this.composition.e(f));
        C3550bC.a("Drawable#setProgress");
    }

    @Deprecated
    public void loop(boolean z) {
        this.animator.setRepeatCount(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.animator.setRepeatMode(i);
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.animator.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public boolean isLooping() {
        return this.animator.getRepeatCount() == -1;
    }

    public boolean isAnimating() {
        Choreographer$FrameCallbackC8908fb choreographer$FrameCallbackC8908fb = this.animator;
        if (choreographer$FrameCallbackC8908fb == null) {
            return false;
        }
        return choreographer$FrameCallbackC8908fb.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAnimatingOrWillAnimateOnVisible() {
        if (isVisible()) {
            return this.animator.isRunning();
        }
        OnVisibleAction onVisibleAction = this.onVisibleAction;
        return onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME;
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.animator.e(z);
    }

    public void setImageAssetDelegate(InterfaceC5348bx interfaceC5348bx) {
        this.imageAssetDelegate = interfaceC5348bx;
        C7997dc c7997dc = this.imageAssetManager;
        if (c7997dc != null) {
            c7997dc.a(interfaceC5348bx);
        }
    }

    public void setFontAssetDelegate(C5242bv c5242bv) {
        this.fontAssetDelegate = c5242bv;
        C8050dd c8050dd = this.fontAssetManager;
        if (c8050dd != null) {
            c8050dd.e(c5242bv);
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        if (map == this.fontMap) {
            return;
        }
        this.fontMap = map;
        invalidateSelf();
    }

    public boolean useTextGlyphs() {
        return this.fontMap == null && this.textDelegate == null && this.composition.a().size() > 0;
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.l();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public float getProgress() {
        return this.animator.j();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            return -1;
        }
        return c3658bG.c().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            return -1;
        }
        return c3658bG.c().height();
    }

    public List<C8368dj> resolveKeyPath(C8368dj c8368dj) {
        if (this.compositionLayer == null) {
            C8909fc.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.a(c8368dj, 0, arrayList, new C8368dj(new String[0]));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addValueCallback$14(C8368dj c8368dj, Object obj, C8912ff c8912ff, C3658bG c3658bG) {
        addValueCallback(c8368dj, (C8368dj) obj, (C8912ff<C8368dj>) c8912ff);
    }

    public <T> void addValueCallback(final C8368dj c8368dj, final T t, final C8912ff<T> c8912ff) {
        C7883dS c7883dS = this.compositionLayer;
        if (c7883dS == null) {
            this.lazyCompositionTasks.add(new e() { // from class: o.bZ
                @Override // com.airbnb.lottie.LottieDrawable.e
                public final void d(C3658bG c3658bG) {
                    LottieDrawable.this.lambda$addValueCallback$14(c8368dj, t, c8912ff, c3658bG);
                }
            });
            return;
        }
        if (c8368dj == C8368dj.c) {
            c7883dS.a(t, c8912ff);
        } else if (c8368dj.b() != null) {
            c8368dj.b().a(t, c8912ff);
        } else {
            List<C8368dj> resolveKeyPath = resolveKeyPath(c8368dj);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).b().a(t, c8912ff);
            }
            if (!(!resolveKeyPath.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == InterfaceC6637ch.A) {
            setProgress(getProgress());
        }
    }

    public <T> void addValueCallback(C8368dj c8368dj, T t, final InterfaceC8915fi<T> interfaceC8915fi) {
        addValueCallback(c8368dj, (C8368dj) t, (C8912ff<C8368dj>) new C8912ff<T>() { // from class: com.airbnb.lottie.LottieDrawable.4
            @Override // o.C8912ff
            public T a(C8911fe<T> c8911fe) {
                return (T) interfaceC8915fi.e(c8911fe);
            }
        });
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        C7997dc imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            C8909fc.b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap b = imageAssetManager.b(str, bitmap);
        invalidateSelf();
        return b;
    }

    @Deprecated
    public Bitmap getImageAsset(String str) {
        C7997dc imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.d(str);
        }
        C3658bG c3658bG = this.composition;
        C6478ce c6478ce = c3658bG == null ? null : c3658bG.g().get(str);
        if (c6478ce != null) {
            return c6478ce.b();
        }
        return null;
    }

    public Bitmap getBitmapForId(String str) {
        C7997dc imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.d(str);
        }
        return null;
    }

    public C6478ce getLottieImageAssetForId(String str) {
        C3658bG c3658bG = this.composition;
        if (c3658bG == null) {
            return null;
        }
        return c3658bG.g().get(str);
    }

    private C7997dc getImageAssetManager() {
        C7997dc c7997dc = this.imageAssetManager;
        if (c7997dc != null && !c7997dc.c(getContext())) {
            this.imageAssetManager = null;
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new C7997dc(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.g());
        }
        return this.imageAssetManager;
    }

    public Typeface getTypeface(C8315di c8315di) {
        Map<String, Typeface> map = this.fontMap;
        if (map != null) {
            String e2 = c8315di.e();
            if (map.containsKey(e2)) {
                return map.get(e2);
            }
            String c = c8315di.c();
            if (map.containsKey(c)) {
                return map.get(c);
            }
            String str = c8315di.e() + "-" + c8315di.d();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C8050dd fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            return fontAssetManager.a(c8315di);
        }
        return null;
    }

    private C8050dd getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            C8050dd c8050dd = new C8050dd(getCallback(), this.fontAssetDelegate);
            this.fontAssetManager = c8050dd;
            String str = this.defaultFontFileExtension;
            if (str != null) {
                c8050dd.d(str);
            }
        }
        return this.fontAssetManager;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
        C8050dd fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            fontAssetManager.d(str);
        }
    }

    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            OnVisibleAction onVisibleAction = this.onVisibleAction;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                playAnimation();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                resumeAnimation();
            }
        } else if (this.animator.isRunning()) {
            pauseAnimation();
            this.onVisibleAction = OnVisibleAction.RESUME;
        } else if (!(!isVisible)) {
            this.onVisibleAction = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void drawDirectlyToCanvas(Canvas canvas) {
        C7883dS c7883dS = this.compositionLayer;
        C3658bG c3658bG = this.composition;
        if (c7883dS == null || c3658bG == null) {
            return;
        }
        this.renderingMatrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.renderingMatrix.preScale(bounds.width() / c3658bG.c().width(), bounds.height() / c3658bG.c().height());
            this.renderingMatrix.preTranslate(bounds.left, bounds.top);
        }
        c7883dS.b(canvas, this.renderingMatrix, this.alpha);
    }

    private void renderAndDrawAsBitmap(Canvas canvas, C7883dS c7883dS) {
        if (this.composition == null || c7883dS == null) {
            return;
        }
        ensureSoftwareRenderingObjectsInitialized();
        canvas.getMatrix(this.softwareRenderingOriginalCanvasMatrix);
        canvas.getClipBounds(this.canvasClipBounds);
        convertRect(this.canvasClipBounds, this.canvasClipBoundsRectF);
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.canvasClipBoundsRectF);
        convertRect(this.canvasClipBoundsRectF, this.canvasClipBounds);
        if (this.clipToCompositionBounds) {
            this.softwareRenderingTransformedBounds.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c7883dS.d(this.softwareRenderingTransformedBounds, (Matrix) null, false);
        }
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.softwareRenderingTransformedBounds);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        scaleRect(this.softwareRenderingTransformedBounds, width, height);
        if (!ignoreCanvasClipBounds()) {
            RectF rectF = this.softwareRenderingTransformedBounds;
            Rect rect = this.canvasClipBounds;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.softwareRenderingTransformedBounds.width());
        int ceil2 = (int) Math.ceil(this.softwareRenderingTransformedBounds.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        ensureSoftwareRenderingBitmap(ceil, ceil2);
        if (this.isDirty) {
            this.renderingMatrix.set(this.softwareRenderingOriginalCanvasMatrix);
            this.renderingMatrix.preScale(width, height);
            Matrix matrix = this.renderingMatrix;
            RectF rectF2 = this.softwareRenderingTransformedBounds;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.softwareRenderingBitmap.eraseColor(0);
            c7883dS.b(this.softwareRenderingCanvas, this.renderingMatrix, this.alpha);
            this.softwareRenderingOriginalCanvasMatrix.invert(this.softwareRenderingOriginalCanvasMatrixInverse);
            this.softwareRenderingOriginalCanvasMatrixInverse.mapRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingTransformedBounds);
            convertRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingDstBoundsRect);
        }
        this.softwareRenderingSrcBoundsRect.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.softwareRenderingBitmap, this.softwareRenderingSrcBoundsRect, this.softwareRenderingDstBoundsRect, this.softwareRenderingPaint);
    }

    private void ensureSoftwareRenderingObjectsInitialized() {
        if (this.softwareRenderingCanvas != null) {
            return;
        }
        this.softwareRenderingCanvas = new Canvas();
        this.softwareRenderingTransformedBounds = new RectF();
        this.softwareRenderingOriginalCanvasMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixInverse = new Matrix();
        this.canvasClipBounds = new Rect();
        this.canvasClipBoundsRectF = new RectF();
        this.softwareRenderingPaint = new C7112cq();
        this.softwareRenderingSrcBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRectF = new RectF();
    }

    private void ensureSoftwareRenderingBitmap(int i, int i2) {
        Bitmap bitmap = this.softwareRenderingBitmap;
        if (bitmap == null || bitmap.getWidth() < i || this.softwareRenderingBitmap.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.softwareRenderingBitmap = createBitmap;
            this.softwareRenderingCanvas.setBitmap(createBitmap);
            this.isDirty = true;
        } else if (this.softwareRenderingBitmap.getWidth() > i || this.softwareRenderingBitmap.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.softwareRenderingBitmap, 0, 0, i, i2);
            this.softwareRenderingBitmap = createBitmap2;
            this.softwareRenderingCanvas.setBitmap(createBitmap2);
            this.isDirty = true;
        }
    }

    private void convertRect(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void convertRect(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void scaleRect(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean ignoreCanvasClipBounds() {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                return !((ViewGroup) parent).getClipChildren();
            }
            return false;
        }
        return false;
    }
}
