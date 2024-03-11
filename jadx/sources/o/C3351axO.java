package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.GameOrientation;

/* renamed from: o.axO  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3351axO implements InterfaceC8949gP<GameOrientation> {
    public static final C3351axO a = new C3351axO();

    private C3351axO() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public GameOrientation b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return GameOrientation.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, GameOrientation gameOrientation) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) gameOrientation, "");
        interfaceC9069id.d(gameOrientation.d());
    }
}
