package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.widget.CompoundButton;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable;
import com.netflix.mediaclient.util.AccessibilityUtils;
import java.nio.charset.StandardCharsets;
import o.InterfaceC6945cmq;

/* renamed from: o.cmD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6906cmD extends AbstractC9944zY<InterfaceC6945cmq.c> implements InterfaceC6945cmq {
    public static final b d;
    public static final int e;
    private static byte e$ss2$208 = 0;
    private static int f = 0;
    private static int h = 1;
    private final CompoundButton a;
    private MyListLottieDrawable b;
    private final int c;
    private final CompoundButton g;
    private final boolean i;

    static {
        j();
        d = new b(null);
        e = 8;
    }

    public static final InterfaceC6945cmq b(CompoundButton compoundButton) {
        return d.e(compoundButton);
    }

    static void j() {
        e$ss2$208 = (byte) 24;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: g */
    public CompoundButton e() {
        return this.g;
    }

    public /* synthetic */ C6906cmD(CompoundButton compoundButton, boolean z, int i, C8627dsp c8627dsp) {
        this(compoundButton, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6906cmD(CompoundButton compoundButton, boolean z) {
        super(compoundButton);
        C8632dsu.c((Object) compoundButton, "");
        this.a = compoundButton;
        this.i = z;
        this.g = compoundButton;
        this.c = compoundButton.getId();
        i();
        compoundButton.setOnClickListener(new View.OnClickListener() { // from class: o.cmB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6906cmD.b(C6906cmD.this, view);
            }
        });
        compoundButton.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C6906cmD c6906cmD, View view) {
        C8632dsu.c((Object) c6906cmD, "");
        boolean isChecked = c6906cmD.a.isChecked();
        if (isChecked) {
            c6906cmD.b((C6906cmD) InterfaceC6945cmq.c.d.c);
        } else if (isChecked) {
        } else {
            c6906cmD.b((C6906cmD) InterfaceC6945cmq.c.C0119c.a);
        }
    }

    private final void i() {
        MyListLottieDrawable b2 = b(this.a.getButtonDrawable());
        this.b = b2;
        if (b2 == null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            C8632dsu.a(compoundDrawables, "");
            for (Drawable drawable : compoundDrawables) {
                MyListLottieDrawable b3 = b(drawable);
                this.b = b3;
                if (b3 != null) {
                    return;
                }
            }
        }
    }

    private final MyListLottieDrawable b(Drawable drawable) {
        if (drawable instanceof MyListLottieDrawable) {
            return (MyListLottieDrawable) drawable;
        }
        return null;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        this.a.setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        this.a.setVisibility(8);
    }

    @Override // o.InterfaceC6945cmq
    public void d(boolean z) {
        this.a.setVisibility(0);
        this.a.setChecked(z);
        MyListLottieDrawable myListLottieDrawable = this.b;
        if (myListLottieDrawable != null) {
            myListLottieDrawable.animateToState(z ? MyListLottieDrawable.State.e : MyListLottieDrawable.State.d);
        }
        boolean isChecked = this.a.isChecked();
        if (isChecked) {
            CompoundButton compoundButton = this.a;
            compoundButton.setContentDescription(compoundButton.getContext().getString(com.netflix.mediaclient.ui.R.o.fU));
        } else if (isChecked) {
        } else {
            CompoundButton compoundButton2 = this.a;
            compoundButton2.setContentDescription(compoundButton2.getContext().getString(com.netflix.mediaclient.ui.R.o.cA));
        }
    }

    @Override // o.InterfaceC6945cmq
    public void a(int i) {
        this.a.performHapticFeedback(i);
    }

    @Override // o.InterfaceC6945cmq
    public void f() {
        NetflixActivity x;
        int i = 2 % 2;
        Context applicationContext = this.a.getContext().getApplicationContext();
        Object obj = null;
        NetflixApplication netflixApplication = applicationContext instanceof NetflixApplication ? (NetflixApplication) applicationContext : null;
        if (netflixApplication != null && this.i) {
            int i2 = h + 55;
            f = i2 % 128;
            int i3 = i2 % 2;
            if (AccessibilityUtils.a(netflixApplication) || (x = netflixApplication.x()) == null) {
                return;
            }
            int i4 = f + 57;
            h = i4 % 128;
            if (i4 % 2 == 0) {
                netflixApplication.getString(com.netflix.mediaclient.ui.R.o.lR).startsWith("'!#+");
                obj.hashCode();
                throw null;
            }
            String string = netflixApplication.getString(com.netflix.mediaclient.ui.R.o.lR);
            if (string.startsWith("'!#+")) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                k(substring, objArr);
                string = ((String) objArr[0]).intern();
            }
            C8054ddD.a(x, string, 0);
        }
    }

    @Override // o.InterfaceC6945cmq
    public void h() {
        NetflixActivity x;
        int i = 2 % 2;
        int i2 = h + 25;
        f = i2 % 128;
        NetflixApplication netflixApplication = null;
        if (i2 % 2 != 0) {
            boolean z = this.a.getContext().getApplicationContext() instanceof NetflixApplication;
            throw null;
        }
        Context applicationContext = this.a.getContext().getApplicationContext();
        if (!(!(applicationContext instanceof NetflixApplication))) {
            int i3 = h + 117;
            f = i3 % 128;
            int i4 = i3 % 2;
            netflixApplication = (NetflixApplication) applicationContext;
        }
        if (netflixApplication == null || !this.i || AccessibilityUtils.a(netflixApplication) || (x = netflixApplication.x()) == null) {
            return;
        }
        int i5 = f + 93;
        h = i5 % 128;
        int i6 = i5 % 2;
        String string = netflixApplication.getString(com.netflix.mediaclient.ui.R.o.lP);
        if (string.startsWith("'!#+")) {
            int i7 = h + 111;
            f = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8054ddD.a(x, string, 0);
        int i9 = h + 87;
        f = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // o.InterfaceC6945cmq
    public void e(String str) {
        Intent intent = new Intent();
        intent.putExtra("pre_release_video_id", str);
        intent.setAction("com.netflix.mediaclient.mylist.intent.action.ADD");
        LocalBroadcastManager.getInstance(this.a.getContext()).sendBroadcast(intent);
    }

    /* renamed from: o.cmD$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final InterfaceC6945cmq e(CompoundButton compoundButton) {
            C8632dsu.c((Object) compoundButton, "");
            return e(this, compoundButton, false, 2, null);
        }

        private b() {
            super("MyListButtonUIView");
        }

        public static /* synthetic */ InterfaceC6945cmq e(b bVar, CompoundButton compoundButton, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return bVar.d(compoundButton, z);
        }

        public final InterfaceC6945cmq d(CompoundButton compoundButton, boolean z) {
            C8632dsu.c((Object) compoundButton, "");
            return new C6906cmD(compoundButton, z);
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        d.getLogTag();
        this.a.setEnabled(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        d.getLogTag();
        this.a.setEnabled(false);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$208);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
