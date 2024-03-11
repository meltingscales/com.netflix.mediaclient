package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import o.C8632dsu;
import o.InterfaceC8888fH;

/* renamed from: o.gx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8983gx {
    public static final ComponentActivity d(Context context) {
        C8632dsu.c((Object) context, "");
        if (context instanceof ComponentActivity) {
            return (ComponentActivity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C8632dsu.a(context, "");
        }
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* renamed from: o.gx$d */
    /* loaded from: classes2.dex */
    public static final class d<A> implements dyS<A> {
        final /* synthetic */ dyS a;
        final /* synthetic */ dtE d;

        public d(dyS dys, dtE dte) {
            this.a = dys;
            this.d = dte;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass2(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.gx$d$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ a;
            final /* synthetic */ dtE e;

            public AnonymousClass2(dyQ dyq, dtE dte) {
                this.a = dyq;
                this.e = dte;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1 r0 = (com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1 r0 = new com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.a
                    o.fH r5 = (o.InterfaceC8888fH) r5
                    o.dtE r2 = r4.e
                    java.lang.Object r5 = r2.get(r5)
                    r0.e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8983gx.d.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    public static final Fragment e(View view) {
        C8632dsu.c((Object) view, "");
        try {
            return FragmentManager.findFragment(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> State<S> e(VM vm, Composer composer, int i) {
        C8632dsu.c((Object) vm, "");
        composer.startReplaceableGroup(-743162186);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-743162186, i, -1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:142)");
        }
        State<S> collectAsState = SnapshotStateKt.collectAsState(vm.a(), C8980gu.c(vm, new drM<S, S>() { // from class: com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$1
            /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
            @Override // o.drM
            /* renamed from: e */
            public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                C8632dsu.c((Object) interfaceC8888fH, "");
                return interfaceC8888fH;
            }
        }), null, composer, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH, A> State<A> a(VM vm, final dtE<S, ? extends A> dte, Composer composer, int i) {
        C8632dsu.c((Object) vm, "");
        C8632dsu.c((Object) dte, "");
        composer.startReplaceableGroup(-1063268123);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1063268123, i, -1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:168)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(dte);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = dyR.e(new d(vm.a(), dte));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State<A> collectAsState = SnapshotStateKt.collectAsState((dyS) rememberedValue, C8980gu.c(vm, new drM<S, A>() { // from class: com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;)TA; */
            @Override // o.drM
            /* renamed from: b */
            public final Object invoke(InterfaceC8888fH interfaceC8888fH) {
                C8632dsu.c((Object) interfaceC8888fH, "");
                return dte.get(interfaceC8888fH);
            }
        }), null, composer, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }
}
