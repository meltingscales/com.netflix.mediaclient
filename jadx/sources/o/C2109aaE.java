package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.aaE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2109aaE {
    public static final C2109aaE a = new C2109aaE();

    private C2109aaE() {
    }

    public final void e(InterfaceC9069id interfaceC9069id, C1356Yn c1356Yn, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1356Yn, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<Integer> interfaceC8949gP = C8953gT.j;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1356Yn.o()));
        interfaceC9069id.e("artworkParamsForInterestingSmall");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1356Yn.j());
        interfaceC9069id.e("startEpisodeCursor");
        C8953gT.t.e(interfaceC9069id, c9028hp, c1356Yn.h());
        interfaceC9069id.e("numOfEpisodes");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1356Yn.i()));
        interfaceC9069id.e("artworkParamsForMdx");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, c1356Yn.g());
    }
}
