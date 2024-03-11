package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkGravity;

/* renamed from: o.axH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3344axH implements InterfaceC8949gP<ArtworkGravity> {
    public static final C3344axH b = new C3344axH();

    private C3344axH() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public ArtworkGravity b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkGravity.e.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkGravity artworkGravity) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkGravity, "");
        interfaceC9069id.d(artworkGravity.c());
    }
}
