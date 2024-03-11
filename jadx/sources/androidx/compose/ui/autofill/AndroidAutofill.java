package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private final View view;

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final View getView() {
        return this.view;
    }

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        AutofillManager m = AndroidAutofill$$ExternalSyntheticApiModelOutline2.m(view.getContext().getSystemService(AndroidAutofill$$ExternalSyntheticApiModelOutline1.m()));
        if (m == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.autofillManager = m;
        view.setImportantForAutofill(1);
    }
}
