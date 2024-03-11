package o;

import android.util.SparseArray;

/* renamed from: o.aMj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1737aMj extends SparseArray<InterfaceC5133bsx> {
    public int e(InterfaceC5133bsx interfaceC5133bsx) {
        C8166dfJ.d();
        int hashCode = interfaceC5133bsx.hashCode();
        super.put(hashCode, interfaceC5133bsx);
        return hashCode;
    }

    public InterfaceC5133bsx a(InterfaceC5133bsx interfaceC5133bsx) {
        C8166dfJ.d();
        int hashCode = interfaceC5133bsx.hashCode();
        InterfaceC5133bsx interfaceC5133bsx2 = get(hashCode);
        super.remove(hashCode);
        return interfaceC5133bsx2;
    }
}
