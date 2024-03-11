package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes3.dex */
public final class ZT {
    public static final ZT c = new ZT();

    private ZT() {
    }

    public final void a(InterfaceC9069id interfaceC9069id, XU xu, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) xu, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, xu.i());
        interfaceC9069id.e("trackId");
        C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, xu.h());
    }
}
