package o;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public class djA {
    private static ThreadLocal<Map<String, Cipher>> a = new e();
    private static ThreadLocal<Map<String, Signature>> j = new e();
    private static ThreadLocal<Map<String, MessageDigest>> e = new e();
    private static ThreadLocal<Map<String, Mac>> f = new e();
    private static ThreadLocal<Map<String, KeyFactory>> c = new e();
    private static ThreadLocal<Map<String, KeyAgreement>> b = new e();
    private static ThreadLocal<Map<String, KeyPairGenerator>> d = new e();

    /* loaded from: classes5.dex */
    static class e<T> extends ThreadLocal<Map<String, T>> {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: c */
        public Map<String, T> initialValue() {
            return new HashMap();
        }
    }

    public static Cipher e(String str) {
        Map<String, Cipher> map = a.get();
        if (!map.containsKey(str)) {
            map.put(str, Cipher.getInstance(str));
        }
        return map.get(str);
    }

    public static void c(String str) {
        a.get().remove(str);
    }

    public static Signature d(String str) {
        Map<String, Signature> map = j.get();
        if (!map.containsKey(str)) {
            map.put(str, Signature.getInstance(str));
        }
        return map.get(str);
    }

    public static Mac a(String str) {
        Map<String, Mac> map = f.get();
        if (!map.containsKey(str)) {
            map.put(str, Mac.getInstance(str));
        }
        return map.get(str);
    }
}
