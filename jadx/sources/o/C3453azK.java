package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TVUIArtworkRoundingStrategy;

/* renamed from: o.azK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3453azK implements InterfaceC8949gP<TVUIArtworkRoundingStrategy> {
    public static final C3453azK b = new C3453azK();

    private C3453azK() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public TVUIArtworkRoundingStrategy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return TVUIArtworkRoundingStrategy.b.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, TVUIArtworkRoundingStrategy tVUIArtworkRoundingStrategy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) tVUIArtworkRoundingStrategy, "");
        interfaceC9069id.d(tVUIArtworkRoundingStrategy.d());
    }
}
