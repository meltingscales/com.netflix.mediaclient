package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import o.AbstractC9453pq;
import o.AbstractC9521rE;
import o.AbstractC9544rb;
import o.C9396om;
import o.C9528rL;
import o.C9537rU;
import o.InterfaceC9324nT;
import o.InterfaceC9326nV;
import o.InterfaceC9327nW;
import o.InterfaceC9437pa;

/* loaded from: classes5.dex */
public class ObjectWriter implements Serializable {
    protected static final InterfaceC9326nV c = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final JsonFactory a;
    protected final Prefetch b;
    protected final SerializationConfig d;
    protected final GeneratorSettings e;
    protected final AbstractC9521rE f;
    protected final DefaultSerializerProvider j;

    /* JADX INFO: Access modifiers changed from: protected */
    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, InterfaceC9326nV interfaceC9326nV) {
        this.d = serializationConfig;
        this.j = objectMapper._serializerProvider;
        this.f = objectMapper._serializerFactory;
        this.a = objectMapper._jsonFactory;
        this.e = interfaceC9326nV == null ? GeneratorSettings.d : new GeneratorSettings(interfaceC9326nV, null, null, null);
        if (javaType == null) {
            this.b = Prefetch.d;
        } else if (javaType.d(Object.class)) {
            this.b = Prefetch.d.e(this, javaType);
        } else {
            this.b = Prefetch.d.e(this, javaType.I());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this.d = serializationConfig;
        this.j = objectMapper._serializerProvider;
        this.f = objectMapper._serializerFactory;
        this.a = objectMapper._jsonFactory;
        this.e = GeneratorSettings.d;
        this.b = Prefetch.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, InterfaceC9324nT interfaceC9324nT) {
        this.d = serializationConfig;
        this.j = objectMapper._serializerProvider;
        this.f = objectMapper._serializerFactory;
        this.a = objectMapper._jsonFactory;
        this.e = interfaceC9324nT == null ? GeneratorSettings.d : new GeneratorSettings(null, interfaceC9324nT, null, null);
        this.b = Prefetch.d;
    }

    protected ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this.d = serializationConfig;
        this.j = objectWriter.j;
        this.f = objectWriter.f;
        this.a = objectWriter.a;
        this.e = generatorSettings;
        this.b = prefetch;
    }

    protected ObjectWriter c(GeneratorSettings generatorSettings, Prefetch prefetch) {
        return (this.e == generatorSettings && this.b == prefetch) ? this : new ObjectWriter(this, this.d, generatorSettings, prefetch);
    }

    public ObjectWriter b() {
        return e(this.d.c());
    }

    public ObjectWriter e(InterfaceC9326nV interfaceC9326nV) {
        return c(this.e.e(interfaceC9326nV), this.b);
    }

    public ObjectWriter e(CharacterEscapes characterEscapes) {
        return c(this.e.c(characterEscapes), this.b);
    }

    public boolean b(SerializationFeature serializationFeature) {
        return this.d.c(serializationFeature);
    }

    public String a(Object obj) {
        C9396om c9396om = new C9396om(this.a._getBufferRecycler());
        try {
            e(this.a.createGenerator(c9396om), obj);
            return c9396om.d();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    protected DefaultSerializerProvider c() {
        return this.j.c(this.d, this.f);
    }

    protected final void e(JsonGenerator jsonGenerator, Object obj) {
        e(jsonGenerator);
        if (this.d.c(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            a(jsonGenerator, obj);
            return;
        }
        try {
            this.b.a(jsonGenerator, obj, c());
            jsonGenerator.close();
        } catch (Exception e) {
            C9537rU.a(jsonGenerator, e);
        }
    }

    private final void a(JsonGenerator jsonGenerator, Object obj) {
        Closeable closeable = (Closeable) obj;
        try {
            this.b.a(jsonGenerator, obj, c());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                C9537rU.e(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    protected final void e(JsonGenerator jsonGenerator) {
        this.d.b(jsonGenerator);
        this.e.e(jsonGenerator);
    }

    /* loaded from: classes5.dex */
    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings d = new GeneratorSettings(null, null, null, null);
        private static final long serialVersionUID = 1;
        public final InterfaceC9327nW a;
        public final InterfaceC9326nV b;
        public final CharacterEscapes c;
        public final InterfaceC9324nT e;

        public GeneratorSettings(InterfaceC9326nV interfaceC9326nV, InterfaceC9324nT interfaceC9324nT, CharacterEscapes characterEscapes, InterfaceC9327nW interfaceC9327nW) {
            this.b = interfaceC9326nV;
            this.e = interfaceC9324nT;
            this.c = characterEscapes;
            this.a = interfaceC9327nW;
        }

        public GeneratorSettings e(InterfaceC9326nV interfaceC9326nV) {
            if (interfaceC9326nV == null) {
                interfaceC9326nV = ObjectWriter.c;
            }
            return interfaceC9326nV == this.b ? this : new GeneratorSettings(interfaceC9326nV, this.e, this.c, this.a);
        }

        public GeneratorSettings c(CharacterEscapes characterEscapes) {
            return this.c == characterEscapes ? this : new GeneratorSettings(this.b, this.e, characterEscapes, this.a);
        }

        public void e(JsonGenerator jsonGenerator) {
            InterfaceC9326nV interfaceC9326nV = this.b;
            if (interfaceC9326nV != null) {
                if (interfaceC9326nV == ObjectWriter.c) {
                    jsonGenerator.a((InterfaceC9326nV) null);
                } else {
                    if (interfaceC9326nV instanceof InterfaceC9437pa) {
                        interfaceC9326nV = (InterfaceC9326nV) ((InterfaceC9437pa) interfaceC9326nV).e();
                    }
                    jsonGenerator.a(interfaceC9326nV);
                }
            }
            CharacterEscapes characterEscapes = this.c;
            if (characterEscapes != null) {
                jsonGenerator.e(characterEscapes);
            }
            InterfaceC9324nT interfaceC9324nT = this.e;
            if (interfaceC9324nT != null) {
                jsonGenerator.a(interfaceC9324nT);
            }
            InterfaceC9327nW interfaceC9327nW = this.a;
            if (interfaceC9327nW != null) {
                jsonGenerator.a(interfaceC9327nW);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Prefetch implements Serializable {
        public static final Prefetch d = new Prefetch(null, null, null);
        private static final long serialVersionUID = 1;
        private final JavaType b;
        private final AbstractC9453pq<Object> c;
        private final AbstractC9544rb e;

        private Prefetch(JavaType javaType, AbstractC9453pq<Object> abstractC9453pq, AbstractC9544rb abstractC9544rb) {
            this.b = javaType;
            this.c = abstractC9453pq;
            this.e = abstractC9544rb;
        }

        public Prefetch e(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null) {
                return (this.b == null || this.c == null) ? this : new Prefetch(null, null, null);
            } else if (javaType.equals(this.b)) {
                return this;
            } else {
                if (javaType.D()) {
                    try {
                        return new Prefetch(null, null, objectWriter.c().c(javaType));
                    } catch (JsonMappingException e) {
                        throw new RuntimeJsonMappingException(e);
                    }
                }
                if (objectWriter.b(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                    try {
                        AbstractC9453pq<Object> b = objectWriter.c().b(javaType, true, (BeanProperty) null);
                        if (b instanceof C9528rL) {
                            return new Prefetch(javaType, null, ((C9528rL) b).a());
                        }
                        return new Prefetch(javaType, b, null);
                    } catch (JsonMappingException unused) {
                    }
                }
                return new Prefetch(javaType, null, this.e);
            }
        }

        public void a(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) {
            AbstractC9544rb abstractC9544rb = this.e;
            if (abstractC9544rb != null) {
                defaultSerializerProvider.d(jsonGenerator, obj, this.b, this.c, abstractC9544rb);
                return;
            }
            AbstractC9453pq<Object> abstractC9453pq = this.c;
            if (abstractC9453pq != null) {
                defaultSerializerProvider.e(jsonGenerator, obj, this.b, abstractC9453pq);
                return;
            }
            JavaType javaType = this.b;
            if (javaType != null) {
                defaultSerializerProvider.b(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.d(jsonGenerator, obj);
            }
        }
    }
}
