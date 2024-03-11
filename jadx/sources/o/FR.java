package o;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class FR<T> {
    private final T a;
    private final T b;
    private final T c;
    private final T d;
    private final T e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FR) {
            FR fr = (FR) obj;
            return C8632dsu.c(this.e, fr.e) && C8632dsu.c(this.b, fr.b) && C8632dsu.c(this.d, fr.d) && C8632dsu.c(this.c, fr.c) && C8632dsu.c(this.a, fr.a);
        }
        return false;
    }

    public int hashCode() {
        T t = this.e;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        int hashCode2 = t2 == null ? 0 : t2.hashCode();
        T t3 = this.d;
        int hashCode3 = t3 == null ? 0 : t3.hashCode();
        T t4 = this.c;
        int hashCode4 = t4 == null ? 0 : t4.hashCode();
        T t5 = this.a;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (t5 != null ? t5.hashCode() : 0);
    }

    public String toString() {
        T t = this.e;
        T t2 = this.b;
        T t3 = this.d;
        T t4 = this.c;
        T t5 = this.a;
        return "Responsive(extraSmall=" + t + ", small=" + t2 + ", medium=" + t3 + ", large=" + t4 + ", extraLarge=" + t5 + ")";
    }

    public FR(T t, T t2, T t3, T t4, T t5) {
        this.e = t;
        this.b = t2;
        this.d = t3;
        this.c = t4;
        this.a = t5;
    }

    public final T e(Composer composer, int i) {
        List j;
        T t;
        T t2;
        composer.startReplaceableGroup(460679406);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(460679406, i, -1, "com.netflix.clcs.models.Responsive.forScreenSize (Responsive.kt:13)");
        }
        j = C8569dql.j(dpD.a(1920, this.a), dpD.a(1280, this.c), dpD.a(960, this.d), dpD.a(600, this.b), dpD.a(0, this.e));
        int i2 = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp;
        Iterator<T> it = j.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            Pair pair = (Pair) t2;
            if (i2 >= ((Number) pair.d()).intValue() && pair.a() != null) {
                break;
            }
        }
        Pair pair2 = (Pair) t2;
        if (pair2 != null) {
            t = (T) pair2.a();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t;
    }
}
