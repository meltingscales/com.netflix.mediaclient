package o;

import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aHN {
    public static final e b = new e(null);
    private long a;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private final String h;
    private long i;
    private long j;

    public aHN(String str) {
        C8632dsu.c((Object) str, "");
        this.h = str;
    }

    public final void d(String str, Long l, Long l2, Map<String, ? extends List<String>> map, NetworkRequestType networkRequestType, String str2) {
        Boolean bool;
        long j;
        long j2;
        boolean z;
        synchronized (this) {
            this.c++;
            if (l != null) {
                this.j += l.longValue();
            } else {
                C1044Mm.j("nf_net_stats", "SentByteCount is missing!");
            }
            if (l2 != null) {
                this.f += l2.longValue();
            } else {
                C1044Mm.j("nf_net_stats", "ReceivedByteCount is missing!");
            }
            if (map != null) {
                List<String> list = map.get("content-encoding");
                boolean z2 = false;
                Boolean bool2 = null;
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (String str3 : list) {
                            if (C8632dsu.c((Object) str3, (Object) "gzip")) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                List<String> list2 = map.get("content-encoding");
                if (list2 != null) {
                    if (!list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C8632dsu.c((Object) ((String) it.next()), (Object) "br")) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    bool2 = Boolean.valueOf(z2);
                }
                Boolean bool3 = Boolean.TRUE;
                if (C8632dsu.c(bool, bool3)) {
                    this.a++;
                    if (l2 != null) {
                        this.i += l2.longValue();
                    }
                    C1044Mm.e("nf_net_stats", "nwStatsTotal this=" + hashCode() + " logReason=" + this.h + " " + str + " " + networkRequestType + " gzipCount=" + this.a + " gzipAvg=" + (this.i / j2));
                } else if (C8632dsu.c(bool2, bool3)) {
                    this.e++;
                    if (l2 != null) {
                        this.d += l2.longValue();
                    }
                    C1044Mm.e("nf_net_stats", "nwStatsTotal this=" + hashCode() + " logReason=" + this.h + " " + str + " " + networkRequestType + " brCount=" + this.e + " brAvg= " + (this.d / j));
                } else {
                    this.g++;
                }
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject();
            jSONObject.put("count", this.c);
            jSONObject.put("gzipCount", this.a);
            jSONObject.put("brCount", this.e);
            jSONObject.put("otherCount", this.g);
            jSONObject.put("receivedBytes", this.f);
            jSONObject.put("sentBytes", this.j);
        }
        return jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
