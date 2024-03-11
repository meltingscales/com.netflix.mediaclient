package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayh  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3423ayh implements InterfaceC8949gP<C2990aqW> {
    public static final C3423ayh a = new C3423ayh();

    private C3423ayh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C2990aqW b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2990aqW c2990aqW) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2990aqW, "");
        if (c2990aqW.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("genreFilter");
            C8953gT.e(C8953gT.d(C3420aye.e)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2990aqW.a());
        }
        if (c2990aqW.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("progressFilter");
            C8953gT.e(C8953gT.d(C3419ayd.a)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2990aqW.e());
        }
        if (c2990aqW.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("sort");
            C8953gT.e(C8953gT.d(C3421ayf.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2990aqW.b());
        }
        if (c2990aqW.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("first");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2990aqW.d());
        }
        if (c2990aqW.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("after");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2990aqW.c());
        }
    }
}
