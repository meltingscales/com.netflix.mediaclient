package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8822dzv;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes5.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements drX<dyQ<? super SharingCommand>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8822dzv<Integer> b;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC8822dzv<Integer> interfaceC8822dzv, InterfaceC8585dra<? super StartedLazily$command$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC8822dzv;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super SharingCommand> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((StartedLazily$command$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.b, interfaceC8585dra);
        startedLazily$command$1.e = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            InterfaceC8822dzv<Integer> interfaceC8822dzv = this.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(booleanRef, (dyQ) this.e);
            this.d = 1;
            if (interfaceC8822dzv.collect(anonymousClass1, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1<T> implements dyQ {
        final /* synthetic */ dyQ<SharingCommand> b;
        final /* synthetic */ Ref.BooleanRef c;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.BooleanRef booleanRef, dyQ<? super SharingCommand> dyq) {
            this.c = booleanRef;
            this.b = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.c
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                o.C8556dpz.d(r6)
                if (r5 <= 0) goto L4e
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.c
                boolean r6 = r5.a
                if (r6 != 0) goto L4e
                r5.a = r3
                o.dyQ<kotlinx.coroutines.flow.SharingCommand> r5 = r4.b
                kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                r0.d = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                o.dpR r5 = o.dpR.c
                return r5
            L4e:
                o.dpR r5 = o.dpR.c
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1.a(int, o.dra):java.lang.Object");
        }

        @Override // o.dyQ
        public /* synthetic */ Object emit(Object obj, InterfaceC8585dra interfaceC8585dra) {
            return a(((Number) obj).intValue(), interfaceC8585dra);
        }
    }
}
