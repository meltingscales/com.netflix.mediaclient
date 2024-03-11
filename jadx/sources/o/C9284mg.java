package o;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.mg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9284mg {
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, String> c;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(Integer.valueOf((int) JSONzip.end), "CursorLeak");
        hashMap.put(512, "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Throwable th) {
        return c(th).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        int lastIndexOf = str.lastIndexOf("violation=");
        if (lastIndexOf != -1) {
            String replace = str.substring(lastIndexOf).replace("violation=", "");
            if (TextUtils.isDigitsOnly(replace)) {
                return c.get(Integer.valueOf(replace));
            }
            return null;
        }
        return null;
    }

    private Throwable c(Throwable th) {
        List<Throwable> b = C9287mj.b(th);
        return b.get(b.size() - 1);
    }
}
