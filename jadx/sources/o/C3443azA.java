package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;

/* renamed from: o.azA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3443azA implements InterfaceC8949gP<SubtitleEdgeAttribute> {
    public static final C3443azA d = new C3443azA();

    private C3443azA() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public SubtitleEdgeAttribute b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleEdgeAttribute.a.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleEdgeAttribute subtitleEdgeAttribute) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleEdgeAttribute, "");
        interfaceC9069id.d(subtitleEdgeAttribute.c());
    }
}
