package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Base64;
import android.view.KeyEvent;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import o.SY;

/* renamed from: o.Rc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163Rc {
    private static int b = 1;
    private static int d = 0;
    private static byte e$ss2$101 = 24;

    /* renamed from: o.Rc$c */
    /* loaded from: classes3.dex */
    public static class c extends e {
        String c;
        Runnable e;
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    public static SY.e d(Context context, String str, String str2, Handler handler, String str3, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        return e(context, str, str2, handler, str3, runnable, null, null, true, runnable2, runnable3);
    }

    public static SY.e c(Context context, final Handler handler, C1907aSr c1907aSr, final Runnable runnable) {
        if (c1907aSr instanceof c) {
            final c cVar = (c) c1907aSr;
            SY.e e2 = e(context, cVar.g, cVar.i, handler, cVar.h, cVar.j, cVar.b, cVar.d, false, runnable, c1907aSr.a);
            C1044Mm.a("nf_dialog", "createDialog ThreeButtonAlertDialogDescriptor");
            e2.b(cVar.c, new DialogInterface.OnClickListener() { // from class: o.Rc.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Runnable runnable2 = c.this.e;
                    if (runnable2 != null) {
                        handler.post(runnable2);
                    }
                    Runnable runnable3 = runnable;
                    if (runnable3 != null) {
                        handler.post(runnable3);
                    }
                }
            });
            return e2;
        } else if (c1907aSr instanceof e) {
            e eVar = (e) c1907aSr;
            return e(context, eVar.g, eVar.i, handler, eVar.h, eVar.j, eVar.b, eVar.d, false, runnable, c1907aSr.a);
        } else {
            return d(context, c1907aSr.g, c1907aSr.i, handler, c1907aSr.h, c1907aSr.j, runnable, c1907aSr.a);
        }
    }

    public static SY.e e(Context context, Handler handler, C1907aSr c1907aSr) {
        return c(context, handler, c1907aSr, null);
    }

    private static Spannable c(String str) {
        if (C8168dfL.g(str)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str.replaceAll("netflix.com/changeplan.", "netflix.com/changeplan"));
        try {
            Linkify.addLinks(spannableString, 15);
        } catch (Throwable th) {
            C1044Mm.e("nf_dialog", "SPY-10546: Unable to add links to spannable", th);
        }
        return spannableString;
    }

    public static SY.e e(Context context, String str, String str2, final Handler handler, String str3, final Runnable runnable, String str4, final Runnable runnable2, boolean z, final Runnable runnable3, final Runnable runnable4) {
        String string;
        String string2;
        int i = 2 % 2;
        SY.e eVar = new SY.e(context);
        eVar.c(b(str));
        eVar.e(c(str2));
        if (str3 != null) {
            string = str3;
        } else {
            string = context.getString(com.netflix.mediaclient.ui.R.o.f13253fi);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
        }
        if (str4 != null) {
            string2 = str4;
        } else {
            string2 = context.getString(com.netflix.mediaclient.ui.R.o.cL);
            if (string2.startsWith("'!#+")) {
                int i2 = b + 69;
                d = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr2 = new Object[1];
                f(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            int i4 = d + 79;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        if (handler != null) {
            if (runnable4 != null) {
                eVar.b(new DialogInterface.OnKeyListener() { // from class: o.Rf
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                        boolean c2;
                        c2 = C1163Rc.c(handler, runnable4, runnable3, dialogInterface, i6, keyEvent);
                        return c2;
                    }
                });
            }
            eVar.c(string, new DialogInterface.OnClickListener() { // from class: o.Rc.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i6) {
                    Runnable runnable5 = runnable;
                    if (runnable5 != null) {
                        handler.post(runnable5);
                    }
                    Runnable runnable6 = runnable3;
                    if (runnable6 != null) {
                        handler.post(runnable6);
                    }
                }
            });
            if (!z) {
                eVar.e(string2, new DialogInterface.OnClickListener() { // from class: o.Rc.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i6) {
                        Runnable runnable5 = runnable2;
                        if (runnable5 != null) {
                            handler.post(runnable5);
                        }
                        Runnable runnable6 = runnable3;
                        if (runnable6 != null) {
                            handler.post(runnable6);
                        }
                    }
                });
            }
        } else {
            eVar.c(string, (DialogInterface.OnClickListener) null);
            if (!z) {
                eVar.e(string2, (DialogInterface.OnClickListener) null);
            }
        }
        C1044Mm.a("nf_dialog", "Creating dialog... Title: %s, Message: %s", str, str2);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Handler handler, Runnable runnable, Runnable runnable2, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 111) {
            handler.post(runnable);
            if (runnable2 != null) {
                handler.post(runnable2);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o.Rc$e */
    /* loaded from: classes3.dex */
    public static class e extends C1907aSr {
        String b;
        Runnable d;

        public e(String str, String str2, String str3, Runnable runnable, String str4, Runnable runnable2) {
            super(str, str2, str3, runnable);
            this.b = str4;
            this.d = runnable2;
        }

        public e(String str, String str2, String str3, Runnable runnable, String str4, Runnable runnable2, Runnable runnable3) {
            this(str, str2, str3, runnable, str4, runnable2);
            this.a = runnable3;
        }
    }

    public static void b(Dialog dialog) {
        TextView textView = (TextView) dialog.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$101);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
