package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.hC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8989hC<T> implements InterfaceC8949gP<List<T>> {
    private final InterfaceC8949gP<T> e;

    public C8989hC(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        this.e = interfaceC8949gP;
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public List<T> b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        jsonReader.e();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.g()) {
            arrayList.add(this.e.b(jsonReader, c9028hp));
        }
        jsonReader.a();
        return arrayList;
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, List<? extends T> list) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) list, "");
        interfaceC9069id.c();
        for (T t : list) {
            this.e.e(interfaceC9069id, c9028hp, t);
        }
        interfaceC9069id.a();
    }
}
