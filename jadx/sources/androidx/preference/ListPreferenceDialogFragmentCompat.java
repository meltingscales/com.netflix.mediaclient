package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes2.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    int mClickedDialogEntryIndex;
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;

    public static ListPreferenceDialogFragmentCompat newInstance(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString(SignupConstants.Error.DEBUG_FIELD_KEY, str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = getListPreference();
            if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.mClickedDialogEntryIndex = listPreference.findIndexOfValue(listPreference.getValue());
            this.mEntries = listPreference.getEntries();
            this.mEntryValues = listPreference.getEntryValues();
            return;
        }
        this.mClickedDialogEntryIndex = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.mEntries = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.mEntryValues = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.mClickedDialogEntryIndex);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.mEntries);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.mEntryValues);
    }

    private ListPreference getListPreference() {
        return (ListPreference) getPreference();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.mEntries, this.mClickedDialogEntryIndex, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.mClickedDialogEntryIndex = i;
                listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        int i;
        ListPreference listPreference = getListPreference();
        if (!z || (i = this.mClickedDialogEntryIndex) < 0) {
            return;
        }
        String charSequence = this.mEntryValues[i].toString();
        if (listPreference.callChangeListener(charSequence)) {
            listPreference.setValue(charSequence);
        }
    }
}