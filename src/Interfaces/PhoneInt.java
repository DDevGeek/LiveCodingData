package Interfaces;

import Types.CallerType;

public interface PhoneInt {
    void call(CallerType caller);
    void text();
    void showCallHistory();
    void showTextHistory();
}
