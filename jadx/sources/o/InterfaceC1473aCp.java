package o;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* renamed from: o.aCp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1473aCp {
    String a();

    Object b(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    List<Pair<String, String>> b();

    Collection<a> c(Context context);

    boolean c();

    boolean e();

    /* renamed from: o.aCp$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final int a;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && this.a == aVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            return "AbTest(testId=" + str + ", cellId=" + i + ")";
        }

        public a(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
        }
    }
}
