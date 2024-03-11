package o;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.random.Random;

/* renamed from: o.dru  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8605dru extends C8604drt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dru$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public static final Integer a;
        public static final d b = new d();

        private d() {
        }

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                a = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            a = num2;
        }
    }

    private final boolean c(int i) {
        Integer num = d.a;
        return num == null || num.intValue() >= i;
    }

    @Override // o.C8599dro
    public C8671duf c(MatchResult matchResult, String str) {
        int start;
        int end;
        String group;
        C8632dsu.c((Object) matchResult, "");
        C8632dsu.c((Object) str, "");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        start = matcher.start(str);
        end = matcher.end(str);
        C8654dtp c8654dtp = new C8654dtp(start, end - 1);
        if (c8654dtp.h().intValue() >= 0) {
            group = matcher.group(str);
            C8632dsu.a(group, "");
            return new C8671duf(group, c8654dtp);
        }
        return null;
    }

    @Override // o.C8599dro
    public Random e() {
        return c(34) ? new C8644dtf() : super.e();
    }
}
