package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.hJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8996hJ<T> implements InterfaceC8949gP<AbstractC8997hK.b<T>> {
    private final InterfaceC8949gP<T> a;

    public C8996hJ(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        this.a = interfaceC8949gP;
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public AbstractC8997hK.b<T> b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        return new AbstractC8997hK.b<>(this.a.b(jsonReader, c9028hp));
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AbstractC8997hK.b<T> bVar) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) bVar, "");
        this.a.e(interfaceC9069id, c9028hp, bVar.a());
    }
}
