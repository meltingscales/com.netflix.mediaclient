package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.WatchStatus;

/* renamed from: o.aCo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1472aCo implements InterfaceC8949gP<WatchStatus> {
    public static final C1472aCo b = new C1472aCo();

    private C1472aCo() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public WatchStatus b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return WatchStatus.e.e(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, WatchStatus watchStatus) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) watchStatus, "");
        interfaceC9069id.d(watchStatus.d());
    }
}
