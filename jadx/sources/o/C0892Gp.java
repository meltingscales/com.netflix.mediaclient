package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.hawkins.consumer.component.staticlist.HawkinsStaticListSize;
import o.C0892Gp;
import o.FW;
import o.dpR;

/* renamed from: o.Gp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0892Gp {
    public static final void c(final FW fw, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) fw, "");
        Composer startRestartGroup = composer.startRestartGroup(1131885557);
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1131885557, i, -1, "com.netflix.clcs.ui.ClcsStaticList (ClcsStaticList.kt:14)");
        }
        duS a = duO.a(fw.e());
        AbstractC1014Lh c = fw.c();
        HawkinsStaticListSize hawkinsStaticListSize = HawkinsStaticListSize.a;
        HawkinsStaticListSize hawkinsStaticListSize2 = (HawkinsStaticListSize) new FR(hawkinsStaticListSize, null, HawkinsStaticListSize.c, null, null).e(startRestartGroup, 0);
        C1015Li.c(a, companion, hawkinsStaticListSize2 == null ? hawkinsStaticListSize : hawkinsStaticListSize2, false, c, null, startRestartGroup, (i & 112) | (AbstractC1014Lh.e << 12), 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsStaticListKt$ClcsStaticList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    C0892Gp.c(FW.this, companion, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
