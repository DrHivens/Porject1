package com.salah.projet1.project1;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class PopUpAction extends AnAction {


    @Override
    public void actionPerformed(AnActionEvent e){
        StringBuilder message =
                new StringBuilder(e.getPresentation().getText() + " ILL MAKE YOU QUIT");

        String title = e.getPresentation().getDescription();
        Messages.showMessageDialog(
                message.toString(),
                title,
                Messages.getInformationIcon());
    }




}
