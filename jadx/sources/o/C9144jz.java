package o;

import com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$1;
import com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$2;
import kotlin.jvm.internal.Ref;

/* renamed from: o.jz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9144jz {
    public static final dyS<InterfaceC7871dIn> c(C9009hW c9009hW) {
        C8632dsu.c((Object) c9009hW, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return dyR.a(dyR.d(new MultipartKt$multipartBodyFlow$1(objectRef, c9009hW, null)), (InterfaceC8612dsa) new MultipartKt$multipartBodyFlow$2(objectRef, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        r15 = o.duD.b((java.lang.CharSequence) r9, new char[]{'='}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String c(java.lang.String r15) {
        /*
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            r1 = 1
            char[] r3 = new char[r1]
            r2 = 59
            r8 = 0
            r3[r8] = r2
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r15
            java.util.List r15 = o.C8684dus.e(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = o.C8570dqm.a(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L24:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r15.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = o.C8684dus.j(r3)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            goto L24
        L3c:
            java.util.Iterator r15 = r2.iterator()
        L40:
            boolean r2 = r15.hasNext()
            r3 = 2
            if (r2 == 0) goto L57
            java.lang.Object r2 = r15.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "boundary="
            boolean r4 = o.C8684dus.c(r4, r5, r8, r3, r0)
            if (r4 == 0) goto L40
            goto L58
        L57:
            r2 = r0
        L58:
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L7e
            char[] r10 = new char[r1]
            r15 = 61
            r10[r8] = r15
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            java.util.List r15 = o.C8684dus.e(r9, r10, r11, r12, r13, r14)
            if (r15 == 0) goto L7e
            java.lang.Object r15 = o.C8570dqm.a(r15, r1)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L7e
            char[] r0 = new char[r3]
            r0 = {x0080: FILL_ARRAY_DATA  , data: [34, 39} // fill-array
            java.lang.String r0 = o.C8684dus.d(r15, r0)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9144jz.c(java.lang.String):java.lang.String");
    }

    public static final boolean e(C9009hW c9009hW) {
        boolean b;
        C8632dsu.c((Object) c9009hW, "");
        String c = C9005hS.c(c9009hW.c(), "Content-Type");
        if (c != null) {
            b = C8691duz.b(c, "multipart/", true);
            if (b) {
                return true;
            }
        }
        return false;
    }
}
