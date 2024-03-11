package o;

import com.netflix.android.org.json.HTTP;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetStateEvent;
import com.netflix.msl.MslCryptoException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* renamed from: o.aYw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2073aYw {

    /* renamed from: o.aYw$b */
    /* loaded from: classes3.dex */
    public static class b {
        private String a;
        private boolean b;
        private boolean c;
        private String d;
        private String e;
        private C1999aWc g;
        private String h;
        private TargetStateEvent i;
        private byte[] j;

        public String a() {
            return this.a;
        }

        public C1999aWc c() {
            return this.g;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.d;
        }

        public byte[] f() {
            return this.j;
        }

        public String g() {
            return this.h;
        }

        public boolean h() {
            return this.c;
        }

        public TargetStateEvent i() {
            return this.i;
        }

        public boolean n() {
            return this.b;
        }

        b(byte[] bArr, String str, String str2) {
            this.c = false;
            this.g = null;
            this.b = false;
            this.i = TargetStateEvent.PairSucceed;
            this.j = bArr;
            this.d = str;
            this.h = str2;
        }

        b(byte[] bArr, String str, String str2, C1999aWc c1999aWc) {
            this(bArr, str, str2);
            this.g = c1999aWc;
            if (c1999aWc != null) {
                this.c = true;
                this.i = j() ? TargetStateEvent.RemoteLoginInProgress : TargetStateEvent.RemoteLoginFail;
            }
        }

        b(TargetStateEvent targetStateEvent, String str, String str2) {
            String str3;
            this.c = false;
            this.g = null;
            this.b = false;
            this.i = targetStateEvent;
            this.a = str2;
            str.hashCode();
            if (str.equals("USER_MISMATCH")) {
                str3 = "33";
            } else if (!str.equals("PROFILE_MISMATCH")) {
                this.e = str;
                return;
            } else {
                str3 = "97";
            }
            this.e = str3;
        }

        b(TargetStateEvent targetStateEvent, String str, String str2, boolean z, boolean z2) {
            this(targetStateEvent, str, str2);
            this.c = z;
            this.b = z2;
        }

        public boolean j() {
            C1999aWc c1999aWc;
            return this.c && (c1999aWc = this.g) != null && c1999aWc.c();
        }

        public boolean l() {
            return TargetStateEvent.PairSucceed.equals(this.i) || TargetStateEvent.RemoteLoginInProgress.equals(this.i);
        }

        public String b() {
            return String.format("{errorCode=%s, errorString=%s}", this.e, this.a);
        }
    }

    private static String e(String str, String str2, String str3, AbstractC8393djy abstractC8393djy, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        String h;
        String str4 = "nonce=" + str2 + "\r\ncontrollerurl=" + str + "\r\ncontrolleruuid=" + AbstractC2065aYo.h() + "\r\ncticket=" + str3 + HTTP.CRLF;
        try {
            String str5 = "controlleruuid=" + URLEncoder.encode(h, "UTF-8") + "&nonce=" + str2;
            synchronized (abstractC8393djy) {
                byte[] b2 = abstractC8393djy.b(str5.getBytes(StandardCharsets.UTF_8), abstractC8399dkd, c8404dki);
                str4 = str4 + "pairdatahmac=" + C8427dle.e(b2) + HTTP.CRLF;
            }
        } catch (MslCryptoException e) {
            C1044Mm.e("MdxTargetPairing", "MslCrypto Exception %s", e);
        } catch (UnsupportedEncodingException e2) {
            C1044Mm.e("MdxTargetPairing", "URLEncode Exception %s", e2);
        } catch (Exception e3) {
            C1044Mm.e("MdxTargetPairing", "buildPairingMessage Exception %s", e3);
        }
        return str4;
    }

    public static String a(String str, String str2, String str3, AbstractC8393djy abstractC8393djy, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return "action=pairingrequest\r\nversion=1.0\r\n" + e(str, str2, str3, abstractC8393djy, abstractC8399dkd, c8404dki);
    }

    public static String d(String str, String str2, String str3, String str4, AbstractC8393djy abstractC8393djy, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        String e;
        String str5 = "action=regpairrequest\r\nversion=2.0" + HTTP.CRLF + e(str, str2, str3, abstractC8393djy, abstractC8399dkd, c8404dki);
        try {
            String str6 = "action=regpairrequest&nonce=" + str2;
            synchronized (abstractC8393djy) {
                if (str4 != null) {
                    str5 = str5 + "pin=" + C8427dle.e(abstractC8393djy.a(str4.getBytes(StandardCharsets.UTF_8), abstractC8399dkd, c8404dki)) + HTTP.CRLF;
                    str6 = str6 + "&pin=" + URLEncoder.encode(e, "UTF-8");
                }
                byte[] b2 = abstractC8393djy.b(str6.getBytes(StandardCharsets.UTF_8), abstractC8399dkd, c8404dki);
                str5 = str5 + "hmac=" + C8427dle.e(b2) + HTTP.CRLF;
            }
        } catch (MslCryptoException e2) {
            C1044Mm.e("MdxTargetPairing", "MslCrypto Exception %s", e2);
        } catch (UnsupportedEncodingException e3) {
            C1044Mm.e("MdxTargetPairing", "URLEncode Exception %s", e3);
        } catch (Exception e4) {
            C1044Mm.e("MdxTargetPairing", "buildPairingMessage Exception %s", e4);
        }
        return str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.C2073aYw.b e(org.json.JSONObject r12, o.AbstractC8393djy r13, o.AbstractC8399dkd r14, o.C8404dki r15) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2073aYw.e(org.json.JSONObject, o.djy, o.dkd, o.dki):o.aYw$b");
    }
}
