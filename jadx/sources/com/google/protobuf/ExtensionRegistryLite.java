package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        if (doFullRuntimeInheritanceCheck) {
            ExtensionRegistryLite extensionRegistryLite = emptyRegistry;
            if (extensionRegistryLite == null) {
                synchronized (ExtensionRegistryLite.class) {
                    extensionRegistryLite = emptyRegistry;
                    if (extensionRegistryLite == null) {
                        extensionRegistryLite = ExtensionRegistryFactory.createEmpty();
                        emptyRegistry = extensionRegistryLite;
                    }
                }
            }
            return extensionRegistryLite;
        }
        return EMPTY_REGISTRY_LITE;
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension<ContainingType, ?>) this.extensionsByNumber.get(new ObjectIntPair(containingtype, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
        }
    }

    ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }

    /* loaded from: classes2.dex */
    static final class ObjectIntPair {
        private final int number;
        private final Object object;

        ObjectIntPair(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ObjectIntPair) {
                ObjectIntPair objectIntPair = (ObjectIntPair) obj;
                return this.object == objectIntPair.object && this.number == objectIntPair.number;
            }
            return false;
        }
    }
}
