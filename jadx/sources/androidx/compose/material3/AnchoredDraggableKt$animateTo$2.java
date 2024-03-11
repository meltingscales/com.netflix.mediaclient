package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateTo$2<T> extends SuspendLambda implements InterfaceC8613dsb<AnchoredDragScope, DraggableAnchors<T>, T, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<T> anchoredDraggableState, float f, InterfaceC8585dra<? super AnchoredDraggableKt$animateTo$2> interfaceC8585dra) {
        super(4, interfaceC8585dra);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, interfaceC8585dra);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$2.L$2 = t;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8613dsb
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                floatRef.d = offset;
                float f = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                drX<Float, Float, dpR> drx = new drX<Float, Float, dpR>() { // from class: androidx.compose.material3.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return dpR.c;
                    }

                    public final void invoke(float f2, float f3) {
                        AnchoredDragScope.this.dragTo(f2, f3);
                        floatRef.d = f2;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.animate(offset, positionOf, f, animationSpec, drx, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
