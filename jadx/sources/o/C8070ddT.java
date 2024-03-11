package o;

import java.util.Comparator;

/* renamed from: o.ddT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8070ddT implements Comparator<InterfaceC5154btR> {
    @Override // java.util.Comparator
    /* renamed from: e */
    public int compare(InterfaceC5154btR interfaceC5154btR, InterfaceC5154btR interfaceC5154btR2) {
        C8632dsu.c((Object) interfaceC5154btR, "");
        C8632dsu.c((Object) interfaceC5154btR2, "");
        int i = !interfaceC5154btR.read();
        int i2 = !interfaceC5154btR2.read();
        return i != i2 ? i - i2 : (int) (interfaceC5154btR2.timestamp() - interfaceC5154btR.timestamp());
    }
}
