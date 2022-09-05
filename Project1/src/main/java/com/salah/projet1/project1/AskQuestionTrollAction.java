package com.salah.projet1.project1;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;

public class AskQuestionTrollAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e){
       randomEvent(e);
    }


    public void randomEvent(AnActionEvent e){
        int randomNum = (int)(Math.random() *2);
        switch (randomNum){
            case 1:
                BrowserUtil.browse("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                break;
            case 2:
                Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
                CaretModel caretModel = editor.getCaretModel();
                String selectedText = caretModel.getCurrentCaret().getSelectedText();

                String query = selectedText.replace(' ', '+');
                BrowserUtil.browse("https://www.youtube.com/results?search_query=" + query);
        }
    }


}