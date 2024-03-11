package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.lang.reflect.Array;
import java.util.Arrays;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9322nR;
import o.C9530rN;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9458pv;

/* loaded from: classes5.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements InterfaceC9420pJ {
    protected final InterfaceC9428pR c;
    protected final Boolean d;
    private transient Object e;

    protected abstract PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool);

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    protected abstract T c(JsonParser jsonParser, DeserializationContext deserializationContext);

    protected abstract T e(T t, T t2);

    protected abstract T f();

    protected PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this.d = null;
        this.c = null;
    }

    protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(primitiveArrayDeserializers.B);
        this.d = bool;
        this.c = interfaceC9428pR;
    }

    public static AbstractC9452pp<?> d(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.b;
        }
        if (cls == Long.TYPE) {
            return LongDeser.a;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        InterfaceC9428pR interfaceC9428pR;
        Boolean d = d(deserializationContext, beanProperty, this.B, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls d2 = d(deserializationContext, beanProperty);
        if (d2 == Nulls.SKIP) {
            interfaceC9428pR = NullsConstantProvider.d();
        } else if (d2 != Nulls.FAIL) {
            interfaceC9428pR = null;
        } else if (beanProperty == null) {
            interfaceC9428pR = NullsFailProvider.a(deserializationContext.a(this.B));
        } else {
            interfaceC9428pR = NullsFailProvider.a(beanProperty);
        }
        return (d == this.d && interfaceC9428pR == this.c) ? this : a(interfaceC9428pR, d);
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        Object obj = this.e;
        if (obj == null) {
            T f = f();
            this.e = f;
            return f;
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) {
        T b = b(jsonParser, deserializationContext);
        return (t == null || Array.getLength(t) == 0) ? b : e(t, b);
    }

    protected T d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_STRING) && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.A().length() == 0) {
            return null;
        }
        Boolean bool = this.d;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return c(jsonParser, deserializationContext);
        }
        return (T) deserializationContext.e(this.B, jsonParser);
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public char[] f() {
            return new char[0];
        }

        public CharDeser() {
            super(char[].class);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public char[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String A;
            if (jsonParser.a(JsonToken.VALUE_STRING)) {
                char[] B = jsonParser.B();
                int H = jsonParser.H();
                int D = jsonParser.D();
                char[] cArr = new char[D];
                System.arraycopy(B, H, cArr, 0, D);
                return cArr;
            } else if (jsonParser.J()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        if (Q == JsonToken.VALUE_STRING) {
                            A = jsonParser.A();
                        } else if (Q == JsonToken.VALUE_NULL) {
                            InterfaceC9428pR interfaceC9428pR = this.c;
                            if (interfaceC9428pR != null) {
                                interfaceC9428pR.c(deserializationContext);
                            } else {
                                i(deserializationContext);
                                A = "\u0000";
                            }
                        } else {
                            A = ((CharSequence) deserializationContext.e(Character.TYPE, jsonParser)).toString();
                        }
                        if (A.length() != 1) {
                            deserializationContext.a(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(A.length()));
                        }
                        sb.append(A.charAt(0));
                    } else {
                        return sb.toString().toCharArray();
                    }
                }
            } else {
                if (jsonParser.a(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object q = jsonParser.q();
                    if (q == null) {
                        return null;
                    }
                    if (q instanceof char[]) {
                        return (char[]) q;
                    }
                    if (q instanceof String) {
                        return ((String) q).toCharArray();
                    }
                    if (q instanceof byte[]) {
                        return C9322nR.e().a((byte[]) q, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.e(this.B, jsonParser);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: f */
        public char[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return (char[]) deserializationContext.e(this.B, jsonParser);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: d */
        public char[] e(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public boolean[] f() {
            return new boolean[0];
        }

        public BooleanDeser() {
            super(boolean[].class);
        }

        protected BooleanDeser(BooleanDeser booleanDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(booleanDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new BooleanDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public boolean[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            boolean z;
            int i;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.e c = deserializationContext.i().c();
            boolean[] a = c.a();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        try {
                            if (Q == JsonToken.VALUE_TRUE) {
                                z = true;
                            } else {
                                if (Q != JsonToken.VALUE_FALSE) {
                                    if (Q == JsonToken.VALUE_NULL) {
                                        InterfaceC9428pR interfaceC9428pR = this.c;
                                        if (interfaceC9428pR != null) {
                                            interfaceC9428pR.c(deserializationContext);
                                        } else {
                                            i(deserializationContext);
                                        }
                                    } else {
                                        z = x(jsonParser, deserializationContext);
                                    }
                                }
                                z = false;
                            }
                            a[i2] = z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.d(e, a, c.e() + i2);
                        }
                        if (i2 >= a.length) {
                            boolean[] a2 = c.a(a, i2);
                            i2 = 0;
                            a = a2;
                        }
                        i = i2 + 1;
                    } else {
                        return c.e(a, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public boolean[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new boolean[]{x(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] e(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: h */
        public byte[] f() {
            return new byte[0];
        }

        public ByteDeser() {
            super(byte[].class);
        }

        protected ByteDeser(ByteDeser byteDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(byteDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new ByteDeser(this, interfaceC9428pR, bool);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x008b A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a3, blocks: (B:26:0x005d, B:28:0x0065, B:30:0x0069, B:33:0x006e, B:35:0x0072, B:37:0x0076, B:38:0x007a, B:41:0x0088, B:43:0x008b, B:39:0x007f, B:40:0x0084), top: B:59:0x005d }] */
        @Override // o.AbstractC9452pp
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] b(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) {
            /*
                r6 = this;
                com.fasterxml.jackson.core.JsonToken r0 = r7.f()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
                r2 = 0
                if (r0 != r1) goto L2e
                com.fasterxml.jackson.core.Base64Variant r1 = r8.h()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L12
                byte[] r7 = r7.e(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L12
                return r7
            L12:
                r1 = move-exception
                java.lang.String r1 = r1.g()
                java.lang.String r3 = "base64"
                boolean r3 = r1.contains(r3)
                if (r3 == 0) goto L2e
                java.lang.String r7 = r7.A()
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Class<byte[]> r2 = byte[].class
                java.lang.Object r7 = r8.b(r2, r7, r1, r0)
                byte[] r7 = (byte[]) r7
                return r7
            L2e:
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT
                if (r0 != r1) goto L41
                java.lang.Object r0 = r7.q()
                if (r0 != 0) goto L3a
                r7 = 0
                return r7
            L3a:
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L41
                byte[] r0 = (byte[]) r0
                return r0
            L41:
                boolean r0 = r7.J()
                if (r0 != 0) goto L4e
                java.lang.Object r7 = r6.d(r7, r8)
                byte[] r7 = (byte[]) r7
                return r7
            L4e:
                o.rN r0 = r8.i()
                o.rN$c r0 = r0.a()
                java.lang.Object r1 = r0.a()
                byte[] r1 = (byte[]) r1
                r3 = r2
            L5d:
                com.fasterxml.jackson.core.JsonToken r4 = r7.Q()     // Catch: java.lang.Exception -> La3
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch: java.lang.Exception -> La3
                if (r4 == r5) goto L9c
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch: java.lang.Exception -> La3
                if (r4 == r5) goto L84
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch: java.lang.Exception -> La3
                if (r4 != r5) goto L6e
                goto L84
            L6e:
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> La3
                if (r4 != r5) goto L7f
                o.pR r4 = r6.c     // Catch: java.lang.Exception -> La3
                if (r4 == 0) goto L7a
                r4.c(r8)     // Catch: java.lang.Exception -> La3
                goto L5d
            L7a:
                r6.i(r8)     // Catch: java.lang.Exception -> La3
                r4 = r2
                goto L88
            L7f:
                byte r4 = r6.y(r7, r8)     // Catch: java.lang.Exception -> La3
                goto L88
            L84:
                byte r4 = r7.m()     // Catch: java.lang.Exception -> La3
            L88:
                int r5 = r1.length     // Catch: java.lang.Exception -> La3
                if (r3 < r5) goto L93
                java.lang.Object r5 = r0.a(r1, r3)     // Catch: java.lang.Exception -> La3
                byte[] r5 = (byte[]) r5     // Catch: java.lang.Exception -> La3
                r3 = r2
                r1 = r5
            L93:
                int r5 = r3 + 1
                r1[r3] = r4     // Catch: java.lang.Exception -> L99
                r3 = r5
                goto L5d
            L99:
                r7 = move-exception
                r3 = r5
                goto La4
            L9c:
                java.lang.Object r7 = r0.e(r1, r3)
                byte[] r7 = (byte[]) r7
                return r7
            La3:
                r7 = move-exception
            La4:
                int r8 = r0.e()
                int r8 = r8 + r3
                com.fasterxml.jackson.databind.JsonMappingException r7 = com.fasterxml.jackson.databind.JsonMappingException.d(r7, r1, r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ByteDeser.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):byte[]");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: i */
        public byte[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            byte m;
            JsonToken f = jsonParser.f();
            if (f == JsonToken.VALUE_NUMBER_INT || f == JsonToken.VALUE_NUMBER_FLOAT) {
                m = jsonParser.m();
            } else if (f == JsonToken.VALUE_NULL) {
                InterfaceC9428pR interfaceC9428pR = this.c;
                if (interfaceC9428pR != null) {
                    interfaceC9428pR.c(deserializationContext);
                    return (byte[]) d(deserializationContext);
                }
                i(deserializationContext);
                return null;
            } else {
                m = ((Number) deserializationContext.e(this.B.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{m};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] e(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public short[] f() {
            return new short[0];
        }

        public ShortDeser() {
            super(short[].class);
        }

        protected ShortDeser(ShortDeser shortDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(shortDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new ShortDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public short[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            short z;
            int i;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.i f = deserializationContext.i().f();
            short[] a = f.a();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        try {
                            if (Q == JsonToken.VALUE_NULL) {
                                InterfaceC9428pR interfaceC9428pR = this.c;
                                if (interfaceC9428pR != null) {
                                    interfaceC9428pR.c(deserializationContext);
                                } else {
                                    i(deserializationContext);
                                    z = 0;
                                }
                            } else {
                                z = z(jsonParser, deserializationContext);
                            }
                            a[i2] = z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.d(e, a, f.e() + i2);
                        }
                        if (i2 >= a.length) {
                            short[] a2 = f.a(a, i2);
                            i2 = 0;
                            a = a2;
                        }
                        i = i2 + 1;
                    } else {
                        return f.e(a, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: f */
        public short[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new short[]{z(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: c */
        public short[] e(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser b = new IntDeser();
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public int[] f() {
            return new int[0];
        }

        public IntDeser() {
            super(int[].class);
        }

        protected IntDeser(IntDeser intDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(intDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new IntDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public int[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int u;
            int i;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.b e = deserializationContext.i().e();
            int[] a = e.a();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        try {
                            if (Q == JsonToken.VALUE_NUMBER_INT) {
                                u = jsonParser.u();
                            } else if (Q == JsonToken.VALUE_NULL) {
                                InterfaceC9428pR interfaceC9428pR = this.c;
                                if (interfaceC9428pR != null) {
                                    interfaceC9428pR.c(deserializationContext);
                                } else {
                                    i(deserializationContext);
                                    u = 0;
                                }
                            } else {
                                u = A(jsonParser, deserializationContext);
                            }
                            a[i2] = u;
                            i2 = i;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i;
                            throw JsonMappingException.d(e, a, e.e() + i2);
                        }
                        if (i2 >= a.length) {
                            int[] a2 = e.a(a, i2);
                            i2 = 0;
                            a = a2;
                        }
                        i = i2 + 1;
                    } else {
                        return e.e(a, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: g */
        public int[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new int[]{A(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: d */
        public int[] e(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser a = new LongDeser();
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: h */
        public long[] f() {
            return new long[0];
        }

        public LongDeser() {
            super(long[].class);
        }

        protected LongDeser(LongDeser longDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(longDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new LongDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public long[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            long w;
            int i;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.j j = deserializationContext.i().j();
            long[] a2 = j.a();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        try {
                            if (Q == JsonToken.VALUE_NUMBER_INT) {
                                w = jsonParser.w();
                            } else if (Q == JsonToken.VALUE_NULL) {
                                InterfaceC9428pR interfaceC9428pR = this.c;
                                if (interfaceC9428pR != null) {
                                    interfaceC9428pR.c(deserializationContext);
                                } else {
                                    i(deserializationContext);
                                    w = 0;
                                }
                            } else {
                                w = D(jsonParser, deserializationContext);
                            }
                            a2[i2] = w;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.d(e, a2, j.e() + i2);
                        }
                        if (i2 >= a2.length) {
                            long[] a3 = j.a(a2, i2);
                            i2 = 0;
                            a2 = a3;
                        }
                        i = i2 + 1;
                    } else {
                        return j.e(a2, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: h */
        public long[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new long[]{D(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] e(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: h */
        public float[] f() {
            return new float[0];
        }

        public FloatDeser() {
            super(float[].class);
        }

        protected FloatDeser(FloatDeser floatDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(floatDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new FloatDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public float[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            InterfaceC9428pR interfaceC9428pR;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.a d = deserializationContext.i().d();
            float[] a = d.a();
            int i = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        if (Q == JsonToken.VALUE_NULL && (interfaceC9428pR = this.c) != null) {
                            interfaceC9428pR.c(deserializationContext);
                        } else {
                            float C = C(jsonParser, deserializationContext);
                            if (i >= a.length) {
                                float[] a2 = d.a(a, i);
                                i = 0;
                                a = a2;
                            }
                            int i2 = i + 1;
                            try {
                                a[i] = C;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.d(e, a, d.e() + i);
                            }
                        }
                    } else {
                        return d.e(a, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: i */
        public float[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new float[]{C(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] e(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: j */
        public double[] f() {
            return new double[0];
        }

        public DoubleDeser() {
            super(double[].class);
        }

        protected DoubleDeser(DoubleDeser doubleDeser, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            super(doubleDeser, interfaceC9428pR, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> a(InterfaceC9428pR interfaceC9428pR, Boolean bool) {
            return new DoubleDeser(this, interfaceC9428pR, bool);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public double[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            InterfaceC9428pR interfaceC9428pR;
            if (!jsonParser.J()) {
                return d(jsonParser, deserializationContext);
            }
            C9530rN.d b = deserializationContext.i().b();
            double[] a = b.a();
            int i = 0;
            while (true) {
                try {
                    JsonToken Q = jsonParser.Q();
                    if (Q != JsonToken.END_ARRAY) {
                        if (Q == JsonToken.VALUE_NULL && (interfaceC9428pR = this.c) != null) {
                            interfaceC9428pR.c(deserializationContext);
                        } else {
                            double w = w(jsonParser, deserializationContext);
                            if (i >= a.length) {
                                double[] a2 = b.a(a, i);
                                i = 0;
                                a = a2;
                            }
                            int i2 = i + 1;
                            try {
                                a[i] = w;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.d(e, a, b.e() + i);
                            }
                        }
                    } else {
                        return b.e(a, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: h */
        public double[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new double[]{w(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* renamed from: d */
        public double[] e(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }
}
