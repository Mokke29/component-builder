package com.mokke.componentbuilder.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mokke.componentbuilder.controller.AiRequest;
import com.mokke.componentbuilder.model.MessageDto;
import com.mokke.componentbuilder.model.PreviousPromptDto;
import com.mokke.componentbuilder.service.UserService;

@Component
public class ChatCore {

    @Autowired private UserService userService;

    public ChatCore() {}

    // Creating and sending request
    public synchronized String createRequest(MessageDto message, PreviousPromptDto prevPrompt ,String id, String openaiApiKey) throws Exception, InterruptedException {
		  AiRequest ts = new AiRequest(userService, openaiApiKey);
		  String res = ts.sendRequest(message, prevPrompt, id);
      String component = createComponent(res);
		  return component;

	}

  public String createComponent(String data) {

    StringBuilder sb = new StringBuilder();
    sb.append(data);
    String completedHtmlComponent = sb.toString();

    return completedHtmlComponent;
  }

  public String createBaseComponent() {

    StringBuilder sb = new StringBuilder();
    sb.append("<div id=\"copy\" class=\""+"base-component text-color-slate"+"\">");
    sb.append("<p>Component...</p>");
    sb.append("</div>");
    String completedHtmlComponent = sb.toString();

    return completedHtmlComponent;
  }
}
