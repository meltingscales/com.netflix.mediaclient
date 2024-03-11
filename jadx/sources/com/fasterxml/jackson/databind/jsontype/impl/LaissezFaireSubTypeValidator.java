package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;

/* loaded from: classes5.dex */
public final class LaissezFaireSubTypeValidator extends PolymorphicTypeValidator.Base {
    public static final LaissezFaireSubTypeValidator d = new LaissezFaireSubTypeValidator();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity c(MapperConfig<?> mapperConfig, JavaType javaType) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity a(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.ALLOWED;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity e(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return PolymorphicTypeValidator.Validity.ALLOWED;
    }
}
