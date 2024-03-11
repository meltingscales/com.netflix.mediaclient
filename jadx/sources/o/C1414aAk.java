package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1414aAk implements InterfaceC8949gP<C3273avq> {
    public static final C1414aAk a = new C1414aAk();

    private C1414aAk() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3273avq b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3273avq c3273avq) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3273avq, "");
        if (c3273avq.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("Carousel");
            C8953gT.e(C8953gT.d(C8953gT.c(C1417aAn.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3273avq.c());
        }
        if (c3273avq.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("Gallery");
            C8953gT.e(C8953gT.d(C8953gT.c(C1428aAy.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3273avq.e());
        }
        if (c3273avq.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("List");
            C8953gT.e(C8953gT.d(C8953gT.c(C1439aBi.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3273avq.b());
        }
        if (c3273avq.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("SingleItem");
            C8953gT.e(C8953gT.d(C8953gT.c(aBY.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3273avq.a());
        }
    }
}
