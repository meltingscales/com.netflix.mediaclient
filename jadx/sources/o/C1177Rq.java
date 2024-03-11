package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.TypedArrayKt;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Rq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1177Rq extends FrameLayout {
    private final C1203Sq a;
    private final View d;
    private CharSequence e;
    private final C1204Sr f;
    private drX<? super View, ? super CharSequence, dpR> g;
    private String h;
    private boolean i;
    public static final a c = new a(null);
    public static final int b = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1177Rq(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1177Rq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final C1203Sq a() {
        return this.a;
    }

    public final void setLinkToCopy(CharSequence charSequence) {
        this.e = charSequence;
    }

    public final void setOnCopyLinkClicked(drX<? super View, ? super CharSequence, dpR> drx) {
        this.g = drx;
    }

    public final void setShowCopiedMessages(boolean z) {
        this.i = z;
    }

    public final void setVisibleToken(String str) {
        this.h = str;
    }

    public /* synthetic */ C1177Rq(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177Rq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.i = true;
        View.inflate(context, C9834xU.i.a, this);
        View findViewById = findViewById(C9834xU.g.l);
        C8632dsu.a(findViewById, "");
        this.d = findViewById;
        View findViewById2 = findViewById(C9834xU.g.w);
        C8632dsu.a(findViewById2, "");
        this.f = (C1204Sr) findViewById2;
        View findViewById3 = findViewById(C9834xU.g.n);
        C8632dsu.a(findViewById3, "");
        C1203Sq c1203Sq = (C1203Sq) findViewById3;
        this.a = c1203Sq;
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.Rm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1177Rq.a(C1177Rq.this, view);
            }
        });
        a(attributeSet, i);
        C1332Xp c1332Xp = C1332Xp.b;
        C9702vQ.d(findViewById, (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), false, false, 6, null);
    }

    /* renamed from: o.Rq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public final void setLabel(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1177Rq c1177Rq, View view) {
        C8632dsu.c((Object) c1177Rq, "");
        CharSequence charSequence = c1177Rq.e;
        if (charSequence == null) {
            throw new IllegalArgumentException("linkToCopy is mandatory".toString());
        }
        c1177Rq.e(charSequence);
    }

    private final void a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C9834xU.n.p, i, 0);
        try {
            View view = this.d;
            if (obtainStyledAttributes.hasValue(C9834xU.n.r)) {
                drawable = obtainStyledAttributes.getDrawable(C9834xU.n.r);
            } else {
                drawable = ContextCompat.getDrawable(getContext(), C9834xU.c.p);
            }
            view.setBackground(drawable);
            if (obtainStyledAttributes.hasValue(C9834xU.n.x)) {
                C1204Sr c1204Sr = this.f;
                C8632dsu.d(obtainStyledAttributes);
                c1204Sr.setTextColor(TypedArrayKt.getColorStateListOrThrow(obtainStyledAttributes, C9834xU.n.x));
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.q)) {
                C1203Sq c1203Sq = this.a;
                C8632dsu.d(obtainStyledAttributes);
                C1203Sq.a(c1203Sq, null, null, TypedArrayKt.getColorStateListOrThrow(obtainStyledAttributes, C9834xU.n.q), null, false, 0, 0, 0, 0, false, false, 2043, null);
            }
            if (obtainStyledAttributes.hasValue(C9834xU.n.t)) {
                C1203Sq c1203Sq2 = this.a;
                C8632dsu.d(obtainStyledAttributes);
                C1203Sq.a(c1203Sq2, null, TypedArrayKt.getColorStateListOrThrow(obtainStyledAttributes, C9834xU.n.t), null, null, false, 0, 0, 0, 0, false, false, 2045, null);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void e(CharSequence charSequence) {
        Map d;
        Map k;
        Throwable th;
        Context context = getContext();
        C8632dsu.a(context, "");
        ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(context, ClipboardManager.class);
        if (clipboardManager != null) {
            ClipData newPlainText = ClipData.newPlainText("link", charSequence);
            ClipDescription description = newPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", false);
            description.setExtras(persistableBundle);
            clipboardManager.setPrimaryClip(newPlainText);
            if (this.i) {
                C8054ddD.c(getContext(), C9834xU.h.i, 0);
            }
            drX<? super View, ? super CharSequence, dpR> drx = this.g;
            if (drx != null) {
                drx.invoke(this.a, charSequence);
                return;
            }
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Clipboard not available?", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    public static /* synthetic */ void setLinkText$default(C1177Rq c1177Rq, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        c1177Rq.setLinkText(charSequence, charSequence2);
    }

    public final void setLinkText(CharSequence charSequence, CharSequence charSequence2) {
        String a2;
        String a3;
        C1204Sr c1204Sr = this.f;
        if (charSequence != null && charSequence2 != null) {
            a2 = C1178Rr.a(charSequence);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append((Object) charSequence2);
            a3 = C1178Rr.a(sb.toString());
            SpannableString spannableString = new SpannableString(a3);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), C9834xU.c.f13913o)), a2.length(), a3.length(), 17);
            charSequence = spannableString;
        }
        c1204Sr.setText(charSequence);
    }
}
