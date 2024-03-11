package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.AddProfileErrorCode;

/* renamed from: o.axv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3384axv implements InterfaceC8949gP<AddProfileErrorCode> {
    public static final C3384axv c = new C3384axv();

    private C3384axv() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public AddProfileErrorCode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return AddProfileErrorCode.b.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AddProfileErrorCode addProfileErrorCode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) addProfileErrorCode, "");
        interfaceC9069id.d(addProfileErrorCode.d());
    }
}
