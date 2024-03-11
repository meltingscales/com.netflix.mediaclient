package androidx.navigation;

import android.os.Bundle;
import o.C8627dsp;
import o.C8632dsu;
import o.C8666dua;
import o.C8684dus;

/* loaded from: classes5.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final Companion Companion = new Companion(null);
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer";
        }

        @Override // androidx.navigation.NavType
        public /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        public void put(Bundle bundle, String str, int i) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putInt(str, i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) {
            int parseInt;
            C8632dsu.c((Object) str, "");
            if (C8684dus.c(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C8632dsu.a(substring, "");
                parseInt = Integer.parseInt(substring, C8666dua.e(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }
    };
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "reference";
        }

        @Override // androidx.navigation.NavType
        public /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        public void put(Bundle bundle, String str, int i) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putInt(str, i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) {
            int parseInt;
            C8632dsu.c((Object) str, "");
            if (C8684dus.c(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C8632dsu.a(substring, "");
                parseInt = Integer.parseInt(substring, C8666dua.e(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }
    };
    public static final NavType<int[]> IntArrayType = new NavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, int[] iArr) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putIntArray(str, iArr);
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String str) {
            C8632dsu.c((Object) str, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        @Override // androidx.navigation.NavType
        public /* synthetic */ void put(Bundle bundle, String str, Long l) {
            put(bundle, str, l.longValue());
        }

        public void put(Bundle bundle, String str, long j) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putLong(str, j);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String str) {
            String str2;
            long parseLong;
            C8632dsu.c((Object) str, "");
            if (C8684dus.b(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                C8632dsu.a(str2, "");
            } else {
                str2 = str;
            }
            if (C8684dus.c(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                C8632dsu.a(substring, "");
                parseLong = Long.parseLong(substring, C8666dua.e(16));
            } else {
                parseLong = Long.parseLong(str2);
            }
            return Long.valueOf(parseLong);
        }
    };
    public static final NavType<long[]> LongArrayType = new NavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, long[] jArr) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putLongArray(str, jArr);
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String str) {
            C8632dsu.c((Object) str, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float";
        }

        @Override // androidx.navigation.NavType
        public /* synthetic */ void put(Bundle bundle, String str, Float f) {
            put(bundle, str, f.floatValue());
        }

        public void put(Bundle bundle, String str, float f) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putFloat(str, f);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String str) {
            C8632dsu.c((Object) str, "");
            return Float.valueOf(Float.parseFloat(str));
        }
    };
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, float[] fArr) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putFloatArray(str, fArr);
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String str) {
            C8632dsu.c((Object) str, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean";
        }

        @Override // androidx.navigation.NavType
        public /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        public void put(Bundle bundle, String str, boolean z) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putBoolean(str, z);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (Boolean) bundle.get(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String str) {
            boolean z;
            C8632dsu.c((Object) str, "");
            if (C8632dsu.c((Object) str, (Object) "true")) {
                z = true;
            } else if (!C8632dsu.c((Object) str, (Object) "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    };
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, boolean[] zArr) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putBooleanArray(str, zArr);
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String str) {
            C8632dsu.c((Object) str, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string";
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String str) {
            C8632dsu.c((Object) str, "");
            return str;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, String str2) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putString(str, str2);
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (String) bundle.get(str);
        }
    };
    public static final NavType<String[]> StringArrayType = new NavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, String[] strArr) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            bundle.putStringArray(str, strArr);
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String str) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) str, "");
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String str) {
            C8632dsu.c((Object) str, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    };

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public abstract T parseValue(String str);

    public abstract void put(Bundle bundle, String str, T t);

    public NavType(boolean z) {
        this.isNullableAllowed = z;
    }

    public final T parseAndPut(Bundle bundle, String str, String str2) {
        C8632dsu.c((Object) bundle, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        T parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }

    public String toString() {
        return getName();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
