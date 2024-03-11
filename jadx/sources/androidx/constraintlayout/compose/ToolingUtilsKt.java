package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C8632dsu;
import o.dsA;
import o.dtC;

/* loaded from: classes.dex */
public final class ToolingUtilsKt {
    static final /* synthetic */ dtC<Object>[] $$delegatedProperties = {dsA.b(new MutablePropertyReference1Impl(dsA.e(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey;
    private static final SemanticsPropertyKey designInfoProvider$delegate;

    static {
        SemanticsPropertyKey<DesignInfoProvider> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);
        DesignInfoDataKey = semanticsPropertyKey;
        designInfoProvider$delegate = semanticsPropertyKey;
    }

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        C8632dsu.c((Object) semanticsPropertyReceiver, "");
        C8632dsu.c((Object) designInfoProvider, "");
        designInfoProvider$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }
}
