package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3457azO implements InterfaceC8949gP<C3229auz> {
    public static final C3457azO d = new C3457azO();

    private C3457azO() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3229auz b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3229auz c3229auz) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3229auz, "");
        interfaceC9069id.e("deviceResolution");
        C3455azM c3455azM = C3455azM.d;
        c3455azM.e(interfaceC9069id, c9028hp, c3229auz.a());
        interfaceC9069id.e("artworkResolution");
        c3455azM.e(interfaceC9069id, c9028hp, c3229auz.b());
        if (c3229auz.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("roundingStrategy");
            C8953gT.e(C8953gT.d(C3453azK.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3229auz.d());
        }
        if (c3229auz.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportsAstcFormat");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3229auz.e());
        }
        if (c3229auz.j() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("useWebPForLargeImages");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3229auz.j());
        }
        if (c3229auz.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("useWebPForAllImages");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3229auz.c());
        }
    }
}
