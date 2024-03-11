package o;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import o.C5503bzw;

/* renamed from: o.bzf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterface$OnClickListenerC5486bzf extends AlertDialog implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener {
    public static final e a;
    private static byte e$ss2$97 = 0;
    private static int g = 1;
    private static int h;
    private int b;
    private final DatePicker c;
    private int d;
    private a e;
    private int i;

    /* renamed from: o.bzf$a */
    /* loaded from: classes4.dex */
    public interface a {
        void e(DatePicker datePicker, int i, int i2, int i3);
    }

    static {
        d();
        a = new e(null);
    }

    static void d() {
        e$ss2$97 = (byte) 24;
    }

    public final DatePicker a() {
        return this.c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogInterface$OnClickListenerC5486bzf(Context context, int i, a aVar, int i2, int i3, int i4) {
        this(context, i, aVar, null, i2, i3, i4);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aVar, "");
    }

    private DialogInterface$OnClickListenerC5486bzf(Context context, int i, a aVar, Calendar calendar, int i2, int i3, int i4) {
        super(context, a.a(context, i));
        this.e = aVar;
        this.i = i2;
        this.b = i3;
        this.d = i4;
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        View inflate = LayoutInflater.from(context2).inflate(C5503bzw.d.m, (ViewGroup) null);
        C8632dsu.d(inflate);
        DatePicker datePicker = (DatePicker) inflate;
        this.c = datePicker;
        if (calendar != null) {
            this.i = calendar.get(1);
            this.b = calendar.get(2);
            this.d = calendar.get(5);
        }
        datePicker.init(this.i, this.b, this.d, this);
        setView(datePicker);
        String string = context2.getString(C5503bzw.a.j);
        if (!(!string.startsWith("'!#+"))) {
            int i5 = h + 43;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                j(substring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            j(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
            int i6 = g + 29;
            h = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        setButton(-1, string, this);
        setButton(-2, context2.getString(17039360), this);
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        C8632dsu.c((Object) datePicker, "");
        this.c.init(i, i2, i3, this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        a aVar;
        C8632dsu.c((Object) dialogInterface, "");
        if (i == -2) {
            cancel();
        } else if (i == -1 && (aVar = this.e) != null) {
            this.c.clearFocus();
            DatePicker datePicker = this.c;
            aVar.e(datePicker, datePicker.getYear(), this.c.getMonth(), this.c.getDayOfMonth());
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR, this.c.getYear());
        onSaveInstanceState.putInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH, this.c.getMonth());
        onSaveInstanceState.putInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_DAY, this.c.getDayOfMonth());
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onRestoreInstanceState(bundle);
        this.c.init(bundle.getInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR), bundle.getInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH), bundle.getInt(SignupConstants.Field.DEMO_COLLECT_BIRTH_DAY), this);
    }

    /* renamed from: o.bzf$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(Context context, int i) {
            boolean z = i == 0;
            if (z) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16843948, typedValue, true);
                return typedValue.resourceId;
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            } else {
                return i;
            }
        }
    }

    private static void j(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$97);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
