package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ArtworkTone;

/* renamed from: o.axG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3343axG implements InterfaceC8949gP<ArtworkTone> {
    public static final C3343axG b = new C3343axG();

    private C3343axG() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public ArtworkTone b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ArtworkTone.d.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ArtworkTone artworkTone) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) artworkTone, "");
        interfaceC9069id.d(artworkTone.a());
    }
}
