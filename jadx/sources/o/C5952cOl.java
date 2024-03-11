package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import o.C5855cKw;

/* renamed from: o.cOl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5952cOl extends LinearLayout {
    public static final b c = new b(null);
    public static final int d = 8;
    private c a;
    private ProfileCreator.AgeSetting b;
    private ProfileCreator.AgeSetting e;

    /* renamed from: o.cOl$c */
    /* loaded from: classes4.dex */
    public interface c {
        void b(ProfileCreator.AgeSetting ageSetting, ProfileCreator.AgeSetting ageSetting2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5952cOl(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5952cOl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final ProfileCreator.AgeSetting e() {
        return this.e;
    }

    public final void setAgeChangedListener(c cVar) {
        this.a = cVar;
    }

    public /* synthetic */ C5952cOl(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5952cOl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        ProfileCreator.AgeSetting ageSetting = ProfileCreator.AgeSetting.d;
        this.b = ageSetting;
        this.e = ageSetting;
        setOrientation(1);
        d();
        b(this.b);
    }

    /* renamed from: o.cOl$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProfilesAgeSection");
        }
    }

    public final void setStartingSelection(ProfileCreator.AgeSetting ageSetting) {
        C8632dsu.c((Object) ageSetting, "");
        this.b = ageSetting;
        e(ageSetting);
        b(ageSetting);
    }

    private final void e(ProfileCreator.AgeSetting ageSetting) {
        if (this.e != ageSetting) {
            this.e = ageSetting;
            b(ageSetting);
        }
    }

    private final void a(ProfileCreator.AgeSetting ageSetting) {
        if (this.e != ageSetting) {
            e(ageSetting);
            c cVar = this.a;
            if (cVar != null) {
                cVar.b(this.b, ageSetting);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AgeSuperParcel", super.onSaveInstanceState());
        bundle.putInt("AgeStartSetting", this.b.ordinal());
        bundle.putInt("AgeCurrentSetting", this.e.ordinal());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle != null) {
            super.onRestoreInstanceState(bundle.getParcelable("AgeSuperParcel"));
            ProfileCreator.AgeSetting[] values = ProfileCreator.AgeSetting.values();
            ProfileCreator.AgeSetting ageSetting = ProfileCreator.AgeSetting.d;
            setStartingSelection(values[bundle.getInt("AgeStartSetting", ageSetting.ordinal())]);
            e(ProfileCreator.AgeSetting.values()[bundle.getInt("AgeCurrentSetting", ageSetting.ordinal())]);
        }
    }

    private final void d() {
        C9703vR.e(this, C5855cKw.c.i, 0, 2, null);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(C5855cKw.d.k);
        C5947cOg c5947cOg = C5947cOg.d;
        Context context = getContext();
        C8632dsu.a(context, "");
        switchCompat.setText(c5947cOg.a(context, com.netflix.mediaclient.ui.R.o.kR, com.netflix.mediaclient.ui.R.o.kP));
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cOk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C5952cOl.c(C5952cOl.this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5952cOl c5952cOl, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) c5952cOl, "");
        c5952cOl.a(z ? ProfileCreator.AgeSetting.b : ProfileCreator.AgeSetting.d);
    }

    private final void b(ProfileCreator.AgeSetting ageSetting) {
        ((SwitchCompat) findViewById(C5855cKw.d.k)).setChecked(ageSetting == ProfileCreator.AgeSetting.b);
    }
}
