package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8578dqu;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8792dys;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;
import o.dyI;
import o.dyQ;
import o.dyS;

/* loaded from: classes5.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ dyS<T>[] b;
    final /* synthetic */ InterfaceC8612dsa<dyQ<? super R>, T[], InterfaceC8585dra<? super dpR>, Object> c;
    final /* synthetic */ dyQ<R> d;
    final /* synthetic */ drO<T[]> e;
    Object f;
    int g;
    private /* synthetic */ Object h;
    int i;
    Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(dyS<? extends T>[] dysArr, drO<T[]> dro, InterfaceC8612dsa<? super dyQ<? super R>, ? super T[], ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, dyQ<? super R> dyq, InterfaceC8585dra<? super CombineKt$combineInternal$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = dysArr;
        this.e = dro;
        this.c = interfaceC8612dsa;
        this.d = dyq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.b, this.e, this.c, this.d, interfaceC8585dra);
        combineKt$combineInternal$2.h = obj;
        return combineKt$combineInternal$2;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CombineKt$combineInternal$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[LOOP:0: B:28:0x00d6->B:34:0x00f9, LOOP_START, PHI: r6 r9 
      PHI: (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00d1, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v6 o.dqu) = (r9v5 o.dqu), (r9v21 o.dqu) binds: [B:25:0x00d1, B:34:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011f -> B:21:0x00b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014b -> B:47:0x014c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ InterfaceC8792dys<C8578dqu<Object>> b;
        final /* synthetic */ dyS<T>[] c;
        final /* synthetic */ AtomicInteger d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(dyS<? extends T>[] dysArr, int i, AtomicInteger atomicInteger, InterfaceC8792dys<C8578dqu<Object>> interfaceC8792dys, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = dysArr;
            this.e = i;
            this.d = atomicInteger;
            this.b = interfaceC8792dys;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.e, this.d, this.b, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            AtomicInteger atomicInteger;
            e = C8586drb.e();
            int i = this.a;
            try {
                if (i == 0) {
                    C8556dpz.d(obj);
                    dyS[] dysArr = this.c;
                    int i2 = this.e;
                    dyS dys = dysArr[i2];
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, i2);
                    this.a = 1;
                    if (dys.collect(anonymousClass2, this) == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    dyI.e.a(this.b, null, 1, null);
                }
                return dpR.c;
            } finally {
                if (this.d.decrementAndGet() == 0) {
                    dyI.e.a(this.b, null, 1, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$2  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ InterfaceC8792dys<C8578dqu<Object>> c;
            final /* synthetic */ int e;

            AnonymousClass2(InterfaceC8792dys<C8578dqu<Object>> interfaceC8792dys, int i) {
                this.c = interfaceC8792dys;
                this.e = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, o.InterfaceC8585dra<? super o.dpR> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    o.C8556dpz.d(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    o.C8556dpz.d(r8)
                    goto L4d
                L38:
                    o.C8556dpz.d(r8)
                    o.dys<o.dqu<java.lang.Object>> r8 = r6.c
                    o.dqu r2 = new o.dqu
                    int r5 = r6.e
                    r2.<init>(r5, r7)
                    r0.e = r4
                    java.lang.Object r7 = r8.a(r2, r0)
                    if (r7 != r1) goto L4d
                    return r1
                L4d:
                    r0.e = r3
                    java.lang.Object r7 = o.C8782dyi.b(r0)
                    if (r7 != r1) goto L56
                    return r1
                L56:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
