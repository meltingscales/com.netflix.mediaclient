package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;
import o.drX;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public final class CardKt {
    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final InterfaceC8612dsa<? super ColumnScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i, final int i2) {
        Object obj;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        Object obj2;
        Object obj3;
        Object obj4;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation2;
        Object obj5;
        int i4;
        CardElevation cardElevation3;
        final CardElevation cardElevation4;
        final BorderStroke borderStroke2;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1179621553);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 6) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i6 = JSONzip.end;
                    i3 |= i6;
                }
            } else {
                cardColors2 = cardColors;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                obj2 = cardElevation;
                if (startRestartGroup.changed(obj2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                obj2 = cardElevation;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            obj2 = cardElevation;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
            obj3 = borderStroke;
        } else {
            obj3 = borderStroke;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                obj4 = i8 != 0 ? Modifier.Companion : obj;
                if ((i2 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 4) != 0) {
                    cardColors3 = CardDefaults.INSTANCE.cardColors(startRestartGroup, 6);
                    i3 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i2 & 8) != 0) {
                    cardElevation2 = CardDefaults.INSTANCE.m732cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                    i3 &= -7169;
                } else {
                    cardElevation2 = obj2;
                }
                obj5 = i9 != 0 ? null : borderStroke;
                Object obj6 = cardElevation2;
                i4 = i3;
                cardElevation3 = obj6;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                obj4 = obj;
                shape3 = shape2;
                cardColors3 = cardColors2;
                obj5 = obj3;
                i4 = i3;
                cardElevation3 = obj2;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i4, -1, "androidx.compose.material3.Card (Card.kt:83)");
            }
            CardElevation cardElevation5 = cardElevation3;
            SurfaceKt.m831SurfaceT9BRK9s(obj4, shape3, cardColors3.m728containerColorvNxB06k$material3_release(true), cardColors3.m729contentColorvNxB06k$material3_release(true), cardElevation3.m733tonalElevationu2uoSUM$material3_release(true), cardElevation3.shadowElevation$material3_release(true, null, startRestartGroup, ((i4 >> 3) & 896) | 54).getValue().m2498unboximpl(), obj5, ComposableLambdaKt.composableLambda(startRestartGroup, 664103990, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.CardKt$Card$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i10) {
                    if ((i10 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(664103990, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:93)");
                    }
                    InterfaceC8612dsa<ColumnScope, Composer, Integer, dpR> interfaceC8612dsa2 = interfaceC8612dsa;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion2.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                    Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    interfaceC8612dsa2.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, (i4 & 14) | 12582912 | (i4 & 112) | (3670016 & (i4 << 6)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors2 = cardColors3;
            cardElevation4 = cardElevation5;
            borderStroke2 = obj5;
        } else {
            startRestartGroup.skipToGroupEnd();
            obj4 = obj;
            shape3 = shape2;
            cardElevation4 = obj2;
            borderStroke2 = obj3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = obj4;
            final Shape shape4 = shape3;
            final CardColors cardColors4 = cardColors2;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.CardKt$Card$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i10) {
                    CardKt.Card(Modifier.this, shape4, cardColors4, cardElevation4, borderStroke2, interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
