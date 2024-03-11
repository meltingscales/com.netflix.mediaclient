package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dAa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7644dAa extends C8818dzr<Integer> implements InterfaceC8822dzv<Integer> {
    public C7644dAa(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        a((C7644dAa) Integer.valueOf(i));
    }

    @Override // o.InterfaceC8822dzv
    /* renamed from: m */
    public Integer b() {
        int intValue;
        synchronized (this) {
            intValue = j().intValue();
        }
        return Integer.valueOf(intValue);
    }

    public final boolean e(int i) {
        boolean a;
        synchronized (this) {
            a = a((C7644dAa) Integer.valueOf(j().intValue() + i));
        }
        return a;
    }
}
