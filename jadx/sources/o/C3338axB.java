package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;

/* renamed from: o.axB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3338axB implements InterfaceC8949gP<ArtworkFormat> {
    public static final C3338axB b = new C3338axB();

    private C3338axB() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public ArtworkFormat b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkFormat.a.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkFormat artworkFormat) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkFormat, "");
        interfaceC9069id.d(artworkFormat.b());
    }
}
