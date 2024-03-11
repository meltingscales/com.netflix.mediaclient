package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.azt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3488azt implements InterfaceC8949gP<C3208aud> {
    public static final C3488azt c = new C3488azt();

    private C3488azt() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3208aud b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3208aud c3208aud) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3208aud, "");
        interfaceC9069id.e("profileGuid");
        C8953gT.p.e(interfaceC9069id, c9028hp, c3208aud.a());
    }
}
