package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3342axF implements InterfaceC8949gP<C2865aoD> {
    public static final C3342axF e = new C3342axF();

    private C3342axF() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C2865aoD b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2865aoD c2865aoD) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2865aoD, "");
        if (c2865aoD.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("artworkType");
            C8953gT.e(C3345axI.a).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2865aoD.e());
        }
        if (c2865aoD.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("format");
            C8953gT.e(C8953gT.d(C3338axB.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2865aoD.d());
        }
        if (c2865aoD.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("formats");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.d(C3338axB.b)))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2865aoD.c());
        }
        if (c2865aoD.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("dimension");
            C8953gT.e(C8953gT.d(C8953gT.c(C3388axz.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2865aoD.b());
        }
        if (c2865aoD.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("features");
            C8953gT.e(C8953gT.d(C8953gT.c(C3352axP.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2865aoD.a());
        }
    }
}
