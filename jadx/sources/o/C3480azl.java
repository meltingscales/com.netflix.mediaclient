package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PlaylistAction;

/* renamed from: o.azl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3480azl implements InterfaceC8949gP<PlaylistAction> {
    public static final C3480azl d = new C3480azl();

    private C3480azl() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public PlaylistAction b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PlaylistAction.c.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PlaylistAction playlistAction) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) playlistAction, "");
        interfaceC9069id.d(playlistAction.d());
    }
}
