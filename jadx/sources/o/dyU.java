package o;

import kotlin.jvm.internal.Ref;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dyU<T> implements dyS<T> {
    public final drM<T, Object> a;
    private final dyS<T> b;
    public final drX<Object, Object, Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dyU(dyS<? extends T> dys, drM<? super T, ? extends Object> drm, drX<Object, Object, Boolean> drx) {
        this.b = dys;
        this.a = drm;
        this.d = drx;
    }

    /* loaded from: classes5.dex */
    public static final class c<T> implements dyQ {
        final /* synthetic */ Ref.ObjectRef<Object> c;
        final /* synthetic */ dyQ<T> d;
        final /* synthetic */ dyU<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        c(dyU<T> dyu, Ref.ObjectRef<Object> objectRef, dyQ<? super T> dyq) {
            this.e = dyu;
            this.c = objectRef;
            this.d = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                o.C8556dpz.d(r7)
                o.dyU<T> r7 = r5.e
                o.drM<T, java.lang.Object> r7 = r7.a
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.c
                T r2 = r2.d
                o.dAH r4 = o.dzT.b
                if (r2 == r4) goto L58
                o.dyU<T> r4 = r5.e
                o.drX<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.d
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                o.dpR r6 = o.dpR.c
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.c
                r2.d = r7
                o.dyQ<T> r7 = r5.d
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dyU.c.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    @Override // o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = (T) dzT.b;
        Object collect = this.b.collect(new c(this, objectRef, dyq), interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }
}
