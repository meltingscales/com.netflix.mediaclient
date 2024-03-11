package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.MyListSort;

/* renamed from: o.ayf  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3421ayf implements InterfaceC8949gP<MyListSort> {
    public static final C3421ayf d = new C3421ayf();

    private C3421ayf() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public MyListSort b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return MyListSort.e.b(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, MyListSort myListSort) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) myListSort, "");
        interfaceC9069id.d(myListSort.a());
    }
}
