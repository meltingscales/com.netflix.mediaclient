package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.abV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2185abV {
    public static final C2185abV d = new C2185abV();

    private C2185abV() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, C1377Zb c1377Zb, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1377Zb, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1377Zb.i()));
        interfaceC9069id.e("artworkParamsForMdx");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1377Zb.h());
        interfaceC9069id.e("artworkParamsForInterestingSmall");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1377Zb.g());
    }
}
