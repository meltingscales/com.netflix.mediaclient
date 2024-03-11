package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;

/* loaded from: classes5.dex */
public final class dFF {
    private final boolean a;
    private final dEU b;
    private int d;

    public dFF(C7777dEz c7777dEz, dEU deu) {
        C8632dsu.c((Object) c7777dEz, "");
        C8632dsu.c((Object) deu, "");
        this.b = deu;
        this.a = c7777dEz.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o.AbstractC8550dpt<o.dpR, o.dEI> r21, o.InterfaceC8585dra<? super o.dEI> r22) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dFF.a(o.dpt, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dEI c() {
        int i;
        byte c = this.b.c();
        if (this.b.n() == 4) {
            dEU.d(this.b, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.b.b()) {
            arrayList.add(b());
            c = this.b.c();
            if (c != 4) {
                dEU deu = this.b;
                boolean z = c == 9;
                i = deu.d;
                if (!z) {
                    dEU.d(deu, "Expected end of the array or comma", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (c == 8) {
            this.b.c((byte) 9);
        } else if (c == 4) {
            dEU.d(this.b, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new dEB(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dET e(boolean z) {
        String j;
        if (this.a || !z) {
            j = this.b.j();
        } else {
            j = this.b.h();
        }
        String str = j;
        return (z || !C8632dsu.c((Object) str, (Object) "null")) ? new dEJ(str, z, null, 4, null) : dEQ.INSTANCE;
    }

    public final dEI b() {
        dEI d;
        byte n = this.b.n();
        if (n == 1) {
            return e(true);
        }
        if (n == 0) {
            return e(false);
        }
        if (n == 6) {
            int i = this.d + 1;
            this.d = i;
            if (i == 200) {
                d = a();
            } else {
                d = d();
            }
            this.d--;
            return d;
        } else if (n == 8) {
            return c();
        } else {
            dEU.d(this.b, "Cannot read Json element because of unexpected " + dEZ.a(n), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    private final dEI a() {
        return (dEI) C8546dpp.b(new C8548dpr(new JsonTreeReader$readDeepRecursive$1(this, null)), dpR.c);
    }

    private final dEI d() {
        byte c = this.b.c((byte) 6);
        if (this.b.n() == 4) {
            dEU.d(this.b, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.b.b()) {
                break;
            }
            String j = this.a ? this.b.j() : this.b.h();
            this.b.c((byte) 5);
            linkedHashMap.put(j, b());
            c = this.b.c();
            if (c != 4) {
                if (c != 7) {
                    dEU.d(this.b, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (c == 6) {
            this.b.c((byte) 7);
        } else if (c == 4) {
            dEU.d(this.b, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new dEP(linkedHashMap);
    }
}
