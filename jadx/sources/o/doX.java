package o;

/* loaded from: classes.dex */
public interface doX extends doY {
    long a(doX dox, InterfaceC8540dpj interfaceC8540dpj);

    default doX a(doW dow) {
        return dow.e(this);
    }

    doX b(long j, InterfaceC8540dpj interfaceC8540dpj);

    default doX c(InterfaceC8533dpc interfaceC8533dpc) {
        return interfaceC8533dpc.b(this);
    }

    doX d(InterfaceC8535dpe interfaceC8535dpe, long j);

    default doX e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }
}
