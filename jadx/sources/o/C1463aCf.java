package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UiExperienceType;

/* renamed from: o.aCf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1463aCf implements InterfaceC8949gP<UiExperienceType> {
    public static final C1463aCf d = new C1463aCf();

    private C1463aCf() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public UiExperienceType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UiExperienceType.a.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UiExperienceType uiExperienceType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) uiExperienceType, "");
        interfaceC9069id.d(uiExperienceType.d());
    }
}
