package androidx.compose.compiler.plugins.kotlin.analysis;

import java.io.File;
import java.util.List;
import java.util.Set;
import o.C8569dql;
import o.drC;

/* loaded from: classes5.dex */
public interface StabilityConfigParser {
    public static final Companion Companion = Companion.$$INSTANCE;

    Set<FqNameMatcher> getStableTypeMatchers();

    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final StabilityConfigParser fromFile(String str) {
            List e;
            List i;
            List i2;
            if (str == null) {
                i2 = C8569dql.i();
                return new StabilityConfigParserImpl(i2);
            }
            File file = new File(str);
            if (file.exists()) {
                e = drC.e(file, null, 1, null);
                return new StabilityConfigParserImpl(e);
            }
            i = C8569dql.i();
            return new StabilityConfigParserImpl(i);
        }
    }
}
