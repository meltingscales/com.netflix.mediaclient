package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkIconIdentifier;

/* renamed from: o.axE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3341axE implements InterfaceC8949gP<ArtworkIconIdentifier> {
    public static final C3341axE b = new C3341axE();

    private C3341axE() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public ArtworkIconIdentifier b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkIconIdentifier.c.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkIconIdentifier artworkIconIdentifier) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkIconIdentifier, "");
        interfaceC9069id.d(artworkIconIdentifier.b());
    }
}
