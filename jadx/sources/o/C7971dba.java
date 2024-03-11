package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.Map;

/* renamed from: o.dba  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7971dba {
    private final Map<Integer, C8654dtp> a;
    private final boolean b;
    private final TaskMode e;

    public final Map<Integer, C8654dtp> c() {
        return this.a;
    }

    public final TaskMode d() {
        return this.e;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7971dba) {
            C7971dba c7971dba = (C7971dba) obj;
            return C8632dsu.c(this.a, c7971dba.a) && this.e == c7971dba.e && this.b == c7971dba.b;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        Map<Integer, C8654dtp> map = this.a;
        TaskMode taskMode = this.e;
        boolean z = this.b;
        return "FetchConfig(sectionEntityRangesMap=" + map + ", taskModePreferred=" + taskMode + ", fetchTop10SectionsOnly=" + z + ")";
    }

    public C7971dba(Map<Integer, C8654dtp> map, TaskMode taskMode, boolean z) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) taskMode, "");
        this.a = map;
        this.e = taskMode;
        this.b = z;
    }

    public /* synthetic */ C7971dba(Map map, TaskMode taskMode, boolean z, int i, C8627dsp c8627dsp) {
        this(map, (i & 2) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode, (i & 4) != 0 ? false : z);
    }
}
