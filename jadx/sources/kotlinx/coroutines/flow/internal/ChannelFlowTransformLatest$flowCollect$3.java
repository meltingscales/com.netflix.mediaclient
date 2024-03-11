package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;
import o.dyQ;
import o.dyS;
import o.dzN;

/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ dzN<T, R> b;
    final /* synthetic */ dyQ<R> c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(dzN<T, R> dzn, dyQ<? super R> dyq, InterfaceC8585dra<? super ChannelFlowTransformLatest$flowCollect$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = dzn;
        this.c = dyq;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.b, this.c, interfaceC8585dra);
        channelFlowTransformLatest$flowCollect$3.d = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            dzN<T, R> dzn = this.b;
            dyS<S> dys = dzn.a;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(objectRef, (dwU) this.d, dzn, this.c);
            this.a = 1;
            if (dys.collect(anonymousClass4, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass4<T> implements dyQ {
        final /* synthetic */ dzN<T, R> a;
        final /* synthetic */ Ref.ObjectRef<dxD> b;
        final /* synthetic */ dyQ<R> c;
        final /* synthetic */ dwU e;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Ref.ObjectRef<dxD> objectRef, dwU dwu, dzN<T, R> dzn, dyQ<? super R> dyq) {
            this.b = objectRef;
            this.e = dwu;
            this.a = dzn;
            this.c = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, o.InterfaceC8585dra<? super o.dpR> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.e
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.b
                o.dxD r8 = (o.dxD) r8
                java.lang.Object r8 = r0.a
                java.lang.Object r0 = r0.d
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$4 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass4) r0
                o.C8556dpz.d(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                o.C8556dpz.d(r9)
                kotlin.jvm.internal.Ref$ObjectRef<o.dxD> r9 = r7.b
                T r9 = r9.d
                o.dxD r9 = (o.dxD) r9
                if (r9 == 0) goto L5d
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.e(r2)
                r0.d = r7
                r0.a = r8
                r0.b = r9
                r0.c = r3
                java.lang.Object r9 = r9.a_(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef<o.dxD> r9 = r0.b
                o.dwU r1 = r0.e
                r2 = 0
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                o.dzN<T, R> r5 = r0.a
                o.dyQ<R> r0 = r0.c
                r6 = 0
                r4.<init>(r5, r0, r8, r6)
                r5 = 1
                o.dxD r8 = o.C8738dws.e(r1, r2, r3, r4, r5, r6)
                r9.d = r8
                o.dpR r8 = o.dpR.c
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }
}
