package com.netflix.android.mdxpanel.postplay;

import android.view.View;
import android.view.ViewStub;
import com.netflix.android.mdxpanel.postplay.MdxPostPlayUIViewImpl$lazyViews$2;
import kotlin.jvm.internal.Lambda;
import o.AbstractC9791we;
import o.C8632dsu;
import o.C9726vo;
import o.C9749wK;
import o.C9795wi;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes2.dex */
public final class MdxPostPlayUIViewImpl$lazyViews$2 extends Lambda implements drO<C9749wK.a> {
    final /* synthetic */ View a;
    final /* synthetic */ C9749wK d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MdxPostPlayUIViewImpl$lazyViews$2(View view, C9749wK c9749wK) {
        super(0);
        this.a = view;
        this.d = c9749wK;
    }

    @Override // o.drO
    /* renamed from: c */
    public final C9749wK.a invoke() {
        View findViewById = this.a.findViewById(C9795wi.a.w);
        C9749wK c9749wK = this.d;
        View inflate = ((ViewStub) findViewById).inflate();
        C8632dsu.a(inflate, "");
        C9749wK.a aVar = new C9749wK.a(c9749wK, inflate);
        final C9749wK c9749wK2 = this.d;
        aVar.a().setOnClickListener(new View.OnClickListener() { // from class: o.wM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MdxPostPlayUIViewImpl$lazyViews$2.c(C9749wK.this, view);
            }
        });
        aVar.c().setOnClickListener(new View.OnClickListener() { // from class: o.wJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MdxPostPlayUIViewImpl$lazyViews$2.b(C9749wK.this, view);
            }
        });
        aVar.d().setOnClickListener(new View.OnClickListener() { // from class: o.wR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MdxPostPlayUIViewImpl$lazyViews$2.g(C9749wK.this, view);
            }
        });
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9749wK c9749wK, View view) {
        C8632dsu.c((Object) c9749wK, "");
        c9749wK.b((C9749wK) AbstractC9791we.f.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C9749wK c9749wK, View view) {
        String str;
        String str2;
        C8632dsu.c((Object) c9749wK, "");
        str = c9749wK.i;
        str2 = c9749wK.e;
        C9726vo.d(str, str2, new drX<String, String, dpR>() { // from class: com.netflix.android.mdxpanel.postplay.MdxPostPlayUIViewImpl$lazyViews$2$2$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(String str3, String str4) {
                c(str3, str4);
                return dpR.c;
            }

            public final void c(String str3, String str4) {
                C8632dsu.c((Object) str3, "");
                C8632dsu.c((Object) str4, "");
                C9749wK.this.b((C9749wK) new AbstractC9791we.b(str3, str4));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final C9749wK c9749wK, View view) {
        String str;
        String str2;
        Boolean bool;
        C8632dsu.c((Object) c9749wK, "");
        str = c9749wK.e;
        str2 = c9749wK.i;
        bool = c9749wK.d;
        C9726vo.d(str, str2, bool, new InterfaceC8612dsa<String, String, Boolean, dpR>() { // from class: com.netflix.android.mdxpanel.postplay.MdxPostPlayUIViewImpl$lazyViews$2$2$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(String str3, String str4, Boolean bool2) {
                b(str3, str4, bool2.booleanValue());
                return dpR.c;
            }

            public final void b(String str3, String str4, boolean z) {
                C8632dsu.c((Object) str3, "");
                C8632dsu.c((Object) str4, "");
                C9749wK.this.b((C9749wK) new AbstractC9791we.g(str3, str4, z));
            }
        });
    }
}
