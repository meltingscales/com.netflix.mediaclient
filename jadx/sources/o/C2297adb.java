package o;

/* renamed from: o.adb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2297adb {
    public static final C2297adb b = new C2297adb();

    private C2297adb() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, ZB zb, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) zb, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e("videoIds");
        C8953gT.a(C8953gT.j).e(interfaceC9069id, c9028hp, zb.h());
        interfaceC9069id.e("artworkParamsForSDP");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, zb.g());
        interfaceC9069id.e("artworkParamsForInterestingSmall");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, zb.j());
        interfaceC9069id.e("artworkParamsForMdx");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, zb.i());
    }
}
