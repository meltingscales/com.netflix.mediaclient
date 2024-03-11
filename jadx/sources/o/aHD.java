package o;

import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.Request;

/* loaded from: classes3.dex */
public class aHD {

    /* renamed from: o.aHD$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Request.Priority.values().length];
            a = iArr;
            try {
                iArr[Request.Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Request.Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Request.Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Request.Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int e(Request.Priority priority) {
        int i = AnonymousClass1.a[priority.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        C9862xw.a("unknown Request priority: %s", priority);
                        return 1;
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static final String d(Request request, byte[] bArr) {
        int i = request.i();
        if (i == -1) {
            try {
                return (request.l() == null && bArr == null) ? "GET" : "POST";
            } catch (AuthFailureError e) {
                C1044Mm.e("nf_cronet", "error parsing POST body: %s", e.getMessage());
                return "GET";
            }
        } else if (i == 0) {
            return bArr == null ? "GET" : "POST";
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C9862xw.a("unknown Request priority: %s", request.s());
                    return "GET";
                }
                return "DELETE";
            }
            return "PUT";
        } else {
            return "POST";
        }
    }
}
