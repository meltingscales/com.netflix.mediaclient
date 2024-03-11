package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import o.C8632dsu;
import o.dsT;

/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        int e;
        int e2;
        int e3;
        int e4;
        int addChildCount = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
            ViewStructure newChild = autofillApi23Helper.newChild(viewStructure, addChildCount);
            if (newChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = autofillApi26Helper.getAutofillId(viewStructure);
                C8632dsu.d(autofillId);
                autofillApi26Helper.setAutofillId(newChild, autofillId, intValue);
                autofillApi23Helper.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
                autofillApi26Helper.setAutofillType(newChild, 1);
                List<AutofillType> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i)));
                }
                autofillApi26Helper.setAutofillHints(newChild, (String[]) arrayList.toArray(new String[0]));
                Rect boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    e = dsT.e(boundingBox.getLeft());
                    e2 = dsT.e(boundingBox.getTop());
                    e3 = dsT.e(boundingBox.getRight());
                    e4 = dsT.e(boundingBox.getBottom());
                    AutofillApi23Helper.INSTANCE.setDimens(newChild, e, e2, 0, 0, e3 - e, e4 - e2);
                }
            }
            addChildCount++;
        }
    }

    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue m = AndroidAutofill_androidKt$$ExternalSyntheticApiModelOutline0.m(sparseArray.get(keyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(m)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, autofillApi26Helper.textValue(m).toString());
            } else if (autofillApi26Helper.isDate(m)) {
                throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
            } else if (autofillApi26Helper.isList(m)) {
                throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
            } else if (autofillApi26Helper.isToggle(m)) {
                throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
            }
        }
    }
}
