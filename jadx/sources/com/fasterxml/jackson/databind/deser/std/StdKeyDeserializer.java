package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.C9398oo;
import o.C9537rU;
import o.C9542rZ;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class StdKeyDeserializer extends AbstractC9450pn implements Serializable {
    private static final long serialVersionUID = 1;
    protected final FromStringDeserializer<?> b;
    protected final int c;
    protected final Class<?> e;

    protected StdKeyDeserializer(int i, Class<?> cls) {
        this(i, cls, null);
    }

    protected StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this.c = i;
        this.e = cls;
        this.b = fromStringDeserializer;
    }

    public static StdKeyDeserializer b(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.c(cls);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else if (cls == Locale.class) {
            return new StdKeyDeserializer(9, cls, FromStringDeserializer.e(Locale.class));
        } else {
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.e(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }

    @Override // o.AbstractC9450pn
    public Object c(String str, DeserializationContext deserializationContext) {
        if (str == null) {
            return null;
        }
        try {
            Object a = a(str, deserializationContext);
            if (a != null) {
                return a;
            }
            if (C9537rU.t(this.e) && deserializationContext.c().e(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.c(this.e, str, "not a valid representation", new Object[0]);
        } catch (Exception e) {
            return deserializationContext.c(this.e, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), C9537rU.d((Throwable) e));
        }
    }

    protected Object a(String str, DeserializationContext deserializationContext) {
        switch (this.c) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : deserializationContext.c(this.e, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int b = b(str);
                if (b < -128 || b > 255) {
                    return deserializationContext.c(this.e, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) b);
            case 3:
                int b2 = b(str);
                if (b2 < -32768 || b2 > 32767) {
                    return deserializationContext.c(this.e, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) b2);
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                return deserializationContext.c(this.e, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(b(str));
            case 6:
                return Long.valueOf(a(str));
            case 7:
                return Float.valueOf((float) c(str));
            case 8:
                return Double.valueOf(c(str));
            case 9:
                try {
                    return this.b.d(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    return e(deserializationContext, str, e);
                }
            case 10:
                return deserializationContext.e(str);
            case 11:
                return deserializationContext.c(deserializationContext.e(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    return e(deserializationContext, str, e2);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    return e(deserializationContext, str, e3);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    return e(deserializationContext, str, e4);
                }
            case 15:
                try {
                    return deserializationContext.d(str);
                } catch (Exception unused) {
                    return deserializationContext.c(this.e, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this.b.d(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    return e(deserializationContext, str, e5);
                }
            case 17:
                try {
                    return deserializationContext.c().i().c(str);
                } catch (IllegalArgumentException e6) {
                    return e(deserializationContext, str, e6);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this.e);
        }
    }

    protected int b(String str) {
        return Integer.parseInt(str);
    }

    protected long a(String str) {
        return Long.parseLong(str);
    }

    protected double c(String str) {
        return C9398oo.c(str);
    }

    protected Object e(DeserializationContext deserializationContext, String str, Exception exc) {
        return deserializationContext.c(this.e, str, "problem: %s", C9537rU.d((Throwable) exc));
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class StringKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        private static final StringKD d = new StringKD(String.class);
        private static final StringKD a = new StringKD(Object.class);

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, o.AbstractC9450pn
        public Object c(String str, DeserializationContext deserializationContext) {
            return str;
        }

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD c(Class<?> cls) {
            return cls == String.class ? d : cls == Object.class ? a : new StringKD(cls);
        }
    }

    /* loaded from: classes5.dex */
    static final class DelegatingKD extends AbstractC9450pn implements Serializable {
        private static final long serialVersionUID = 1;
        protected final AbstractC9452pp<?> b;
        protected final Class<?> c;

        /* JADX INFO: Access modifiers changed from: protected */
        public DelegatingKD(Class<?> cls, AbstractC9452pp<?> abstractC9452pp) {
            this.c = cls;
            this.b = abstractC9452pp;
        }

        @Override // o.AbstractC9450pn
        public final Object c(String str, DeserializationContext deserializationContext) {
            if (str == null) {
                return null;
            }
            C9542rZ c9542rZ = new C9542rZ(deserializationContext.m(), deserializationContext);
            c9542rZ.i(str);
            try {
                JsonParser m = c9542rZ.m();
                m.Q();
                Object b = this.b.b(m, deserializationContext);
                return b != null ? b : deserializationContext.c(this.c, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.c(this.c, str, "not a valid representation: %s", e.getMessage());
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final EnumResolver a;
        protected EnumResolver d;
        protected final AnnotatedMethod f;
        protected final Enum<?> i;

        /* JADX INFO: Access modifiers changed from: protected */
        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.e());
            this.a = enumResolver;
            this.f = annotatedMethod;
            this.i = enumResolver.d();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object a(String str, DeserializationContext deserializationContext) {
            AnnotatedMethod annotatedMethod = this.f;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.c(str);
                } catch (Exception e) {
                    C9537rU.i(e);
                }
            }
            EnumResolver d = deserializationContext.d(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? d(deserializationContext) : this.a;
            Enum<?> d2 = d.d(str);
            return d2 == null ? (this.i == null || !deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) ? !deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.c(this.e, str, "not one of the values accepted for Enum class: %s", d.c()) : d2 : this.i : d2;
        }

        private EnumResolver d(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this.d;
            if (enumResolver == null) {
                synchronized (this) {
                    enumResolver = EnumResolver.c(this.a.e(), deserializationContext.f());
                    this.d = enumResolver;
                }
            }
            return enumResolver;
        }
    }

    /* loaded from: classes5.dex */
    static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final Constructor<?> d;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.d = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object a(String str, DeserializationContext deserializationContext) {
            return this.d.newInstance(str);
        }
    }

    /* loaded from: classes5.dex */
    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        final Method a;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this.a = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object a(String str, DeserializationContext deserializationContext) {
            return this.a.invoke(null, str);
        }
    }
}
