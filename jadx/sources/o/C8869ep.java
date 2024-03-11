package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.ep  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8869ep implements InterfaceC8846eS<Float> {
    public static final C8869ep d = new C8869ep();

    private C8869ep() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: e */
    public Float d(JsonReader jsonReader, float f) {
        return Float.valueOf(C8876ew.c(jsonReader) * f);
    }
}
