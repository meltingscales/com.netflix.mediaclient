package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;

/* renamed from: o.azH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3450azH implements InterfaceC8949gP<SubtitleOpacity> {
    public static final C3450azH e = new C3450azH();

    private C3450azH() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public SubtitleOpacity b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleOpacity.a.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleOpacity subtitleOpacity) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleOpacity, "");
        interfaceC9069id.d(subtitleOpacity.c());
    }
}
