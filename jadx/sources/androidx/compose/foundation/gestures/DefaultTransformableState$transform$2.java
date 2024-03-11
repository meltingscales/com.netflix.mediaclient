package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class DefaultTransformableState$transform$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<TransformScope, InterfaceC8585dra<? super dpR>, Object> $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, drX<? super TransformScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super DefaultTransformableState$transform$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DefaultTransformableState$transform$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<TransformScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drX<TransformScope, InterfaceC8585dra<? super dpR>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultTransformableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DefaultTransformableState defaultTransformableState, drX<? super TransformScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = defaultTransformableState;
            this.$block = drx;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(TransformScope transformScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(transformScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            e = C8586drb.e();
            int i = this.label;
            try {
                if (i == 0) {
                    C8556dpz.d(obj);
                    TransformScope transformScope = (TransformScope) this.L$0;
                    mutableState2 = this.this$0.isTransformingState;
                    mutableState2.setValue(C8589dre.e(true));
                    drX<TransformScope, InterfaceC8585dra<? super dpR>, Object> drx = this.$block;
                    this.label = 1;
                    if (drx.invoke(transformScope, this) == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                mutableState3 = this.this$0.isTransformingState;
                mutableState3.setValue(C8589dre.e(false));
                return dpR.c;
            } catch (Throwable th) {
                mutableState = this.this$0.isTransformingState;
                mutableState.setValue(C8589dre.e(false));
                throw th;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        MutatorMutex mutatorMutex;
        TransformScope transformScope;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            mutatorMutex = this.this$0.transformMutex;
            transformScope = this.this$0.transformScope;
            MutatePriority mutatePriority = this.$transformPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == e) {
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
