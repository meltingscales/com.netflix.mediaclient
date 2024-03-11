package o;

/* renamed from: o.abG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2170abG {
    public static final C2170abG b = new C2170abG();

    private C2170abG() {
    }

    public final void a(InterfaceC9069id interfaceC9069id, YS ys, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) ys, "");
        C8632dsu.c((Object) c9028hp, "");
        interfaceC9069id.e("entityId");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, ys.i());
        interfaceC9069id.e("sessionId");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, ys.p());
        interfaceC9069id.e("sectionCursor");
        C8994hH<String> c8994hH = C8953gT.t;
        c8994hH.e(interfaceC9069id, c9028hp, ys.n());
        interfaceC9069id.e("first_sections");
        C8994hH<Integer> c8994hH2 = C8953gT.n;
        c8994hH2.e(interfaceC9069id, c9028hp, ys.g());
        interfaceC9069id.e("entityCursor");
        c8994hH.e(interfaceC9069id, c9028hp, ys.h());
        interfaceC9069id.e("first_entities");
        c8994hH2.e(interfaceC9069id, c9028hp, ys.j());
        interfaceC9069id.e("imageParamsForLocalizedBoxart");
        C8953gT.c(C3475azg.b, false, 1, null).e(interfaceC9069id, c9028hp, ys.k());
        interfaceC9069id.e("imageParamsForGamesIcon");
        C3342axF c3342axF = C3342axF.e;
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, ys.m());
        interfaceC9069id.e("imageParamsForPQS");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, ys.l());
        interfaceC9069id.e("imageParamsForCreatorHome");
        C8953gT.c(c3342axF, false, 1, null).e(interfaceC9069id, c9028hp, ys.o());
    }
}
