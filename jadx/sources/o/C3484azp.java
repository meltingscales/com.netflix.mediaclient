package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PuiBillboardModule;

/* renamed from: o.azp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3484azp implements InterfaceC8949gP<PuiBillboardModule> {
    public static final C3484azp d = new C3484azp();

    private C3484azp() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public PuiBillboardModule b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PuiBillboardModule.e.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PuiBillboardModule puiBillboardModule) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) puiBillboardModule, "");
        interfaceC9069id.d(puiBillboardModule.b());
    }
}
