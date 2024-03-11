package o;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7218cs {
    private final Map<String, String> e = new HashMap();
    private boolean c = true;
    private final LottieAnimationView a = null;
    private final LottieDrawable b = null;

    public String b(String str) {
        return str;
    }

    C7218cs() {
    }

    public String a(String str, String str2) {
        return b(str2);
    }

    public final String e(String str, String str2) {
        if (this.c && this.e.containsKey(str2)) {
            return this.e.get(str2);
        }
        String a = a(str, str2);
        if (this.c) {
            this.e.put(str2, a);
        }
        return a;
    }
}
