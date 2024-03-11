package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.eu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C8874eu {
    static JsonReader.e e = JsonReader.e.d("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<C8910fd<T>> d(JsonReader jsonReader, C3658bG c3658bG, float f, InterfaceC8846eS<T> interfaceC8846eS, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.l() == JsonReader.Token.STRING) {
            c3658bG.c("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.e();
        while (jsonReader.f()) {
            if (jsonReader.c(e) == 0) {
                if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
                    jsonReader.c();
                    if (jsonReader.l() == JsonReader.Token.NUMBER) {
                        arrayList.add(C8875ev.e(jsonReader, c3658bG, f, interfaceC8846eS, false, z));
                    } else {
                        while (jsonReader.f()) {
                            arrayList.add(C8875ev.e(jsonReader, c3658bG, f, interfaceC8846eS, true, z));
                        }
                    }
                    jsonReader.a();
                } else {
                    arrayList.add(C8875ev.e(jsonReader, c3658bG, f, interfaceC8846eS, false, z));
                }
            } else {
                jsonReader.k();
            }
        }
        jsonReader.d();
        d(arrayList);
        return arrayList;
    }

    public static <T> void d(List<? extends C8910fd<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C8910fd<T> c8910fd = list.get(i2);
            i2++;
            C8910fd<T> c8910fd2 = list.get(i2);
            c8910fd.e = Float.valueOf(c8910fd2.g);
            if (c8910fd.d == null && (t = c8910fd2.j) != null) {
                c8910fd.d = t;
                if (c8910fd instanceof C6047cS) {
                    ((C6047cS) c8910fd).e();
                }
            }
        }
        C8910fd<T> c8910fd3 = list.get(i);
        if ((c8910fd3.j == null || c8910fd3.d == null) && list.size() > 1) {
            list.remove(c8910fd3);
        }
    }
}
