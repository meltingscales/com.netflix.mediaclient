package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.ack  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2253ack {
    public static final C2253ack d = new C2253ack();

    private C2253ack() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, C1386Zk c1386Zk, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1386Zk, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1386Zk.h()));
        interfaceC9069id.e("sectionCount");
        C8953gT.n.e(interfaceC9069id, c9028hp, c1386Zk.i());
        interfaceC9069id.e("artworkParamsForMdx");
        C8953gT.c(C3342axF.e, false, 1, null).e(interfaceC9069id, c9028hp, c1386Zk.j());
    }
}
