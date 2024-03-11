package o;

import com.netflix.mediaclient.service.cdx.pairing.UnpairingState;

/* loaded from: classes3.dex */
public final class aOC {
    private final C1255Uq a;
    private final int c;
    private UnpairingState e;

    public final C1255Uq a() {
        return this.a;
    }

    public aOC(C1255Uq c1255Uq, int i) {
        C8632dsu.c((Object) c1255Uq, "");
        this.a = c1255Uq;
        this.c = i;
        this.e = UnpairingState.d;
    }

    public final boolean e() {
        return this.e == UnpairingState.e;
    }

    public final void e(int i) {
        if (this.c == i) {
            this.e = UnpairingState.e;
        }
    }
}
