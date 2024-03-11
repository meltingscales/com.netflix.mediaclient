package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;

/* renamed from: o.ayd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3419ayd implements InterfaceC8949gP<MyListProgressFilter> {
    public static final C3419ayd a = new C3419ayd();

    private C3419ayd() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public MyListProgressFilter b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return MyListProgressFilter.c.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, MyListProgressFilter myListProgressFilter) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) myListProgressFilter, "");
        interfaceC9069id.d(myListProgressFilter.e());
    }
}
