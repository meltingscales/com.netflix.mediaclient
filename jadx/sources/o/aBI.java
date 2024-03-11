package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UXConfigPinotSectionKind;

/* loaded from: classes3.dex */
public final class aBI implements InterfaceC8949gP<UXConfigPinotSectionKind> {
    public static final aBI c = new aBI();

    private aBI() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public UXConfigPinotSectionKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UXConfigPinotSectionKind.a.c(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UXConfigPinotSectionKind uXConfigPinotSectionKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) uXConfigPinotSectionKind, "");
        interfaceC9069id.d(uXConfigPinotSectionKind.b());
    }
}
