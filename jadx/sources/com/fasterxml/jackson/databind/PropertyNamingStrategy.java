package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class PropertyNamingStrategy implements Serializable {
    public static final PropertyNamingStrategy a;
    public static final PropertyNamingStrategy b;
    @Deprecated
    public static final PropertyNamingStrategy c;
    public static final PropertyNamingStrategy d;
    public static final PropertyNamingStrategy e;
    public static final PropertyNamingStrategy h;
    @Deprecated
    public static final PropertyNamingStrategy i;
    public static final PropertyNamingStrategy j;

    public String b(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String c(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String d(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String e(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    static {
        SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();
        j = snakeCaseStrategy;
        UpperCamelCaseStrategy upperCamelCaseStrategy = new UpperCamelCaseStrategy();
        h = upperCamelCaseStrategy;
        a = new PropertyNamingStrategy();
        d = new LowerCaseStrategy();
        e = new KebabCaseStrategy();
        b = new LowerDotCaseStrategy();
        c = snakeCaseStrategy;
        i = upperCamelCaseStrategy;
    }

    /* loaded from: classes5.dex */
    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public abstract String a(String str);

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String b(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return a(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String d(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return a(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String c(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return a(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String e(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return a(str);
        }

        protected static String a(String str, char c) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String a(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        }
    }

    /* loaded from: classes5.dex */
    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String a(String str) {
            char charAt;
            char upperCase;
            if (str == null || str.length() == 0 || charAt == (upperCase = Character.toUpperCase((charAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String a(String str) {
            return str.toLowerCase();
        }
    }

    /* loaded from: classes5.dex */
    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String a(String str) {
            return PropertyNamingStrategyBase.a(str, '-');
        }
    }

    /* loaded from: classes5.dex */
    public static class LowerDotCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String a(String str) {
            return PropertyNamingStrategyBase.a(str, '.');
        }
    }
}
