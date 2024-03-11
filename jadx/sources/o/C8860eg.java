package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8860eg {
    private static final JsonReader.e c = JsonReader.e.d("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7751dE b(JsonReader jsonReader, C3658bG c3658bG, int i) {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        InterfaceC7643dA<PointF, PointF> interfaceC7643dA = null;
        C8611ds c8611ds = null;
        while (jsonReader.f()) {
            int c2 = jsonReader.c(c);
            if (c2 == 0) {
                str = jsonReader.o();
            } else if (c2 == 1) {
                interfaceC7643dA = C8857ed.a(jsonReader, c3658bG);
            } else if (c2 == 2) {
                c8611ds = C8863ej.e(jsonReader, c3658bG);
            } else if (c2 == 3) {
                z2 = jsonReader.h();
            } else if (c2 == 4) {
                z = jsonReader.j() == 3;
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        return new C7751dE(str, interfaceC7643dA, c8611ds, z, z2);
    }
}
