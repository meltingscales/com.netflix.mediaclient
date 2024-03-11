package o;

import kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1;

/* renamed from: o.dyu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8794dyu {
    private static final dAH a;
    private static final dAH b;
    private static final dAH c;
    public static final int d;
    public static final dAH e;
    private static final dAH f;
    private static final dAH g;
    private static final dAH h;
    private static final dAH i;
    private static final int j;
    private static final dAH k;
    private static final dAH l;
    private static final C8796dyw<Object> m = new C8796dyw<>(-1, null, null, 0);
    private static final dAH n;

    /* renamed from: o  reason: collision with root package name */
    private static final dAH f13864o;
    private static final dAH p;
    private static final dAH q;
    private static final dAH r;
    private static final dAH t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(int i2) {
        if (i2 != 0) {
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    public static final dAH s() {
        return a;
    }

    public static final <E> dtA<C8796dyw<E>> t() {
        return BufferedChannelKt$createSegmentFunction$1.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> C8796dyw<E> d(long j2, C8796dyw<E> c8796dyw) {
        return new C8796dyw<>(j2, c8796dyw, c8796dyw.a(), 0);
    }

    static {
        int c2;
        int c3;
        c2 = dAI.c("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        d = c2;
        c3 = dAI.c("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        j = c3;
        e = new dAH("BUFFERED");
        k = new dAH("SHOULD_BUFFER");
        p = new dAH("S_RESUMING_BY_RCV");
        t = new dAH("RESUMING_BY_EB");
        n = new dAH("POISONED");
        h = new dAH("DONE_RCV");
        f = new dAH("INTERRUPTED_SEND");
        i = new dAH("INTERRUPTED_RCV");
        a = new dAH("CHANNEL_CLOSED");
        r = new dAH("SUSPEND");
        q = new dAH("SUSPEND_NO_WAITER");
        g = new dAH("FAILED");
        f13864o = new dAH("NO_RECEIVE_RESULT");
        c = new dAH("CLOSE_HANDLER_CLOSED");
        b = new dAH("CLOSE_HANDLER_INVOKED");
        l = new dAH("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(InterfaceC8743dwx interfaceC8743dwx, Object obj, drM drm, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            drm = null;
        }
        return a(interfaceC8743dwx, obj, drm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean a(InterfaceC8743dwx<? super T> interfaceC8743dwx, T t2, drM<? super Throwable, dpR> drm) {
        Object e2 = interfaceC8743dwx.e(t2, null, drm);
        if (e2 != null) {
            interfaceC8743dwx.b(e2);
            return true;
        }
        return false;
    }
}
