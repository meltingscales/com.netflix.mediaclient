package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.acb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2244acb {
    public static final C2244acb c = new C2244acb();

    private C2244acb() {
    }

    public final void b(InterfaceC9069id interfaceC9069id, C1378Zc c1378Zc, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1378Zc, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<Integer> interfaceC8949gP = C8953gT.j;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1378Zc.n()));
        interfaceC9069id.e("artworkParamsForMdx");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1378Zc.i());
        interfaceC9069id.e("episodeFromCursor");
        C8953gT.t.e(interfaceC9069id, c9028hp, c1378Zc.j());
        interfaceC9069id.e("episodeCount");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1378Zc.h()));
        interfaceC9069id.e("artworkParamsForInterestingSmall");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1378Zc.g());
    }
}
