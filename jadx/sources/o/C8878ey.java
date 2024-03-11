package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.ey  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8878ey implements InterfaceC8846eS<Integer> {
    public static final C8878ey b = new C8878ey();

    private C8878ey() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: a */
    public Integer d(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(C8876ew.c(jsonReader) * f));
    }
}
