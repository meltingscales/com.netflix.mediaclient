package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* renamed from: o.drc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8587drc<T> implements InterfaceC8585dra<T>, InterfaceC8594drj {
    private final InterfaceC8585dra<T> a;
    private volatile Object result;
    private static final e d = new e(null);
    private static final AtomicReferenceFieldUpdater<C8587drc<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(C8587drc.class, Object.class, VisualStateDefinition.ELEMENT_STATE.RESULT);

    /* JADX WARN: Multi-variable type inference failed */
    public C8587drc(InterfaceC8585dra<? super T> interfaceC8585dra, Object obj) {
        C8632dsu.c((Object) interfaceC8585dra, "");
        this.a = interfaceC8585dra;
        this.result = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8587drc(InterfaceC8585dra<? super T> interfaceC8585dra) {
        this(interfaceC8585dra, CoroutineSingletons.b);
        C8632dsu.c((Object) interfaceC8585dra, "");
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return this.a.getContext();
    }

    /* renamed from: o.drc$e */
    /* loaded from: classes5.dex */
    static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        Object e2;
        Object e3;
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.b;
            if (obj2 != coroutineSingletons) {
                e2 = C8586drb.e();
                if (obj2 != e2) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<C8587drc<?>, Object> atomicReferenceFieldUpdater = c;
                e3 = C8586drb.e();
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, e3, CoroutineSingletons.e)) {
                    this.a.resumeWith(obj);
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, coroutineSingletons, obj)) {
                return;
            }
        }
    }

    public final Object b() {
        Object e2;
        Object e3;
        Object e4;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.b;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<C8587drc<?>, Object> atomicReferenceFieldUpdater = c;
            e3 = C8586drb.e();
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, coroutineSingletons, e3)) {
                e4 = C8586drb.e();
                return e4;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.e) {
            e2 = C8586drb.e();
            return e2;
        } else if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).d;
        } else {
            return obj;
        }
    }

    @Override // o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<T> interfaceC8585dra = this.a;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    public String toString() {
        return "SafeContinuation for " + this.a;
    }
}
