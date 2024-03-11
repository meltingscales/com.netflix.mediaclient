package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, InterfaceC8585dra<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, interfaceC8585dra);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final dwU dwu = (dwU) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            dyS snapshotFlow = SnapshotStateKt.snapshotFlow(new drO<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ Offset invoke() {
                    return Offset.m1126boximpl(m529invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                public final long m529invokeF1C5BW0() {
                    return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            dyQ dyq = new dyQ() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2
                @Override // o.dyQ
                public /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                    return m530emit3MmeM6k(((Offset) obj2).m1146unboximpl(), interfaceC8585dra);
                }

                /* renamed from: emit-3MmeM6k  reason: not valid java name */
                public final Object m530emit3MmeM6k(long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e2;
                    if (OffsetKt.m1151isSpecifiedk4lQ0M(animatable.getValue().m1146unboximpl()) && OffsetKt.m1151isSpecifiedk4lQ0M(j) && Offset.m1138getYimpl(animatable.getValue().m1146unboximpl()) != Offset.m1138getYimpl(j)) {
                        C8737dwr.c(dwu, null, null, new AnonymousClass1(animatable, j, null), 3, null);
                        return dpR.c;
                    }
                    Object snapTo = animatable.snapTo(Offset.m1126boximpl(j), interfaceC8585dra);
                    e2 = C8586drb.e();
                    return snapTo == e2 ? snapTo : dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$animatable = animatable;
                        this.$targetValue = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                            Offset m1126boximpl = Offset.m1126boximpl(this.$targetValue);
                            SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                            this.label = 1;
                            if (Animatable.animateTo$default(animatable, m1126boximpl, magnifierSpringSpec, null, null, this, 12, null) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        return dpR.c;
                    }
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
