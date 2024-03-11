package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7112cq extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public C7112cq() {
    }

    public C7112cq(int i) {
        super(i);
    }

    public C7112cq(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C7112cq(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C8853eZ.a(i, 0, (int) PrivateKeyType.INVALID) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(C8853eZ.a(i, 0, (int) PrivateKeyType.INVALID));
    }
}
