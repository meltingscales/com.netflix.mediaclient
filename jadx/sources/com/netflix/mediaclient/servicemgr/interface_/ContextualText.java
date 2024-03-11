package com.netflix.mediaclient.servicemgr.interface_;

import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8321diF;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface ContextualText extends InterfaceC8321diF {
    String evidenceKey();

    String text();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class TextContext {
        public static final TextContext a;
        public static final TextContext b;
        public static final TextContext c = new TextContext("Billboard", 0, null, 1, null);
        public static final TextContext d;
        public static final TextContext e;
        private static final /* synthetic */ TextContext[] f;
        public static final TextContext g;
        private static final /* synthetic */ InterfaceC8598drn h;
        public static final TextContext i;
        private final TextContext j;

        private static final /* synthetic */ TextContext[] a() {
            return new TextContext[]{c, b, d, a, i, e, g};
        }

        public static TextContext valueOf(String str) {
            return (TextContext) Enum.valueOf(TextContext.class, str);
        }

        public static TextContext[] values() {
            return (TextContext[]) f.clone();
        }

        public final TextContext e() {
            return this.j;
        }

        private TextContext(String str, int i2, TextContext textContext) {
            this.j = textContext;
        }

        /* synthetic */ TextContext(String str, int i2, TextContext textContext, int i3, C8627dsp c8627dsp) {
            this(str, i2, (i3 & 1) != 0 ? null : textContext);
        }

        static {
            TextContext textContext = new TextContext("DP", 1, null, 1, null);
            b = textContext;
            d = new TextContext("EpisodeList", 2, textContext);
            a = new TextContext("Mdx", 3, textContext);
            i = new TextContext("Postplay", 4, textContext);
            e = new TextContext("PVideo", 5, textContext);
            g = new TextContext("UpNext", 6, textContext);
            TextContext[] a2 = a();
            f = a2;
            h = C8600drp.e(a2);
        }
    }
}
