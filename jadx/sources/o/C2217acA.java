package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.acA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2217acA {
    public static final C2217acA c = new C2217acA();

    private C2217acA() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, C1394Zs c1394Zs, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1394Zs, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c1394Zs.j());
        interfaceC9069id.e("trackId");
        C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c1394Zs.h());
    }
}
