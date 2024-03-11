package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ef  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8859ef {
    private static final JsonReader.e a = JsonReader.e.d("ef");
    private static final JsonReader.e d = JsonReader.e.d("ty", "v");

    C8859ef() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7724dD e(JsonReader jsonReader, C3658bG c3658bG) {
        C7724dD c7724dD = null;
        while (jsonReader.f()) {
            if (jsonReader.c(a) == 0) {
                jsonReader.c();
                while (jsonReader.f()) {
                    C7724dD d2 = d(jsonReader, c3658bG);
                    if (d2 != null) {
                        c7724dD = d2;
                    }
                }
                jsonReader.a();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        return c7724dD;
    }

    private static C7724dD d(JsonReader jsonReader, C3658bG c3658bG) {
        jsonReader.e();
        C7724dD c7724dD = null;
        while (true) {
            boolean z = false;
            while (jsonReader.f()) {
                int c = jsonReader.c(d);
                if (c != 0) {
                    if (c != 1) {
                        jsonReader.m();
                        jsonReader.k();
                    } else if (z) {
                        c7724dD = new C7724dD(C8863ej.b(jsonReader, c3658bG));
                    } else {
                        jsonReader.k();
                    }
                } else if (jsonReader.j() == 0) {
                    z = true;
                }
            }
            jsonReader.d();
            return c7724dD;
        }
    }
}
