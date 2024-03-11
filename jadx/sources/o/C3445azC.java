package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleColor;

/* renamed from: o.azC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3445azC implements InterfaceC8949gP<SubtitleColor> {
    public static final C3445azC b = new C3445azC();

    private C3445azC() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public SubtitleColor b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleColor.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleColor subtitleColor) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleColor, "");
        interfaceC9069id.d(subtitleColor.e());
    }
}
