package androidx.compose.material;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC8585dra;
import o.dBK;
import o.dBL;
import o.dpR;
import o.drM;
import o.drO;
import o.dwY;
import o.dxD;

/* loaded from: classes5.dex */
public final class InternalMutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final dBK mutex = dBL.d(false, 1, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
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
            dxD.b.b(this.job, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public final <R> Object mutate(MutatePriority mutatePriority, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return dwY.b(new InternalMutatorMutex$mutate$2(mutatePriority, this, drm, null), interfaceC8585dra);
    }

    public final boolean tryMutate(drO<dpR> dro) {
        boolean a = dBK.b.a(this.mutex, null, 1, null);
        if (a) {
            try {
                dro.invoke();
            } finally {
                dBK.b.d(this.mutex, null, 1, null);
            }
        }
        return a;
    }
}
