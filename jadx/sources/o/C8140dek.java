package o;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;

/* renamed from: o.dek  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8140dek {
    public static final C8140dek a = new C8140dek();

    private C8140dek() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InterfaceC5223buh & InterfaceC5160btX> CharSequence b(Context context, T t) {
        CharSequence c;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) t, "");
        String title = t.getTitle();
        if (title == null) {
            title = t.aC_();
        }
        if (title == null) {
            String string = context.getString(com.netflix.mediaclient.ui.R.o.fJ);
            C8632dsu.a(string, "");
            return string;
        } else if (t.isPlayable() || (c = c(context, title)) == null) {
            dsE dse = dsE.b;
            String string2 = context.getResources().getString(com.netflix.mediaclient.ui.R.o.l);
            C8632dsu.a(string2, "");
            String format = String.format(string2, Arrays.copyOf(new Object[]{title}, 1));
            C8632dsu.a(format, "");
            return format;
        } else {
            return c;
        }
    }

    private final CharSequence b(Context context, String str, boolean z) {
        CharSequence c;
        return str == null ? "" : (z || (c = c(context, str)) == null) ? str : c;
    }

    public final CharSequence a(Context context, InterfaceC5223buh interfaceC5223buh) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        return b(context, interfaceC5223buh.getTitle(), interfaceC5223buh.isPlayable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InterfaceC5223buh & InterfaceC5160btX> CharSequence d(Context context, T t) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) t, "");
        String title = t.getTitle();
        if (title == null) {
            title = t.aC_();
        }
        return b(context, title, t.isPlayable());
    }

    private final CharSequence c(Context context, CharSequence charSequence) {
        if (C1584aGs.d((Activity) C9737vz.e(context, Activity.class)).g()) {
            return C1584aGs.d((Activity) C9737vz.e(context, Activity.class)).d(charSequence);
        }
        return null;
    }
}
