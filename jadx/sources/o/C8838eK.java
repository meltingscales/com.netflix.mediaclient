package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.eK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8838eK implements InterfaceC8846eS<C7880dP> {
    public static final C8838eK d = new C8838eK();
    private static final JsonReader.e b = JsonReader.e.d("c", "v", "i", "o");

    private C8838eK() {
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: e */
    public C7880dP d(JsonReader jsonReader, float f) {
        if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
        }
        jsonReader.e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.f()) {
            int c = jsonReader.c(b);
            if (c == 0) {
                z = jsonReader.h();
            } else if (c == 1) {
                list = C8876ew.a(jsonReader, f);
            } else if (c == 2) {
                list2 = C8876ew.a(jsonReader, f);
            } else if (c == 3) {
                list3 = C8876ew.a(jsonReader, f);
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
        if (jsonReader.l() == JsonReader.Token.END_ARRAY) {
            jsonReader.a();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new C7880dP(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new C8103de(C8853eZ.e(list.get(i2), list3.get(i2)), C8853eZ.e(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new C8103de(C8853eZ.e(list.get(i3), list3.get(i3)), C8853eZ.e(pointF3, list2.get(0)), pointF3));
        }
        return new C7880dP(pointF, z, arrayList);
    }
}
