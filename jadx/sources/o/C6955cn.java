package o;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.cn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6955cn {
    private boolean d = false;
    private final Set<c> b = new ArraySet();
    private final Map<String, C8907fa> a = new HashMap();
    private final Comparator<Pair<String, Float>> c = new Comparator<Pair<String, Float>>() { // from class: o.cn.1
        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    /* renamed from: o.cn$c */
    /* loaded from: classes2.dex */
    public interface c {
        void d(float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.d = z;
    }

    public void c(String str, float f) {
        if (this.d) {
            C8907fa c8907fa = this.a.get(str);
            if (c8907fa == null) {
                c8907fa = new C8907fa();
                this.a.put(str, c8907fa);
            }
            c8907fa.e(f);
            if (str.equals("__container")) {
                for (c cVar : this.b) {
                    cVar.d(f);
                }
            }
        }
    }
}
