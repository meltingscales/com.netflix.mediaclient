package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import java.nio.charset.StandardCharsets;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    final AlertController mAlert;

    public AlertDialog(Context context) {
        this(context, 0);
    }

    public AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & PrivateKeyType.INVALID) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        return this.mAlert.getButton(i);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, null, null);
    }

    public void setIcon(int i) {
        this.mAlert.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private static int d = 1;
        private static int e = 0;
        private static byte e$ss2$263 = 24;
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(Context context, int i) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public Context getContext() {
            return this.P.mContext;
        }

        public Builder setTitle(int i) {
            int i2 = 2 % 2;
            int i3 = e + 7;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                this.P.mContext.getString(i).startsWith("'!#+");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            String string = context.getString(i);
            if (string.startsWith("'!#+")) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                g(substring, objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                } else {
                    int i4 = d + 43;
                    e = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            alertParams.mTitle = string;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public Builder setMessage(int i) {
            int i2 = 2 % 2;
            int i3 = d + 85;
            e = i3 % 128;
            int i4 = i3 % 2;
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            String string = context.getString(i);
            if (!(!string.startsWith("'!#+"))) {
                int i5 = d + 55;
                e = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    g(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    boolean z = context.getText(i) instanceof Spanned;
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                g(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                } else {
                    int i6 = e + 71;
                    d = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            alertParams.mMessage = string;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            int i2 = 2 % 2;
            int i3 = d + 83;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                AlertController.AlertParams alertParams = this.P;
                Context context = alertParams.mContext;
                String string = context.getString(i);
                if (!(!string.startsWith("'!#+"))) {
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    g(substring, objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(i);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        int i4 = e + 47;
                        d = i4 % 128;
                        int i5 = i4 % 2;
                        string = spannableString;
                    }
                }
                alertParams.mPositiveButtonText = string;
                this.P.mPositiveButtonListener = onClickListener;
                return this;
            }
            this.P.mContext.getString(i).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            int i2 = 2 % 2;
            int i3 = d + 19;
            e = i3 % 128;
            int i4 = i3 % 2;
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            String string = context.getString(i);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                g(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    int i5 = d + 111;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    string = spannableString;
                }
            }
            alertParams.mNegativeButtonText = string;
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            int i2 = 2 % 2;
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            String string = context.getString(i);
            if (!(!string.startsWith("'!#+"))) {
                int i3 = e + 99;
                d = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                g(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    int i5 = d + 113;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    string = spannableString;
                } else {
                    int i7 = e + 29;
                    d = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 5 % 4;
                    }
                }
            }
            alertParams.mNeutralButtonText = string;
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.P.mCancelable = z;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.P.mOnKeyListener;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        private void g(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$263);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }
}
