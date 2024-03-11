package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3436ayu implements InterfaceC8949gP<C3039arS> {
    public static final C3436ayu d = new C3436ayu();

    private C3436ayu() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3039arS b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3039arS c3039arS) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3039arS, "");
        if (c3039arS.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("pinotCarousel");
            C8953gT.e(C8953gT.d(C8953gT.c(C3391ayB.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3039arS.e());
        }
        if (c3039arS.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("pinotGallery");
            C8953gT.e(C8953gT.d(C8953gT.c(C3395ayF.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3039arS.b());
        }
        if (c3039arS.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("pinotList");
            C8953gT.e(C8953gT.d(C8953gT.c(C3400ayK.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3039arS.c());
        }
        if (c3039arS.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("pinotSingleItem");
            C8953gT.e(C8953gT.d(C8953gT.c(C3405ayP.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3039arS.d());
        }
    }
}
