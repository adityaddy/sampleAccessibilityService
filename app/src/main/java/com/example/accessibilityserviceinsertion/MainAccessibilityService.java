package com.example.accessibilityserviceinsertion;

import android.accessibilityservice.AccessibilityService;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class MainAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityNodeInfo source = accessibilityEvent.getSource();
        if (source != null & accessibilityEvent.getClassName().equals("android.widget.EditText")) {
            // 16 - TYPE_VIEW_TEXT_CHANGED
            if(accessibilityEvent.getEventType() == 16){
                String text = String.valueOf(source.getText());
                if(text.equals("/alpha")) {
                    String FinalString = "a b c d e f";
                    Bundle arguments = new Bundle();
                    arguments.putCharSequence(AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, FinalString);
                    boolean actionResult = source.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, arguments);
                    Log.d("action", String.valueOf(actionResult));
                }
            }

        }
    }

    @Override
    public void onInterrupt() {

    }
}
