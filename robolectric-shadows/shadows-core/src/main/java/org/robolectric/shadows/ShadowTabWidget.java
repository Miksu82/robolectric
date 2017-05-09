package org.robolectric.shadows;

import android.widget.TabWidget;
import org.robolectric.annotation.HiddenApi;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

@Implements(TabWidget.class)
public class ShadowTabWidget extends ShadowLinearLayout {

  @HiddenApi @Implementation
  protected void initTabWidget() {
  }
}
