package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC8997hK;

/* renamed from: o.aCj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1467aCj implements InterfaceC8949gP<C3374axl> {
    public static final C1467aCj b = new C1467aCj();

    private C1467aCj() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3374axl b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3374axl c3374axl) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3374axl, "");
        interfaceC9069id.e(SignupConstants.Field.LANG_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c3374axl.a());
        if (c3374axl.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("background");
            C8953gT.e(C8953gT.d(C8953gT.c(C3446azD.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3374axl.e());
        }
        if (c3374axl.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("deviceGroup");
            C8953gT.e(C8953gT.d(C3444azB.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3374axl.c());
        }
        if (c3374axl.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("text");
            C8953gT.e(C8953gT.d(C8953gT.c(C3448azF.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3374axl.d());
        }
        if (c3374axl.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("window");
            C8953gT.e(C8953gT.d(C8953gT.c(C3452azJ.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3374axl.b());
        }
    }
}
