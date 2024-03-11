package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotEntityKind;

/* renamed from: o.azf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3474azf implements InterfaceC8949gP<PinotEntityKind> {
    public static final C3474azf a = new C3474azf();

    private C3474azf() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public PinotEntityKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotEntityKind.a.e(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotEntityKind pinotEntityKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotEntityKind, "");
        interfaceC9069id.d(pinotEntityKind.c());
    }
}
