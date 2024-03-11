package o;

import java.net.ProtocolException;
import okhttp3.Protocol;

/* renamed from: o.dHe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7837dHe {
    public static final e b = new e(null);
    public final int a;
    public final String d;
    public final Protocol e;

    public C7837dHe(Protocol protocol, int i, String str) {
        C8632dsu.d(protocol, "");
        C8632dsu.d((Object) str, "");
        this.e = protocol;
        this.a = i;
        this.d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.e == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.d);
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }

    /* renamed from: o.dHe$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final C7837dHe e(String str) {
            boolean i;
            boolean i2;
            Protocol protocol;
            int i3;
            String str2 = "";
            C8632dsu.d((Object) str, "");
            i = C8691duz.i(str, "HTTP/1.", false, 2, null);
            if (i) {
                i3 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                i2 = C8691duz.i(str, "ICY ", false, 2, null);
                if (i2) {
                    protocol = Protocol.HTTP_1_0;
                    i3 = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            int i4 = i3 + 3;
            if (str.length() < i4) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String substring = str.substring(i3, i4);
                C8632dsu.b(substring, "");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i4) {
                    if (str.charAt(i4) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    String substring2 = str.substring(i3 + 4);
                    C8632dsu.b(substring2, "");
                    str2 = substring2;
                }
                return new C7837dHe(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }
}
