package Interfaces;

import Types.CallerType;
import Types.TextType;

import java.util.List;

public interface PhoneInt {
    void call();
    void text();
    void showCallHistory();
    List<TextType> showTextHistory();
}
