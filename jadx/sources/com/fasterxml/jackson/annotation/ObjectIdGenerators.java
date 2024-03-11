package com.fasterxml.jackson.annotation;

/* loaded from: classes5.dex */
public class ObjectIdGenerators {

    /* loaded from: classes5.dex */
    public static abstract class None extends ObjectIdGenerator<Object> {
    }

    /* loaded from: classes5.dex */
    public static abstract class Base<T> extends ObjectIdGenerator<T> {
        protected final Class<?> a;

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public Class<?> a() {
            return this.a;
        }

        protected Base(Class<?> cls) {
            this.a = cls;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public boolean e(ObjectIdGenerator<?> objectIdGenerator) {
            return objectIdGenerator.getClass() == getClass() && objectIdGenerator.a() == this.a;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class PropertyGenerator extends Base<Object> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
        public /* bridge */ /* synthetic */ Class a() {
            return super.a();
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
        public /* bridge */ /* synthetic */ boolean e(ObjectIdGenerator objectIdGenerator) {
            return super.e(objectIdGenerator);
        }

        public PropertyGenerator(Class<?> cls) {
            super(cls);
        }
    }
}
