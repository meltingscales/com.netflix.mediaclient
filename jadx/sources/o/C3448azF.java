package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.AbstractC8997hK;

/* renamed from: o.azF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3448azF implements InterfaceC8949gP<C3224aut> {
    public static final C3448azF d = new C3448azF();

    private C3448azF() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3224aut b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3224aut c3224aut) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3224aut, "");
        if (c3224aut.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("color");
            C8953gT.e(C8953gT.d(C3445azC.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.c());
        }
        if (c3224aut.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            C8953gT.e(C8953gT.d(C3451azI.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.e());
        }
        if (c3224aut.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("edgeAttribute");
            C8953gT.e(C8953gT.d(C3443azA.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.a());
        }
        if (c3224aut.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("edgeColor");
            C8953gT.e(C8953gT.d(C3445azC.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.d());
        }
        if (c3224aut.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("size");
            C8953gT.e(C8953gT.d(C3449azG.c)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.b());
        }
        if (c3224aut.h() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("style");
            C8953gT.e(C8953gT.d(C3447azE.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3224aut.h());
        }
    }
}
