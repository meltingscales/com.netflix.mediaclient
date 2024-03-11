package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC8585dra<? super SingleProcessDataStore$data$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, interfaceC8585dra);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((dyQ) ((dyQ) obj), interfaceC8585dra);
    }

    public final Object invoke(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SingleProcessDataStore$data$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8812dzl interfaceC8812dzl;
        InterfaceC8812dzl interfaceC8812dzl2;
        SimpleActor simpleActor;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq = (dyQ) this.L$0;
            interfaceC8812dzl = ((SingleProcessDataStore) this.this$0).downstreamFlow;
            State state = (State) interfaceC8812dzl.b();
            if (!(state instanceof Data)) {
                simpleActor = ((SingleProcessDataStore) this.this$0).actor;
                simpleActor.offer(new SingleProcessDataStore.Message.Read(state));
            }
            interfaceC8812dzl2 = ((SingleProcessDataStore) this.this$0).downstreamFlow;
            final dyS d = dyR.d((dyS) interfaceC8812dzl2, (drX) new AnonymousClass1(state, null));
            dyS<T> dys = new dyS<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2 implements dyQ<State<T>> {
                    final /* synthetic */ dyQ $this_unsafeFlow$inlined;

                    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC8585dra interfaceC8585dra) {
                            super(interfaceC8585dra);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(dyQ dyq) {
                        this.$this_unsafeFlow$inlined = dyq;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // o.dyQ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 + r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = o.C8588drd.c()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            o.C8556dpz.d(r6)
                            goto L53
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            o.C8556dpz.d(r6)
                            o.dyQ r6 = r4.$this_unsafeFlow$inlined
                            androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                            boolean r2 = r5 instanceof androidx.datastore.core.ReadException
                            if (r2 != 0) goto L73
                            boolean r2 = r5 instanceof androidx.datastore.core.Final
                            if (r2 != 0) goto L6c
                            boolean r2 = r5 instanceof androidx.datastore.core.Data
                            if (r2 == 0) goto L56
                            androidx.datastore.core.Data r5 = (androidx.datastore.core.Data) r5
                            java.lang.Object r5 = r5.getValue()
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L53
                            return r1
                        L53:
                            o.dpR r5 = o.dpR.c
                            return r5
                        L56:
                            boolean r5 = r5 instanceof androidx.datastore.core.UnInitialized
                            if (r5 == 0) goto L66
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                            java.lang.String r6 = r6.toString()
                            r5.<init>(r6)
                            throw r5
                        L66:
                            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                            r5.<init>()
                            throw r5
                        L6c:
                            androidx.datastore.core.Final r5 = (androidx.datastore.core.Final) r5
                            java.lang.Throwable r5 = r5.getFinalException()
                            throw r5
                        L73:
                            androidx.datastore.core.ReadException r5 = (androidx.datastore.core.ReadException) r5
                            java.lang.Throwable r5 = r5.getReadException()
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
                    }
                }

                @Override // o.dyS
                public Object collect(dyQ dyq2, InterfaceC8585dra interfaceC8585dra) {
                    Object e2;
                    Object collect = dyS.this.collect(new AnonymousClass2(dyq2), interfaceC8585dra);
                    e2 = C8586drb.e();
                    return collect == e2 ? collect : dpR.c;
                }
            };
            this.label = 1;
            if (dyR.e(dyq, dys, this) == e) {
                return e;
            }
        } else if (i == 1) {
            C8556dpz.d(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<State<T>, InterfaceC8585dra<? super Boolean>, Object> {
        final /* synthetic */ State<T> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<T> state, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$currentDownStreamFlowState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(State<T> state, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return ((AnonymousClass1) create(state, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // o.drX
        public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            return invoke((State) ((State) obj), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.label == 0) {
                C8556dpz.d(obj);
                State<T> state = (State) this.L$0;
                State<T> state2 = this.$currentDownStreamFlowState;
                return C8589dre.e(((state2 instanceof Data) || (state2 instanceof Final) || state != state2) ? false : true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
