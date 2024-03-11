package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.InterfaceC8615dsd;
import o.InterfaceC8619dsh;
import o.InterfaceC8620dsi;
import o.dpR;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements ComposableLambda {
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int i, boolean z, Object obj) {
        this.key = i;
        this.tracked = z;
        this._block = obj;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return invoke(obj, composer, num.intValue());
    }

    @Override // o.InterfaceC8613dsb
    public /* synthetic */ Object invoke(Object obj, Object obj2, Composer composer, Integer num) {
        return invoke(obj, obj2, composer, num.intValue());
    }

    @Override // o.InterfaceC8615dsd
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, composer, num.intValue());
    }

    @Override // o.InterfaceC8619dsh
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Override // o.InterfaceC8620dsi
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    public final void update(Object obj) {
        if (C8632dsu.c(this._block, obj)) {
            return;
        }
        boolean z = this._block == null;
        this._block = obj;
        if (z) {
            return;
        }
        trackWrite();
    }

    public Object invoke(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0);
        Object obj = this._block;
        C8632dsu.d(obj);
        Object invoke = ((drX) dsH.a(obj, 2)).invoke(startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            C8632dsu.d(this);
            endRestartGroup.updateScope((drX) dsH.a(this, 2));
        }
        return invoke;
    }

    public Object invoke(final Object obj, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object obj2 = this._block;
        C8632dsu.d(obj2);
        Object invoke = ((InterfaceC8612dsa) dsH.a(obj2, 3)).invoke(obj, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.invoke(obj, composer2, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object invoke(final Object obj, final Object obj2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object obj3 = this._block;
        C8632dsu.d(obj3);
        Object invoke = ((InterfaceC8613dsb) dsH.a(obj3, 4)).invoke(obj, obj2, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, composer2, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object obj4 = this._block;
        C8632dsu.d(obj4);
        Object invoke = ((InterfaceC8615dsd) dsH.a(obj4, 5)).invoke(obj, obj2, obj3, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object obj5 = this._block;
        C8632dsu.d(obj5);
        Object invoke = ((InterfaceC8619dsh) dsH.a(obj5, 6)).invoke(obj, obj2, obj3, obj4, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, composer2, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object obj6 = this._block;
        C8632dsu.d(obj6);
        Object invoke = ((InterfaceC8620dsi) dsH.a(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, composer2, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
                }
            });
        }
        return invoke;
    }
}
