package com.example;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PluginExplorerFactory implements ToolWindowFactory {
  public PluginExplorerFactory() {
  }

  @Override
  public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
    JPanel mainPanel = new JPanel();
    JBLabel label = new JBLabel("HEy ayoub");
    mainPanel.add(label);
    Content content = ContentFactory.getInstance().createContent(mainPanel,"OCi Plugin",false);
    toolWindow.getContentManager().addContent(content);
  }
}
