package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UpdateSubtitleAppearanceErrorCode;

/* renamed from: o.aCg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1464aCg implements InterfaceC8949gP<UpdateSubtitleAppearanceErrorCode> {
    public static final C1464aCg c = new C1464aCg();

    private C1464aCg() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public UpdateSubtitleAppearanceErrorCode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UpdateSubtitleAppearanceErrorCode.d.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UpdateSubtitleAppearanceErrorCode updateSubtitleAppearanceErrorCode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) updateSubtitleAppearanceErrorCode, "");
        interfaceC9069id.d(updateSubtitleAppearanceErrorCode.e());
    }
}
