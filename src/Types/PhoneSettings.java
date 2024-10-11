package Types;

public class PhoneSettings {
    private String phoneName, phoneBrand, phoneMemory;
    private CallerType phoneOwner;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(String phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public CallerType getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(CallerType phoneOwner) {
        this.phoneOwner = phoneOwner;
    }
}
