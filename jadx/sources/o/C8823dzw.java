package o;

import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedLazily$command$1;

/* renamed from: o.dzw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8823dzw implements InterfaceC8817dzq {
    public String toString() {
        return "SharingStarted.Lazily";
    }

    @Override // o.InterfaceC8817dzq
    public dyS<SharingCommand> e(InterfaceC8822dzv<Integer> interfaceC8822dzv) {
        return dyR.d(new StartedLazily$command$1(interfaceC8822dzv, null));
    }
}
