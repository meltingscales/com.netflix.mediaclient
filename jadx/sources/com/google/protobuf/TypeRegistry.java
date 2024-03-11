package com.google.protobuf;

import com.google.protobuf.Descriptors;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class TypeRegistry {
    private static final Logger logger = Logger.getLogger(TypeRegistry.class.getName());
    private final Map<String, Descriptors.Descriptor> types;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class EmptyTypeRegistryHolder {
        private static final TypeRegistry EMPTY = new TypeRegistry(Collections.emptyMap());
    }

    public static TypeRegistry getEmptyTypeRegistry() {
        return EmptyTypeRegistryHolder.EMPTY;
    }

    public Descriptors.Descriptor find(String str) {
        return this.types.get(str);
    }

    public final Descriptors.Descriptor getDescriptorForTypeUrl(String str) {
        return find(getTypeName(str));
    }

    TypeRegistry(Map<String, Descriptors.Descriptor> map) {
        this.types = map;
    }

    private static String getTypeName(String str) {
        String[] split = str.split("/");
        if (split.length <= 1) {
            throw new InvalidProtocolBufferException("Invalid type url found: " + str);
        }
        return split[split.length - 1];
    }
}
