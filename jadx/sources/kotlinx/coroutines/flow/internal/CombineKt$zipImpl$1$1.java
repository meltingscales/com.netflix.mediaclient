package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dAO;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwG;
import o.dwU;
import o.dxK;
import o.dyD;
import o.dyI;
import o.dyJ;
import o.dyQ;
import o.dyS;
import o.dzE;
import o.dzP;

/* loaded from: classes6.dex */
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> a;
    final /* synthetic */ dyS<T2> b;
    final /* synthetic */ dyQ<R> c;
    final /* synthetic */ dyS<T1> d;
    int e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(dyQ<? super R> dyq, dyS<? extends T2> dys, dyS<? extends T1> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super CombineKt$zipImpl$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = dyq;
        this.b = dys;
        this.d = dys2;
        this.a = interfaceC8612dsa;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CombineKt$zipImpl$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.c, this.b, this.d, this.a, interfaceC8585dra);
        combineKt$zipImpl$1$1.i = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.dyJ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyJ dyj;
        final dwG c;
        dyJ dyj2;
        dyJ dyj3;
        dqZ plus;
        dpR dpr;
        AnonymousClass2 anonymousClass2;
        e = C8586drb.e();
        dyJ dyj4 = this.e;
        try {
            if (dyj4 != 0) {
                if (dyj4 == 1) {
                    dyj3 = (dyJ) this.i;
                    try {
                        C8556dpz.d(obj);
                        dyj4 = dyj3;
                    } catch (AbortFlowException e2) {
                        e = e2;
                    }
                    dyJ.d.e(dyj4, null, 1, null);
                    return dpR.c;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.i;
            dyJ b = dyD.b(dwu, null, 0, new CombineKt$zipImpl$1$1$second$1(this.b, null), 3, null);
            c = dxK.c(null, 1, null);
            C8632dsu.d(b);
            final dyQ dyq = this.c;
            ((dyI) b).d((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    if (dwG.this.cu_()) {
                        dwG.this.e(new AbortFlowException(dyq));
                    }
                }
            });
            try {
                dqZ coroutineContext = dwu.getCoroutineContext();
                Object c2 = dAO.c(coroutineContext);
                plus = dwu.getCoroutineContext().plus(c);
                dpr = dpR.c;
                anonymousClass2 = new AnonymousClass2(this.d, coroutineContext, c2, b, this.c, this.a, null);
                this.i = b;
                this.e = 1;
                dyj2 = b;
            } catch (AbortFlowException e3) {
                e = e3;
                dyj2 = b;
            } catch (Throwable th) {
                th = th;
                dyj2 = b;
            }
            try {
            } catch (AbortFlowException e4) {
                e = e4;
                dyj3 = dyj2;
                dzP.a(e, this.c);
                dyj4 = dyj3;
                dyJ.d.e(dyj4, null, 1, null);
                return dpR.c;
            } catch (Throwable th2) {
                th = th2;
                dyj = dyj2;
                dyJ.d.e(dyj, null, 1, null);
                throw th;
            }
            if (dzE.a(plus, dpr, null, anonymousClass2, this, 4, null) == e) {
                return e;
            }
            dyj4 = dyj2;
            dyJ.d.e(dyj4, null, 1, null);
            return dpR.c;
            dzP.a(e, this.c);
            dyj4 = dyj3;
            dyJ.d.e(dyj4, null, 1, null);
            return dpR.c;
        } catch (Throwable th3) {
            th = th3;
            dyj = dyj4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dpR, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dyQ<R> a;
        final /* synthetic */ Object b;
        final /* synthetic */ dyS<T1> c;
        final /* synthetic */ dqZ d;
        final /* synthetic */ dyJ<Object> e;
        int f;
        final /* synthetic */ InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(dyS<? extends T1> dys, dqZ dqz, Object obj, dyJ<? extends Object> dyj, dyQ<? super R> dyq, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = dys;
            this.d = dqz;
            this.b = obj;
            this.e = dyj;
            this.a = dyq;
            this.j = interfaceC8612dsa;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.c, this.d, this.b, this.e, this.a, this.j, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dpR dpr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dpr, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$3  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ<R> a;
            final /* synthetic */ InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> b;
            final /* synthetic */ Object c;
            final /* synthetic */ dyJ<Object> d;
            final /* synthetic */ dqZ e;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(dqZ dqz, Object obj, dyJ<? extends Object> dyj, dyQ<? super R> dyq, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
                this.e = dqz;
                this.c = obj;
                this.d = dyj;
                this.a = dyq;
                this.b = interfaceC8612dsa;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T1 r13, o.InterfaceC8585dra<? super o.dpR> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r14)
                    goto L51
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    o.C8556dpz.d(r14)
                    o.dqZ r14 = r12.e
                    o.dpR r2 = o.dpR.c
                    java.lang.Object r4 = r12.c
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    o.dyJ<java.lang.Object> r6 = r12.d
                    o.dyQ<R> r7 = r12.a
                    o.dsa<T1, T2, o.dra<? super R>, java.lang.Object> r8 = r12.b
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.e = r3
                    java.lang.Object r13 = o.dzE.b(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L51
                    return r1
                L51:
                    o.dpR r13 = o.dpR.c
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.f;
            if (i == 0) {
                C8556dpz.d(obj);
                dyS<T1> dys = this.c;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.d, this.b, this.e, this.a, this.j);
                this.f = 1;
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
}
