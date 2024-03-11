package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.aaG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2111aaG {
    public static final C2111aaG c = new C2111aaG();

    private C2111aaG() {
    }

    public final void e(InterfaceC9069id interfaceC9069id, C1359Yq c1359Yq, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1359Yq, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1359Yq.i()));
        interfaceC9069id.e("artworkParamsForMdx");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1359Yq.j());
        interfaceC9069id.e("artworkParamsForInterestingSmall");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1359Yq.h());
    }
}
