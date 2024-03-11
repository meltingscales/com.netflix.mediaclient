package o;

import kotlinx.coroutines.flow.SharingCommand;

/* renamed from: o.dzy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8825dzy implements InterfaceC8817dzq {
    public String toString() {
        return "SharingStarted.Eagerly";
    }

    @Override // o.InterfaceC8817dzq
    public dyS<SharingCommand> e(InterfaceC8822dzv<Integer> interfaceC8822dzv) {
        return dyR.c(SharingCommand.START);
    }
}
