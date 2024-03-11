package o;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ez  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8879ez {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Mask c(JsonReader jsonReader, C3658bG c3658bG) {
        boolean z;
        jsonReader.e();
        Mask.MaskMode maskMode = null;
        C8584dr c8584dr = null;
        C8665du c8665du = null;
        boolean z2 = false;
        while (jsonReader.f()) {
            String i = jsonReader.i();
            i.hashCode();
            int hashCode = i.hashCode();
            char c = 65535;
            if (hashCode == 111) {
                if (i.equals("o")) {
                    z = false;
                }
                z = true;
            } else if (hashCode == 3588) {
                if (i.equals("pt")) {
                    z = true;
                }
                z = true;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && i.equals("mode")) {
                    z = true;
                }
                z = true;
            } else {
                if (i.equals("inv")) {
                    z = true;
                }
                z = true;
            }
            if (!z) {
                c8665du = C8863ej.a(jsonReader, c3658bG);
            } else if (z) {
                c8584dr = C8863ej.f(jsonReader, c3658bG);
            } else if (z) {
                z2 = jsonReader.h();
            } else if (z) {
                String o2 = jsonReader.o();
                o2.hashCode();
                int hashCode2 = o2.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 != 110) {
                            if (hashCode2 == 115 && o2.equals("s")) {
                                c = 3;
                            }
                        } else if (o2.equals("n")) {
                            c = 2;
                        }
                    } else if (o2.equals("i")) {
                        c = 1;
                    }
                } else if (o2.equals("a")) {
                    c = 0;
                }
                if (c == 0) {
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                } else if (c == 1) {
                    c3658bG.c("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                } else if (c == 2) {
                    maskMode = Mask.MaskMode.MASK_MODE_NONE;
                } else if (c == 3) {
                    maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                } else {
                    C8909fc.b("Unknown mask mode " + i + ". Defaulting to Add.");
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                }
            } else {
                jsonReader.k();
            }
        }
        jsonReader.d();
        return new Mask(maskMode, c8584dr, c8665du, z2);
    }
}
