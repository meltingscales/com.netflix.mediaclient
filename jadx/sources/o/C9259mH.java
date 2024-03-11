package o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: o.mH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9259mH implements InterfaceC9257mF {
    private int a;
    private int b;
    private final Map<String, Object> c;
    private int d;
    private final Map<String, Integer> e;
    private int f;

    public C9259mH() {
        this(null, 1, null);
    }

    @Override // o.InterfaceC9257mF
    public void d(int i, int i2) {
        this.d = i;
        this.a = i2;
    }

    @Override // o.InterfaceC9257mF
    public void e(int i, int i2) {
        this.f = i;
        this.b = i2;
    }

    public C9259mH(Map<String, ? extends Object> map) {
        if (map != null) {
            Map<String, Object> d = dsH.d(map.get("config"));
            this.c = d == null ? new HashMap<>() : d;
            Map<String, Integer> d2 = dsH.d(map.get("callbacks"));
            this.e = d2 == null ? new HashMap<>() : d2;
            Map d3 = dsH.d(map.get("system"));
            if (d3 != null) {
                Number number = (Number) d3.get("stringsTruncated");
                this.f = number == null ? 0 : number.intValue();
                Number number2 = (Number) d3.get("stringCharsTruncated");
                this.b = number2 == null ? 0 : number2.intValue();
                Number number3 = (Number) d3.get("breadcrumbsRemovedCount");
                this.d = number3 == null ? 0 : number3.intValue();
                Number number4 = (Number) d3.get("breadcrumbBytesRemoved");
                this.a = number4 != null ? number4.intValue() : 0;
                return;
            }
            return;
        }
        this.c = new HashMap();
        this.e = new HashMap();
    }

    public /* synthetic */ C9259mH(Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : map);
    }

    @Override // o.InterfaceC9257mF
    public Map<String, Object> b() {
        List i;
        Map d;
        List i2;
        Map<String, Object> d2;
        Map<String, Object> e = e();
        Pair[] pairArr = new Pair[4];
        int i3 = this.f;
        pairArr[0] = i3 > 0 ? dpD.a("stringsTruncated", Integer.valueOf(i3)) : null;
        int i4 = this.b;
        pairArr[1] = i4 > 0 ? dpD.a("stringCharsTruncated", Integer.valueOf(i4)) : null;
        int i5 = this.d;
        pairArr[2] = i5 > 0 ? dpD.a("breadcrumbsRemoved", Integer.valueOf(i5)) : null;
        int i6 = this.a;
        pairArr[3] = i6 > 0 ? dpD.a("breadcrumbBytesRemoved", Integer.valueOf(i6)) : null;
        i = C8569dql.i(pairArr);
        d = dqE.d(i);
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = this.c.isEmpty() ^ true ? dpD.a("config", this.c) : null;
        pairArr2[1] = e.isEmpty() ^ true ? dpD.a("callbacks", e) : null;
        pairArr2[2] = d.isEmpty() ^ true ? dpD.a("system", d) : null;
        i2 = C8569dql.i(pairArr2);
        d2 = dqE.d(i2);
        return d2;
    }

    @Override // o.InterfaceC9257mF
    public void e(Map<String, ? extends Object> map) {
        Map b;
        Map<String, ? extends Object> b2;
        this.c.clear();
        this.c.putAll(map);
        C9213lO c9213lO = C9213lO.e;
        b = dqD.b(dpD.a("config", this.c));
        b2 = dqD.b(dpD.a("usage", b));
        c9213lO.e(b2);
    }

    @Override // o.InterfaceC9257mF
    public void b(Map<String, Integer> map) {
        this.e.clear();
        this.e.putAll(map);
        C9213lO.e.a(map);
    }

    @Override // o.InterfaceC9257mF
    public void a(String str) {
        b(str, 1);
        C9213lO.e.c(str);
    }

    private final void b(String str, int i) {
        int b;
        Integer num = this.e.get(str);
        int intValue = num == null ? 0 : num.intValue();
        Map<String, Integer> map = this.e;
        b = C8657dts.b(intValue + i, 0);
        map.put(str, Integer.valueOf(b));
    }

    private final Map<String, Object> e() {
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.e);
        C9213lO c9213lO = C9213lO.e;
        Map<String, Integer> b = c9213lO.b();
        if (b != null && (num = b.get("ndkOnError")) != null) {
            hashMap.put("ndkOnError", num);
        }
        Map<String, Boolean> a = c9213lO.a();
        if (a != null) {
            hashMap.putAll(a);
        }
        return hashMap;
    }
}
