package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.er  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8871er {
    private static final JsonReader.e c = JsonReader.e.d("ch", "size", "w", "style", "fFamily", NotificationFactory.DATA);
    private static final JsonReader.e a = JsonReader.e.d("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8422dl c(JsonReader jsonReader, C3658bG c3658bG) {
        ArrayList arrayList = new ArrayList();
        jsonReader.e();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c2 = 0;
        while (jsonReader.f()) {
            int c3 = jsonReader.c(c);
            if (c3 == 0) {
                c2 = jsonReader.o().charAt(0);
            } else if (c3 == 1) {
                d = jsonReader.g();
            } else if (c3 == 2) {
                d2 = jsonReader.g();
            } else if (c3 == 3) {
                str = jsonReader.o();
            } else if (c3 == 4) {
                str2 = jsonReader.o();
            } else if (c3 == 5) {
                jsonReader.e();
                while (jsonReader.f()) {
                    if (jsonReader.c(a) == 0) {
                        jsonReader.c();
                        while (jsonReader.f()) {
                            arrayList.add((C7879dO) C8865el.a(jsonReader, c3658bG));
                        }
                        jsonReader.a();
                    } else {
                        jsonReader.m();
                        jsonReader.k();
                    }
                }
                jsonReader.d();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        return new C8422dl(arrayList, c2, d, d2, str, str2);
    }
}
