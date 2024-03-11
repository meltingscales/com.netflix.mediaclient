package o;

import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2;
import o.C8797dyx;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyB {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object b(dyI<? super E> dyi, E e) {
        Object b;
        Object d = dyi.d((dyI<? super E>) e);
        if (d instanceof C8797dyx.a) {
            b = C8740dwu.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(dyi, e, null), 1, null);
            return ((C8797dyx) b).e();
        }
        dpR dpr = (dpR) d;
        return C8797dyx.b.d(dpR.c);
    }
}
