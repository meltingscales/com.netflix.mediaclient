package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.clcs.models.ItemAlignment;
import com.netflix.clcs.models.Layout;
import com.netflix.clcs.models.StackContentJustification;
import com.netflix.hawkins.consumer.tokens.Theme;
import java.util.ArrayList;
import o.C0881Ge;
import o.FH;
import o.dpR;

/* renamed from: o.Ge  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0881Ge {
    public static final void e(final FH fh, final Theme theme, final String str, final FY fy, Modifier modifier, Composer composer, final int i, final int i2) {
        ArrayList arrayList;
        C8632dsu.c((Object) fh, "");
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) fy, "");
        Composer startRestartGroup = composer.startRestartGroup(-247022607);
        final Modifier modifier2 = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-247022607, i, -1, "com.netflix.clcs.ui.ClcsHorizontalStack (ClcsHorizontalStack.kt:17)");
        }
        String b = fh.b();
        FC h = fh.h();
        Layout.Direction direction = Layout.Direction.d;
        StackContentJustification d = fh.d();
        if (d == null) {
            d = StackContentJustification.c;
        }
        StackContentJustification stackContentJustification = d;
        ItemAlignment e = fh.e();
        if (fh.f()) {
            int size = fh.c().size();
            ArrayList arrayList2 = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                arrayList2.add(new Layout.Template.Flexible(0, Layout.Template.Flexible.Size.c, 1, null));
                i3++;
                size = size;
            }
            arrayList = arrayList2;
        } else {
            int size2 = fh.c().size();
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new Layout.Template.Flexible(0, null, 3, null));
            }
            arrayList = arrayList3;
        }
        Integer a = fh.a();
        int intValue = a != null ? a.intValue() : 0;
        Integer a2 = fh.a();
        C0887Gk.a(new Layout(b, h, direction, null, stackContentJustification, null, e, null, arrayList, null, intValue, null, a2 != null ? a2.intValue() : 0, null, fh.c()), theme, str, fy, modifier2, startRestartGroup, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsHorizontalStackKt$ClcsHorizontalStack$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i5) {
                    C0881Ge.e(FH.this, theme, str, fy, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
