package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dBK;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwU;
import o.dxD;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2<R> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super R>, Object> {
    final /* synthetic */ drM<InterfaceC8585dra<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super MutatorMutex$mutate$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, interfaceC8585dra);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return ((MutatorMutex$mutate$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, o.dBK] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        MutatorMutex.Mutator mutator;
        dBK dbk;
        drM<InterfaceC8585dra<? super R>, Object> drm;
        MutatorMutex mutatorMutex;
        MutatorMutex.Mutator mutator2;
        Throwable th;
        MutatorMutex mutatorMutex2;
        dBK dbk2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        e = C8586drb.e();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    C8556dpz.d(obj);
                    MutatePriority mutatePriority = this.$priority;
                    dqZ.b bVar = ((dwU) this.L$0).getCoroutineContext().get(dxD.b);
                    C8632dsu.d(bVar);
                    mutator = new MutatorMutex.Mutator(mutatePriority, (dxD) bVar);
                    this.this$0.tryMutateOrCancel(mutator);
                    dbk = this.this$0.mutex;
                    drM<InterfaceC8585dra<? super R>, Object> drm2 = this.$block;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator;
                    this.L$1 = dbk;
                    this.L$2 = drm2;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (dbk.a(null, this) == e) {
                        return e;
                    }
                    drm = drm2;
                    mutatorMutex = mutatorMutex3;
                } else if (r1 != 1) {
                    if (r1 == 2) {
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        dbk2 = (dBK) this.L$1;
                        mutator2 = (MutatorMutex.Mutator) this.L$0;
                        try {
                            C8556dpz.d(obj);
                            atomicReference2 = mutatorMutex2.currentMutator;
                            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                            dbk2.d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.currentMutator;
                            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mutatorMutex = (MutatorMutex) this.L$3;
                    drm = (drM) this.L$2;
                    C8556dpz.d(obj);
                    dbk = (dBK) this.L$1;
                    mutator = (MutatorMutex.Mutator) this.L$0;
                }
                this.L$0 = mutator;
                this.L$1 = dbk;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = drm.invoke(this);
                if (invoke == e) {
                    return e;
                }
                mutatorMutex2 = mutatorMutex;
                dbk2 = dbk;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.currentMutator;
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                dbk2.d(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.d(null);
            throw th4;
        }
    }
}
