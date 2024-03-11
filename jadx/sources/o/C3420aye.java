package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.MyListGenreFilter;

/* renamed from: o.aye  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3420aye implements InterfaceC8949gP<MyListGenreFilter> {
    public static final C3420aye e = new C3420aye();

    private C3420aye() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public MyListGenreFilter b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return MyListGenreFilter.e.b(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, MyListGenreFilter myListGenreFilter) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) myListGenreFilter, "");
        interfaceC9069id.d(myListGenreFilter.c());
    }
}
