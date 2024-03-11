package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UXConfigPinotUnifiedEntityKind;

/* loaded from: classes3.dex */
public final class aBT implements InterfaceC8949gP<UXConfigPinotUnifiedEntityKind> {
    public static final aBT a = new aBT();

    private aBT() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public UXConfigPinotUnifiedEntityKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UXConfigPinotUnifiedEntityKind.d.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UXConfigPinotUnifiedEntityKind uXConfigPinotUnifiedEntityKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) uXConfigPinotUnifiedEntityKind, "");
        interfaceC9069id.d(uXConfigPinotUnifiedEntityKind.e());
    }
}
