package com.netflix.mediaclient.ui.diagnosis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.api.diagnostics.IDiagnosis;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import o.AbstractApplicationC1040Mh;
import o.ActivityC3740bIx;
import o.C1044Mm;
import o.C8054ddD;
import o.C8150deu;
import o.InterfaceC5091bsH;
import o.aMJ;

/* loaded from: classes4.dex */
public class DiagnosisActivity extends NetflixActivity implements IDiagnosis.a {
    private static byte e$ss2$2710 = 24;
    private static int f = 0;
    private static int m = 1;
    private TextView a;
    private c b;
    private ImageView c;
    private ProgressBar d;
    private IDiagnosis e;
    private TextView g;
    private Button h;
    private List<aMJ> i;
    private ListView j;

    /* loaded from: classes4.dex */
    public enum InfoGroupState {
        INITIAL,
        TEST_ONGOING,
        FAILED,
        SUCCESS
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldFinishOnManagerError() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldStartLaunchActivityIfVisibleOnManagerUnavailable() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    public static Intent b(Context context) {
        return new Intent(context, e());
    }

    private static Class<?> e() {
        return NetflixApplication.getInstance().M() ? ActivityC3740bIx.class : DiagnosisActivity.class;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C8150deu.h()) {
            setRequestedOrientation(6);
            setContentView(R.i.E);
        } else {
            setRequestedOrientation(7);
            setContentView(R.i.L);
        }
        C1044Mm.e("DiagnosisActivity", "onCreate");
        d();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(true);
        c0051b.e((CharSequence) getResources().getString(R.o.cR));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IDiagnosis iDiagnosis = this.e;
        if (iDiagnosis != null) {
            iDiagnosis.c();
            this.e.d();
            this.e = null;
            this.i = null;
        }
        C1044Mm.e("DiagnosisActivity", "onDestroy");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.customerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        C1044Mm.e("DiagnosisActivity", "Diagnosis being attempted");
        this.e.b();
        c(InfoGroupState.TEST_ONGOING);
        this.b.notifyDataSetChanged();
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis.a
    public void c() {
        runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.1
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("DiagnosisActivity", "DiagnosisListUpdated");
                DiagnosisActivity.this.b.notifyDataSetChanged();
            }
        });
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis.a
    public void a() {
        runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.4
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("DiagnosisActivity", "DiagnosisUpdated ");
                if (C8054ddD.l(DiagnosisActivity.this)) {
                    C1044Mm.d("DiagnosisActivity", "DiagnosisActivity FinishedOrDestroyed");
                    return;
                }
                Iterator it = DiagnosisActivity.this.i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((aMJ) it.next()).i()) {
                            DiagnosisActivity.this.c(InfoGroupState.FAILED);
                            break;
                        }
                    } else {
                        DiagnosisActivity.this.c(InfoGroupState.SUCCESS);
                        break;
                    }
                }
                DiagnosisActivity.this.b.notifyDataSetChanged();
            }
        });
    }

    private String b() {
        int i = 2 % 2;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            aMJ amj = this.i.get(i2);
            if (!amj.i()) {
                if (amj.d()) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
        }
        if (z) {
            int i3 = f + 103;
            m = i3 % 128;
            int i4 = i3 % 2;
            if (z2) {
                String string = getString(R.o.gY);
                if (!string.startsWith("'!#+")) {
                    return string;
                }
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                return ((String) objArr[0]).intern();
            }
        }
        if (!(!z2)) {
            String string2 = getString(R.o.cO);
            if (string2.startsWith("'!#+")) {
                int i5 = f + 63;
                m = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                k(string2.substring(4), objArr2);
                return ((String) objArr2[0]).intern();
            }
            return string2;
        } else if (!z) {
            String string3 = getString(R.o.ev);
            if (!string3.startsWith("'!#+")) {
                return string3;
            }
            Object[] objArr3 = new Object[1];
            k(string3.substring(4), objArr3);
            return ((String) objArr3[0]).intern();
        } else {
            int i7 = f + 87;
            m = i7 % 128;
            int i8 = i7 % 2;
            String string4 = getString(R.o.ey);
            if (string4.startsWith("'!#+")) {
                int i9 = m + 125;
                f = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr4 = new Object[1];
                k(string4.substring(4), objArr4);
                return ((String) objArr4[0]).intern();
            }
            return string4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[InfoGroupState.values().length];
            d = iArr;
            try {
                iArr[InfoGroupState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[InfoGroupState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[InfoGroupState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[InfoGroupState.TEST_ONGOING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(InfoGroupState infoGroupState) {
        int i = 2 % 2;
        int i2 = AnonymousClass3.d[infoGroupState.ordinal()];
        if (i2 == 1) {
            TextView textView = this.a;
            int i3 = R.o.cP;
            Context context = textView.getContext();
            String string = context.getString(i3);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i3);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            textView.setText(string);
            TextView textView2 = this.g;
            int i4 = R.o.gB;
            Context context2 = textView2.getContext();
            String string2 = context2.getString(i4);
            if (string2.startsWith("'!#+")) {
                int i5 = f + 115;
                m = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    k(string2.substring(4), objArr2);
                    ((String) objArr2[0]).intern();
                    boolean z = context2.getText(i4) instanceof Spanned;
                    throw null;
                }
                Object[] objArr3 = new Object[1];
                k(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
                CharSequence text2 = context2.getText(i4);
                if (text2 instanceof Spanned) {
                    SpannableString spannableString2 = new SpannableString(string2);
                    TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                    string2 = spannableString2;
                }
            }
            textView2.setText(string2);
            Button button = this.h;
            int i6 = R.o.gu;
            Context context3 = button.getContext();
            String string3 = context3.getString(i6);
            if (string3.startsWith("'!#+")) {
                Object[] objArr4 = new Object[1];
                k(string3.substring(4), objArr4);
                string3 = ((String) objArr4[0]).intern();
                CharSequence text3 = context3.getText(i6);
                if (text3 instanceof Spanned) {
                    SpannableString spannableString3 = new SpannableString(string3);
                    TextUtils.copySpansFrom((SpannedString) text3, 0, string3.length(), Object.class, spannableString3, 0);
                    string3 = spannableString3;
                } else {
                    int i7 = f + 81;
                    m = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            button.setText(string3);
            this.h.setVisibility(0);
            this.d.setVisibility(4);
        } else if (i2 == 2) {
            TextView textView3 = this.a;
            int i9 = R.o.ex;
            Context context4 = textView3.getContext();
            String string4 = context4.getString(i9);
            if (string4.startsWith("'!#+")) {
                Object[] objArr5 = new Object[1];
                k(string4.substring(4), objArr5);
                string4 = ((String) objArr5[0]).intern();
                CharSequence text4 = context4.getText(i9);
                if (text4 instanceof Spanned) {
                    SpannableString spannableString4 = new SpannableString(string4);
                    TextUtils.copySpansFrom((SpannedString) text4, 0, string4.length(), Object.class, spannableString4, 0);
                    string4 = spannableString4;
                }
            }
            textView3.setText(string4);
            this.g.setVisibility(0);
            this.g.setText(b());
            this.h.setVisibility(0);
            Button button2 = this.h;
            int i10 = R.o.gD;
            Context context5 = button2.getContext();
            String string5 = context5.getString(i10);
            if (string5.startsWith("'!#+")) {
                Object[] objArr6 = new Object[1];
                k(string5.substring(4), objArr6);
                string5 = ((String) objArr6[0]).intern();
                CharSequence text5 = context5.getText(i10);
                if (text5 instanceof Spanned) {
                    SpannableString spannableString5 = new SpannableString(string5);
                    TextUtils.copySpansFrom((SpannedString) text5, 0, string5.length(), Object.class, spannableString5, 0);
                    string5 = spannableString5;
                }
            }
            button2.setText(string5);
            this.d.setVisibility(4);
        } else if (i2 != 3) {
            int i11 = f + 25;
            m = i11 % 128;
            int i12 = i11 % 2;
            if (i2 != 4) {
                return;
            }
            this.c.setVisibility(8);
            this.j.setVisibility(0);
            this.h.setVisibility(4);
            this.d.setVisibility(0);
            TextView textView4 = this.a;
            int i13 = R.o.cN;
            Context context6 = textView4.getContext();
            String string6 = context6.getString(i13);
            if (string6.startsWith("'!#+")) {
                Object[] objArr7 = new Object[1];
                k(string6.substring(4), objArr7);
                string6 = ((String) objArr7[0]).intern();
                CharSequence text6 = context6.getText(i13);
                if (text6 instanceof Spanned) {
                    SpannableString spannableString6 = new SpannableString(string6);
                    TextUtils.copySpansFrom((SpannedString) text6, 0, string6.length(), Object.class, spannableString6, 0);
                    string6 = spannableString6;
                } else {
                    int i14 = f + 101;
                    m = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            textView4.setText(string6);
            this.g.setVisibility(4);
        } else {
            TextView textView5 = this.a;
            int i16 = R.o.ev;
            Context context7 = textView5.getContext();
            String string7 = context7.getString(i16);
            if (string7.startsWith("'!#+")) {
                Object[] objArr8 = new Object[1];
                k(string7.substring(4), objArr8);
                string7 = ((String) objArr8[0]).intern();
                CharSequence text7 = context7.getText(i16);
                if (text7 instanceof Spanned) {
                    SpannableString spannableString7 = new SpannableString(string7);
                    TextUtils.copySpansFrom((SpannedString) text7, 0, string7.length(), Object.class, spannableString7, 0);
                    string7 = spannableString7;
                }
            }
            textView5.setText(string7);
            this.h.setVisibility(0);
            Button button3 = this.h;
            int i17 = R.o.gD;
            Context context8 = button3.getContext();
            String string8 = context8.getString(i17);
            if (string8.startsWith("'!#+")) {
                Object[] objArr9 = new Object[1];
                k(string8.substring(4), objArr9);
                string8 = ((String) objArr9[0]).intern();
                CharSequence text8 = context8.getText(i17);
                if (text8 instanceof Spanned) {
                    SpannableString spannableString8 = new SpannableString(string8);
                    TextUtils.copySpansFrom((SpannedString) text8, 0, string8.length(), Object.class, spannableString8, 0);
                    string8 = spannableString8;
                }
            }
            button3.setText(string8);
            this.d.setVisibility(4);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.2
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            }
        };
    }

    private void d() {
        C1044Mm.a("DiagnosisActivity", "setupViews");
        IDiagnosis c2 = AbstractApplicationC1040Mh.getInstance().i().c();
        this.e = c2;
        if (c2 == null) {
            return;
        }
        c2.c(this);
        this.i = this.e.e();
        this.j = (ListView) findViewById(R.g.dh);
        c cVar = new c(this);
        this.b = cVar;
        this.j.setAdapter((ListAdapter) cVar);
        this.a = (TextView) findViewById(R.g.aT);
        this.g = (TextView) findViewById(R.g.aY);
        this.h = (Button) findViewById(R.g.ba);
        this.c = (ImageView) findViewById(R.g.aV);
        this.d = (ProgressBar) findViewById(R.g.aS);
        c(InfoGroupState.INITIAL);
        findViewById(R.g.ba).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DiagnosisActivity.this.h();
            }
        });
    }

    @SuppressLint({"ViewHolder"})
    /* loaded from: classes4.dex */
    public class c extends ArrayAdapter<String> {
        private static int a = 0;
        private static int c = 1;
        private static byte e$ss2$63 = 24;
        final Context b;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        public c(Context context) {
            super(context, R.i.f13248J, R.g.dh);
            this.b = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
            r14 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a + 55;
            com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c = r14 % 128;
            r14 = r14 % 2;
            r14 = r12.b.getString(com.netflix.mediaclient.ui.R.o.ew);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r14.startsWith("'!#+") == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
            r0 = new java.lang.Object[1];
            f(r14.substring(4), r0);
            r14 = ((java.lang.String) r0[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            r13.setText(r14);
            r13 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a + 65;
            com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            r14 = com.netflix.mediaclient.ui.R.o.dY;
            r0 = r13.getContext();
            r5 = r0.getString(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
            if (r5.startsWith("'!#+") == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
            r3 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c + 57;
            com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a = r3 % 128;
            r3 = r3 % 2;
            r1 = new java.lang.Object[1];
            f(r5.substring(4), r1);
            r5 = ((java.lang.String) r1[0]).intern();
            r14 = r0.getText(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
            if ((r14 instanceof android.text.Spanned) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
            r0 = new android.text.SpannableString(r5);
            android.text.TextUtils.copySpansFrom((android.text.SpannedString) r14, 0, r5.length(), java.lang.Object.class, r0, 0);
            r5 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
            r13.setText(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r14 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r14 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r14.contains("netflix") == false) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(android.widget.TextView r13, java.lang.String r14, int r15) {
            /*
                r12 = this;
                r15 = 2
                int r0 = r15 % r15
                int r0 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a = r1
                int r0 = r0 % r15
                r1 = 1
                r2 = 4
                java.lang.String r3 = "'!#+"
                r4 = 0
                if (r0 == 0) goto L19
                r0 = 60
                int r0 = r0 / r4
                if (r14 == 0) goto L58
                goto L1b
            L19:
                if (r14 == 0) goto L58
            L1b:
                java.lang.String r0 = "netflix"
                boolean r14 = r14.contains(r0)
                if (r14 == 0) goto L58
                int r14 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a
                int r14 = r14 + 55
                int r0 = r14 % 128
                com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c = r0
                int r14 = r14 % r15
                android.content.Context r14 = r12.b
                int r0 = com.netflix.mediaclient.ui.R.o.ew
                java.lang.String r14 = r14.getString(r0)
                boolean r0 = r14.startsWith(r3)
                if (r0 == 0) goto L4b
                java.lang.String r14 = r14.substring(r2)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r12.f(r14, r0)
                r14 = r0[r4]
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r14 = r14.intern()
            L4b:
                r13.setText(r14)
                int r13 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a
                int r13 = r13 + 65
                int r14 = r13 % 128
                com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c = r14
                int r13 = r13 % r15
                goto La5
            L58:
                int r14 = com.netflix.mediaclient.ui.R.o.dY
                android.content.Context r0 = r13.getContext()
                java.lang.String r5 = r0.getString(r14)
                boolean r3 = r5.startsWith(r3)
                if (r3 == 0) goto La2
                int r3 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c
                int r3 = r3 + 57
                int r6 = r3 % 128
                com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a = r6
                int r3 = r3 % r15
                java.lang.String r2 = r5.substring(r2)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r12.f(r2, r1)
                r1 = r1[r4]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r5 = r1.intern()
                java.lang.CharSequence r14 = r0.getText(r14)
                boolean r0 = r14 instanceof android.text.Spanned
                if (r0 == 0) goto La2
                android.text.SpannableString r0 = new android.text.SpannableString
                r0.<init>(r5)
                r6 = r14
                android.text.SpannedString r6 = (android.text.SpannedString) r6
                r7 = 0
                int r8 = r5.length()
                java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
                r14 = r0
                android.text.SpannableString r14 = (android.text.SpannableString) r14
                r11 = 0
                r10 = r0
                android.text.TextUtils.copySpansFrom(r6, r7, r8, r9, r10, r11)
                r5 = r0
            La2:
                r13.setText(r5)
            La5:
                int r13 = com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.a
                int r13 = r13 + 3
                int r14 = r13 % 128
                com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.c = r14
                int r13 = r13 % r15
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity.c.d(android.widget.TextView, java.lang.String, int):void");
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.i.f13248J, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.g.aR);
            TextView textView2 = (TextView) inflate.findViewById(R.g.aW);
            ImageView imageView = (ImageView) inflate.findViewById(R.g.aU);
            imageView.setImageResource(R.e.am);
            aMJ amj = (aMJ) DiagnosisActivity.this.i.get(i);
            d(textView, amj.e(), i);
            if (amj.a().equals(IDiagnosis.UrlStatus.COMPLETED)) {
                if (amj.i()) {
                    imageView.setImageResource(R.e.am);
                    textView2.setVisibility(4);
                } else {
                    textView2.setText("nw-" + amj.c() + "-" + amj.b());
                    imageView.setImageResource(R.e.aj);
                }
            } else if (amj.a().equals(IDiagnosis.UrlStatus.TEST_ONGOING)) {
                imageView.setVisibility(4);
                textView2.setVisibility(4);
            } else if (amj.a().equals(IDiagnosis.UrlStatus.NOT_TESTED)) {
                imageView.setVisibility(4);
                textView2.setVisibility(4);
                textView.setVisibility(4);
            }
            return inflate;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            if (DiagnosisActivity.this.i == null) {
                C1044Mm.e("DiagnosisActivity", "urlList is null");
                return 0;
            }
            return DiagnosisActivity.this.i.size();
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$63);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2710);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
