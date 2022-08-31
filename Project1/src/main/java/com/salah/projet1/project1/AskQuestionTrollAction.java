package com.salah.projet1.project1;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class AskQuestionTrollAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e){
        BrowserUtil.browse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"); //rick roll
    }


}
 