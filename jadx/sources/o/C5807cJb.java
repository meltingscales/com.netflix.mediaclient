package o;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* renamed from: o.cJb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5807cJb {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final int r37, final int r38, final boolean r39, final boolean r40, final boolean r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5807cJb.e(int, int, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier e(Modifier modifier, final int i) {
        return LayoutModifierKt.layout(modifier, new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerSeekbarBifKt$placeBif$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return d(measureScope, measurable, constraints.m2478unboximpl());
            }

            public final MeasureResult d(MeasureScope measureScope, Measurable measurable, long j) {
                C8632dsu.c((Object) measureScope, "");
                C8632dsu.c((Object) measurable, "");
                final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
                int width = mo1803measureBRTryo0.getWidth();
                int height = mo1803measureBRTryo0.getHeight();
                final int i2 = i;
                return MeasureScope.layout$default(measureScope, width, height, null, new drM<Placeable.PlacementScope, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerSeekbarBifKt$placeBif$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                        b(placementScope);
                        return dpR.c;
                    }

                    public final void b(Placeable.PlacementScope placementScope) {
                        C8632dsu.c((Object) placementScope, "");
                        Placeable placeable = Placeable.this;
                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i2 - (placeable.getWidth() / 2), 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        });
    }
}
