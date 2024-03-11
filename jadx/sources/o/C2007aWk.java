package o;

/* renamed from: o.aWk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2007aWk {
    public static final C2007aWk b = new C2007aWk();

    private C2007aWk() {
    }

    public static final int e(int i, InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        if (i > 0) {
            C1044Mm.e("nf_mdx_util", "getRealStartTimeInSec:: using override " + i + " in sec for bookmark");
            return i;
        }
        int aF_ = (int) (interfaceC5160btX.aF_() / 1000);
        C1044Mm.e("nf_mdx_util", "getRealStartTimeInSec:: using playable " + aF_ + " in sec for bookmark");
        return aF_;
    }
}
