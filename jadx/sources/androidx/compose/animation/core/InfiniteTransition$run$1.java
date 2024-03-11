package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, InterfaceC8585dra<? super InfiniteTransition$run$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.$toolingOverride, this.this$0, interfaceC8585dra);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InfiniteTransition$run$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:11:0x003f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            o.dwU r4 = (o.dwU) r4
            o.C8556dpz.d(r8)
            goto L3f
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            o.dwU r4 = (o.dwU) r4
            o.C8556dpz.d(r8)
            goto L55
        L2e:
            o.C8556dpz.d(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            o.dwU r4 = (o.dwU) r4
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.d = r8
        L3f:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r8 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r5 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r6 = r7.this$0
            r8.<init>()
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r8 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r8, r7)
            if (r8 != r0) goto L55
            return r0
        L55:
            float r8 = r1.d
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L3f
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r8 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r8.<init>()
            o.dyS r8 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r8)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r6 = 0
            r5.<init>(r6)
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = o.dyR.a(r8, r5, r7)
            if (r8 != r0) goto L3f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements drX<Float, InterfaceC8585dra<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
            super(2, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC8585dra);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return ((AnonymousClass3) create(Float.valueOf(f), interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // o.drX
        public /* synthetic */ Object invoke(Float f, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return invoke(f.floatValue(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.label == 0) {
                C8556dpz.d(obj);
                return C8589dre.e(this.F$0 > 0.0f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
