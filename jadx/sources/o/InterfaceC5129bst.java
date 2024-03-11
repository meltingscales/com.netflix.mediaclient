package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.msl.MslErrorException;
import java.util.Map;

/* renamed from: o.bst  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5129bst extends InterfaceC4938bpN {

    /* renamed from: o.bst$a */
    /* loaded from: classes4.dex */
    public interface a {
        void e(long j);
    }

    /* renamed from: o.bst$d */
    /* loaded from: classes4.dex */
    public interface d {
        void a(String str, Long l);
    }

    C8382djn a();

    C8378djj b();

    C8379djk c();

    boolean c(String str);

    Status d(MslErrorException mslErrorException);

    void d();

    void d(String str, String str2);

    void d(InterfaceC5089bsF interfaceC5089bsF);

    dkV e(String str, String str2);

    AbstractC8399dkd e();

    /* renamed from: o.bst$b */
    /* loaded from: classes4.dex */
    public static class b {
        public String a;
        public String b;
        public String c;
        public Map<String, String> d;
        public String e;

        public b(String str, String str2, Map<String, String> map, String str3, String str4) {
            this.e = str;
            this.b = str2;
            this.d = map;
            this.c = str3;
            this.a = str4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MSLApiUnwrappedParams{ uri=");
            sb.append(this.e);
            sb.append(", method='");
            sb.append(this.b);
            sb.append(", additional headers=");
            Map<String, String> map = this.d;
            if (map != null) {
                boolean z = true;
                if (map.size() >= 1) {
                    sb.append("{");
                    for (String str : this.d.keySet()) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append('=');
                        sb.append(this.d.get(str));
                    }
                    sb.append("}");
                    sb.append(", query='");
                    sb.append(this.c);
                    sb.append(", payload='");
                    sb.append(this.a);
                    sb.append("}");
                    return sb.toString();
                }
            }
            sb.append("null");
            sb.append(", query='");
            sb.append(this.c);
            sb.append(", payload='");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }
    }
}
