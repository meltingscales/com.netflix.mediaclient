package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8834eG implements InterfaceC8846eS<PointF> {
    public static final C8834eG c = new C8834eG();

    private C8834eG() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: a */
    public PointF d(JsonReader jsonReader, float f) {
        JsonReader.Token l = jsonReader.l();
        if (l == JsonReader.Token.BEGIN_ARRAY) {
            return C8876ew.b(jsonReader, f);
        }
        if (l == JsonReader.Token.BEGIN_OBJECT) {
            return C8876ew.b(jsonReader, f);
        }
        if (l == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.g()) * f, ((float) jsonReader.g()) * f);
            while (jsonReader.f()) {
                jsonReader.k();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + l);
    }
}
