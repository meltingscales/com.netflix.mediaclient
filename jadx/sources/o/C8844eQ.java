package o;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8844eQ {
    private static final JsonReader.e d = JsonReader.e.d("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeTrimPath e(JsonReader jsonReader, C3658bG c3658bG) {
        String str = null;
        ShapeTrimPath.Type type = null;
        C8557dq c8557dq = null;
        C8557dq c8557dq2 = null;
        C8557dq c8557dq3 = null;
        boolean z = false;
        while (jsonReader.f()) {
            int c = jsonReader.c(d);
            if (c == 0) {
                c8557dq = C8863ej.d(jsonReader, c3658bG, false);
            } else if (c == 1) {
                c8557dq2 = C8863ej.d(jsonReader, c3658bG, false);
            } else if (c == 2) {
                c8557dq3 = C8863ej.d(jsonReader, c3658bG, false);
            } else if (c == 3) {
                str = jsonReader.o();
            } else if (c == 4) {
                type = ShapeTrimPath.Type.d(jsonReader.j());
            } else if (c == 5) {
                z = jsonReader.h();
            } else {
                jsonReader.k();
            }
        }
        return new ShapeTrimPath(str, type, c8557dq, c8557dq2, c8557dq3, z);
    }
}
