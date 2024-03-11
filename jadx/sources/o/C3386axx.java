package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.axx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3386axx implements InterfaceC8949gP<C2906aos> {
    public static final C3386axx e = new C3386axx();

    private C3386axx() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C2906aos b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2906aos c2906aos) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2906aos, "");
        interfaceC9069id.e("name");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2906aos.b());
        interfaceC9069id.e("avatarKey");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2906aos.e());
        interfaceC9069id.e("isKids");
        C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(c2906aos.d()));
    }
}
