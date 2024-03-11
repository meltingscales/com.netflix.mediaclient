package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C8737dwr;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private drM<? super Density, dpR> onDensityChanged;
    private drM<? super Modifier, dpR> onModifierChanged;
    private drM<? super Boolean, dpR> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private drO<dpR> release;
    private drO<dpR> reset;
    private final drO<dpR> runInvalidate;
    private final drO<dpR> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private drO<dpR> update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final drM<AndroidViewHolder, dpR> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final drO<dpR> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final void setOnDensityChanged$ui_release(drM<? super Density, dpR> drm) {
        this.onDensityChanged = drm;
    }

    public final void setOnModifierChanged$ui_release(drM<? super Modifier, dpR> drm) {
        this.onModifierChanged = drm;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(drM<? super Boolean, dpR> drm) {
        this.onRequestDisallowInterceptTouchEvent = drm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setRelease(drO<dpR> dro) {
        this.release = dro;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setReset(drO<dpR> dro) {
        this.reset = dro;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        AndroidViewHolder_androidKt$NoOpScrollConnection$1 androidViewHolder_androidKt$NoOpScrollConnection$1;
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = new drO<dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }
        };
        this.reset = new drO<dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }
        };
        this.release = new drO<dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new drO<dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
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
                boolean z;
                OwnerSnapshotObserver snapshotObserver;
                drM drm;
                z = AndroidViewHolder.this.hasUpdateBlock;
                if (z && AndroidViewHolder.this.isAttachedToWindow()) {
                    snapshotObserver = AndroidViewHolder.this.getSnapshotObserver();
                    AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                    drm = AndroidViewHolder.OnCommitAffectingUpdate;
                    snapshotObserver.observeReads$ui_release(androidViewHolder, drm, AndroidViewHolder.this.getUpdate());
                }
            }
        };
        this.runInvalidate = new drO<dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
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
                AndroidViewHolder.this.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        androidViewHolder_androidKt$NoOpScrollConnection$1 = AndroidViewHolder_androidKt.NoOpScrollConnection;
        final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, androidViewHolder_androidKt$NoOpScrollConnection$1, nestedScrollDispatcher), true, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }
        }), this), new drM<DrawScope, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner$ui_release = layoutNode2.getOwner$ui_release();
                    AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new drM<LayoutCoordinates, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                AndroidViewHolder_androidKt.layoutAccordingTo(AndroidViewHolder.this, layoutNode);
            }
        });
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new drM<Modifier, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Modifier modifier) {
                invoke2(modifier);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                LayoutNode.this.setModifier(modifier.then(onGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new drM<Density, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Density density) {
                invoke2(density);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                LayoutNode.this.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new drM<Owner, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Owner owner2) {
                invoke2(owner2);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(AndroidViewHolder.this, layoutNode);
                }
                ViewParent parent = AndroidViewHolder.this.getView().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new drM<Owner, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Owner owner2) {
                invoke2(owner2);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(AndroidViewHolder.this);
                }
                AndroidViewHolder.this.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m2475getMinWidthimpl(j), Constraints.m2474getMinHeightimpl(j), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return dpR.c;
                        }
                    }, 4, null);
                }
                if (Constraints.m2475getMinWidthimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m2475getMinWidthimpl(j));
                }
                if (Constraints.m2474getMinHeightimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m2474getMinHeightimpl(j));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
                int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                C8632dsu.d(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m2475getMinWidthimpl, m2473getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
                int m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                C8632dsu.d(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m2474getMinHeightimpl, m2472getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                int measuredWidth = AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = AndroidViewHolder.this.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = AndroidViewHolder.this;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(AndroidViewHolder.this, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            private final int intrinsicWidth(int i2) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                C8632dsu.d(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i2, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            private final int intrinsicHeight(int i2) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                C8632dsu.d(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i2, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setUpdate(drO<dpR> dro) {
        this.update = dro;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            drM<? super Modifier, dpR> drm = this.onModifierChanged;
            if (drm != null) {
                drm.invoke(modifier);
            }
        }
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            drM<? super Density, dpR> drm = this.onDensityChanged;
            if (drm != null) {
                drm.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
        }
        return this.owner.getSnapshotObserver();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            this.view.measure(i, i2);
            setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
            this.lastWidthMeasureSpec = i;
            this.lastHeightMeasureSpec = i2;
        }
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.view.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        drM<? super Boolean, dpR> drm = this.onRequestDisallowInterceptTouchEvent;
        if (drm != null) {
            drm.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            View view = this.view;
            final drO<dpR> dro = this.runInvalidate;
            view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    drO.this.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        region.op(i, i2, i + width, this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i, int i2, int i3) {
        int c;
        if (i3 >= 0 || i == i2) {
            c = C8657dts.c(i3, i, i2);
            return View.MeasureSpec.makeMeasureSpec(c, 1073741824);
        } else if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long Offset = OffsetKt.Offset(composeOffset, composeOffset2);
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            long Offset2 = OffsetKt.Offset(composeOffset3, composeOffset4);
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i5);
            long m1671dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m1671dispatchPostScrollDzOQY0M(Offset, Offset2, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1137getXimpl(m1671dispatchPostScrollDzOQY0M));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1138getYimpl(m1671dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long Offset = OffsetKt.Offset(composeOffset, composeOffset2);
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            long Offset2 = OffsetKt.Offset(composeOffset3, composeOffset4);
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i5);
            nestedScrollDispatcher.m1671dispatchPostScrollDzOQY0M(Offset, Offset2, nestedScrollSource);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        float composeOffset;
        float composeOffset2;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long Offset = OffsetKt.Offset(composeOffset, composeOffset2);
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i3);
            long m1673dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m1673dispatchPreScrollOzD1aCk(Offset, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1137getXimpl(m1673dispatchPreScrollOzD1aCk));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1138getYimpl(m1673dispatchPreScrollOzD1aCk));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        float composeVelocity;
        float composeVelocity2;
        if (isNestedScrollingEnabled()) {
            composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f);
            composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f2);
            C8737dwr.c(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        float composeVelocity;
        float composeVelocity2;
        if (isNestedScrollingEnabled()) {
            composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f);
            composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f2);
            C8737dwr.c(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
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
