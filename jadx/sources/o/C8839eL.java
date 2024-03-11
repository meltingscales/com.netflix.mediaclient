package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8839eL {
    private static final JsonReader.e c = JsonReader.e.d("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7879dO b(JsonReader jsonReader, C3658bG c3658bG) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.f()) {
            int c2 = jsonReader.c(c);
            if (c2 == 0) {
                str = jsonReader.o();
            } else if (c2 == 1) {
                z = jsonReader.h();
            } else if (c2 == 2) {
                jsonReader.c();
                while (jsonReader.f()) {
                    InterfaceC7697dC a = C8865el.a(jsonReader, c3658bG);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                jsonReader.a();
            } else {
                jsonReader.k();
            }
        }
        return new C7879dO(str, arrayList, z);
    }
}
