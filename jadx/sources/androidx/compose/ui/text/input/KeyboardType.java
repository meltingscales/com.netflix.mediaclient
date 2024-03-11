package androidx.compose.ui.text.input;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Text = m2282constructorimpl(1);
    private static final int Ascii = m2282constructorimpl(2);
    private static final int Number = m2282constructorimpl(3);
    private static final int Phone = m2282constructorimpl(4);
    private static final int Uri = m2282constructorimpl(5);
    private static final int Email = m2282constructorimpl(6);
    private static final int Password = m2282constructorimpl(7);
    private static final int NumberPassword = m2282constructorimpl(8);
    private static final int Decimal = m2282constructorimpl(9);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2282constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2283equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardType) && i == ((KeyboardType) obj).m2287unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2284equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2285hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2283equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2285hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2287unboximpl() {
        return this.value;
    }

    public String toString() {
        return m2286toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2286toStringimpl(int i) {
        return m2284equalsimpl0(i, Text) ? "Text" : m2284equalsimpl0(i, Ascii) ? "Ascii" : m2284equalsimpl0(i, Number) ? "Number" : m2284equalsimpl0(i, Phone) ? "Phone" : m2284equalsimpl0(i, Uri) ? "Uri" : m2284equalsimpl0(i, Email) ? "Email" : m2284equalsimpl0(i, Password) ? "Password" : m2284equalsimpl0(i, NumberPassword) ? "NumberPassword" : m2284equalsimpl0(i, Decimal) ? "Decimal" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getText-PjHm6EE  reason: not valid java name */
        public final int m2295getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getAscii-PjHm6EE  reason: not valid java name */
        public final int m2288getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getNumber-PjHm6EE  reason: not valid java name */
        public final int m2291getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getPhone-PjHm6EE  reason: not valid java name */
        public final int m2294getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getUri-PjHm6EE  reason: not valid java name */
        public final int m2296getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        /* renamed from: getEmail-PjHm6EE  reason: not valid java name */
        public final int m2290getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getPassword-PjHm6EE  reason: not valid java name */
        public final int m2293getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getNumberPassword-PjHm6EE  reason: not valid java name */
        public final int m2292getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getDecimal-PjHm6EE  reason: not valid java name */
        public final int m2289getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }
    }
}
