package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;

/* renamed from: o.azm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3481azm implements InterfaceC8949gP<PinotUnifiedEntityKind> {
    public static final C3481azm c = new C3481azm();

    private C3481azm() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public PinotUnifiedEntityKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotUnifiedEntityKind.d.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotUnifiedEntityKind pinotUnifiedEntityKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotUnifiedEntityKind, "");
        interfaceC9069id.d(pinotUnifiedEntityKind.c());
    }
}
