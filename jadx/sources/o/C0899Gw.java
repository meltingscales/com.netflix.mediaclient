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
import o.C0879Gc;
import o.C0899Gw;
import o.dpR;

/* renamed from: o.Gw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0899Gw {
    public static final void e(final C0879Gc c0879Gc, final Theme theme, final String str, final FY fy, Modifier modifier, Composer composer, final int i, final int i2) {
        ArrayList arrayList;
        C8632dsu.c((Object) c0879Gc, "");
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) fy, "");
        Composer startRestartGroup = composer.startRestartGroup(-964609377);
        final Modifier modifier2 = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964609377, i, -1, "com.netflix.clcs.ui.ClcsVerticalStack (ClcsVerticalStack.kt:17)");
        }
        String b = c0879Gc.b();
        FC h = c0879Gc.h();
        Layout.Direction direction = Layout.Direction.a;
        StackContentJustification c = c0879Gc.c();
        if (c == null) {
            c = StackContentJustification.c;
        }
        StackContentJustification stackContentJustification = c;
        ItemAlignment e = c0879Gc.e();
        if (c0879Gc.j()) {
            int size = c0879Gc.d().size();
            ArrayList arrayList2 = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                arrayList2.add(new Layout.Template.Flexible(0, Layout.Template.Flexible.Size.c, 1, null));
                i3++;
                size = size;
            }
            arrayList = arrayList2;
        } else {
            int size2 = c0879Gc.d().size();
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new Layout.Template.Flexible(0, null, 3, null));
            }
            arrayList = arrayList3;
        }
        Integer a = c0879Gc.a();
        int intValue = a != null ? a.intValue() : 0;
        Integer a2 = c0879Gc.a();
        C0887Gk.a(new Layout(b, h, direction, null, stackContentJustification, null, e, null, arrayList, null, intValue, null, a2 != null ? a2.intValue() : 0, null, c0879Gc.d()), theme, str, fy, modifier2, startRestartGroup, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsVerticalStackKt$ClcsVerticalStack$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i5) {
                    C0899Gw.e(C0879Gc.this, theme, str, fy, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
