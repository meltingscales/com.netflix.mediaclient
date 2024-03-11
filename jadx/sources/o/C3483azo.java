package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;

/* renamed from: o.azo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3483azo implements InterfaceC8949gP<PlaybackBadge> {
    public static final C3483azo e = new C3483azo();

    private C3483azo() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public PlaybackBadge b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PlaybackBadge.b.c(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PlaybackBadge playbackBadge) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) playbackBadge, "");
        interfaceC9069id.d(playbackBadge.a());
    }
}
