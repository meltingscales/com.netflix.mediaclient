package o;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: o.dun */
/* loaded from: classes5.dex */
public final class C8679dun {
    public static final /* synthetic */ InterfaceC8678dum b(Matcher matcher, int i, CharSequence charSequence) {
        return c(matcher, i, charSequence);
    }

    public static final /* synthetic */ InterfaceC8678dum e(Matcher matcher, CharSequence charSequence) {
        return d(matcher, charSequence);
    }

    public static final InterfaceC8678dum c(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C8680duo(matcher, charSequence);
        }
        return null;
    }

    public static final InterfaceC8678dum d(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C8680duo(matcher, charSequence);
        }
        return null;
    }

    public static final C8654dtp e(MatchResult matchResult) {
        C8654dtp g;
        g = C8657dts.g(matchResult.start(), matchResult.end());
        return g;
    }

    public static final C8654dtp a(MatchResult matchResult, int i) {
        C8654dtp g;
        g = C8657dts.g(matchResult.start(i), matchResult.end(i));
        return g;
    }
}
