package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C9834xU;

/* renamed from: o.Sv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1208Sv extends LinearLayout {
    private int a;
    private d b;
    private final List<EditText> c;
    private boolean d;

    /* renamed from: o.Sv$d */
    /* loaded from: classes3.dex */
    public interface d {
        void b(String str);

        void e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1208Sv(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1208Sv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final List<EditText> d() {
        return this.c;
    }

    public final d e() {
        return this.b;
    }

    public final void setFirstTouchEventInterception(boolean z) {
        this.d = z;
    }

    public final void setPinBackground(int i) {
        this.a = i;
    }

    public final void setPinChangeListener(d dVar) {
        this.b = dVar;
    }

    public /* synthetic */ C1208Sv(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208Sv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8654dtp g;
        int d2;
        C8632dsu.c((Object) context, "");
        this.d = true;
        int i2 = C9834xU.o.g;
        this.a = C9834xU.j.H;
        int i3 = C9834xU.a.H;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9834xU.n.ad, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(C9834xU.n.af, 8);
            boolean z = obtainStyledAttributes.getBoolean(C9834xU.n.ai, true);
            int resourceId = obtainStyledAttributes.getResourceId(C9834xU.n.am, i2);
            this.a = obtainStyledAttributes.getResourceId(C9834xU.n.ag, this.a);
            int resourceId2 = obtainStyledAttributes.getResourceId(C9834xU.n.ah, i3);
            obtainStyledAttributes.recycle();
            setGravity(17);
            setOrientation(0);
            setLayoutDirection(0);
            g = C8657dts.g(0, integer);
            d2 = C8572dqo.d(g, 10);
            ArrayList arrayList = new ArrayList(d2);
            Iterator<Integer> it = g.iterator();
            while (it.hasNext()) {
                int nextInt = ((dqB) it).nextInt();
                if (z && nextInt == integer / 2) {
                    View view = new View(context);
                    view.setBackgroundColor(ContextCompat.getColor(context, C9834xU.c.f13913o));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) context.getResources().getDimension(C9834xU.a.E), (int) context.getResources().getDimension(C9834xU.a.G));
                    layoutParams.setMarginStart((int) (context.getResources().getDimension(C9834xU.a.A) - context.getResources().getDimension(C9834xU.a.H)));
                    layoutParams.setMarginEnd((int) context.getResources().getDimension(C9834xU.a.A));
                    C1332Xp c1332Xp = C1332Xp.b;
                    layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
                    addView(view, layoutParams);
                }
                EditText editText = new EditText(new ContextThemeWrapper(context, resourceId));
                editText.setId(C9834xU.g.E);
                editText.setBackground(ContextCompat.getDrawable(context, this.a));
                editText.setGravity(17);
                C1332Xp c1332Xp2 = C1332Xp.b;
                editText.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                if (nextInt == integer - 1) {
                    editText.setImeOptions(6);
                } else {
                    layoutParams2.setMarginEnd((int) context.getResources().getDimension(resourceId2));
                }
                addView(editText, layoutParams2);
                arrayList.add(editText);
            }
            this.c = arrayList;
            a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(EditText editText, EditText editText2, View view, int i, KeyEvent keyEvent) {
        Editable text;
        C8632dsu.c((Object) editText, "");
        if (keyEvent.getAction() == 0 && i == 67) {
            Editable text2 = editText.getText();
            if (text2 == null || text2.length() == 0) {
                if (editText2 != null && (text = editText2.getText()) != null) {
                    text.clear();
                }
                if (editText2 != null) {
                    editText2.requestFocus();
                }
            } else {
                editText.getText().clear();
            }
            return true;
        }
        return false;
    }

    /* renamed from: o.Sv$a */
    /* loaded from: classes3.dex */
    public static final class a implements TextWatcher {
        final /* synthetic */ EditText a;
        final /* synthetic */ C1208Sv d;
        final /* synthetic */ EditText e;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        a(EditText editText, C1208Sv c1208Sv, EditText editText2) {
            this.e = editText;
            this.d = c1208Sv;
            this.a = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null && editable.length() > 0) {
                if (editable.length() <= 1 || this.e == null) {
                    EditText editText = this.e;
                    if (editText != null) {
                        editText.requestFocus();
                    }
                } else {
                    this.d.setPin(editable.toString());
                }
            }
            d e = this.d.e();
            if (e != null) {
                e.b(this.d.c());
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            char t;
            if (this.e != null || charSequence == null || charSequence.length() <= 1) {
                return;
            }
            EditText editText = this.a;
            t = duB.t(charSequence);
            editText.setText(String.valueOf(t));
            editText.setSelection(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C1208Sv c1208Sv, TextView textView, int i, KeyEvent keyEvent) {
        d dVar;
        C8632dsu.c((Object) c1208Sv, "");
        if (i != 6 || (dVar = c1208Sv.b) == null) {
            return false;
        }
        dVar.e();
        return false;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        for (EditText editText : this.c) {
            sb.append(editText.getText().toString());
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (this.d && motionEvent.getAction() == 0) {
            this.d = false;
            b();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final void b() {
        this.c.get(0).requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.c.get(0), 1);
        }
    }

    private final void a() {
        Object B;
        Object f;
        Object f2;
        int i = 0;
        for (Object obj : this.c) {
            int i2 = i + 1;
            if (i < 0) {
                C8569dql.h();
            }
            final EditText editText = (EditText) obj;
            f = C8576dqs.f((List<? extends Object>) this.c, i2);
            f2 = C8576dqs.f((List<? extends Object>) this.c, i - 1);
            final EditText editText2 = (EditText) f2;
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: o.Sw
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                    boolean a2;
                    a2 = C1208Sv.a(editText, editText2, view, i3, keyEvent);
                    return a2;
                }
            });
            this.c.get(i).addTextChangedListener(new a((EditText) f, this, editText));
            this.c.get(i).setContentDescription(C1333Xq.d(C9834xU.h.m).d("number", Integer.valueOf(i2)).c());
            i = i2;
        }
        B = C8576dqs.B((List<? extends Object>) this.c);
        ((EditText) B).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.Sy
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                boolean d2;
                d2 = C1208Sv.d(C1208Sv.this, textView, i3, keyEvent);
                return d2;
            }
        });
    }

    public final void setPin(String str) {
        C8632dsu.c((Object) str, "");
        int i = 0;
        for (Object obj : this.c) {
            if (i < 0) {
                C8569dql.h();
            }
            EditText editText = (EditText) obj;
            if (i < str.length()) {
                editText.setText(String.valueOf(str.charAt(i)));
                if (i == this.c.size() - 1) {
                    editText.setSelection(1);
                }
            }
            i++;
        }
    }

    public final void setErrorState(boolean z) {
        for (EditText editText : this.c) {
            editText.setBackground(ResourcesCompat.getDrawable(getResources(), z ? C9834xU.j.G : this.a, getContext().getTheme()));
        }
    }
}
