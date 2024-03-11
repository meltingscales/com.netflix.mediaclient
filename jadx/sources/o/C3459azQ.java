package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.azQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3459azQ implements InterfaceC8949gP<C3258avb> {
    public static final C3459azQ d = new C3459azQ();

    private C3459azQ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3258avb b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3258avb c3258avb) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3258avb, "");
        interfaceC9069id.e("abTest");
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c3258avb.d()));
        interfaceC9069id.e("name");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c3258avb.e());
        interfaceC9069id.e("value");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c3258avb.a());
    }
}
