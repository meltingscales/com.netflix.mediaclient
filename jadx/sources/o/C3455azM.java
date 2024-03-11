package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TVUIResolution;

/* renamed from: o.azM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3455azM implements InterfaceC8949gP<TVUIResolution> {
    public static final C3455azM d = new C3455azM();

    private C3455azM() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public TVUIResolution b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return TVUIResolution.b.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, TVUIResolution tVUIResolution) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) tVUIResolution, "");
        interfaceC9069id.d(tVUIResolution.b());
    }
}
