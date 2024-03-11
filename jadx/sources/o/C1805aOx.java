package o;

import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.service.cdx.pairing.PairingState;

/* renamed from: o.aOx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1805aOx {
    private PairingState a;
    private final C1255Uq b;
    private final PairingType c;
    private final int e;

    public final PairingType d() {
        return this.c;
    }

    public final C1255Uq e() {
        return this.b;
    }

    public C1805aOx(C1255Uq c1255Uq, int i, PairingType pairingType) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) pairingType, "");
        this.b = c1255Uq;
        this.e = i;
        this.c = pairingType;
        this.a = PairingState.b;
    }

    public final boolean a() {
        return this.a != PairingState.d;
    }

    public final void b(int i) {
        if (this.e == i) {
            this.a = PairingState.e;
        }
    }
}
