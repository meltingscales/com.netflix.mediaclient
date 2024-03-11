package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.azx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3492azx implements InterfaceC8949gP<C3222aur> {
    public static final C3492azx d = new C3492azx();

    private C3492azx() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3222aur b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3222aur c3222aur) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3222aur, "");
        interfaceC9069id.e("profileGuid");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c3222aur.b());
        interfaceC9069id.e("profileAccessPin");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c3222aur.a());
    }
}
