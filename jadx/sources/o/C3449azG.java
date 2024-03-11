package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;

/* renamed from: o.azG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3449azG implements InterfaceC8949gP<SubtitleSize> {
    public static final C3449azG c = new C3449azG();

    private C3449azG() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public SubtitleSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleSize.e.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleSize subtitleSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleSize, "");
        interfaceC9069id.d(subtitleSize.b());
    }
}
