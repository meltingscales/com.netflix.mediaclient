package o;

import kotlin.text.Regex;
import o.FZ;

/* renamed from: o.Fx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0874Fx {
    public static final String b(FZ fz, String str) {
        C8632dsu.c((Object) fz, "");
        C8632dsu.c((Object) str, "");
        if (fz instanceof FZ.c) {
            int length = str.length();
            FZ.c cVar = (FZ.c) fz;
            Integer a = cVar.a();
            if (length >= (a != null ? a.intValue() : 0)) {
                int length2 = str.length();
                Integer d = cVar.d();
                if (length2 <= (d != null ? d.intValue() : Integer.MAX_VALUE)) {
                    return null;
                }
            }
            return fz.b();
        } else if (!(fz instanceof FZ.d) || new Regex(((FZ.d) fz).d()).d(str)) {
            return null;
        } else {
            return fz.b();
        }
    }
}
