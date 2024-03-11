package o;

import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.aaQ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2127aaQ {
    public static final C2127aaQ d = new C2127aaQ();

    private C2127aaQ() {
    }

    public final void b(InterfaceC9069id interfaceC9069id, C1370Yu c1370Yu, C9028hp c9028hp, boolean z) {
        List j;
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c1370Yu, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e("gameId");
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1370Yu.g()));
        interfaceC9069id.e("artworkType");
        C3345axI.a.e(interfaceC9069id, c9028hp, c1370Yu.h());
        interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
        C8994hH<Integer> c8994hH = C8953gT.n;
        c8994hH.e(interfaceC9069id, c9028hp, c1370Yu.o());
        interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
        c8994hH.e(interfaceC9069id, c9028hp, c1370Yu.l());
        if (c1370Yu.i() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("formats");
            C8953gT.e(C8953gT.d(C8953gT.a(C3338axB.b))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c1370Yu.i());
        } else if (z) {
            interfaceC9069id.e("formats");
            C8994hH<Object> c8994hH2 = C8953gT.m;
            j = C8569dql.j("WEBP", "JPG");
            c8994hH2.e(interfaceC9069id, c9028hp, j);
        }
        interfaceC9069id.e("features");
        C8953gT.c(C3352axP.e, false, 1, null).e(interfaceC9069id, c9028hp, c1370Yu.j());
    }
}
