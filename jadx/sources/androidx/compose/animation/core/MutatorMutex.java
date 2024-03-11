package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC8585dra;
import o.dBK;
import o.dBL;
import o.drM;
import o.dwY;
import o.dxD;

/* loaded from: classes.dex */
public final class MutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final dBK mutex = dBL.d(false, 1, null);

    /* loaded from: classes.dex */
    public static final class Mutator {
        private final dxD job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, dxD dxd) {
            this.priority = mutatePriority;
            this.job = dxd;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.e(new MutationInterruptedException());
        }
    }

    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, drM drm, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, drm, interfaceC8585dra);
    }

    public final <R> Object mutate(MutatePriority mutatePriority, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return dwY.b(new MutatorMutex$mutate$2(mutatePriority, this, drm, null), interfaceC8585dra);
    }
}
