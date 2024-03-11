package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8820dzt;
import o.InterfaceC8585dra;
import o.InterfaceC8810dzj;
import o.InterfaceC8817dzq;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyS;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8817dzq a;
    final /* synthetic */ T b;
    final /* synthetic */ dyS<T> c;
    int d;
    final /* synthetic */ InterfaceC8810dzj<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC8817dzq interfaceC8817dzq, dyS<? extends T> dys, InterfaceC8810dzj<T> interfaceC8810dzj, T t, InterfaceC8585dra<? super FlowKt__ShareKt$launchSharing$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC8817dzq;
        this.c = dys;
        this.e = interfaceC8810dzj;
        this.b = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FlowKt__ShareKt$launchSharing$1(this.a, this.c, this.e, this.b, interfaceC8585dra);
    }

    public final Object d(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowKt__ShareKt$launchSharing$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return d(dwu, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.d
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r2) goto L21
            if (r1 != r3) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            o.C8556dpz.d(r8)
            goto L5c
        L21:
            o.C8556dpz.d(r8)
            goto L8d
        L25:
            o.C8556dpz.d(r8)
            o.dzq r8 = r7.a
            o.dzq$a r1 = o.InterfaceC8817dzq.d
            o.dzq r6 = r1.d()
            if (r8 != r6) goto L3f
            o.dyS<T> r8 = r7.c
            o.dzj<T> r1 = r7.e
            r7.d = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L3f:
            o.dzq r8 = r7.a
            o.dzq r1 = r1.c()
            r5 = 0
            if (r8 != r1) goto L69
            o.dzj<T> r8 = r7.e
            o.dzv r8 = r8.e()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.d = r4
            java.lang.Object r8 = o.dyR.a(r8, r1, r7)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            o.dyS<T> r8 = r7.c
            o.dzj<T> r1 = r7.e
            r7.d = r2
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L69:
            o.dzq r8 = r7.a
            o.dzj<T> r1 = r7.e
            o.dzv r1 = r1.e()
            o.dyS r8 = r8.e(r1)
            o.dyS r8 = o.dyR.e(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            o.dyS<T> r2 = r7.c
            o.dzj<T> r4 = r7.e
            T r6 = r7.b
            r1.<init>(r2, r4, r6, r5)
            r7.d = r3
            java.lang.Object r8 = o.dyR.d(r8, r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L8d:
            o.dpR r8 = o.dpR.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<Integer, InterfaceC8585dra<? super Boolean>, Object> {
        int b;
        /* synthetic */ int d;

        AnonymousClass1(InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
        }

        public final Object a(int i, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return ((AnonymousClass1) create(Integer.valueOf(i), interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8585dra);
            anonymousClass1.d = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // o.drX
        public /* synthetic */ Object invoke(Integer num, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return a(num.intValue(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.b == 0) {
                C8556dpz.d(obj);
                return C8589dre.e(this.d > 0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<SharingCommand, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dyS<T> a;
        int b;
        /* synthetic */ Object c;
        final /* synthetic */ T d;
        final /* synthetic */ InterfaceC8810dzj<T> e;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$c */
        /* loaded from: classes5.dex */
        public final /* synthetic */ class c {
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                b = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(dyS<? extends T> dys, InterfaceC8810dzj<T> interfaceC8810dzj, T t, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.a = dys;
            this.e = interfaceC8810dzj;
            this.d = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.a, this.e, this.d, interfaceC8585dra);
            anonymousClass2.c = obj;
            return anonymousClass2;
        }

        public final Object e(SharingCommand sharingCommand, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(sharingCommand, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // o.drX
        public /* synthetic */ Object invoke(SharingCommand sharingCommand, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return e(sharingCommand, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.b;
            if (i == 0) {
                C8556dpz.d(obj);
                int i2 = c.b[((SharingCommand) this.c).ordinal()];
                if (i2 == 1) {
                    dyS<T> dys = this.a;
                    Object obj2 = this.e;
                    this.b = 1;
                    if (dys.collect(obj2, this) == e) {
                        return e;
                    }
                } else if (i2 == 3) {
                    T t = this.d;
                    if (t == C8820dzt.e) {
                        this.e.a();
                    } else {
                        this.e.a(t);
                    }
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
