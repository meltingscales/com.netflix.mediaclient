package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8792dys<dpR> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(InterfaceC8792dys<dpR> interfaceC8792dys, InterfaceC8585dra<? super GlobalSnapshotManager$ensureStarted$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$channel = interfaceC8792dys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:6:0x0013, B:15:0x0036, B:17:0x003e, B:12:0x0029, B:18:0x0052, B:11:0x0024), top: B:26:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:6:0x0013, B:15:0x0036, B:17:0x003e, B:12:0x0029, B:18:0x0052, B:11:0x0024), top: B:26:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0033 -> B:15:0x0036). Please submit an issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r5.L$1
            o.dyy r1 = (o.InterfaceC8798dyy) r1
            java.lang.Object r3 = r5.L$0
            o.dyJ r3 = (o.dyJ) r3
            o.C8556dpz.d(r6)     // Catch: java.lang.Throwable -> L59
            goto L36
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            o.C8556dpz.d(r6)
            o.dys<o.dpR> r3 = r5.$channel
            o.dyy r6 = r3.ct_()     // Catch: java.lang.Throwable -> L59
            r1 = r6
        L29:
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L59
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L59
            r5.label = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r1.c(r5)     // Catch: java.lang.Throwable -> L59
            if (r6 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L59
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L52
            java.lang.Object r6 = r1.a()     // Catch: java.lang.Throwable -> L59
            o.dpR r6 = (o.dpR) r6     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L59
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L59
            androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> L59
            r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L59
            goto L29
        L52:
            o.dpR r6 = o.dpR.c     // Catch: java.lang.Throwable -> L59
            r0 = 0
            o.dyA.c(r3, r0)
            return r6
        L59:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            o.dyA.c(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
