package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public final class dzJ<T> extends dzH<T> {
    private final dyS<dyS<T>> a;
    private final int e;

    public /* synthetic */ dzJ(dyS dys, int i, dqZ dqz, int i2, BufferOverflow bufferOverflow, int i3, C8627dsp c8627dsp) {
        this(dys, i, (i3 & 4) != 0 ? EmptyCoroutineContext.e : dqz, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzJ(dyS<? extends dyS<? extends T>> dys, int i, dqZ dqz, int i2, BufferOverflow bufferOverflow) {
        super(dqz, i2, bufferOverflow);
        this.a = dys;
        this.e = i;
    }

    @Override // o.dzH
    protected dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dzJ(this.a, this.e, dqz, i, bufferOverflow);
    }

    @Override // o.dzH
    public dyJ<T> c(dwU dwu) {
        return dyD.a(dwu, this.b, this.c, a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzH
    public Object a(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object collect = this.a.collect(new d((dxD) interfaceC8585dra.getContext().get(dxD.b), dBR.c(this.e, 0, 2, null), dyk, new dzZ(dyk)), interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }

    /* loaded from: classes5.dex */
    public static final class d<T> implements dyQ {
        final /* synthetic */ dzZ<T> a;
        final /* synthetic */ dBM b;
        final /* synthetic */ dxD c;
        final /* synthetic */ dyK<T> d;

        /* JADX WARN: Multi-variable type inference failed */
        d(dxD dxd, dBM dbm, dyK<? super T> dyk, dzZ<T> dzz) {
            this.c = dxd;
            this.b = dbm;
            this.d = dyk;
            this.a = dzz;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // o.dyQ
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.dyS<? extends T> r8, o.InterfaceC8585dra<? super o.dpR> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
                int r1 = r0.a
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.a = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.d
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.a
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.c
                o.dyS r8 = (o.dyS) r8
                java.lang.Object r0 = r0.b
                o.dzJ$d r0 = (o.dzJ.d) r0
                o.C8556dpz.d(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                o.C8556dpz.d(r9)
                o.dxD r9 = r7.c
                if (r9 == 0) goto L43
                o.dxG.b(r9)
            L43:
                o.dBM r9 = r7.b
                r0.b = r7
                r0.c = r8
                r0.a = r3
                java.lang.Object r9 = r9.e(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                o.dyK<T> r1 = r0.d
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                o.dzZ<T> r9 = r0.a
                o.dBM r0 = r0.b
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                o.C8738dws.e(r1, r2, r3, r4, r5, r6)
                o.dpR r8 = o.dpR.c
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dzJ.d.emit(o.dyS, o.dra):java.lang.Object");
        }
    }

    @Override // o.dzH
    protected String c() {
        return "concurrency=" + this.e;
    }
}
