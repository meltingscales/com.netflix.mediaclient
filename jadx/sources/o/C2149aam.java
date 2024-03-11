package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.aam  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2149aam {
    public static final C2149aam b = new C2149aam();

    private C2149aam() {
    }

    public final void a(InterfaceC9069id interfaceC9069id, C1349Yg c1349Yg, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1349Yg, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1349Yg.i()));
        interfaceC9069id.e("horizontalArtFeatures");
        C8953gT.c(C3352axP.e, false, 1, null).e(interfaceC9069id, c9028hp, c1349Yg.j());
    }
}
