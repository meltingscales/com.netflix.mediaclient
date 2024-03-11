package o;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.en  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8867en implements InterfaceC8846eS<Integer> {
    public static final C8867en d = new C8867en();

    private C8867en() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: b */
    public Integer d(JsonReader jsonReader, float f) {
        boolean z = jsonReader.l() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.c();
        }
        double g = jsonReader.g();
        double g2 = jsonReader.g();
        double g3 = jsonReader.g();
        double g4 = jsonReader.l() == JsonReader.Token.NUMBER ? jsonReader.g() : 1.0d;
        if (z) {
            jsonReader.a();
        }
        if (g <= 1.0d && g2 <= 1.0d && g3 <= 1.0d) {
            g *= 255.0d;
            g2 *= 255.0d;
            g3 *= 255.0d;
            if (g4 <= 1.0d) {
                g4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) g4, (int) g, (int) g2, (int) g3));
    }
}
