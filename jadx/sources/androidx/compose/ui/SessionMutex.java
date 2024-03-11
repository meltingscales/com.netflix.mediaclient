package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* loaded from: classes.dex */
    public static final class Session<T> {
        private final T value;

        public final T getValue() {
            return this.value;
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m1058constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1059equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && C8632dsu.c(atomicReference, ((SessionMutex) obj).m1063unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1061hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1062toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    public boolean equals(Object obj) {
        return m1059equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m1061hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m1062toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ AtomicReference m1063unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m1057constructorimpl() {
        return m1058constructorimpl(new AtomicReference(null));
    }

    /* renamed from: getCurrentSession-impl  reason: not valid java name */
    public static final T m1060getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }
}
