package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class SZ extends TextView {
    private boolean a;

    public void setUnderline(boolean z) {
        this.a = z;
    }

    public SZ(Context context) {
        super(context);
    }

    public SZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet);
    }

    public SZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(attributeSet);
    }

    private void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.netflix.mediaclient.ui.R.k.m);
        if (obtainStyledAttributes == null) {
            return;
        }
        for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == com.netflix.mediaclient.ui.R.k.l) {
                this.a = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && this.a) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new UnderlineSpan(), 0, charSequence.length(), 0);
            super.setText(spannableString, TextView.BufferType.SPANNABLE);
            return;
        }
        super.setText(charSequence, bufferType);
    }
}
