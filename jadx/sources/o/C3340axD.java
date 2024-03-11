package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkGenreBranding;

/* renamed from: o.axD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3340axD implements InterfaceC8949gP<ArtworkGenreBranding> {
    public static final C3340axD a = new C3340axD();

    private C3340axD() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public ArtworkGenreBranding b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkGenreBranding.c.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkGenreBranding artworkGenreBranding) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkGenreBranding, "");
        interfaceC9069id.d(artworkGenreBranding.d());
    }
}
