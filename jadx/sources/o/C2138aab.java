package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.aab  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2138aab {
    public static final C2138aab d = new C2138aab();

    private C2138aab() {
    }

    public final void c(InterfaceC9069id interfaceC9069id, XY xy, C9028hp c9028hp, boolean z) {
        List j;
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) xy, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(xy.o()));
        interfaceC9069id.e("artworkType");
        C3345axI.a.e(interfaceC9069id, c9028hp, xy.h());
        interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
        C8994hH<Integer> c8994hH = C8953gT.n;
        c8994hH.e(interfaceC9069id, c9028hp, xy.l());
        interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
        c8994hH.e(interfaceC9069id, c9028hp, xy.j());
        if (xy.g() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("formats");
            C8953gT.e(C8953gT.d(C8953gT.a(C3338axB.b))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) xy.g());
        } else if (z) {
            interfaceC9069id.e("formats");
            C8994hH<Object> c8994hH2 = C8953gT.m;
            j = C8569dql.j("WEBP", "JPG");
            c8994hH2.e(interfaceC9069id, c9028hp, j);
        }
        interfaceC9069id.e("features");
        C8953gT.c(C3352axP.e, false, 1, null).e(interfaceC9069id, c9028hp, xy.i());
    }
}
