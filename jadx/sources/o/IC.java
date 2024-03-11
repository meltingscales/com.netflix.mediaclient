package o;

import com.google.gson.Gson;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class IC implements InterfaceC1242Ud {
    public static final InterfaceC1242Ud b = new IC(new ArrayList(0));
    private final List a;

    @Override // o.InterfaceC1242Ud
    public List<Object> d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IC(List list) {
        this.a = list;
    }

    @Override // o.InterfaceC1242Ud
    public int e() {
        return this.a.size();
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud b(InterfaceC1242Ud interfaceC1242Ud) {
        ArrayList arrayList = new ArrayList(interfaceC1242Ud.d());
        arrayList.addAll(this.a);
        return new IC(arrayList);
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud d(InterfaceC1242Ud interfaceC1242Ud) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.addAll(interfaceC1242Ud.d());
        return new IC(arrayList);
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud c(Object obj) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.add(IE.b(obj));
        return new IC(arrayList);
    }

    @Override // o.InterfaceC1242Ud
    public int b() {
        int size;
        int size2 = this.a.size();
        int i = 1;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = this.a.get(i2);
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Integer num = (Integer) map.get(NetflixActivity.EXTRA_FROM);
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) map.get("to");
                size = ((num2 != null ? num2.intValue() : 0) - intValue) + 1;
            } else if (obj instanceof List) {
                size = ((List) obj).size();
            }
            i *= size;
        }
        return i;
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud e(int i, Object obj) {
        List c = IM.c(d()).c();
        c.set(i, obj);
        return new IC(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020e, code lost:
        if (r10 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0210, code lost:
        if (r8 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0212, code lost:
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0219, code lost:
        r8 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021d, code lost:
        r5[r9] = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0223, code lost:
        r8 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0225, code lost:
        if (r8 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022b, code lost:
        if (r8.equals(r13) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022d, code lost:
        r5[r9] = java.lang.Integer.valueOf(r5[r9].intValue() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023c, code lost:
        r8 = null;
        r5[r9] = null;
        r4[r9] = java.lang.Integer.valueOf(r4[r9].intValue() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024e, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
        r10 = r8;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
        r4[r7] = r6[r7];
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
        if (r9 < 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015f, code lost:
        r14 = r4[r9].intValue();
        r15 = r1.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
        if ((r15 instanceof java.util.List) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016d, code lost:
        r15 = ((java.util.List) r15).get(r4[r9].intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
        if ((r15 instanceof java.util.Map) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
        r15 = (java.util.Map) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0180, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
        if (r15 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0183, code lost:
        r10 = (java.lang.Integer) r15.get("to");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
        if (r15 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018d, code lost:
        r15 = (java.lang.Integer) r15.get(com.netflix.mediaclient.android.activity.NetflixActivity.EXTRA_FROM);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019b, code lost:
        if (r14 != r6[r9].intValue()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019d, code lost:
        r8 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019f, code lost:
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a5, code lost:
        if (r8.equals(r10) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
        r4[r9] = 0;
        r14 = r1.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if ((r14 instanceof java.util.List) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b6, code lost:
        ((java.util.List) r14).get(r4[r9].intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
        if (r15 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
        r8 = r15.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ca, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cb, code lost:
        r8 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d0, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d1, code lost:
        r5[r9] = r8;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d8, code lost:
        if (r9 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01da, code lost:
        r8 = r1.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e0, code lost:
        if ((r8 instanceof java.util.List) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e2, code lost:
        r8 = ((java.util.List) r8).get(r4[r9].intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
        r10 = r8 instanceof java.util.Map;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f0, code lost:
        if (r10 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f2, code lost:
        r8 = (java.util.Map) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f5, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f6, code lost:
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f8, code lost:
        r13 = (java.lang.Integer) r8.get("to");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ff, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0200, code lost:
        if (r10 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0202, code lost:
        r8 = (java.lang.Integer) r8.get(com.netflix.mediaclient.android.activity.NetflixActivity.EXTRA_FROM);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0209, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020a, code lost:
        if (r13 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020c, code lost:
        r10 = r5[r9];
     */
    @Override // o.InterfaceC1242Ud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashSet<o.InterfaceC1242Ud> c() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IC.c():java.util.LinkedHashSet");
    }

    public String toString() {
        return ((Gson) C1332Xp.b(Gson.class)).toJson(this.a);
    }

    public Object clone() {
        return new IC(new ArrayList(this.a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof InterfaceC1242Ud)) {
            return this.a.equals(((InterfaceC1242Ud) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // o.InterfaceC1242Ud
    public boolean g() {
        return this.a.size() == 0;
    }

    @Override // o.InterfaceC1242Ud
    public String i() {
        StringBuilder sb = new StringBuilder();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.a.get(i);
            if (!(obj instanceof String)) {
                return null;
            }
            sb.append(obj);
            if (i < size - 1) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud e(int i) {
        return a(i, this.a.size() - i);
    }

    @Override // o.InterfaceC1242Ud
    public InterfaceC1242Ud a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = i; i3 < i + i2; i3++) {
            arrayList.add(this.a.get(i3));
        }
        return new IC(arrayList);
    }

    @Override // o.InterfaceC1242Ud
    public String a() {
        if (this.a.size() > 0) {
            return this.a.get(0).toString();
        }
        return null;
    }
}
