package androidx.compose.ui.semantics;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.dsA;
import o.dtC;

/* loaded from: classes.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ dtC<Object>[] $$delegatedProperties = {dsA.b(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
