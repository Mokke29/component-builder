package com.mokke.componentbuilder.core;

import java.util.HashMap;
import java.util.List;

public record CompletionRequest(String model,
		List<HashMap<String,String>> messages) {
	
	public static CompletionRequest defaultWith(List<HashMap<String,String>> messages) {
		return new CompletionRequest("gpt-3.5-turbo", messages);
	}
	
}