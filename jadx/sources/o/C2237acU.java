package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.acU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2237acU {
    public static final C2237acU a = new C2237acU();

    private C2237acU() {
    }

    public final void b(InterfaceC9069id interfaceC9069id, ZE ze, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) ze, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, ze.i());
        interfaceC9069id.e("rating");
        C3456azN.d.e(interfaceC9069id, c9028hp, ze.j());
        interfaceC9069id.e("trackId");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, ze.h());
    }
}
