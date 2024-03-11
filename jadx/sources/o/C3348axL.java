package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.EditProfileErrorCode;

/* renamed from: o.axL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3348axL implements InterfaceC8949gP<EditProfileErrorCode> {
    public static final C3348axL d = new C3348axL();

    private C3348axL() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public EditProfileErrorCode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return EditProfileErrorCode.c.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, EditProfileErrorCode editProfileErrorCode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) editProfileErrorCode, "");
        interfaceC9069id.d(editProfileErrorCode.c());
    }
}
