package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8840eM {
    private static final JsonReader.e b = JsonReader.e.d("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7875dK e(JsonReader jsonReader, C3658bG c3658bG) {
        boolean z = false;
        String str = null;
        C8557dq c8557dq = null;
        while (jsonReader.f()) {
            int c = jsonReader.c(b);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                c8557dq = C8863ej.d(jsonReader, c3658bG, true);
            } else if (c == 2) {
                z = jsonReader.h();
            } else {
                jsonReader.k();
            }
        }
        if (z) {
            return null;
        }
        return new C7875dK(str, c8557dq);
    }
}
