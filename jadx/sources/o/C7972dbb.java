package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.aRM;

/* renamed from: o.dbb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7972dbb {
    public static final e b = new e(null);
    private static final long e = TimeUnit.HOURS.toMillis(1);
    private String a;
    private final C1567aGb c;
    private final String d;

    @Inject
    public C7972dbb(C1567aGb c1567aGb) {
        C8632dsu.c((Object) c1567aGb, "");
        this.c = c1567aGb;
        String a = c1567aGb.a();
        this.d = "com.netflix.android.upNextFeed" + a;
    }

    private final String b(final Context context) {
        List c;
        String d2;
        if (this.a == null) {
            Collection<aRM> d3 = C1818aPj.d(context);
            C8632dsu.a(d3, "");
            c = C8576dqs.c((Iterable) d3, (Comparator) new b());
            d2 = C8576dqs.d(c, ",", null, null, 0, null, new drM<aRM, CharSequence>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedProfileStorage$getAbConfigString$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final CharSequence invoke(aRM arm) {
                    String d4 = arm.d();
                    int cellId = arm.c(context).getCellId();
                    return d4 + ":" + cellId;
                }
            }, 30, null);
            this.a = d2;
        }
        return this.a;
    }

    public final d d(Context context) {
        C8632dsu.c((Object) context, "");
        String b2 = b(context);
        String string = c(context).getString("session_id_key", null);
        long j = c(context).getLong("session_id_timestamp_key", 0L);
        String string2 = c(context).getString("session_id_ab_key", null);
        if (string == null || j == 0 || !C8632dsu.c((Object) string2, (Object) b2)) {
            return null;
        }
        return new d(string, j);
    }

    public final void d(d dVar, Context context) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) context, "");
        c(context).edit().putString("session_id_key", dVar.a()).putLong("session_id_timestamp_key", dVar.e()).putString("session_id_ab_key", b(context)).apply();
    }

    public final void e(Context context) {
        C8632dsu.c((Object) context, "");
        c(context).edit().remove("session_id_key").remove("session_id_timestamp_key").remove("session_id_ab_key").apply();
    }

    public final void a(Context context) {
        C8632dsu.c((Object) context, "");
        e(context);
    }

    private final SharedPreferences c(Context context) {
        return context.getSharedPreferences(this.d, 0);
    }

    /* renamed from: o.dbb$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private final long c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final long e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            String str = this.e;
            long j = this.c;
            return "UpNextFeedSession(id=" + str + ", creationTimestamp=" + j + ")";
        }

        public d(String str, long j) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = j;
        }
    }

    /* renamed from: o.dbb$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final long b() {
            return C7972dbb.e;
        }
    }

    /* renamed from: o.dbb$b */
    /* loaded from: classes5.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((aRM) t).d(), ((aRM) t2).d());
            return compareValues;
        }
    }
}
