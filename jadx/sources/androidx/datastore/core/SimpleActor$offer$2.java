package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, InterfaceC8585dra<? super SimpleActor$offer$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SimpleActor$offer$2(this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SimpleActor$offer$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            o.C8556dpz.d(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            o.drX r1 = (o.drX) r1
            o.C8556dpz.d(r6)
            goto L51
        L22:
            o.C8556dpz.d(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L6c
        L31:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            o.dwU r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
            o.dwY.c(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            o.drX r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            o.dys r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L51
            return r0
        L51:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L31
            o.dpR r6 = o.dpR.c
            return r6
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
