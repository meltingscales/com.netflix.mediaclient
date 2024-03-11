package androidx.compose.ui.autofill;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.HashMap;
import o.dpD;
import o.dqE;

/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes;

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    static {
        HashMap<AutofillType, String> b;
        b = dqE.b(dpD.a(AutofillType.EmailAddress, "emailAddress"), dpD.a(AutofillType.Username, "username"), dpD.a(AutofillType.Password, SignupConstants.Field.PASSWORD), dpD.a(AutofillType.NewUsername, "newUsername"), dpD.a(AutofillType.NewPassword, "newPassword"), dpD.a(AutofillType.PostalAddress, "postalAddress"), dpD.a(AutofillType.PostalCode, SignupConstants.Field.POSTAL_CODE), dpD.a(AutofillType.CreditCardNumber, "creditCardNumber"), dpD.a(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), dpD.a(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), dpD.a(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), dpD.a(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), dpD.a(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), dpD.a(AutofillType.AddressCountry, "addressCountry"), dpD.a(AutofillType.AddressRegion, "addressRegion"), dpD.a(AutofillType.AddressLocality, "addressLocality"), dpD.a(AutofillType.AddressStreet, "streetAddress"), dpD.a(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), dpD.a(AutofillType.PostalCodeExtended, "extendedPostalCode"), dpD.a(AutofillType.PersonFullName, "personName"), dpD.a(AutofillType.PersonFirstName, "personGivenName"), dpD.a(AutofillType.PersonLastName, "personFamilyName"), dpD.a(AutofillType.PersonMiddleName, "personMiddleName"), dpD.a(AutofillType.PersonMiddleInitial, "personMiddleInitial"), dpD.a(AutofillType.PersonNamePrefix, "personNamePrefix"), dpD.a(AutofillType.PersonNameSuffix, "personNameSuffix"), dpD.a(AutofillType.PhoneNumber, SignupConstants.Field.PHONE_NUMBER), dpD.a(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), dpD.a(AutofillType.PhoneCountryCode, "phoneCountryCode"), dpD.a(AutofillType.PhoneNumberNational, "phoneNational"), dpD.a(AutofillType.Gender, SignupConstants.Field.GENDER), dpD.a(AutofillType.BirthDateFull, "birthDateFull"), dpD.a(AutofillType.BirthDateDay, "birthDateDay"), dpD.a(AutofillType.BirthDateMonth, "birthDateMonth"), dpD.a(AutofillType.BirthDateYear, "birthDateYear"), dpD.a(AutofillType.SmsOtpCode, "smsOTPCode"));
        androidAutofillTypes = b;
    }
}
