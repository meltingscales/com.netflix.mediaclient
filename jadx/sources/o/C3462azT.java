package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TokenScope;

/* renamed from: o.azT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3462azT implements InterfaceC8949gP<TokenScope> {
    public static final C3462azT a = new C3462azT();

    private C3462azT() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public TokenScope b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return TokenScope.a.e(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, TokenScope tokenScope) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) tokenScope, "");
        interfaceC9069id.d(tokenScope.e());
    }
}
