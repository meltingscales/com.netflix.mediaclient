package o;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8832eE {
    private static final JsonReader.e c = JsonReader.e.d("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PolystarShape a(JsonReader jsonReader, C3658bG c3658bG, int i) {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        PolystarShape.Type type = null;
        C8557dq c8557dq = null;
        InterfaceC7643dA<PointF, PointF> interfaceC7643dA = null;
        C8557dq c8557dq2 = null;
        C8557dq c8557dq3 = null;
        C8557dq c8557dq4 = null;
        C8557dq c8557dq5 = null;
        C8557dq c8557dq6 = null;
        while (jsonReader.f()) {
            switch (jsonReader.c(c)) {
                case 0:
                    str = jsonReader.o();
                    break;
                case 1:
                    type = PolystarShape.Type.e(jsonReader.j());
                    break;
                case 2:
                    c8557dq = C8863ej.d(jsonReader, c3658bG, false);
                    break;
                case 3:
                    interfaceC7643dA = C8857ed.a(jsonReader, c3658bG);
                    break;
                case 4:
                    c8557dq2 = C8863ej.d(jsonReader, c3658bG, false);
                    break;
                case 5:
                    c8557dq4 = C8863ej.b(jsonReader, c3658bG);
                    break;
                case 6:
                    c8557dq6 = C8863ej.d(jsonReader, c3658bG, false);
                    break;
                case 7:
                    c8557dq3 = C8863ej.b(jsonReader, c3658bG);
                    break;
                case 8:
                    c8557dq5 = C8863ej.d(jsonReader, c3658bG, false);
                    break;
                case 9:
                    z = jsonReader.h();
                    break;
                case 10:
                    if (jsonReader.j() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                default:
                    jsonReader.m();
                    jsonReader.k();
                    break;
            }
        }
        return new PolystarShape(str, type, c8557dq, interfaceC7643dA, c8557dq2, c8557dq3, c8557dq4, c8557dq5, c8557dq6, z, z2);
    }
}
