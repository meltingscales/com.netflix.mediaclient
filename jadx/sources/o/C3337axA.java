package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkAlignment;

/* renamed from: o.axA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3337axA implements InterfaceC8949gP<ArtworkAlignment> {
    public static final C3337axA e = new C3337axA();

    private C3337axA() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public ArtworkAlignment b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkAlignment.e.c(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkAlignment artworkAlignment) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkAlignment, "");
        interfaceC9069id.d(artworkAlignment.c());
    }
}
