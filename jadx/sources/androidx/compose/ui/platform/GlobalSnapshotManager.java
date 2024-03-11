package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8737dwr;
import o.C8799dyz;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.dwY;

/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final InterfaceC8792dys e = C8799dyz.e(1, null, null, 6, null);
            C8737dwr.c(dwY.c(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(e, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new drM<Object, dpR>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Object obj) {
                    invoke2(obj);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = GlobalSnapshotManager.sent;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        e.d((InterfaceC8792dys<dpR>) dpR.c);
                    }
                }
            });
        }
    }
}
