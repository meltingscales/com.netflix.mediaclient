package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ij  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9075ij {
    public static final C9075ij e = new C9075ij();

    private C9075ij() {
    }

    public final List<Object> a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        String str;
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) strArr, "");
        C8632dsu.c((Object) iArr2, "");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = strArr[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
