package com.netflix.android.components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.netflix.android.components.ErrorUIView$uiView$2;
import kotlin.jvm.internal.Lambda;
import o.AbstractC9672un;
import o.C8632dsu;
import o.C9634uB;
import o.C9678ut;
import o.C9703vR;
import o.drO;

/* loaded from: classes2.dex */
public final class ErrorUIView$uiView$2 extends Lambda implements drO<View> {
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ C9678ut d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorUIView$uiView$2(ViewGroup viewGroup, C9678ut c9678ut) {
        super(0);
        this.c = viewGroup;
        this.d = c9678ut;
    }

    @Override // o.drO
    /* renamed from: a */
    public final View invoke() {
        View e = C9703vR.e(this.c, C9634uB.e.b, 0, 2, null);
        e.setVisibility(8);
        final C9678ut c9678ut = this.d;
        ((Button) e.findViewById(C9634uB.d.b)).setOnClickListener(new View.OnClickListener() { // from class: o.uu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorUIView$uiView$2.c(C9678ut.this, view);
            }
        });
        final C9678ut c9678ut2 = this.d;
        ((Button) e.findViewById(C9634uB.d.d)).setOnClickListener(new View.OnClickListener() { // from class: o.uw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorUIView$uiView$2.a(C9678ut.this, view);
            }
        });
        this.d.e = true;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9678ut c9678ut, View view) {
        C8632dsu.c((Object) c9678ut, "");
        c9678ut.b((C9678ut) AbstractC9672un.e.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9678ut c9678ut, View view) {
        C8632dsu.c((Object) c9678ut, "");
        c9678ut.b((C9678ut) AbstractC9672un.d.e);
    }
}
