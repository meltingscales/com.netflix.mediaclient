package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.InterfaceC9480qQ;

/* loaded from: classes5.dex */
public abstract class FilteredBeanPropertyWriter {
    public static BeanPropertyWriter c(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new MultiView(beanPropertyWriter, clsArr);
    }

    /* loaded from: classes5.dex */
    static final class SingleView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Class<?> u;
        protected final BeanPropertyWriter x;

        protected SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this.x = beanPropertyWriter;
            this.u = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        /* renamed from: c */
        public SingleView a(NameTransformer nameTransformer) {
            return new SingleView(this.x.a(nameTransformer), this.u);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void d(AbstractC9453pq<Object> abstractC9453pq) {
            this.x.d(abstractC9453pq);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void c(AbstractC9453pq<Object> abstractC9453pq) {
            this.x.c(abstractC9453pq);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            Class<?> a = abstractC9459pw.a();
            if (a == null || this.u.isAssignableFrom(a)) {
                this.x.d(obj, jsonGenerator, abstractC9459pw);
            } else {
                this.x.e(obj, jsonGenerator, abstractC9459pw);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            Class<?> a = abstractC9459pw.a();
            if (a == null || this.u.isAssignableFrom(a)) {
                this.x.b(obj, jsonGenerator, abstractC9459pw);
            } else {
                this.x.a(obj, jsonGenerator, abstractC9459pw);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
            Class<?> a = abstractC9459pw.a();
            if (a == null || this.u.isAssignableFrom(a)) {
                super.d(interfaceC9480qQ, abstractC9459pw);
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class MultiView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final BeanPropertyWriter u;
        protected final Class<?>[] v;

        protected MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this.u = beanPropertyWriter;
            this.v = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        /* renamed from: d */
        public MultiView a(NameTransformer nameTransformer) {
            return new MultiView(this.u.a(nameTransformer), this.v);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void d(AbstractC9453pq<Object> abstractC9453pq) {
            this.u.d(abstractC9453pq);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void c(AbstractC9453pq<Object> abstractC9453pq) {
            this.u.c(abstractC9453pq);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (a(abstractC9459pw.a())) {
                this.u.d(obj, jsonGenerator, abstractC9459pw);
            } else {
                this.u.e(obj, jsonGenerator, abstractC9459pw);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (a(abstractC9459pw.a())) {
                this.u.b(obj, jsonGenerator, abstractC9459pw);
            } else {
                this.u.a(obj, jsonGenerator, abstractC9459pw);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
            if (a(abstractC9459pw.a())) {
                super.d(interfaceC9480qQ, abstractC9459pw);
            }
        }

        private final boolean a(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this.v.length;
            for (int i = 0; i < length; i++) {
                if (this.v[i].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
