package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.RemoveProfileErrorCode;

/* renamed from: o.azu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3489azu implements InterfaceC8949gP<RemoveProfileErrorCode> {
    public static final C3489azu d = new C3489azu();

    private C3489azu() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public RemoveProfileErrorCode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return RemoveProfileErrorCode.e.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, RemoveProfileErrorCode removeProfileErrorCode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) removeProfileErrorCode, "");
        interfaceC9069id.d(removeProfileErrorCode.c());
    }
}
