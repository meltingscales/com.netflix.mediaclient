package org.linphone.core;

import java.util.Vector;

/* loaded from: classes6.dex */
public interface LinphoneAccountCreator {

    /* loaded from: classes6.dex */
    public interface LinphoneAccountCreatorListener {
        void onAccountCreatorAccountActivated(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorAccountCreated(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorAccountLinkedWithPhoneNumber(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorIsAccountActivated(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorIsAccountLinked(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorIsAccountUsed(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorIsPhoneNumberUsed(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorPasswordUpdated(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorPhoneAccountRecovered(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);

        void onAccountCreatorPhoneNumberLinkActivated(LinphoneAccountCreator linphoneAccountCreator, RequestStatus requestStatus);
    }

    RequestStatus activateAccount();

    RequestStatus activatePhoneNumberLink();

    LinphoneProxyConfig configure();

    RequestStatus createAccount();

    String getDisplayName();

    String getDomain();

    String getEmail();

    String getHa1();

    String getPassword();

    String getPhoneNumber();

    String getPrefix(String str);

    String getUsername();

    RequestStatus isAccountActivated();

    RequestStatus isAccountLinked();

    RequestStatus isAccountUsed();

    RequestStatus isPhoneNumberUsed();

    RequestStatus linkPhoneNumberWithAccount();

    RequestStatus recoverPhoneAccount();

    ActivationCodeCheck setActivationCode(String str);

    UsernameCheck setDisplayName(String str);

    DomainCheck setDomain(String str);

    EmailCheck setEmail(String str);

    PasswordCheck setHa1(String str);

    LanguageCheck setLanguage(String str);

    void setListener(LinphoneAccountCreatorListener linphoneAccountCreatorListener);

    PasswordCheck setPassword(String str);

    int setPhoneNumber(String str, String str2);

    UsernameCheck setUsername(String str);

    RequestStatus updatePassword(String str);

    /* loaded from: classes6.dex */
    public static class UsernameCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<UsernameCheck> values = new Vector<>();
        public static final UsernameCheck Ok = new UsernameCheck(0, "Ok");
        public static final UsernameCheck TooShort = new UsernameCheck(1, "TooShort");
        public static final UsernameCheck TooLong = new UsernameCheck(2, "TooLong");
        public static final UsernameCheck InvalidCharacters = new UsernameCheck(3, "InvalidCharacters");
        public static final UsernameCheck Invalid = new UsernameCheck(4, "Invalid");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private UsernameCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static UsernameCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                UsernameCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("UsernameCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class PhoneNumberCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<PhoneNumberCheck> values = new Vector<>();
        public static final PhoneNumberCheck Ok = new PhoneNumberCheck(1, "Ok");
        public static final PhoneNumberCheck TooShort = new PhoneNumberCheck(2, "TooShort");
        public static final PhoneNumberCheck TooLong = new PhoneNumberCheck(4, "TooLong");
        public static final PhoneNumberCheck CountryCodeInvalid = new PhoneNumberCheck(8, "CountryCodeInvalid");
        public static final PhoneNumberCheck Invalid = new PhoneNumberCheck(16, "Invalid");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private PhoneNumberCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static PhoneNumberCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                PhoneNumberCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("UsernameCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class EmailCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<EmailCheck> values = new Vector<>();
        public static final EmailCheck Ok = new EmailCheck(0, "Ok");
        public static final EmailCheck Malformed = new EmailCheck(1, "Malformed");
        public static final EmailCheck InvalidCharacters = new EmailCheck(2, "InvalidCharacters");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private EmailCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static EmailCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                EmailCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("EmailCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class DomainCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<DomainCheck> values = new Vector<>();
        public static final DomainCheck Ok = new DomainCheck(0, "Ok");
        public static final DomainCheck Invalid = new DomainCheck(1, "Invalid");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private DomainCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static DomainCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                DomainCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("DomainCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class PasswordCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<PasswordCheck> values = new Vector<>();
        public static final PasswordCheck Ok = new PasswordCheck(0, "Ok");
        public static final PasswordCheck TooShort = new PasswordCheck(1, "TooShort");
        public static final PasswordCheck TooLong = new PasswordCheck(2, "TooLong");
        public static final PasswordCheck InvalidCharacters = new PasswordCheck(3, "InvalidCharacters");
        public static final PasswordCheck MissingCharacters = new PasswordCheck(4, "MissingCharacters");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private PasswordCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static PasswordCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                PasswordCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("PasswordCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class LanguageCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<LanguageCheck> values = new Vector<>();
        public static final LanguageCheck Ok = new LanguageCheck(0, "Ok");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private LanguageCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static LanguageCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                LanguageCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("LanguageCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class ActivationCodeCheck {
        private final String mStringValue;
        private final int mValue;
        private static Vector<ActivationCodeCheck> values = new Vector<>();
        public static final ActivationCodeCheck Ok = new ActivationCodeCheck(0, "Ok");
        public static final ActivationCodeCheck TooShort = new ActivationCodeCheck(1, "TooShort");
        public static final ActivationCodeCheck TooLong = new ActivationCodeCheck(2, "TooLong");
        public static final ActivationCodeCheck InvalidCharacters = new ActivationCodeCheck(3, "InvalidCharacters");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private ActivationCodeCheck(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static ActivationCodeCheck fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                ActivationCodeCheck elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("ActivationCodeCheck not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class RequestStatus {
        private final String mStringValue;
        private final int mValue;
        private static Vector<RequestStatus> values = new Vector<>();
        public static final RequestStatus Ok = new RequestStatus(0, "Ok");
        public static final RequestStatus Failed = new RequestStatus(1, "Failed");
        public static final RequestStatus MissingArguments = new RequestStatus(2, "MissingArguments");
        public static final RequestStatus MissingCallbacks = new RequestStatus(3, "MissingCallbacks");
        public static final RequestStatus AccountCreated = new RequestStatus(4, "AccountCreated");
        public static final RequestStatus AccountNotCreated = new RequestStatus(5, "AccountNotCreated");
        public static final RequestStatus AccountExist = new RequestStatus(6, "AccountExist");
        public static final RequestStatus AccountExistWithAlias = new RequestStatus(7, "AccountExistWithAlias");
        public static final RequestStatus AccountNotExist = new RequestStatus(8, "AccountNotExist");
        public static final RequestStatus AliasIsAccount = new RequestStatus(9, "AliasIsAccount");
        public static final RequestStatus AliasExist = new RequestStatus(10, "AliasExist");
        public static final RequestStatus AliasNotExist = new RequestStatus(11, "AliasNotExist");
        public static final RequestStatus AccountActivated = new RequestStatus(12, "AccountActivated");
        public static final RequestStatus AccountAlreadyActivated = new RequestStatus(13, "AccountAlreadyActivated");
        public static final RequestStatus AccountNotActivated = new RequestStatus(14, "AccountNotActivated");
        public static final RequestStatus AccountLinked = new RequestStatus(15, "AccountLinked");
        public static final RequestStatus AccountNotLinked = new RequestStatus(16, "AccountNotLinked");
        public static final RequestStatus ErrorServer = new RequestStatus(17, "ErrorServer");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private RequestStatus(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static RequestStatus fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                RequestStatus elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("RequestStatus not found [" + i + "]");
        }
    }
}
