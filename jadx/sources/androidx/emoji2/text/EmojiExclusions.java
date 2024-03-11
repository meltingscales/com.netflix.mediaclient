package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
class EmojiExclusions {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<int[]> getEmojiExclusions() {
        if (Build.VERSION.SDK_INT >= 34) {
            return EmojiExclusions_Api34.getExclusions();
        }
        return EmojiExclusions_Reflections.getExclusions();
    }

    /* loaded from: classes5.dex */
    static class EmojiExclusions_Api34 {
        static Set<int[]> getExclusions() {
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class EmojiExclusions_Reflections {
        @SuppressLint({"BanUncheckedReflection"})
        static Set<int[]> getExclusions() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }
}
