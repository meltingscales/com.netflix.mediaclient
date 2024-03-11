package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFormat;

/* renamed from: o.azj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3478azj implements InterfaceC8949gP<PinotSearchArtworkFormat> {
    public static final C3478azj c = new C3478azj();

    private C3478azj() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public PinotSearchArtworkFormat b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotSearchArtworkFormat.a.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotSearchArtworkFormat pinotSearchArtworkFormat) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotSearchArtworkFormat, "");
        interfaceC9069id.d(pinotSearchArtworkFormat.e());
    }
}
