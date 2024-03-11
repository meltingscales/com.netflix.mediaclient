package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerType;

/* renamed from: o.ayl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3427ayl implements InterfaceC8949gP<NGPBeaconControllerType> {
    public static final C3427ayl b = new C3427ayl();

    private C3427ayl() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public NGPBeaconControllerType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return NGPBeaconControllerType.c.a(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, NGPBeaconControllerType nGPBeaconControllerType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) nGPBeaconControllerType, "");
        interfaceC9069id.d(nGPBeaconControllerType.e());
    }
}
