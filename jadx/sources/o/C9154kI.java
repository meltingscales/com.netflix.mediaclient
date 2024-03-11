package o;

import com.bugsnag.android.ErrorType;
import java.io.BufferedOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;

/* renamed from: o.kI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9154kI {
    public static final Map<String, String> c(C9230lf c9230lf) {
        Map i;
        Map<String, String> l;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = dpD.a("Bugsnag-Payload-Version", "4.0");
        String a = c9230lf.a();
        if (a == null) {
            a = "";
        }
        pairArr[1] = dpD.a("Bugsnag-Api-Key", a);
        C9302my c9302my = C9302my.d;
        pairArr[2] = dpD.a("Bugsnag-Sent-At", C9302my.a(new Date()));
        pairArr[3] = dpD.a("Content-Type", "application/json");
        i = dqE.i(pairArr);
        Set<ErrorType> d = c9230lf.d();
        if (!d.isEmpty()) {
            i.put("Bugsnag-Stacktrace-Types", c(d));
        }
        l = dqE.l(i);
        return l;
    }

    public static final String c(Set<? extends ErrorType> set) {
        int d;
        if (set.isEmpty()) {
            return "";
        }
        Set<? extends ErrorType> set2 = set;
        d = C8572dqo.d(set2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (ErrorType errorType : set2) {
            arrayList.add(errorType.getDesc$bugsnag_android_core_release());
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        String str = it.next();
        while (it.hasNext()) {
            str = ((String) str) + ',' + ((String) it.next());
        }
        return (String) str;
    }

    public static final Map<String, String> c(String str) {
        Map<String, String> c;
        Pair a = dpD.a("Bugsnag-Payload-Version", "1.0");
        Pair a2 = dpD.a("Bugsnag-Api-Key", str);
        Pair a3 = dpD.a("Content-Type", "application/json");
        C9302my c9302my = C9302my.d;
        c = dqE.c(a, a2, a3, dpD.a("Bugsnag-Sent-At", C9302my.a(new Date())));
        return c;
    }

    public static final String d(byte[] bArr) {
        byte[] digest;
        try {
            Result.c cVar = Result.e;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            StringBuilder sb = new StringBuilder("sha1 ");
            DigestOutputStream digestOutputStream = new DigestOutputStream(new C9212lN(), messageDigest);
            BufferedOutputStream bufferedOutputStream = digestOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) digestOutputStream : new BufferedOutputStream(digestOutputStream, 8192);
            try {
                bufferedOutputStream.write(bArr);
                dpR dpr = dpR.c;
                C8608drx.a(bufferedOutputStream, null);
                for (byte b : messageDigest.digest()) {
                    dsE dse = dsE.b;
                    String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    C8632dsu.a(format, "");
                    sb.append(format);
                }
                dpR dpr2 = dpR.c;
                C8608drx.a(digestOutputStream, null);
                return sb.toString();
            } finally {
            }
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            if (Result.d(Result.e(C8556dpz.a(th))) != null) {
                return null;
            }
            throw new KotlinNothingValueException();
        }
    }
}
