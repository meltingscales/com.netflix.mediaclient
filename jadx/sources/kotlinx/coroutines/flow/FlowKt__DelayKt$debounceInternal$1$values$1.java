package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyK;
import o.dyQ;
import o.dyS;

/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements drX<dyK<? super Object>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ dyS<T> b;
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$values$1(dyS<? extends T> dys, InterfaceC8585dra<? super FlowKt__DelayKt$debounceInternal$1$values$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = dys;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyK<Object> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.b, interfaceC8585dra);
        flowKt__DelayKt$debounceInternal$1$values$1.a = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass3<T> implements dyQ {
        final /* synthetic */ dyK<Object> b;

        AnonymousClass3(dyK<Object> dyk) {
            this.b = dyk;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.c
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r6)
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                o.C8556dpz.d(r6)
                o.dyK<java.lang.Object> r6 = r4.b
                if (r5 != 0) goto L3a
                o.dAH r5 = o.dzT.b
            L3a:
                r0.e = r3
                java.lang.Object r5 = r6.a(r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                o.dpR r5 = o.dpR.c
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            dyS<T> dys = this.b;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3((dyK) this.a);
            this.c = 1;
            if (dys.collect(anonymousClass3, this) == e) {
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
