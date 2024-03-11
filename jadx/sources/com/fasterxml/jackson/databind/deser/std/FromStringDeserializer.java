package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o.C8543dpm;
import o.C9448pl;
import o.C9537rU;

/* loaded from: classes5.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {
    public static Class<?>[] j() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T d(String str, DeserializationContext deserializationContext);

    protected T h() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static Std e(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else if (cls == InetSocketAddress.class) {
            i = 12;
        } else if (cls != StringBuilder.class) {
            return null;
        } else {
            i = 13;
        }
        return new Std(cls, i);
    }

    @Override // o.AbstractC9452pp
    public T b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String L = jsonParser.L();
        if (L != null) {
            if (L.length() != 0) {
                String trim = L.trim();
                if (trim.length() != 0) {
                    try {
                        return d(trim, deserializationContext);
                    } catch (IllegalArgumentException | MalformedURLException e) {
                        String message = e.getMessage();
                        String str = "not a valid textual representation";
                        if (message != null) {
                            str = "not a valid textual representation, problem: " + message;
                        }
                        JsonMappingException c = deserializationContext.c(trim, this.B, str);
                        c.initCause(e);
                        throw c;
                    }
                }
            }
            return h();
        }
        JsonToken f = jsonParser.f();
        if (f == JsonToken.START_ARRAY) {
            return q(jsonParser, deserializationContext);
        }
        if (f == JsonToken.VALUE_EMBEDDED_OBJECT) {
            T t = (T) jsonParser.q();
            if (t == null) {
                return null;
            }
            return this.B.isAssignableFrom(t.getClass()) ? t : b((Object) t, deserializationContext);
        }
        return (T) deserializationContext.e(this.B, jsonParser);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T b(Object obj, DeserializationContext deserializationContext) {
        deserializationContext.a(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.B.getName());
        return null;
    }

    /* loaded from: classes5.dex */
    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        protected final int b;

        protected Std(Class<?> cls, int i) {
            super(cls);
            this.b = i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        protected Object d(String str, DeserializationContext deserializationContext) {
            switch (this.b) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.d(str);
                    } catch (Exception e) {
                        return deserializationContext.d(this.B, str, C9537rU.c((Throwable) e));
                    }
                case 5:
                    return deserializationContext.e().c(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int a = a(str);
                    if (a < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, a);
                    String substring2 = str.substring(a + 1);
                    int a2 = a(substring2);
                    if (a2 < 0) {
                        return new Locale(substring, substring2);
                    }
                    return new Locale(substring, substring2.substring(0, a2), substring2.substring(a2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return C8543dpm.c(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf == -1) {
                            throw new InvalidFormatException(deserializationContext.m(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                        }
                        int indexOf = str.indexOf(58, lastIndexOf);
                        return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf > -1 ? Integer.parseInt(str.substring(indexOf + 1)) : 0);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i = indexOf2 + 1;
                        if (str.indexOf(58, i) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    C9448pl.e();
                    return null;
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        protected Object h() {
            int i = this.b;
            if (i == 3) {
                return URI.create("");
            }
            if (i == 8) {
                return Locale.ROOT;
            }
            if (i == 13) {
                return new StringBuilder();
            }
            return super.h();
        }

        protected int a(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '_' || charAt == '-') {
                    return i;
                }
            }
            return -1;
        }
    }
}
