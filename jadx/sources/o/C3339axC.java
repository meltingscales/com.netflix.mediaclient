package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkFallbackStrategy;

/* renamed from: o.axC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3339axC implements InterfaceC8949gP<ArtworkFallbackStrategy> {
    public static final C3339axC d = new C3339axC();

    private C3339axC() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public ArtworkFallbackStrategy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkFallbackStrategy.a.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkFallbackStrategy artworkFallbackStrategy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkFallbackStrategy, "");
        interfaceC9069id.d(artworkFallbackStrategy.c());
    }
}
