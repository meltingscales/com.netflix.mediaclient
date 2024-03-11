package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;

/* renamed from: o.axI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3345axI implements InterfaceC8949gP<ArtworkType> {
    public static final C3345axI a = new C3345axI();

    private C3345axI() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public ArtworkType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkType.r.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkType artworkType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkType, "");
        interfaceC9069id.d(artworkType.e());
    }
}
