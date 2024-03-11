package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
class duL extends duJ {
    public static final DurationUnit e(String str) {
        C8632dsu.c((Object) str, "");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals(SignupConstants.Field.REGION_US)) {
                                    return DurationUnit.e;
                                }
                            } else if (str.equals("ns")) {
                                return DurationUnit.j;
                            }
                        } else if (str.equals("ms")) {
                            return DurationUnit.a;
                        }
                    } else if (str.equals("s")) {
                        return DurationUnit.f;
                    }
                } else if (str.equals("m")) {
                    return DurationUnit.c;
                }
            } else if (str.equals("h")) {
                return DurationUnit.d;
            }
        } else if (str.equals("d")) {
            return DurationUnit.b;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    public static final DurationUnit a(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnit.b;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return DurationUnit.d;
        } else {
            if (c == 'M') {
                return DurationUnit.c;
            }
            if (c == 'S') {
                return DurationUnit.f;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }
}
