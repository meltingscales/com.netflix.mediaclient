package o;

import android.content.Context;
import android.util.Base64;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import java.nio.charset.StandardCharsets;

/* renamed from: o.bMl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3836bMl extends C3833bMi {
    private static int a = 1;
    private static int b = 0;
    private static byte e$ss2$63 = 24;
    private UserAgentImpl c;
    private Context d;

    C3836bMl(Context context, UserAgent userAgent, C1907aSr c1907aSr) {
        super(c1907aSr);
        this.d = context;
        this.c = (UserAgentImpl) userAgent;
    }

    @Override // o.C3833bMi, o.InterfaceC1905aSp
    public Runnable c() {
        return new Runnable() { // from class: o.bMl.4
            @Override // java.lang.Runnable
            public void run() {
                if (C3836bMl.this.c.isReady()) {
                    C1044Mm.e("nf_appboot_error", "User agent is ready, just logout.");
                    C3836bMl.this.c.e(SignOutReason.userForced, true);
                    return;
                }
                C1044Mm.d("nf_appboot_error", "User agent is NOT ready, do brute force.");
                C8054ddD.d(C3836bMl.this.d);
            }
        };
    }

    public static C3836bMl a(Context context, UserAgent userAgent, String str) {
        int i = 2 % 2;
        C1044Mm.e("nf_appboot_error", "ActionID 13 Forcelogout");
        if (C8168dfL.g(str)) {
            str = context.getString(com.netflix.mediaclient.ui.R.o.c);
            if (str.startsWith("'!#+")) {
                int i2 = b + 19;
                a = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                f(str.substring(4), objArr);
                str = ((String) objArr[0]).intern();
                int i4 = b + 45;
                a = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return new C3836bMl(context, userAgent, new C1907aSr("", str, null, new Runnable() { // from class: o.bMl.5
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.d("nf_appboot_error", "ActionID 13, reset...");
            }
        }));
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$63);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
