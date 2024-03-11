package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;

/* renamed from: o.deJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8113deJ {
    public static final C8113deJ e = new C8113deJ();

    /* renamed from: o.deJ$a */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TaskMode.values().length];
            try {
                iArr[TaskMode.FROM_CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskMode.FROM_CACHE_OR_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    private C8113deJ() {
    }

    public final QueryMode b(TaskMode taskMode) {
        C8632dsu.c((Object) taskMode, "");
        int i = a.b[taskMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return QueryMode.b;
            }
            return QueryMode.d;
        }
        return QueryMode.c;
    }
}
