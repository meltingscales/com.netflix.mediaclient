package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.AbstractC8997hK;

/* renamed from: o.axz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3388axz implements InterfaceC8949gP<C2864aoC> {
    public static final C3388axz b = new C3388axz();

    private C3388axz() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C2864aoC b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2864aoC c2864aoC) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2864aoC, "");
        if (c2864aoC.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.e());
        }
        if (c2864aoC.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.b());
        }
        if (c2864aoC.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("matchStrategy");
            C8953gT.e(C8953gT.d(C3349axM.e)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.c());
        }
        if (c2864aoC.h() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("widthVariance");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.h());
        }
        if (c2864aoC.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("heightVariance");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.d());
        }
        if (c2864aoC.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("scaleStrategy");
            C8953gT.e(C8953gT.d(C3491azw.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2864aoC.a());
        }
    }
}
