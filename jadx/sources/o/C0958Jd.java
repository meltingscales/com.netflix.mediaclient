package o;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Jd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0958Jd extends AbstractC0985Ke<Map<String, ? extends String>> {
    public static final C0960Jf b = new C0960Jf(null);
    private final List<String> a;
    private final Map<String, String> c;

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public Map<String, String> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        return this.c;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean d() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0958Jd(List<String> list) {
        super("FetchDeviceSignedInStatusTask", TaskMode.FROM_NETWORK, false, 4, null);
        int d;
        C8632dsu.c((Object) list, "");
        this.c = new LinkedHashMap();
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("uuid:" + ((String) it.next()));
        }
        this.a = arrayList;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b2 = IE.b("devices", this.a, "signedInStatus");
        C8632dsu.a(b2, "");
        list.add(b2);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0989Ki
    public void c(HZ hz) {
        String asString;
        String c;
        C8632dsu.c((Object) hz, "");
        for (String str : this.a) {
            HZ b2 = hz.b("devices", str, "signedInStatus");
            if (b2 != null) {
                C8632dsu.d(b2);
                JsonElement d = ((HH) b2).d();
                if (d != null && (asString = d.getAsString()) != null) {
                    C8632dsu.d((Object) asString);
                    Map<String, String> map = this.c;
                    c = duD.c(str, (CharSequence) "uuid:");
                    map.put(c, asString);
                }
            }
        }
    }
}
