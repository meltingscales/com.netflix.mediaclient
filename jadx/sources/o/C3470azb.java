package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFallbackStrategy;

/* renamed from: o.azb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3470azb implements InterfaceC8949gP<PinotSearchArtworkFallbackStrategy> {
    public static final C3470azb e = new C3470azb();

    private C3470azb() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public PinotSearchArtworkFallbackStrategy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotSearchArtworkFallbackStrategy.b.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotSearchArtworkFallbackStrategy pinotSearchArtworkFallbackStrategy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotSearchArtworkFallbackStrategy, "");
        interfaceC9069id.d(pinotSearchArtworkFallbackStrategy.e());
    }
}
