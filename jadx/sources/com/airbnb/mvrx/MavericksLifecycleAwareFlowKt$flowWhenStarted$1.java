package com.airbnb.mvrx;

import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;
import o.dyQ;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1<T> extends SuspendLambda implements drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ LifecycleOwner a;
    final /* synthetic */ dyS<T> b;
    private /* synthetic */ Object c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1(LifecycleOwner lifecycleOwner, dyS<? extends T> dys, InterfaceC8585dra<? super MavericksLifecycleAwareFlowKt$flowWhenStarted$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = lifecycleOwner;
        this.b = dys;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(this.a, this.b, interfaceC8585dra);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dyQ<T> a;
        Object b;
        final /* synthetic */ LifecycleOwner c;
        final /* synthetic */ dyS<T> d;
        Object e;
        int f;
        Object g;
        Object h;
        private /* synthetic */ Object i;
        Object j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LifecycleOwner lifecycleOwner, dyQ<? super T> dyq, dyS<? extends T> dys, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = lifecycleOwner;
            this.a = dyq;
            this.d = dys;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.a, this.d, interfaceC8585dra);
            anonymousClass1.i = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:10|(1:11)|12|13|14|15|16|17|18|19|(1:21)|(1:23)(3:25|26|(2:28|(1:30)(5:31|6|7|8|(2:42|43)(0)))(4:32|7|8|(0)(0)))) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00de, code lost:
            r10 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
            r3.c(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011d -> B:39:0x011f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0125 -> B:41:0x012c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, (dyQ) this.c, this.b, null);
            this.d = 1;
            if (dwY.b(anonymousClass1, this) == e) {
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
