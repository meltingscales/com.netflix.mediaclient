package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity;

/* renamed from: o.azI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3451azI implements InterfaceC8949gP<SubtitleTextOpacity> {
    public static final C3451azI d = new C3451azI();

    private C3451azI() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public SubtitleTextOpacity b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleTextOpacity.a.b(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleTextOpacity subtitleTextOpacity) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleTextOpacity, "");
        interfaceC9069id.d(subtitleTextOpacity.e());
    }
}
