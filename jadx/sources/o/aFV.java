package o;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class aFV<T> implements InterfaceC1551aFm<T> {
    private final /* synthetic */ Provider<T> b;
    private final InterfaceC8810dzj<T> c;
    private final dyS<dpR> d;

    public final InterfaceC8810dzj<T> a() {
        return this.c;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.b.get();
    }

    public aFV(Provider<T> provider) {
        C8632dsu.c((Object) provider, "");
        this.b = provider;
        InterfaceC8810dzj<T> b = C8820dzt.b(0, 0, null, 7, null);
        this.c = b;
        this.d = new e(dyR.e((dyS) b));
    }

    /* loaded from: classes3.dex */
    public static final class e implements dyS<dpR> {
        final /* synthetic */ dyS d;

        public e(dyS dys) {
            this.d = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super dpR> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass3(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.aFV$e$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass3(dyQ dyq) {
                this.c = dyq;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r4, o.InterfaceC8585dra r5) {
                /*
                    r3 = this;
                    boolean r4 = r5 instanceof com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigImpl$special$$inlined$map$1$2$1
                    if (r4 == 0) goto L13
                    r4 = r5
                    com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigImpl$special$$inlined$map$1$2$1 r4 = (com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigImpl$special$$inlined$map$1$2$1) r4
                    int r0 = r4.b
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 + r1
                    r4.b = r0
                    goto L18
                L13:
                    com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigImpl$special$$inlined$map$1$2$1 r4 = new com.netflix.mediaclient.hendrixconfig.impl.VolatileConfigImpl$special$$inlined$map$1$2$1
                    r4.<init>(r3, r5)
                L18:
                    java.lang.Object r5 = r4.e
                    java.lang.Object r0 = o.C8588drd.c()
                    int r1 = r4.b
                    r2 = 1
                    if (r1 == 0) goto L31
                    if (r1 != r2) goto L29
                    o.C8556dpz.d(r5)
                    goto L41
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    o.C8556dpz.d(r5)
                    o.dyQ r5 = r3.c
                    o.dpR r1 = o.dpR.c
                    r4.b = r2
                    java.lang.Object r4 = r5.emit(r1, r4)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    o.dpR r4 = o.dpR.c
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aFV.e.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
