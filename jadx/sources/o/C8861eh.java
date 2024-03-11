package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8861eh {
    private static final JsonReader.e c = JsonReader.e.d("a");
    private static final JsonReader.e b = JsonReader.e.d("fc", "sc", "sw", "t");

    public static C8800dz b(JsonReader jsonReader, C3658bG c3658bG) {
        jsonReader.e();
        C8800dz c8800dz = null;
        while (jsonReader.f()) {
            if (jsonReader.c(c) == 0) {
                c8800dz = c(jsonReader, c3658bG);
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        return c8800dz == null ? new C8800dz(null, null, null, null) : c8800dz;
    }

    private static C8800dz c(JsonReader jsonReader, C3658bG c3658bG) {
        jsonReader.e();
        C8530dp c8530dp = null;
        C8530dp c8530dp2 = null;
        C8557dq c8557dq = null;
        C8557dq c8557dq2 = null;
        while (jsonReader.f()) {
            int c2 = jsonReader.c(b);
            if (c2 == 0) {
                c8530dp = C8863ej.c(jsonReader, c3658bG);
            } else if (c2 == 1) {
                c8530dp2 = C8863ej.c(jsonReader, c3658bG);
            } else if (c2 == 2) {
                c8557dq = C8863ej.b(jsonReader, c3658bG);
            } else if (c2 == 3) {
                c8557dq2 = C8863ej.b(jsonReader, c3658bG);
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        return new C8800dz(c8530dp, c8530dp2, c8557dq, c8557dq2);
    }
}
