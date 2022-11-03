package com.tochycomputerservices.jobportal.RichEditor.styles.toolbar;

import android.content.Intent;

import com.tochycomputerservices.jobportal.RichEditor.AREditText;
import com.tochycomputerservices.jobportal.RichEditor.styles.toolitems.IARE_ToolItem;

import java.util.List;

/**
 * Created by wliu on 13/08/2018.
 */

public interface IARE_Toolbar {

    public void addToolbarItem(IARE_ToolItem toolbarItem);

    public List<IARE_ToolItem> getToolItems();

    public void setEditText(AREditText editText);

    public AREditText getEditText();

    public void onActivityResult(int requestCode, int resultCode, Intent data);
}
