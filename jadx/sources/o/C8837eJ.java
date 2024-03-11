package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8837eJ implements InterfaceC8846eS<C8913fg> {
    public static final C8837eJ e = new C8837eJ();

    private C8837eJ() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: b */
    public C8913fg d(JsonReader jsonReader, float f) {
        boolean z = jsonReader.l() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.c();
        }
        float g = (float) jsonReader.g();
        float g2 = (float) jsonReader.g();
        while (jsonReader.f()) {
            jsonReader.k();
        }
        if (z) {
            jsonReader.a();
        }
        return new C8913fg((g / 100.0f) * f, (g2 / 100.0f) * f);
    }
}
