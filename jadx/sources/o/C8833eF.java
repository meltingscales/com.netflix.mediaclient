package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8833eF {
    private static final JsonReader.e e = JsonReader.e.d("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7859dI e(JsonReader jsonReader, C3658bG c3658bG) {
        String str = null;
        InterfaceC7643dA<PointF, PointF> interfaceC7643dA = null;
        C8611ds c8611ds = null;
        C8557dq c8557dq = null;
        boolean z = false;
        while (jsonReader.f()) {
            int c = jsonReader.c(e);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                interfaceC7643dA = C8857ed.a(jsonReader, c3658bG);
            } else if (c == 2) {
                c8611ds = C8863ej.e(jsonReader, c3658bG);
            } else if (c == 3) {
                c8557dq = C8863ej.b(jsonReader, c3658bG);
            } else if (c == 4) {
                z = jsonReader.h();
            } else {
                jsonReader.k();
            }
        }
        return new C7859dI(str, interfaceC7643dA, c8611ds, c8557dq, z);
    }
}
