package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8843eP {
    static JsonReader.e c = JsonReader.e.d("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7878dN e(JsonReader jsonReader, C3658bG c3658bG) {
        String str = null;
        int i = 0;
        boolean z = false;
        C8584dr c8584dr = null;
        while (jsonReader.f()) {
            int c2 = jsonReader.c(c);
            if (c2 == 0) {
                str = jsonReader.o();
            } else if (c2 == 1) {
                i = jsonReader.j();
            } else if (c2 == 2) {
                c8584dr = C8863ej.f(jsonReader, c3658bG);
            } else if (c2 == 3) {
                z = jsonReader.h();
            } else {
                jsonReader.k();
            }
        }
        return new C7878dN(str, i, c8584dr, z);
    }
}
