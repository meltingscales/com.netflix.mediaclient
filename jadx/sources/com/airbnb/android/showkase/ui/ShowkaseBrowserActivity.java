package com.airbnb.android.showkase.ui;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.airbnb.android.showkase.exceptions.ShowkaseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.A;
import o.C;
import o.C8627dsp;
import o.C8632dsu;
import o.D;
import o.E;
import o.F;
import o.I;
import o.P;
import o.W;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
public final class ShowkaseBrowserActivity extends AppCompatActivity {
    public static final e a = new e(null);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        final String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("SHOWKASE_ROOT_MODULE")) == null) {
            throw new ShowkaseException("Missing key in bundle. Please start this activity by using the intent returned by the ShowkaseBrowserActivity.getIntent() method.");
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-695351285, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                E d;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-695351285, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserActivity.onCreate.<anonymous> (ShowkaseBrowserActivity.kt:25)");
                    }
                    d = ShowkaseBrowserActivity.this.d(string);
                    List<C> c = d.c();
                    List<A> a2 = d.a();
                    List<F> b = d.b();
                    composer.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new D(null, null, null, null, false, null, 63, null), null, 2, null);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    MutableState mutableState = (MutableState) rememberedValue;
                    if ((!c.isEmpty()) || (!a2.isEmpty()) || (!b.isEmpty())) {
                        composer.startReplaceableGroup(-1589906276);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : c) {
                            String d2 = ((C) obj).d();
                            Object obj2 = linkedHashMap.get(d2);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap.put(d2, obj2);
                            }
                            ((List) obj2).add(obj);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj3 : a2) {
                            String c2 = ((A) obj3).c();
                            Object obj4 = linkedHashMap2.get(c2);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap2.put(c2, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj5 : b) {
                            String a3 = ((F) obj5).a();
                            Object obj6 = linkedHashMap3.get(a3);
                            if (obj6 == null) {
                                obj6 = new ArrayList();
                                linkedHashMap3.put(a3, obj6);
                            }
                            ((List) obj6).add(obj5);
                        }
                        P.b(linkedHashMap, linkedHashMap2, linkedHashMap3, mutableState, composer, 3656);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(-1589905920);
                        W.b("There were no elements that were annotated with either @ShowkaseComposable, @ShowkaseTypography or @ShowkaseColor. If you think this is a mistake, file an issue at https://github.com/airbnb/Showkase/issues", composer, 6);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E d(String str) {
        try {
            Object newInstance = Class.forName(str + "Codegen").newInstance();
            C8632dsu.d(newInstance);
            E c = ((I) newInstance).c();
            return new E(c.e(), c.d(), c.g());
        } catch (ClassNotFoundException unused) {
            return new E(null, null, null, 7, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
