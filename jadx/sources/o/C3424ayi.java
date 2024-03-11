package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;

/* renamed from: o.ayi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3424ayi implements InterfaceC8949gP<NGPBeaconControllerOrientation> {
    public static final C3424ayi d = new C3424ayi();

    private C3424ayi() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public NGPBeaconControllerOrientation b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return NGPBeaconControllerOrientation.a.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, NGPBeaconControllerOrientation nGPBeaconControllerOrientation) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) nGPBeaconControllerOrientation, "");
        interfaceC9069id.d(nGPBeaconControllerOrientation.c());
    }
}
