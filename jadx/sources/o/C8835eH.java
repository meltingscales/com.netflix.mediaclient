package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8835eH {
    private static final JsonReader.e b = JsonReader.e.d("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7874dJ b(JsonReader jsonReader, C3658bG c3658bG) {
        String str = null;
        C8557dq c8557dq = null;
        C8557dq c8557dq2 = null;
        C8746dx c8746dx = null;
        boolean z = false;
        while (jsonReader.f()) {
            int c = jsonReader.c(b);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                c8557dq = C8863ej.d(jsonReader, c3658bG, false);
            } else if (c == 2) {
                c8557dq2 = C8863ej.d(jsonReader, c3658bG, false);
            } else if (c == 3) {
                c8746dx = C8862ei.e(jsonReader, c3658bG);
            } else if (c == 4) {
                z = jsonReader.h();
            } else {
                jsonReader.k();
            }
        }
        return new C7874dJ(str, c8557dq, c8557dq2, c8746dx, z);
    }
}
