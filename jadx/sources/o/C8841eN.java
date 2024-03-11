package o;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8841eN {
    private static final JsonReader.e a = JsonReader.e.d("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7876dL c(JsonReader jsonReader, C3658bG c3658bG) {
        C8665du c8665du = null;
        String str = null;
        C8530dp c8530dp = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.f()) {
            int c = jsonReader.c(a);
            if (c == 0) {
                str = jsonReader.o();
            } else if (c == 1) {
                c8530dp = C8863ej.c(jsonReader, c3658bG);
            } else if (c == 2) {
                c8665du = C8863ej.a(jsonReader, c3658bG);
            } else if (c == 3) {
                z = jsonReader.h();
            } else if (c == 4) {
                i = jsonReader.j();
            } else if (c == 5) {
                z2 = jsonReader.h();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        if (c8665du == null) {
            c8665du = new C8665du(Collections.singletonList(new C8910fd(100)));
        }
        return new C7876dL(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c8530dp, c8665du, z2);
    }
}
