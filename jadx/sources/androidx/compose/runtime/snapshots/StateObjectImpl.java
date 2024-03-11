package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;

/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: recordReadIn-h_f27i8$runtime_release  reason: not valid java name */
    public final void m1055recordReadInh_f27i8$runtime_release(int i) {
        int m1049constructorimpl;
        do {
            m1049constructorimpl = ReaderKind.m1049constructorimpl(this.readerKind.get());
            if ((m1049constructorimpl & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m1049constructorimpl, ReaderKind.m1049constructorimpl(m1049constructorimpl | i)));
    }

    /* renamed from: isReadIn-h_f27i8$runtime_release  reason: not valid java name */
    public final boolean m1054isReadInh_f27i8$runtime_release(int i) {
        return (i & ReaderKind.m1049constructorimpl(this.readerKind.get())) != 0;
    }
}
