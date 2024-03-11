package o;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.es  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8872es {
    private static final JsonReader.e b = JsonReader.e.d("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final JsonReader.e c = JsonReader.e.d("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7805dG d(JsonReader jsonReader, C3658bG c3658bG) {
        C8665du c8665du = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        C8476dn c8476dn = null;
        C8611ds c8611ds = null;
        C8611ds c8611ds2 = null;
        boolean z = false;
        while (jsonReader.f()) {
            switch (jsonReader.c(b)) {
                case 0:
                    str = jsonReader.o();
                    break;
                case 1:
                    jsonReader.e();
                    int i = -1;
                    while (jsonReader.f()) {
                        int c2 = jsonReader.c(c);
                        if (c2 == 0) {
                            i = jsonReader.j();
                        } else if (c2 == 1) {
                            c8476dn = C8863ej.a(jsonReader, c3658bG, i);
                        } else {
                            jsonReader.m();
                            jsonReader.k();
                        }
                    }
                    jsonReader.d();
                    break;
                case 2:
                    c8665du = C8863ej.a(jsonReader, c3658bG);
                    break;
                case 3:
                    gradientType = jsonReader.j() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    c8611ds = C8863ej.e(jsonReader, c3658bG);
                    break;
                case 5:
                    c8611ds2 = C8863ej.e(jsonReader, c3658bG);
                    break;
                case 6:
                    fillType = jsonReader.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.h();
                    break;
                default:
                    jsonReader.m();
                    jsonReader.k();
                    break;
            }
        }
        return new C7805dG(str, gradientType, fillType, c8476dn, c8665du == null ? new C8665du(Collections.singletonList(new C8910fd(100))) : c8665du, c8611ds, c8611ds2, null, null, z);
    }
}
