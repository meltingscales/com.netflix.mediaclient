package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Locale;

/* renamed from: o.aMk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1738aMk {
    int a(Context context, LoMoType loMoType);

    InterfaceC1903aSn a();

    void a(Context context);

    void a(Context context, Intent intent);

    void a(Context context, Handler handler, UserAgent userAgent, Runnable runnable);

    void a(InterfaceC5283bvo interfaceC5283bvo);

    Intent b(Context context);

    Intent b(Context context, String str);

    void b(String str);

    void b(boolean z, boolean z2);

    boolean b();

    Intent c(Context context);

    Class c();

    String c(UserAgent userAgent);

    void c(ImageView imageView, Drawable drawable, Bitmap bitmap);

    aOZ d();

    void d(Context context);

    String e();

    Locale e(Context context);

    void e(String str);

    void h();
}
