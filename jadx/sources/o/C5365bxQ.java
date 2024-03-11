package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.PreferenceDialogFragmentCompat;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.bandwidthsetting.ManualBwChoice;

/* renamed from: o.bxQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5365bxQ extends PreferenceDialogFragmentCompat {
    private RadioButton a;
    private RadioButton b;
    private RadioButton c;
    private RadioGroup d;
    private SwitchCompat e;
    private ManualBwChoice g;

    /* renamed from: o.bxQ$a */
    /* loaded from: classes4.dex */
    public interface a {
        void c(Context context, boolean z);
    }

    public static C5365bxQ e() {
        C5365bxQ c5365bxQ = new C5365bxQ();
        Bundle bundle = new Bundle();
        bundle.putString(SignupConstants.Error.DEBUG_FIELD_KEY, "nf.bw_save");
        c5365bxQ.setArguments(bundle);
        return c5365bxQ;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public View onCreateDialogView(Context context) {
        return LayoutInflater.from(context).inflate(com.netflix.mediaclient.ui.R.i.bc, (ViewGroup) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onBindDialogView(View view) {
        e(view, C1613aHu.b(getContext()), C1613aHu.e(getContext()));
        b();
        this.g = d();
        super.onBindDialogView(view);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z) {
            ManualBwChoice d2 = d();
            C1613aHu.a(getContext(), Boolean.valueOf(a()), d2.d());
            CLv2Utils.INSTANCE.e(new Focus(AppView.cellularDataUsageSetting, null), new ChangeValueCommand(a() ? ManualBwChoice.AUTO.c() : d2.c()));
            d(this.g != d2);
        }
    }

    private void d(boolean z) {
        if (getContext() instanceof a) {
            ((a) getContext()).c(getContext(), z);
            return;
        }
        C1044Mm.e("BandwidthPrefDialogFragment", "notifyCaller: no callback interface!! activity:" + getContext().getClass().getSimpleName());
    }

    private void e(View view, boolean z, int i) {
        this.d = (RadioGroup) view.findViewById(com.netflix.mediaclient.ui.R.g.cC);
        this.b = (RadioButton) view.findViewById(com.netflix.mediaclient.ui.R.g.cB);
        this.c = (RadioButton) view.findViewById(com.netflix.mediaclient.ui.R.g.cz);
        this.a = (RadioButton) view.findViewById(com.netflix.mediaclient.ui.R.g.cE);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(com.netflix.mediaclient.ui.R.g.cA);
        this.e = switchCompat;
        switchCompat.setChecked(z);
        e(!z);
        if (z) {
            return;
        }
        a(ManualBwChoice.d(i));
    }

    private void b() {
        this.b.setOnClickListener(new d());
        this.c.setOnClickListener(new d());
        this.a.setOnClickListener(new d());
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.bxQ.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1044Mm.e("BandwidthPrefDialogFragment", "bwSwitch toggled state: " + z);
                C5365bxQ.this.i();
                C5365bxQ.this.e(z ^ true);
                if (z) {
                    return;
                }
                C5365bxQ.this.a(ManualBwChoice.d(C1613aHu.b));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.b.setEnabled(z);
        this.c.setEnabled(z);
        this.a.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.b.setChecked(false);
        this.c.setChecked(false);
        this.a.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bxQ$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ManualBwChoice.values().length];
            d = iArr;
            try {
                iArr[ManualBwChoice.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ManualBwChoice.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ManualBwChoice.UNLIMITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ManualBwChoice manualBwChoice) {
        this.d.clearCheck();
        int i = AnonymousClass2.d[manualBwChoice.ordinal()];
        if (i == 1) {
            this.b.setChecked(true);
        } else if (i == 2) {
            this.c.setChecked(true);
        } else if (i != 3) {
        } else {
            this.a.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bxQ$d */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ManualBwChoice manualBwChoice;
            if (C5365bxQ.this.a()) {
                C1044Mm.e("BandwidthPrefDialogFragment", "ignore manual selection - in auto mode");
                return;
            }
            ManualBwChoice manualBwChoice2 = ManualBwChoice.UNDEFINED;
            int id = view.getId();
            if (id == com.netflix.mediaclient.ui.R.g.cB) {
                manualBwChoice = ManualBwChoice.OFF;
            } else if (id == com.netflix.mediaclient.ui.R.g.cz) {
                manualBwChoice = ManualBwChoice.LOW;
            } else if (id == com.netflix.mediaclient.ui.R.g.cE) {
                manualBwChoice = ManualBwChoice.UNLIMITED;
            } else {
                C1044Mm.e("BandwidthPrefDialogFragment", "Ignoring click on unknown view");
                manualBwChoice = manualBwChoice2;
            }
            if (manualBwChoice != manualBwChoice2) {
                C5365bxQ.this.i();
                C5365bxQ.this.a(manualBwChoice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return this.e.isChecked();
    }

    private ManualBwChoice d() {
        if (this.b.isChecked()) {
            return ManualBwChoice.OFF;
        }
        if (this.c.isChecked()) {
            return ManualBwChoice.LOW;
        }
        if (this.a.isChecked()) {
            return ManualBwChoice.UNLIMITED;
        }
        return ManualBwChoice.AUTO;
    }
}
