package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.et  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8873et {
    private static final JsonReader.e d = JsonReader.e.d("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8315di c(JsonReader jsonReader) {
        jsonReader.e();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (jsonReader.f()) {
            int c = jsonReader.c(d);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                str3 = jsonReader.o();
            } else if (c == 2) {
                str2 = jsonReader.o();
            } else if (c == 3) {
                f = (float) jsonReader.g();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        return new C8315di(str, str3, str2, f);
    }
}
