package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    /* loaded from: classes5.dex */
    public enum Validity {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract Validity a(MapperConfig<?> mapperConfig, JavaType javaType, String str);

    public abstract Validity c(MapperConfig<?> mapperConfig, JavaType javaType);

    public abstract Validity e(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2);

    /* loaded from: classes5.dex */
    public static abstract class Base extends PolymorphicTypeValidator implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity c(MapperConfig<?> mapperConfig, JavaType javaType) {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity a(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity e(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
            return Validity.INDETERMINATE;
        }
    }
}
