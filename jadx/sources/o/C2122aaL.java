package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.aaL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2122aaL {
    public static final C2122aaL c = new C2122aaL();

    private C2122aaL() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, C1362Yt c1362Yt, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1362Yt, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e("videoIds");
        InterfaceC8949gP<Integer> interfaceC8949gP = C8953gT.j;
        C8953gT.a(interfaceC8949gP).e(interfaceC9069id, c9028hp, c1362Yt.h());
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c1362Yt.j());
        interfaceC9069id.e("widthForStoryArt");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1362Yt.l()));
        interfaceC9069id.e("widthForEpisode");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1362Yt.k()));
        interfaceC9069id.e("widthForBoxshot");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1362Yt.i()));
        interfaceC9069id.e("widthForTrailer");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1362Yt.n()));
        interfaceC9069id.e("heightForBrandAndGenreBadge");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1362Yt.g()));
    }
}
