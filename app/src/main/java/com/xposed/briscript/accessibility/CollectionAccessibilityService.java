package com.xposed.briscript.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import com.xposed.briscript.utils.AccessibleUtil;
import com.xposed.briscript.utils.Logs;

import java.util.ArrayList;
import java.util.List;

public class CollectionAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityEvent.getSource();
        printNodeInfo(accessibilityNodeInfo);
    }

    private void printNodeInfo(AccessibilityNodeInfo nodeInfo) {
        if (nodeInfo == null) return;
        List<AccessibilityNodeInfo> accessibilityNodeInfos = new ArrayList<>();
        AccessibleUtil.getAccessibilityNodeInfoS(accessibilityNodeInfos, nodeInfo);
        for (AccessibilityNodeInfo nodeInfo1 : accessibilityNodeInfos) {
            Logs.logI(nodeInfo1.toString());
        }
    }

    @Override
    public void onInterrupt() {

    }
}
