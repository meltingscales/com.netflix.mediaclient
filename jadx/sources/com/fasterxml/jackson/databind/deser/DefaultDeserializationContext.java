package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC9415pE;
import o.AbstractC9424pN;
import o.AbstractC9447pk;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9509qt;
import o.C9494qe;
import o.C9537rU;
import o.InterfaceC9317nM;
import o.InterfaceC9429pS;

/* loaded from: classes5.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient LinkedHashMap<ObjectIdGenerator.IdKey, C9494qe> k;
    private List<InterfaceC9317nM> n;

    public abstract DefaultDeserializationContext b(DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC9447pk abstractC9447pk);

    protected DefaultDeserializationContext(AbstractC9424pN abstractC9424pN, DeserializerCache deserializerCache) {
        super(abstractC9424pN, deserializerCache);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC9447pk abstractC9447pk) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, abstractC9447pk);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }

    public DefaultDeserializationContext p() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public C9494qe d(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC9317nM interfaceC9317nM) {
        InterfaceC9317nM interfaceC9317nM2 = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey b = objectIdGenerator.b(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, C9494qe> linkedHashMap = this.k;
        if (linkedHashMap == null) {
            this.k = new LinkedHashMap<>();
        } else {
            C9494qe c9494qe = linkedHashMap.get(b);
            if (c9494qe != null) {
                return c9494qe;
            }
        }
        List<InterfaceC9317nM> list = this.n;
        if (list == null) {
            this.n = new ArrayList(8);
        } else {
            Iterator<InterfaceC9317nM> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC9317nM next = it.next();
                if (next.e(interfaceC9317nM)) {
                    interfaceC9317nM2 = next;
                    break;
                }
            }
        }
        if (interfaceC9317nM2 == null) {
            interfaceC9317nM2 = interfaceC9317nM.c(this);
            this.n.add(interfaceC9317nM2);
        }
        C9494qe e = e(b);
        e.b(interfaceC9317nM2);
        this.k.put(b, e);
        return e;
    }

    protected C9494qe e(ObjectIdGenerator.IdKey idKey) {
        return new C9494qe(idKey);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void d() {
        if (this.k != null && d(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            UnresolvedForwardReference unresolvedForwardReference = null;
            for (Map.Entry<ObjectIdGenerator.IdKey, C9494qe> entry : this.k.entrySet()) {
                C9494qe value = entry.getValue();
                if (value.c() && !d(value)) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(m(), "Unresolved forward references for: ");
                    }
                    Object obj = value.e().a;
                    Iterator<C9494qe.d> d = value.d();
                    while (d.hasNext()) {
                        C9494qe.d next = d.next();
                        unresolvedForwardReference.e(obj, next.c(), next.d());
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    protected boolean d(C9494qe c9494qe) {
        return c9494qe.d((DeserializationContext) this);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public AbstractC9452pp<Object> d(AbstractC9509qt abstractC9509qt, Object obj) {
        AbstractC9452pp<?> abstractC9452pp;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC9452pp) {
            abstractC9452pp = (AbstractC9452pp) obj;
        } else if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
        } else {
            Class<?> cls = (Class) obj;
            if (cls == AbstractC9452pp.d.class || C9537rU.l(cls)) {
                return null;
            }
            if (!AbstractC9452pp.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            AbstractC9415pE n = this.a.n();
            AbstractC9452pp<?> a = n != null ? n.a(this.a, abstractC9509qt, cls) : null;
            abstractC9452pp = a == null ? (AbstractC9452pp) C9537rU.b(cls, this.a.f()) : a;
        }
        if (abstractC9452pp instanceof InterfaceC9429pS) {
            ((InterfaceC9429pS) abstractC9452pp).b(this);
        }
        return abstractC9452pp;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final AbstractC9450pn e(AbstractC9509qt abstractC9509qt, Object obj) {
        AbstractC9450pn abstractC9450pn;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC9450pn) {
            abstractC9450pn = (AbstractC9450pn) obj;
        } else if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        } else {
            Class<?> cls = (Class) obj;
            if (cls == AbstractC9450pn.d.class || C9537rU.l(cls)) {
                return null;
            }
            if (!AbstractC9450pn.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            AbstractC9415pE n = this.a.n();
            AbstractC9450pn d = n != null ? n.d(this.a, abstractC9509qt, cls) : null;
            abstractC9450pn = d == null ? (AbstractC9450pn) C9537rU.b(cls, this.a.f()) : d;
        }
        if (abstractC9450pn instanceof InterfaceC9429pS) {
            ((InterfaceC9429pS) abstractC9450pn).b(this);
        }
        return abstractC9450pn;
    }

    /* loaded from: classes5.dex */
    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(AbstractC9424pN abstractC9424pN) {
            super(abstractC9424pN, null);
        }

        protected Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC9447pk abstractC9447pk) {
            super(impl, deserializationConfig, jsonParser, abstractC9447pk);
        }

        protected Impl(Impl impl) {
            super(impl);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext p() {
            C9537rU.c(Impl.class, this, "copy");
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext b(DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC9447pk abstractC9447pk) {
            return new Impl(this, deserializationConfig, jsonParser, abstractC9447pk);
        }
    }
}
