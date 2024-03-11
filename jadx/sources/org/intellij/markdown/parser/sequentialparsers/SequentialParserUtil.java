package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.html.CommonDefsImplJvmKt;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class SequentialParserUtil {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean isWhitespace(TokensCache.Iterator iterator, int i) {
            C8632dsu.c((Object) iterator, "");
            return CommonDefsImplJvmKt.isWhitespace(iterator.charLookup(i));
        }

        public final boolean isPunctuation(TokensCache.Iterator iterator, int i) {
            C8632dsu.c((Object) iterator, "");
            return CommonDefsImplJvmKt.isPunctuation(iterator.charLookup(i));
        }

        public final List<C8654dtp> filterBlockquotes(TokensCache tokensCache, C8654dtp c8654dtp) {
            C8632dsu.c((Object) tokensCache, "");
            C8632dsu.c((Object) c8654dtp, "");
            ArrayList arrayList = new ArrayList();
            int d = c8654dtp.d();
            int e = c8654dtp.e();
            int i = e - 1;
            if (d <= i) {
                int i2 = d;
                while (true) {
                    int i3 = d + 1;
                    if (C8632dsu.c(new TokensCache.Iterator(tokensCache, d).getType(), MarkdownTokenTypes.BLOCK_QUOTE)) {
                        if (i2 < d) {
                            arrayList.add(new C8654dtp(i2, d - 1));
                        }
                        i2 = i3;
                    }
                    if (d == i) {
                        break;
                    }
                    d = i3;
                }
                d = i2;
            }
            if (d < e) {
                arrayList.add(new C8654dtp(d, e));
            }
            return arrayList;
        }
    }
}
