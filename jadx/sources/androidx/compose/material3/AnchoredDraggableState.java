package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final drM<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final drM<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final drO<Float> velocityThreshold;
    private final InternalMutatorMutex dragMutex = new InternalMutatorMutex();
    private final DraggableState draggableState = new AnchoredDraggableState$draggableState$1(this);

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final drM<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, drM<? super Float, Float> drm, drO<Float> dro, AnimationSpec<Float> animationSpec, drM<? super T, Boolean> drm2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MapDraggableAnchors emptyDraggableAnchors;
        MutableState mutableStateOf$default3;
        this.positionalThreshold = drm;
        this.velocityThreshold = dro;
        this.animationSpec = animationSpec;
        this.confirmValueChange = drm2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new drO<T>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public final T invoke() {
                Object dragTarget;
                Object computeTarget;
                dragTarget = this.this$0.getDragTarget();
                T t2 = (T) dragTarget;
                if (t2 == null) {
                    AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                    float offset = anchoredDraggableState.getOffset();
                    if (!Float.isNaN(offset)) {
                        computeTarget = anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
                        return (T) computeTarget;
                    }
                    return anchoredDraggableState.getCurrentValue();
                }
                return t2;
            }
        });
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new drO<T>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$closestValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public final T invoke() {
                Object dragTarget;
                Object computeTargetWithoutThresholds;
                dragTarget = this.this$0.getDragTarget();
                T t2 = (T) dragTarget;
                if (t2 == null) {
                    AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                    float offset = anchoredDraggableState.getOffset();
                    if (!Float.isNaN(offset)) {
                        computeTargetWithoutThresholds = anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
                        return (T) computeTargetWithoutThresholds;
                    }
                    return anchoredDraggableState.getCurrentValue();
                }
                return t2;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new drO<Float>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
                if (r2 > 0.999999f) goto L13;
             */
            @Override // o.drO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Float invoke() {
                /*
                    r4 = this;
                    androidx.compose.material3.AnchoredDraggableState<T> r0 = r4.this$0
                    androidx.compose.material3.DraggableAnchors r0 = r0.getAnchors()
                    androidx.compose.material3.AnchoredDraggableState<T> r1 = r4.this$0
                    java.lang.Object r1 = r1.getCurrentValue()
                    float r0 = r0.positionOf(r1)
                    androidx.compose.material3.AnchoredDraggableState<T> r1 = r4.this$0
                    androidx.compose.material3.DraggableAnchors r1 = r1.getAnchors()
                    androidx.compose.material3.AnchoredDraggableState<T> r2 = r4.this$0
                    java.lang.Object r2 = r2.getClosestValue$material3_release()
                    float r1 = r1.positionOf(r2)
                    float r1 = r1 - r0
                    float r2 = java.lang.Math.abs(r1)
                    boolean r3 = java.lang.Float.isNaN(r2)
                    if (r3 != 0) goto L47
                    r3 = 897988541(0x358637bd, float:1.0E-6)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 <= 0) goto L47
                    androidx.compose.material3.AnchoredDraggableState<T> r2 = r4.this$0
                    float r2 = r2.requireOffset()
                    float r2 = r2 - r0
                    float r2 = r2 / r1
                    int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r0 >= 0) goto L40
                    r2 = 0
                    goto L49
                L40:
                    r0 = 1065353199(0x3f7fffef, float:0.999999)
                    int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L49
                L47:
                    r2 = 1065353216(0x3f800000, float:1.0)
                L49:
                    java.lang.Float r0 = java.lang.Float.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableState$progress$2.invoke():java.lang.Float");
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.dragTarget$delegate = mutableStateOf$default2;
        emptyDraggableAnchors = AnchoredDraggableKt.emptyDraggableAnchors();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyDraggableAnchors, null, 2, null);
        this.anchors$delegate = mutableStateOf$default3;
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.AnchoredDragScope
            public void dragTo(float f, float f2) {
                this.this$0.setOffset(f);
                this.this$0.setLastVelocity(f2);
            }
        };
    }

    public final float requireOffset() {
        if (!(!Float.isNaN(getOffset()))) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t) {
        if (C8632dsu.c(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t)) {
            return;
        }
        setDragTarget(t);
    }

    public final Object settle(float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f, interfaceC8585dra);
            e2 = C8586drb.e();
            return animateTo == e2 ? animateTo : dpR.c;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, interfaceC8585dra);
        e = C8586drb.e();
        return animateTo2 == e ? animateTo2 : dpR.c;
    }

    public final T computeTarget(float f, T t, float f2) {
        T closestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        int i = (positionOf > f ? 1 : (positionOf == f ? 0 : -1));
        if (i == 0 || Float.isNaN(positionOf)) {
            return t;
        }
        if (i < 0) {
            if (f2 >= floatValue) {
                T closestAnchor2 = anchors.closestAnchor(f, true);
                C8632dsu.d(closestAnchor2);
                return closestAnchor2;
            }
            closestAnchor = anchors.closestAnchor(f, true);
            C8632dsu.d(closestAnchor);
            if (f < Math.abs(positionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(closestAnchor) - positionOf))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-floatValue)) {
            T closestAnchor3 = anchors.closestAnchor(f, false);
            C8632dsu.d(closestAnchor3);
            return closestAnchor3;
        } else {
            closestAnchor = anchors.closestAnchor(f, false);
            C8632dsu.d(closestAnchor);
            float abs = Math.abs(positionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor)))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return t;
                }
            } else if (f > abs) {
                return t;
            }
        }
        return closestAnchor;
    }

    public final T computeTargetWithoutThresholds(float f, T t) {
        T closestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t);
        int i = (positionOf > f ? 1 : (positionOf == f ? 0 : -1));
        if (i == 0 || Float.isNaN(positionOf)) {
            return t;
        }
        if (i < 0) {
            closestAnchor = anchors.closestAnchor(f, true);
            if (closestAnchor == null) {
                return t;
            }
        } else {
            closestAnchor = anchors.closestAnchor(f, false);
            if (closestAnchor == null) {
                return t;
            }
        }
        return closestAnchor;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority r7, o.InterfaceC8612dsa<? super androidx.compose.material3.AnchoredDragScope, ? super androidx.compose.material3.DraggableAnchors<T>, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r8, o.InterfaceC8585dra<? super o.dpR> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.AnchoredDraggableState r7 = (androidx.compose.material3.AnchoredDraggableState) r7
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            o.C8556dpz.d(r9)
            androidx.compose.material3.InternalMutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L87
            r0.label = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            androidx.compose.material3.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto L84
            float r9 = r7.getOffset()
            androidx.compose.material3.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            o.drM<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.setCurrentValue(r8)
        L84:
            o.dpR r7 = o.dpR.c
            return r7
        L87:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L8a:
            androidx.compose.material3.DraggableAnchors r9 = r7.getAnchors()
            float r0 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r0)
            if (r9 == 0) goto Lbe
            float r0 = r7.getOffset()
            androidx.compose.material3.DraggableAnchors r1 = r7.getAnchors()
            float r1 = r1.positionOf(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbe
            o.drM<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbe
            r7.setCurrentValue(r9)
        Lbe:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, o.dsa, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(T r7, androidx.compose.foundation.MutatePriority r8, o.InterfaceC8613dsb<? super androidx.compose.material3.AnchoredDragScope, ? super androidx.compose.material3.DraggableAnchors<T>, ? super T, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r9, o.InterfaceC8585dra<? super o.dpR> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material3.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.AnchoredDraggableState r7 = (androidx.compose.material3.AnchoredDraggableState) r7
            o.C8556dpz.d(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L95
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            o.C8556dpz.d(r10)
            androidx.compose.material3.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lcd
            androidx.compose.material3.InternalMutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L92
            r0.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.setDragTarget(r5)
            androidx.compose.material3.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Ld0
            float r9 = r7.getOffset()
            androidx.compose.material3.DraggableAnchors r10 = r7.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Ld0
            o.drM<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Ld0
            r7.setCurrentValue(r8)
            goto Ld0
        L92:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L95:
            r7.setDragTarget(r5)
            androidx.compose.material3.DraggableAnchors r9 = r7.getAnchors()
            float r10 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r10)
            if (r9 == 0) goto Lcc
            float r10 = r7.getOffset()
            androidx.compose.material3.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcc
            o.drM<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcc
            r7.setCurrentValue(r9)
        Lcc:
            throw r8
        Lcd:
            r6.setCurrentValue(r7)
        Ld0:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, o.dsb, o.dra):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC8613dsb interfaceC8613dsb, InterfaceC8585dra interfaceC8585dra, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC8613dsb, interfaceC8585dra);
    }

    public final float newOffsetForDelta$material3_release(float f) {
        float a;
        a = C8657dts.a((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f, getAnchors().minAnchor(), getAnchors().maxAnchor());
        return a;
    }

    public final float dispatchRawDelta(float f) {
        float newOffsetForDelta$material3_release = newOffsetForDelta$material3_release(f);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material3_release);
        return newOffsetForDelta$material3_release - offset;
    }

    private final boolean trySnapTo(final T t) {
        return this.dragMutex.tryMutate(new drO<dpR>(this) { // from class: androidx.compose.material3.AnchoredDraggableState$trySnapTo$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t2 = t;
                float positionOf = anchoredDraggableState.getAnchors().positionOf(t2);
                if (!Float.isNaN(positionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t2);
            }
        });
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final void setOffset(float f) {
        this.offset$delegate.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setFloatValue(f);
    }

    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    public final void setDragTarget(T t) {
        this.dragTarget$delegate.setValue(t);
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }
}
