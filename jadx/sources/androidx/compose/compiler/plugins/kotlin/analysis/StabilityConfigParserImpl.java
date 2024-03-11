package androidx.compose.compiler.plugins.kotlin.analysis;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.C8569dql;
import o.C8576dqs;
import o.C8681dup;
import o.C8691duz;
import o.duD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class StabilityConfigParserImpl implements StabilityConfigParser {
    private final Set<FqNameMatcher> stableTypeMatchers;

    @Override // androidx.compose.compiler.plugins.kotlin.analysis.StabilityConfigParser
    public Set<FqNameMatcher> getStableTypeMatchers() {
        return this.stableTypeMatchers;
    }

    public StabilityConfigParserImpl(List<String> list) {
        Set<FqNameMatcher> W;
        CharSequence n;
        boolean i;
        boolean g;
        boolean d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                C8569dql.h();
            }
            String str = (String) obj;
            n = duD.n((CharSequence) str);
            String obj2 = n.toString();
            i = C8691duz.i(obj2, "//", false, 2, null);
            if (!i) {
                g = C8691duz.g(obj2);
                if (g) {
                    continue;
                } else {
                    d = duD.d((CharSequence) obj2, (CharSequence) "//", false, 2, (Object) null);
                    if (d) {
                        throw new IllegalStateException(errorMessage(str, i2, "Comments are only supported at the start of a line.").toString());
                    }
                    try {
                        linkedHashSet.add(new FqNameMatcher(obj2));
                    } catch (IllegalStateException e) {
                        String message = e.getMessage();
                        throw new IllegalStateException(errorMessage(str, i2, message == null ? "" : message).toString());
                    }
                }
            }
            i2++;
        }
        W = C8576dqs.W(linkedHashSet);
        this.stableTypeMatchers = W;
    }

    public final String errorMessage(String str, int i, String str2) {
        String h;
        h = C8681dup.h("\n            Error parsing stability configuration file on line " + i + ".\n            " + str2 + "\n            " + str + "\n        ");
        return h;
    }
}
