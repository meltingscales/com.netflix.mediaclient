package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1428aAy implements InterfaceC8949gP<C3237avG> {
    public static final C1428aAy d = new C1428aAy();

    private C1428aAy() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3237avG b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3237avG c3237avG) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3237avG, "");
        if (c3237avG.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1407aAd.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3237avG.e());
        }
    }
}
