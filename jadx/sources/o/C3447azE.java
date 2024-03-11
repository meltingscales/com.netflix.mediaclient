package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;

/* renamed from: o.azE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3447azE implements InterfaceC8949gP<SubtitleFontStyle> {
    public static final C3447azE d = new C3447azE();

    private C3447azE() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public SubtitleFontStyle b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleFontStyle.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleFontStyle subtitleFontStyle) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleFontStyle, "");
        interfaceC9069id.d(subtitleFontStyle.b());
    }
}
