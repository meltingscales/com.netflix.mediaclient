package androidx.window.core;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes2.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private final InterfaceC8554dpx bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public /* synthetic */ Version(int i, int i2, int i3, String str, C8627dsp c8627dsp) {
        this(i, i2, i3, str);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((this.major + 527) * 31) + this.minor) * 31) + this.patch;
    }

    private Version(int i, int i2, int i3, String str) {
        InterfaceC8554dpx b;
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.description = str;
        b = dpB.b(new drO<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final BigInteger invoke() {
                return BigInteger.valueOf(Version.this.getMajor()).shiftLeft(32).or(BigInteger.valueOf(Version.this.getMinor())).shiftLeft(32).or(BigInteger.valueOf(Version.this.getPatch()));
            }
        });
        this.bigInteger$delegate = b;
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        C8632dsu.a(value, "");
        return (BigInteger) value;
    }

    public String toString() {
        boolean g;
        g = C8691duz.g(this.description);
        String d = g ^ true ? C8632dsu.d("-", (Object) this.description) : "";
        return this.major + '.' + this.minor + '.' + this.patch + d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        C8632dsu.c((Object) version, "");
        return getBigInteger().compareTo(version.getBigInteger());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Version) {
            Version version = (Version) obj;
            return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version parse(String str) {
            boolean g;
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                        if (valueOf == null) {
                            return null;
                        }
                        int intValue = valueOf.intValue();
                        String group2 = matcher.group(2);
                        Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                        if (valueOf2 == null) {
                            return null;
                        }
                        int intValue2 = valueOf2.intValue();
                        String group3 = matcher.group(3);
                        Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                        if (valueOf3 == null) {
                            return null;
                        }
                        int intValue3 = valueOf3.intValue();
                        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                        C8632dsu.a(group4, "");
                        return new Version(intValue, intValue2, intValue3, group4, null);
                    }
                    return null;
                }
            }
            return null;
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }
}
