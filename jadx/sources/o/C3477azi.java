package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkType;

/* renamed from: o.azi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3477azi implements InterfaceC8949gP<PinotSearchArtworkType> {
    public static final C3477azi c = new C3477azi();

    private C3477azi() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public PinotSearchArtworkType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotSearchArtworkType.d.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotSearchArtworkType pinotSearchArtworkType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotSearchArtworkType, "");
        interfaceC9069id.d(pinotSearchArtworkType.e());
    }
}
