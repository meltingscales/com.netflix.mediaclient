package o;

import o.AbstractC8997hK;

/* renamed from: o.abP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2179abP {
    public static final C2179abP a = new C2179abP();

    private C2179abP() {
    }

    public final void d(InterfaceC9069id interfaceC9069id, YX yx, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) yx, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e("sessionId");
        C8953gT.p.e(interfaceC9069id, c9028hp, yx.n());
        interfaceC9069id.e("sectionCursor");
        C8994hH<String> c8994hH = C8953gT.t;
        c8994hH.e(interfaceC9069id, c9028hp, yx.l());
        interfaceC9069id.e("first_sections");
        C8994hH<Integer> c8994hH2 = C8953gT.n;
        c8994hH2.e(interfaceC9069id, c9028hp, yx.i());
        interfaceC9069id.e("entityCursor");
        c8994hH.e(interfaceC9069id, c9028hp, yx.h());
        interfaceC9069id.e("first_entities");
        c8994hH2.e(interfaceC9069id, c9028hp, yx.j());
        interfaceC9069id.e("imageParamsForLocalizedBoxart");
        C8953gT.c(C3475azg.b, false, 1, null).e(interfaceC9069id, c9028hp, yx.k());
        interfaceC9069id.e("imageParamsForGamesIcon");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, yx.m());
        interfaceC9069id.e("imageParamsForPQS");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, yx.o());
        interfaceC9069id.e("imageParamsForCreatorHome");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, yx.g());
        if (yx.r() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportIrmaEntity");
            C8953gT.e(C8953gT.i).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) yx.r());
        } else if (z) {
            interfaceC9069id.e("supportIrmaEntity");
            C8953gT.m.e(interfaceC9069id, c9028hp, Boolean.FALSE);
        }
    }
}
