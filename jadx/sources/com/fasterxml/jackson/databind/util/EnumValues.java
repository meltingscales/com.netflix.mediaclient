package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.C9537rU;
import o.InterfaceC9327nW;

/* loaded from: classes5.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> a;
    private final InterfaceC9327nW[] c;
    private final Enum<?>[] d;

    public Class<Enum<?>> d() {
        return this.a;
    }

    private EnumValues(Class<Enum<?>> cls, InterfaceC9327nW[] interfaceC9327nWArr) {
        this.a = cls;
        this.d = cls.getEnumConstants();
        this.c = interfaceC9327nWArr;
    }

    public static EnumValues c(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> b = C9537rU.b((Class<?>) cls);
        Enum<?>[] enumArr = (Enum[]) b.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] b2 = mapperConfig.h().b(b, enumArr, new String[enumArr.length]);
        InterfaceC9327nW[] interfaceC9327nWArr = new InterfaceC9327nW[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r5 = enumArr[i];
            String str = b2[i];
            if (str == null) {
                str = r5.name();
            }
            interfaceC9327nWArr[r5.ordinal()] = mapperConfig.a(str);
        }
        return new EnumValues(cls, interfaceC9327nWArr);
    }

    public InterfaceC9327nW b(Enum<?> r2) {
        return this.c[r2.ordinal()];
    }

    public Collection<InterfaceC9327nW> b() {
        return Arrays.asList(this.c);
    }

    public List<Enum<?>> a() {
        return Arrays.asList(this.d);
    }
}
