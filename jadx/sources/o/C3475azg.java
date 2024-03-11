package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3475azg implements InterfaceC8949gP<C3166atn> {
    public static final C3475azg b = new C3475azg();

    private C3475azg() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3166atn b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3166atn c3166atn) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3166atn, "");
        interfaceC9069id.e("artworkType");
        C3477azi.c.e(interfaceC9069id, c9028hp, c3166atn.b());
        interfaceC9069id.e("formats");
        C8953gT.a(C3478azj.c).e(interfaceC9069id, c9028hp, c3166atn.c());
        interfaceC9069id.e("dimension");
        C8953gT.c(C3472azd.e, false, 1, null).e(interfaceC9069id, c9028hp, c3166atn.e());
        if (c3166atn.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("features");
            C8953gT.e(C8953gT.d(C8953gT.c(C3473aze.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3166atn.d());
        }
    }
}
