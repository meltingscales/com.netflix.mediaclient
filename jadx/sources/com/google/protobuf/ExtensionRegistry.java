package com.google.protobuf;

import com.google.protobuf.Descriptors;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ExtensionRegistry extends ExtensionRegistryLite {
    static final ExtensionRegistry EMPTY_REGISTRY = new ExtensionRegistry(true);
    private final Map<String, ExtensionInfo> immutableExtensionsByName;
    private final Map<DescriptorIntPair, ExtensionInfo> immutableExtensionsByNumber;
    private final Map<String, ExtensionInfo> mutableExtensionsByName;
    private final Map<DescriptorIntPair, ExtensionInfo> mutableExtensionsByNumber;

    /* loaded from: classes2.dex */
    public static final class ExtensionInfo {
        public final Message defaultInstance;
        public final Descriptors.FieldDescriptor descriptor;
    }

    public static ExtensionRegistry getEmptyRegistry() {
        return EMPTY_REGISTRY;
    }

    public ExtensionInfo findImmutableExtensionByNumber(Descriptors.Descriptor descriptor, int i) {
        return this.immutableExtensionsByNumber.get(new DescriptorIntPair(descriptor, i));
    }

    private ExtensionRegistry() {
        this.immutableExtensionsByName = new HashMap();
        this.mutableExtensionsByName = new HashMap();
        this.immutableExtensionsByNumber = new HashMap();
        this.mutableExtensionsByNumber = new HashMap();
    }

    ExtensionRegistry(boolean z) {
        super(ExtensionRegistryLite.EMPTY_REGISTRY_LITE);
        this.immutableExtensionsByName = Collections.emptyMap();
        this.mutableExtensionsByName = Collections.emptyMap();
        this.immutableExtensionsByNumber = Collections.emptyMap();
        this.mutableExtensionsByNumber = Collections.emptyMap();
    }

    /* loaded from: classes2.dex */
    static final class DescriptorIntPair {
        private final Descriptors.Descriptor descriptor;
        private final int number;

        DescriptorIntPair(Descriptors.Descriptor descriptor, int i) {
            this.descriptor = descriptor;
            this.number = i;
        }

        public int hashCode() {
            return (this.descriptor.hashCode() * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (obj instanceof DescriptorIntPair) {
                DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
                return this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number;
            }
            return false;
        }
    }
}
