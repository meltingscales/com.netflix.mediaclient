package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import o.C8576dqs;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpB;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.drX;
import o.dwF;
import o.dwH;
import o.dwU;
import o.dyR;
import o.dyS;
import o.dzB;

/* loaded from: classes2.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final dyS<T> data;
    private final InterfaceC8812dzl<State<T>> downstreamFlow;
    private final InterfaceC8554dpx file$delegate;
    private List<? extends drX<? super InitializerApi<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object>> initTasks;
    private final drO<File> produceFile;
    private final dwU scope;
    private final Serializer<T> serializer;

    @Override // androidx.datastore.core.DataStore
    public dyS<T> getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(drO<? extends File> dro, Serializer<T> serializer, List<? extends drX<? super InitializerApi<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object>> list, CorruptionHandler<T> corruptionHandler, dwU dwu) {
        InterfaceC8554dpx b;
        List<? extends drX<? super InitializerApi<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object>> U;
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) serializer, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) corruptionHandler, "");
        C8632dsu.c((Object) dwu, "");
        this.produceFile = dro;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = dwu;
        this.data = dyR.d(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        b = dpB.b(new drO<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final File invoke() {
                drO dro2;
                dro2 = ((SingleProcessDataStore) this.this$0).produceFile;
                File file = (File) dro2.invoke();
                String absolutePath = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (!(!companion.getActiveFiles$datastore_core().contains(absolutePath))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    C8632dsu.a(absolutePath, "");
                    activeFiles$datastore_core.add(absolutePath);
                }
                return file;
            }
        });
        this.file$delegate = b;
        this.downstreamFlow = dzB.d(UnInitialized.INSTANCE);
        U = C8576dqs.U(list);
        this.initTasks = U;
        this.actor = new SimpleActor<>(dwu, new drM<Throwable, dpR>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                File file;
                InterfaceC8812dzl interfaceC8812dzl;
                if (th != null) {
                    interfaceC8812dzl = ((SingleProcessDataStore) this.this$0).downstreamFlow;
                    interfaceC8812dzl.d(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    file = singleProcessDataStore.getFile();
                    activeFiles$datastore_core.remove(file.getAbsolutePath());
                    dpR dpr = dpR.c;
                }
            }
        }, new drX<Message<T>, Throwable, dpR>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.Message) ((SingleProcessDataStore.Message) obj), th);
                return dpR.c;
            }

            public final void invoke(SingleProcessDataStore.Message<T> message, Throwable th) {
                C8632dsu.c((Object) message, "");
                if (message instanceof SingleProcessDataStore.Message.Update) {
                    dwF<T> ack = ((SingleProcessDataStore.Message.Update) message).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.a(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(drX<? super T, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        dwF d = dwH.d(null, 1, null);
        this.actor.offer(new Message.Update(drx, d, this.downstreamFlow.b(), interfaceC8585dra.getContext()));
        return d.b(interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class Message<T> {
        public /* synthetic */ Message(C8627dsp c8627dsp) {
            this();
        }

        private Message() {
        }

        /* loaded from: classes2.dex */
        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            public State<T> getLastState() {
                return this.lastState;
            }

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Update<T> extends Message<T> {
            private final dwF<T> ack;
            private final dqZ callerContext;
            private final State<T> lastState;
            private final drX<T, InterfaceC8585dra<? super T>, Object> transform;

            public final dwF<T> getAck() {
                return this.ack;
            }

            public final dqZ getCallerContext() {
                return this.callerContext;
            }

            public State<T> getLastState() {
                return this.lastState;
            }

            public final drX<T, InterfaceC8585dra<? super T>, Object> getTransform() {
                return this.transform;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(drX<? super T, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, dwF<T> dwf, State<T> state, dqZ dqz) {
                super(null);
                C8632dsu.c((Object) drx, "");
                C8632dsu.c((Object) dwf, "");
                C8632dsu.c((Object) dqz, "");
                this.transform = drx;
                this.ack = dwf;
                this.lastState = state;
                this.callerContext = dqz;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        State<T> b = this.downstreamFlow.b();
        if (!(b instanceof Data)) {
            if (b instanceof ReadException) {
                if (b == read.getLastState()) {
                    Object readAndInitOrPropagateFailure = readAndInitOrPropagateFailure(interfaceC8585dra);
                    e2 = C8586drb.e();
                    return readAndInitOrPropagateFailure == e2 ? readAndInitOrPropagateFailure : dpR.c;
                }
            } else if (C8632dsu.c(b, UnInitialized.INSTANCE)) {
                Object readAndInitOrPropagateFailure2 = readAndInitOrPropagateFailure(interfaceC8585dra);
                e = C8586drb.e();
                return readAndInitOrPropagateFailure2 == e ? readAndInitOrPropagateFailure2 : dpR.c;
            } else if (b instanceof Final) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(6:(1:(1:(2:12|13))(8:15|16|17|18|(1:20)|21|22|23))|30|31|21|22|23)(4:32|33|34|(2:36|(1:38)(4:39|21|22|23))(4:40|(2:53|(2:55|56)(2:57|58))|43|(2:45|(1:47)(7:48|17|18|(0)|21|22|23))(2:49|50)))))|61|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [o.dwF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.SingleProcessDataStore.Message.Update<T> r9, o.InterfaceC8585dra<? super o.dpR> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.handleUpdate(androidx.datastore.core.SingleProcessDataStore$Message$Update, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(o.InterfaceC8585dra<? super o.dpR> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            o.C8556dpz.d(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            o.C8556dpz.d(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.readAndInit(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            o.dpR r5 = o.dpR.c
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            o.dzl<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.d(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateAndThrowFailure(o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateFailure(o.InterfaceC8585dra<? super o.dpR> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            o.C8556dpz.d(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            o.C8556dpz.d(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L45
            r0.label = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.readAndInit(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            o.dzl<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.d(r1)
        L51:
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateFailure(o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInit(o.InterfaceC8585dra<? super o.dpR> r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInit(o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(o.InterfaceC8585dra<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            o.C8556dpz.d(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            o.C8556dpz.d(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            o.C8556dpz.d(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            o.C8556dpz.d(r8)
            r0.L$0 = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.label = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.readData(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            androidx.datastore.core.CorruptionHandler<T> r5 = r2.corruptionHandler
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r4 = r5.handleCorruption(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.L$0 = r2     // Catch: java.io.IOException -> L88
            r0.L$1 = r8     // Catch: java.io.IOException -> L88
            r0.label = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.writeData$datastore_core(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            o.C8549dps.e(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readDataOrHandleCorruption(o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, o.dra] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readData(o.InterfaceC8585dra<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$1
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            o.C8556dpz.d(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            o.C8556dpz.d(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.getFile()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            androidx.datastore.core.Serializer<T> r6 = r5.serializer     // Catch: java.lang.Throwable -> L65
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L65
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.L$2 = r4     // Catch: java.lang.Throwable -> L65
            r0.label = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.readFrom(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            o.C8608drx.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            o.C8608drx.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.getFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            androidx.datastore.core.Serializer<T> r6 = r0.serializer
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readData(o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object transformAndWrite(o.drX<? super T, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r8, o.dqZ r9, o.InterfaceC8585dra<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$1
            java.lang.Object r9 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            o.C8556dpz.d(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.Data r9 = (androidx.datastore.core.Data) r9
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            o.C8556dpz.d(r10)
            goto L73
        L49:
            o.C8556dpz.d(r10)
            o.dzl<androidx.datastore.core.State<T>> r10 = r7.downstreamFlow
            java.lang.Object r10 = r10.b()
            androidx.datastore.core.Data r10 = (androidx.datastore.core.Data) r10
            r10.checkHashCode()
            java.lang.Object r2 = r10.getValue()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r8, r2, r5)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r8 = o.C8738dws.c(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.checkHashCode()
            boolean r9 = o.C8632dsu.c(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r8 = r2.writeData$datastore_core(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            o.dzl<androidx.datastore.core.State<T>> r9 = r9.downstreamFlow
            if (r8 == 0) goto L97
            int r10 = r8.hashCode()
            goto L98
        L97:
            r10 = 0
        L98:
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            r0.<init>(r8, r10)
            r9.d(r0)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.transformAndWrite(o.drX, o.dqZ, o.dra):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: IOException -> 0x00bc, TryCatch #4 {IOException -> 0x00bc, blocks: (B:25:0x0092, B:28:0x00a0, B:29:0x00bb), top: B:46:0x0092 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core(T r8, o.InterfaceC8585dra<? super o.dpR> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.L$4
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$2
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.L$1
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lbf
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            o.C8556dpz.d(r9)
            java.io.File r9 = r7.getFile()
            r7.createParentDirectories(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.getFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.SCRATCH_SUFFIX
            java.lang.String r2 = o.C8632dsu.d(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc8
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc8
            androidx.datastore.core.Serializer<T> r4 = r7.serializer     // Catch: java.lang.Throwable -> Lc1
            androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream r5 = new androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lc1
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Lc1
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.L$3 = r6     // Catch: java.lang.Throwable -> Lc1
            r0.L$4 = r2     // Catch: java.lang.Throwable -> Lc1
            r0.label = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.writeTo(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            o.dpR r8 = o.dpR.c     // Catch: java.lang.Throwable -> L3d
            o.C8608drx.a(r2, r1)     // Catch: java.io.IOException -> Lbc
            java.io.File r9 = r0.getFile()     // Catch: java.io.IOException -> Lbc
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lbc
            if (r9 == 0) goto La0
            return r8
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbc
            r9.<init>()     // Catch: java.io.IOException -> Lbc
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbc
            r9.append(r3)     // Catch: java.io.IOException -> Lbc
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbc
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbc
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbc
            throw r8     // Catch: java.io.IOException -> Lbc
        Lbc:
            r8 = move-exception
            r9 = r3
            goto Lc9
        Lbf:
            r9 = r3
            goto Lc2
        Lc1:
            r8 = move-exception
        Lc2:
            throw r8     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r0 = move-exception
            o.C8608drx.a(r2, r8)     // Catch: java.io.IOException -> Lc8
            throw r0     // Catch: java.io.IOException -> Lc8
        Lc8:
            r8 = move-exception
        Lc9:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld2
            r9.delete()
        Ld2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.writeData$datastore_core(java.lang.Object, o.dra):java.lang.Object");
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C8632dsu.d("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            C8632dsu.c((Object) fileOutputStream, "");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.fileOutputStream.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C8632dsu.c((Object) bArr, "");
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C8632dsu.c((Object) bArr, "");
            this.fileOutputStream.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
