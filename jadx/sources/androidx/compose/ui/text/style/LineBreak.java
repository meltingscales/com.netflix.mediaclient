package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineBreak m2351boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2352constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2353equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m2360unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2354equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2358hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2353equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m2358hashCodeimpl(this.mask);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2360unboximpl() {
        return this.mask;
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* renamed from: getStrategy-fcGXIks  reason: not valid java name */
    public static final int m2355getStrategyfcGXIks(int i) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i);
        return Strategy.m2363constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc  reason: not valid java name */
    public static final int m2356getStrictnessusljTpc(int i) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i);
        return Strictness.m2372constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c  reason: not valid java name */
    public static final int m2357getWordBreakjp8hJ3c(int i) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i);
        return WordBreak.m2382constructorimpl(unpackByte3);
    }

    public String toString() {
        return m2359toStringimpl(this.mask);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2359toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m2367toStringimpl(m2355getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m2376toStringimpl(m2356getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m2386toStringimpl(m2357getWordBreakjp8hJ3c(i))) + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getSimple-rAG3T2k  reason: not valid java name */
        public final int m2361getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k  reason: not valid java name */
        public final int m2362getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m2371getSimplefcGXIks = companion.m2371getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m2380getNormalusljTpc = companion2.m2380getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m2371getSimplefcGXIks, m2380getNormalusljTpc, companion3.m2388getDefaultjp8hJ3c());
        Simple = m2352constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m2369getBalancedfcGXIks(), companion2.m2379getLooseusljTpc(), companion3.m2389getPhrasejp8hJ3c());
        Heading = m2352constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m2370getHighQualityfcGXIks(), companion2.m2381getStrictusljTpc(), companion3.m2388getDefaultjp8hJ3c());
        Paragraph = m2352constructorimpl(packBytes3);
        Unspecified = m2352constructorimpl(0);
    }

    @drN
    /* loaded from: classes.dex */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m2363constructorimpl(1);
        private static final int HighQuality = m2363constructorimpl(2);
        private static final int Balanced = m2363constructorimpl(3);
        private static final int Unspecified = m2363constructorimpl(0);

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m2363constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2364equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m2368unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2365equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2366hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m2364equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2366hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m2368unboximpl() {
            return this.value;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getSimple-fcGXIks  reason: not valid java name */
            public final int m2371getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getHighQuality-fcGXIks  reason: not valid java name */
            public final int m2370getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getBalanced-fcGXIks  reason: not valid java name */
            public final int m2369getBalancedfcGXIks() {
                return Strategy.Balanced;
            }
        }

        public String toString() {
            return m2367toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2367toStringimpl(int i) {
            return m2365equalsimpl0(i, Simple) ? "Strategy.Simple" : m2365equalsimpl0(i, HighQuality) ? "Strategy.HighQuality" : m2365equalsimpl0(i, Balanced) ? "Strategy.Balanced" : m2365equalsimpl0(i, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    @drN
    /* loaded from: classes.dex */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m2372constructorimpl(1);
        private static final int Loose = m2372constructorimpl(2);
        private static final int Normal = m2372constructorimpl(3);
        private static final int Strict = m2372constructorimpl(4);
        private static final int Unspecified = m2372constructorimpl(0);
        private final int value;

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m2372constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2373equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m2377unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2374equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2375hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m2373equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2375hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m2377unboximpl() {
            return this.value;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getDefault-usljTpc  reason: not valid java name */
            public final int m2378getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc  reason: not valid java name */
            public final int m2379getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc  reason: not valid java name */
            public final int m2380getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc  reason: not valid java name */
            public final int m2381getStrictusljTpc() {
                return Strictness.Strict;
            }
        }

        public String toString() {
            return m2376toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2376toStringimpl(int i) {
            return m2374equalsimpl0(i, Default) ? "Strictness.None" : m2374equalsimpl0(i, Loose) ? "Strictness.Loose" : m2374equalsimpl0(i, Normal) ? "Strictness.Normal" : m2374equalsimpl0(i, Strict) ? "Strictness.Strict" : m2374equalsimpl0(i, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    @drN
    /* loaded from: classes.dex */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m2382constructorimpl(1);
        private static final int Phrase = m2382constructorimpl(2);
        private static final int Unspecified = m2382constructorimpl(0);
        private final int value;

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m2382constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2383equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m2387unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m2384equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2385hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m2383equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2385hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m2387unboximpl() {
            return this.value;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c  reason: not valid java name */
            public final int m2388getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c  reason: not valid java name */
            public final int m2389getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }
        }

        public String toString() {
            return m2386toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2386toStringimpl(int i) {
            return m2384equalsimpl0(i, Default) ? "WordBreak.None" : m2384equalsimpl0(i, Phrase) ? "WordBreak.Phrase" : m2384equalsimpl0(i, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }
    }
}
