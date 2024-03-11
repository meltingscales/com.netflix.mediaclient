package o;

import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;

/* renamed from: o.bxy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5399bxy {
    public static InterfaceC5350bxB c(Context context) {
        boolean c = C1850aQo.c();
        if (AbstractC5349bxA.c.e(context)) {
            c = false;
        }
        if (!(!C8150deu.a(context)) && c) {
            return new C5400bxz(AppUpdateManagerFactory.create(context.getApplicationContext()));
        }
        return new C5356bxH();
    }
}
